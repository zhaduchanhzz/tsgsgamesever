package com.gzbz.war.stonehenge;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.StonehengeDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.model.HeroModel;
import com.gzbz.model.StonehengeBattleModel;
import com.gzbz.model.StonehengeBuffModel;
import com.gzbz.model.StonehengeResumeModel;
import com.gzbz.model.StonehengeRewardModel;
import com.gzbz.model.StonehengeRoomModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.StonehengeMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.util.TempUtil;
import com.gzbz.worldMgr.WorldMgr;
import com.gzbz.worldMgr.WorldMgrPushTaskPart;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import misc.CalculateUtil;
import misc.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class StonehengePart extends PlayerPart {
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private WorldMgr worldMgr;
   private static final int EVENT_FIGHT = 1;
   private static final int EVENT_TREASURE = 2;
   private static final int EVENT_BUFF = 3;
   private static final int EVENT_RESUME = 4;
   private static final int ROOM_BEGIN = 1;
   private static final int ROOM_FINAL = 2;
   private static final int ROOM_NORMAL = 3;
   private static final int GAME_EXPLORE = 1;
   private static final int GAME_SWEEP = 2;
   private static final int NORMAL_LEVEL = 1;
   private static final int FIGHT_ONE = 1;
   private static final int FIGHT_AGAIN = 2;
   private static final int RECOVERY_1 = 1;
   private static final int RECOVERY_2 = 2;
   private static final int RECOVERY_3 = 3;
   private static final int FIGHT_WIN = 1;
   private static final int FIGHT_LOSE = 2;

   public StonehengeDao getStonehengeDao() {
      return (StonehengeDao)this.player.getData("tb_stonehenge", this.player.getPlayerId());
   }

   public void resetWeek() {
      if (!this.systemNotOpen()) {
         StonehengeDao stonehengeDao = this.getStonehengeDao();
         if (stonehengeDao.hardId != 0) {
            stonehengeDao.needTime = false;
         } else {
            stonehengeDao.clear();
         }

         stonehengeDao.lastAwards.clear();
         stonehengeDao.isPassNormal = false;
         stonehengeDao.time = 0;
         stonehengeDao.updateOp();
      }
   }

   @MsgHandlerAnno
   public void C2S_StonehengeMain_22901(StonehengeMsg.C2S_StonehengeMain_22901 msg, String source) {
      if (this.systemNotOpen()) {
         this.player.failure(21);
      } else {
         this.player.uploadCrossPlayer();
         StonehengeMsg.S2C_StonehengeMain_22902.Builder builder = StonehengeMsg.S2C_StonehengeMain_22902.newBuilder();
         StonehengeDao stonehengeDao = this.getStonehengeDao();
         builder.setHard(stonehengeDao.hardId);
         builder.setMaxHard(stonehengeDao.maxHardId);
         builder.addAllPassId(stonehengeDao.passIds);
         builder.addAllMoveId(stonehengeDao.moveIds);
         builder.setIsPass(stonehengeDao.isPass);
         builder.addAllBuff(stonehengeDao.buffs);
         builder.setTime(stonehengeDao.time);
         builder.addAllDeBuff(stonehengeDao.deBuffs);
         builder.setReviveTime(stonehengeDao.reviveTime);
         if (stonehengeDao.time > 0 && !stonehengeDao.isPassNormal) {
            stonehengeDao.isPassNormal = true;
            stonehengeDao.updateOp();
         }

         builder.setIsPassNormal(stonehengeDao.isPassNormal);
         builder.setMaxPassHard(stonehengeDao.maxPassHard);
         builder.setCanSweep(!CollectionUtils.isEmpty(stonehengeDao.lastAwards));
         StonehengeRoomModel roomModel = (StonehengeRoomModel)ApplicationContextProvider.getModelPoolEntity("stonehengeRoom", stonehengeDao.id);
         builder.setWaitId(roomModel == null ? stonehengeDao.id : roomModel.getRoomId());
         stonehengeDao.heroHpMap.values().forEach((hpData) -> builder.addHero(hpData.toBuild()));
         ArrayList<ResourceModel> models = new ArrayList();

         for(Integer id : stonehengeDao.awards) {
            StonehengeRewardModel reward = (StonehengeRewardModel)ApplicationContextProvider.getModelPoolEntity("stonehengeReward", id);
            ResourceModel.addResourceToListPlus(models, reward.getRewards());
         }

         builder.addAllItems(ResourceModel.builderList(models));
         int type = stonehengeDao.inType;
         if (type == 0) {
            WorldDao<ArrayList<Integer>> worldDao = this.worldMgr.<ArrayList<Integer>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_STONEHENGE_PATH);
            type = CollectionUtils.isEmpty((Collection)worldDao.jsonData) ? 1 : (Integer)((ArrayList)worldDao.jsonData).get(((ArrayList)worldDao.jsonData).size() - 1);
         }

         builder.setType(type);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_StonehengeChallenge_22903(StonehengeMsg.C2S_StonehengeChallenge_22903 msg, String source) {
      StonehengeDao stonehengeDao = this.getStonehengeDao();
      if (stonehengeDao.time > this.configManager.getIntDefault("stonehengeTimeLimitByWeek", 5)) {
         this.player.failure(6);
      } else {
         if (msg.getStatus() == 1) {
            if (stonehengeDao.hardId != 0 && stonehengeDao.hardId != msg.getLevelId()) {
               this.player.failure(6);
               return;
            }

            stonehengeDao.hardId = msg.getLevelId();
            stonehengeDao.inType = msg.getType();
            stonehengeDao.updateOp();
         } else if (msg.getStatus() == 2) {
            if (stonehengeDao.hardId != 0) {
               this.player.failure(6);
               return;
            }

            if (stonehengeDao.maxPassHard <= 0) {
               this.player.failure(6);
               return;
            }

            List<Integer> awards = new ArrayList();
            int sweepLevel = stonehengeDao.isPassNormal ? Math.max(this.getStonehengeDao().maxPassHard - 1, 1) : 1;
            Map<Integer, StonehengeRoomModel> roomMap = ApplicationContextProvider.<Integer, StonehengeRoomModel>getModelPoolMap("stonehengeRoom");
            WorldDao<ArrayList<Integer>> worldDao = this.worldMgr.<ArrayList<Integer>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_STONEHENGE_PATH);
            int type = CollectionUtils.isEmpty((Collection)worldDao.jsonData) ? 1 : (Integer)((ArrayList)worldDao.jsonData).get(((ArrayList)worldDao.jsonData).size() - 1);
            roomMap.values().stream().filter((room) -> room.getType() == type && (room.getEventType() == 1 || room.getEventType() == 2)).forEach((room) -> {
               Map<Integer, StonehengeRewardModel> rewardMap = ApplicationContextProvider.<Integer, StonehengeRewardModel>getModelPoolMap("stonehengeReward");
               List<StonehengeRewardModel> list = (List)rewardMap.values().stream().filter((r) -> r.checkCon(sweepLevel, room.getEventType(), room.getEventId1())).collect(Collectors.toList());
               StonehengeRewardModel rewardModel = (StonehengeRewardModel)TempUtil.getOneForCollection(list);
               if (rewardModel != null) {
                  awards.add(rewardModel.getId());
               }

            });
            if (CollectionUtils.isEmpty(awards)) {
               this.player.failure(6);
               return;
            }

            ArrayList<ResourceModel> models = new ArrayList();

            for(Integer id : awards) {
               StonehengeRewardModel reward = (StonehengeRewardModel)ApplicationContextProvider.getModelPoolEntity("stonehengeReward", id);
               ResourceModel.addResourceToListPlus(models, reward.getRewards());
            }

            ++stonehengeDao.time;
            stonehengeDao.isPassNormal = true;
            stonehengeDao.updateOp();
            if (stonehengeDao.needTime) {
               int roomCount = (int)roomMap.values().stream().filter((room) -> room.getType() == type && room.getIsMove()).count();
               StonehengeMsg.S2CR_StonehengeUpdateRank_22918.Builder builder = StonehengeMsg.S2CR_StonehengeUpdateRank_22918.newBuilder();
               builder.setHard(sweepLevel);
               builder.setExplore(roomCount);
               builder.setTime((int)(System.currentTimeMillis() / 1000L));
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            }

            this.player.addResource(models, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 133, 13303, 0, 0, "");
            this.C2S_StonehengeMain_22901((StonehengeMsg.C2S_StonehengeMain_22901)null, (String)null);
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_StonehengeTriggerRoom_22905(StonehengeMsg.C2S_StonehengeTriggerRoom_22905 msg, String source) {
      StonehengeDao stonehengeDao = this.getStonehengeDao();
      StonehengeRoomModel roomModel = (StonehengeRoomModel)ApplicationContextProvider.getModelPoolEntity("stonehengeRoom", msg.getId());
      if (!roomModel.getIsMove() && !stonehengeDao.moveIds.contains(roomModel.getRoomId()) && roomModel.getSite() != 1) {
         this.player.failure(6);
      } else if (stonehengeDao.passIds.contains(roomModel.getRoomId())) {
         this.player.failure(6);
      } else {
         StonehengeMsg.S2C_StonehengeTriggerRoom_22906.Builder eventReturn = StonehengeMsg.S2C_StonehengeTriggerRoom_22906.newBuilder();
         switch (roomModel.getEventType()) {
            case 1:
               List<Integer> battleList = (List)stonehengeDao.tempMap.get(roomModel.getId());
               int fightId;
               if (CollectionUtils.isEmpty(battleList)) {
                  Map<Integer, StonehengeBattleModel> battleMap = ApplicationContextProvider.<Integer, StonehengeBattleModel>getModelPoolMap("stonehengeBattle");
                  Map<StonehengeBattleModel, Integer> randomBattleMap = (Map)battleMap.values().stream().filter((b) -> b.checkCon(stonehengeDao.hardId, roomModel.getEventId1(), roomModel.getEventId2())).collect(Collectors.toMap((StonehengeBattleModel) -> StonehengeBattleModel, StonehengeBattleModel::getRatio));
                  StonehengeBattleModel randomBattle = (StonehengeBattleModel)TempUtil.getOneForMap(randomBattleMap);
                  if (randomBattle == null) {
                     this.player.failure(1);
                     return;
                  }

                  fightId = randomBattle.getId();
                  ((List)stonehengeDao.tempMap.computeIfAbsent(roomModel.getId(), (k) -> new ArrayList())).add(randomBattle.getId());
                  stonehengeDao.updateOp();
               } else {
                  fightId = (Integer)battleList.get(0);
               }

               StonehengeBattleModel battleModel = (StonehengeBattleModel)ApplicationContextProvider.getModelPoolEntity("stonehengeBattle", fightId);
               StonehengeMsg.StonehengeBattleData.Builder battleData = StonehengeMsg.StonehengeBattleData.newBuilder();
               battleData.setFightId(fightId);
               Map<Integer, Byte> heroMap1 = (Map)stonehengeDao.battlePosMap1.get(roomModel.getId());
               if (!CollectionUtils.isEmpty(heroMap1)) {
                  for(Map.Entry<Integer, Byte> entry : heroMap1.entrySet()) {
                     StonehengeMsg.StonehengeHero.Builder builder = StonehengeMsg.StonehengeHero.newBuilder();
                     builder.setHeroCode((Integer)entry.getKey());
                     builder.setPos((Byte)entry.getValue());
                     battleData.addMyHero1(builder);
                  }
               }

               Map<Integer, Byte> heroMap2 = (Map)stonehengeDao.battlePosMap2.get(roomModel.getId());
               if (!CollectionUtils.isEmpty(heroMap2)) {
                  for(Map.Entry<Integer, Byte> entry : heroMap2.entrySet()) {
                     StonehengeMsg.StonehengeHero.Builder builder = StonehengeMsg.StonehengeHero.newBuilder();
                     builder.setHeroCode((Integer)entry.getKey());
                     builder.setPos((Byte)entry.getValue());
                     battleData.addMyHero2(builder);
                  }
               }

               Map<Integer, StonehengeDao.HPData> enemyMap1 = (Map)stonehengeDao.enemyHpMap.get(battleModel.getBattleId1());
               if (!CollectionUtils.isEmpty(enemyMap1)) {
                  enemyMap1.values().forEach((hpData) -> battleData.addEnemy1(hpData.toBuild()));
               }

               Map<Integer, StonehengeDao.HPData> enemyMap2 = (Map)stonehengeDao.enemyHpMap.get(battleModel.getBattleId2());
               if (!CollectionUtils.isEmpty(enemyMap2)) {
                  enemyMap2.values().forEach((hpData) -> battleData.addEnemy2(hpData.toBuild()));
               }

               eventReturn.setBattleData(battleData);
               break;
            case 2:
               Map<Integer, StonehengeRewardModel> rewardMap = ApplicationContextProvider.<Integer, StonehengeRewardModel>getModelPoolMap("stonehengeReward");
               List<StonehengeRewardModel> list = (List)rewardMap.values().stream().filter((r) -> r.checkCon(stonehengeDao.hardId, roomModel.getEventType(), 0)).collect(Collectors.toList());
               StonehengeRewardModel rewardModel = (StonehengeRewardModel)TempUtil.getOneForCollection(list);
               if (rewardModel == null) {
                  this.player.failure(6);
                  return;
               }

               stonehengeDao.awards.add(rewardModel.getId());
               stonehengeDao.passIds.add(roomModel.getRoomId());
               stonehengeDao.moveIds.addAll(roomModel.getMoveRoom());
               stonehengeDao.updateOp();

               for(ResourceModel reward : rewardModel.getRewards()) {
                  eventReturn.addItems(reward.builder());
               }

               this.send22920((ArrayList)null);
               break;
            case 3:
               List<Integer> buffList = (List)stonehengeDao.tempMap.get(roomModel.getId());
               if (CollectionUtils.isEmpty(buffList)) {
                  Map<Integer, StonehengeBuffModel> buffMap = ApplicationContextProvider.<Integer, StonehengeBuffModel>getModelPoolMap("stonehengeBuff");
                  Map<Integer, Integer> randomBuffMap = (Map)buffMap.values().stream().filter((b) -> b.checkCon(roomModel.getEventId1(), roomModel.getEventId2(), stonehengeDao.buffs)).collect(Collectors.toMap(StonehengeBuffModel::getId, StonehengeBuffModel::getWeight));
                  buffList = TempUtil.<Integer>getLotForMap(randomBuffMap, roomModel.getEventId3(), false);
                  ((List)stonehengeDao.tempMap.computeIfAbsent(roomModel.getId(), (k) -> new ArrayList())).addAll(buffList);
                  stonehengeDao.updateOp();
               }

               eventReturn.addAllBuffId(buffList);
               break;
            case 4:
               List<Integer> resumeList = (List)stonehengeDao.tempMap.get(roomModel.getId());
               if (CollectionUtils.isEmpty(resumeList)) {
                  Map<Integer, StonehengeResumeModel> resumeMap = ApplicationContextProvider.<Integer, StonehengeResumeModel>getModelPoolMap("stonehengeResume");
                  List<Integer> randomList = (List)resumeMap.values().stream().map(StonehengeResumeModel::getId).collect(Collectors.toList());
                  resumeList = TempUtil.<Integer>getLotForCollection(randomList, roomModel.getEventId1(), false);
                  ((List)stonehengeDao.tempMap.computeIfAbsent(roomModel.getId(), (k) -> new ArrayList())).addAll(resumeList);
                  stonehengeDao.updateOp();
               }

               eventReturn.addAllResumeId(resumeList);
               break;
            default:
               this.player.failure(6);
         }

         this.player.sendMsg(eventReturn.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_StonehengeEvent_22919(StonehengeMsg.C2S_StonehengeEvent_22919 msg, String source) {
      if (CollectionUtils.isEmpty(msg.getParamList())) {
         this.player.failure(6);
      } else {
         StonehengeDao stonehengeDao = this.getStonehengeDao();
         Integer selectId = (Integer)msg.getParamList().get(0);
         int roomId = msg.getId();
         List<Integer> tempIds = (List)stonehengeDao.tempMap.get(roomId);
         if (CollectionUtils.isEmpty(tempIds) || !tempIds.contains(selectId)) {
            boolean error = true;

            for(Map.Entry<Integer, List<Integer>> entry : stonehengeDao.tempMap.entrySet()) {
               if (((List)entry.getValue()).contains(selectId)) {
                  roomId = (Integer)entry.getKey();
                  error = false;
                  break;
               }
            }

            if (error) {
               this.player.failure(6);
               return;
            }
         }

         StonehengeRoomModel roomModel = (StonehengeRoomModel)ApplicationContextProvider.getModelPoolEntity("stonehengeRoom", roomId);
         if (roomModel == null) {
            this.player.failure(6);
         } else {
            ArrayList<StonehengeDao.HPData> heroes;
            label149: {
               heroes = new ArrayList();
               switch (roomModel.getEventType()) {
                  case 1:
                  case 3:
                     stonehengeDao.tempMap.remove(roomModel.getId());
                     stonehengeDao.passIds.add(roomModel.getRoomId());
                     stonehengeDao.moveIds.addAll(roomModel.getMoveRoom());
                     stonehengeDao.deBuffs.clear();
                     stonehengeDao.buffs.add(selectId);
                     stonehengeDao.updateOp();
                     ArrayingMirror myArrayingMirror = this.player.getPlayerSpecialArraying(CommonMsg.HeroState.HERO_STATE_STONEHENGE_1, (List)null);
                     Iterator var17 = myArrayingMirror.arrayingElementsMap.values().iterator();

                     while(true) {
                        if (!var17.hasNext()) {
                           break label149;
                        }

                        ArrayingEntity entity = (ArrayingEntity)var17.next();
                        StonehengeDao.HPData hpData = stonehengeDao.getHeroHPData(entity.code);
                        hpData.power = entity.power();
                        heroes.add(hpData);
                     }
                  case 2:
                  default:
                     this.player.failure(0);
                     break label149;
                  case 4:
               }

               StonehengeResumeModel recovery = (StonehengeResumeModel)ApplicationContextProvider.getModelPoolEntity("stonehengeResume", selectId);
               if (recovery.getResumeType() == 3) {
                  for(StonehengeDao.HPData hpData : stonehengeDao.heroHpMap.values()) {
                     if (hpData != null && hpData.hpPercent != 100 && hpData.hpPercent != 0) {
                        heroes.add(hpData);
                     }
                  }
               } else {
                  for(Integer code : msg.getParamList().subList(1, msg.getParamList().size())) {
                     StonehengeDao.HPData hpData = (StonehengeDao.HPData)stonehengeDao.heroHpMap.get(code);
                     if (hpData == null || hpData.hpPercent == 100) {
                        this.player.failure(6);
                        return;
                     }

                     heroes.add(hpData);
                  }
               }

               if (CollectionUtils.isEmpty(heroes)) {
                  this.player.failure(6);
                  return;
               }

               if (recovery.getResumeType() == 1) {
                  if (heroes.size() > recovery.getResumeValue()) {
                     this.player.failure(6);
                     return;
                  }

                  for(StonehengeDao.HPData hpData : heroes) {
                     hpData.hpPercent = 100;
                  }
               } else if (recovery.getResumeType() == 2) {
                  if (heroes.size() > recovery.getResumeValue()) {
                     this.player.failure(6);
                     return;
                  }

                  int resumeValue2 = recovery.getResumeValue2();

                  for(StonehengeDao.HPData hpData : heroes) {
                     hpData.hpPercent = Math.min(100, hpData.hpPercent + resumeValue2);
                  }
               } else if (recovery.getResumeType() == 3) {
                  int resumeValue = recovery.getResumeValue();

                  for(StonehengeDao.HPData hpData : heroes) {
                     hpData.hpPercent = Math.min(100, hpData.hpPercent + resumeValue);
                  }
               }

               stonehengeDao.tempMap.remove(msg.getId());
               stonehengeDao.passIds.remove(-roomModel.getRoomId());
               stonehengeDao.passIds.add(roomModel.getRoomId());
               stonehengeDao.moveIds.addAll(roomModel.getMoveRoom());
               stonehengeDao.updateOp();
            }

            this.send22920(heroes);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_StonehengePass_22910(StonehengeMsg.C2S_StonehengePass_22910 msg, String source) {
      if (this.systemNotOpen()) {
         this.player.failure(21);
      } else {
         StonehengeDao stonehengeDao = this.getStonehengeDao();
         if (msg.getStatus() && stonehengeDao.isPass) {
            if (stonehengeDao.needTime) {
               ++stonehengeDao.time;
               stonehengeDao.maxHardId = Math.max(stonehengeDao.hardId, stonehengeDao.maxHardId);
               stonehengeDao.lastAwards.clear();
               stonehengeDao.lastAwards.addAll(stonehengeDao.awards);
               if (stonehengeDao.hardId == 1) {
                  stonehengeDao.isPassNormal = true;
               }

               stonehengeDao.updateOp();
            }

            Map<Integer, StonehengeRoomModel> roomMap = ApplicationContextProvider.<Integer, StonehengeRoomModel>getModelPoolMap("stonehengeRoom");
            List<Integer> rewardRoomList = (List)roomMap.values().stream().filter((room) -> room.getType() == stonehengeDao.inType && (room.getEventType() == 1 || room.getEventType() == 2)).map(StonehengeRoomModel::getRoomId).collect(Collectors.toList());
            if (stonehengeDao.passIds.containsAll(rewardRoomList) && stonehengeDao.hardId > stonehengeDao.maxPassHard) {
               stonehengeDao.maxPassHard = stonehengeDao.hardId;
               stonehengeDao.updateOp();
            }

            ArrayList<ResourceModel> models = new ArrayList();

            for(Integer id : stonehengeDao.awards) {
               StonehengeRewardModel reward = (StonehengeRewardModel)ApplicationContextProvider.getModelPoolEntity("stonehengeReward", id);
               ResourceModel.addResourceToListPlus(models, reward.getRewards());
            }

            this.player.addResource(models, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 133, 13301, 0, 0, "");
            this.addPassLog();
            this.player.triggerTask(732, 0, 1L, 1);
            if (stonehengeDao.needTime) {
               StonehengeMsg.S2CR_StonehengeUpdateRank_22918.Builder builder = StonehengeMsg.S2CR_StonehengeUpdateRank_22918.newBuilder();
               builder.setHard(stonehengeDao.hardId);
               builder.setExplore(stonehengeDao.passIds.size());
               builder.setTime((int)(System.currentTimeMillis() / 1000L));
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            }
         }

         stonehengeDao.needTime = true;
         stonehengeDao.clear();
         this.C2S_StonehengeMain_22901((StonehengeMsg.C2S_StonehengeMain_22901)null, (String)null);
      }
   }

   @MsgHandlerAnno
   public void C2S_StonehengeHero_22911(StonehengeMsg.C2S_StonehengeHero_22911 msg, String channelId) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      StonehengeMsg.S2C_StonehengeHero_22912.Builder builder = StonehengeMsg.S2C_StonehengeHero_22912.newBuilder();

      for(Integer code : msg.getHeroCodeList()) {
         HeroDao heroDao = heroBagPart.getHeroByCode(code, CommonMsg.HeroState.HERO_STATE_STONEHENGE_1);
         if (heroDao != null) {
            StonehengeDao.HPData hpData = this.getStonehengeDao().getHeroHPData(code);
            hpData.power = heroDao.getCombatPower();
            builder.addHero(hpData.toBuild());
         }
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_StonehengeQuery_22913(StonehengeMsg.C2S_StonehengeQuery_22913 msg, String channelId) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode(), CommonMsg.HeroState.HERO_STATE_STONEHENGE_1);
      if (heroDao == null) {
         this.player.failure(6);
      } else {
         this.player.sendMsg(StonehengeMsg.S2C_StonehengeQuery_22914.newBuilder().setInfo(HeroMirror.fromHeroBean(heroDao).toBuilder()).build());
      }
   }

   @MsgHandlerAnno
   public void C2S_StonehengeRevive_22915(StonehengeMsg.C2S_StonehengeRevive_22915 msg, String channelId) {
      StonehengeDao dao = this.getStonehengeDao();
      String reviveLimit = this.configManager.getStrByDefault("stonehengeReviveLimit", "30");
      if (dao.reviveTime + msg.getHeroCodeCount() > Integer.parseInt(reviveLimit)) {
         this.player.failure(6);
      } else {
         for(Integer id : msg.getHeroCodeList()) {
            StonehengeDao.HPData hpData = (StonehengeDao.HPData)dao.heroHpMap.get(id);
            if (hpData == null || hpData.hpPercent >= 100) {
               this.player.failure(6);
               return;
            }
         }

         String reviveCost = this.configManager.getStrByDefault("stonehengeReviveCost", "1|9|50");
         ResourceModel goldModel = ResourceModel.buildResource(reviveCost);
         goldModel.setValue(goldModel.getValue() * msg.getHeroCodeList().size());
         this.player.delResource(goldModel, 133, 13302, 0, 0, "");
         dao.reviveTime += msg.getHeroCodeCount();
         StonehengeMsg.S2C_StonehengeResume_22908.Builder recovery = StonehengeMsg.S2C_StonehengeResume_22908.newBuilder();

         for(Integer id : msg.getHeroCodeList()) {
            ((StonehengeDao.HPData)dao.heroHpMap.get(id)).hpPercent = 100;
            recovery.addHero(StonehengeMsg.StonehengeHero.newBuilder().setHeroCode(id).setHpPercent(100));
         }

         dao.updateOp();
         recovery.setReviveTime(dao.reviveTime);
         this.player.sendMsg(recovery.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_StonehengeRank_22916(StonehengeMsg.C2S_StonehengeRank_22916 msg, String channelId) {
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg.toBuilder().build());
   }

   @MsgHandlerAnno
   public void C2S_StonehengeInRoom_22921(StonehengeMsg.C2S_StonehengeInRoom_22921 msg, String channelId) {
      StonehengeDao stonehengeDao = this.getStonehengeDao();
      StonehengeRoomModel roomModel = (StonehengeRoomModel)ApplicationContextProvider.getModelPoolEntity("stonehengeRoom", msg.getId());
      stonehengeDao.id = roomModel.getId();
      if (roomModel.getEventType() == 4 && !stonehengeDao.passIds.contains(roomModel.getRoomId()) && !stonehengeDao.passIds.contains(-roomModel.getRoomId())) {
         stonehengeDao.moveIds.addAll(roomModel.getMoveRoom());
         stonehengeDao.passIds.add(-roomModel.getRoomId());
         stonehengeDao.updateOp();
         this.send22920((ArrayList)null);
      }

   }

   public int enterBattle(BattleDao battleDao) {
      return this.battle(battleDao, CommonMsg.HeroState.HERO_STATE_STONEHENGE_1, 1);
   }

   public int nextBattle(BattleDao battleDao) {
      return this.battle(battleDao, CommonMsg.HeroState.HERO_STATE_STONEHENGE_2, 2);
   }

   private int battle(BattleDao battleDao, CommonMsg.HeroState heroState, int wave) {
      if (!this.player.isSystemOpen(6310)) {
         return 21;
      } else {
         StonehengeDao stonehengeDao = this.getStonehengeDao();
         StonehengeRoomModel roomModel = (StonehengeRoomModel)ApplicationContextProvider.getModelPoolEntity("stonehengeRoom", battleDao.modelId);
         if (roomModel != null && stonehengeDao.arrayVerify) {
            List<Integer> battles = (List)stonehengeDao.tempMap.get(roomModel.getId());
            if (wave == 1 && battles.size() >= 2 && (Integer)battles.get(1) == 1) {
               wave = 2;
               heroState = CommonMsg.HeroState.HERO_STATE_STONEHENGE_2;
               battleDao.params.add(1);
               battleDao.updateOp();
            }

            int fightId = 0;
            if (!CollectionUtils.isEmpty(battles)) {
               fightId = (Integer)battles.get(0);
            }

            StonehengeBattleModel battleModel = (StonehengeBattleModel)ApplicationContextProvider.getModelPoolEntity("stonehengeBattle", fightId);
            if (battleModel == null) {
               return 6;
            } else {
               int battleId = battleModel.getBattleId(wave);
               HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
               if (heroArrayingPart.getHeroCodesOfArraying(heroState).isEmpty()) {
                  return 4113;
               } else {
                  PlayerDao playerDao = this.player.getPlayerDao();
                  ArrayList<CommonMsg.CodeType> removeList = new ArrayList();
                  removeList.add(CommonMsg.CodeType.CODE_ARTIFACT);
                  removeList.add(CommonMsg.CodeType.CODE_BEAUTY);
                  removeList.add(CommonMsg.CodeType.CODE_DRAGON);
                  ArrayingMirror myArrayingMirror = this.player.getPlayerSpecialArraying(heroState, removeList);
                  BattlePKTeam myPKTeam = new BattlePKTeam(this.player.getPlayerId(), playerDao.playerName, myArrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, (Map)null);
                  BattlePKTeam enemyPKTeam = new BattlePKTeam(battleId);
                  battleDao.scene.addPKTeam(myPKTeam, enemyPKTeam);
                  this.setHP(myPKTeam.getAllEntity(), stonehengeDao.heroHpMap, true);
                  this.setHP(enemyPKTeam.getAllEntity(), (Map)stonehengeDao.enemyHpMap.get(battleId), false);
                  List<Integer> allEffects = new ArrayList();
                  List<Integer> randomEffects = new ArrayList();

                  for(Integer buff : stonehengeDao.buffs) {
                     StonehengeBuffModel buffModel = (StonehengeBuffModel)this.player.getGameModelPool().getEntity("stonehengeBuff", buff);
                     if (buffModel.getSkillId() != 0) {
                        if (buffModel.randomEffect()) {
                           randomEffects.add(buffModel.getSkillId());
                        } else {
                           allEffects.add(buffModel.getSkillId());
                        }
                     }
                  }

                  Map<Integer, Byte> posMap;
                  if (wave == 1) {
                     posMap = (Map)stonehengeDao.battlePosMap1.computeIfAbsent(roomModel.getId(), (k) -> new HashMap());
                  } else {
                     posMap = (Map)stonehengeDao.battlePosMap2.computeIfAbsent(roomModel.getId(), (k) -> new HashMap());
                  }

                  posMap.replaceAll((heroCode, pos) -> (byte) -1);

                  for(Entity entity : myPKTeam.getAllEntity().values()) {
                     posMap.put(entity.getHeroCode(), entity.getTeamPos());
                     entity.addPassiveEffect((byte)15, allEffects);
                  }

                  stonehengeDao.updateOp();

                  for(Integer effect : randomEffects) {
                     Entity entity = (Entity)TempUtil.getOneForCollection(myPKTeam.getAllEntity().values());
                     if (entity != null) {
                        entity.addPassiveEffect((byte)15, Collections.singletonList(effect));
                     }
                  }

                  battleDao.scene.setBattleId(battleId);
                  battleDao.scene.setMaxRound(this.configManager.getByteDefault("stonehengeMaxRound", (byte)22));
                  battleDao.scene.setWave((short)((byte)wave), (short)2);
                  battleDao.updateOp();
                  this.player.getOperationMgr().addCopyLog(this.player, battleDao.modelId, "石兵八阵");
                  return 1;
               }
            }
         } else {
            return 0;
         }
      }
   }

   public void afterBattle(BattleDao battleDao) {
      StonehengeDao stonehengeDao = this.getStonehengeDao();
      ArrayList<StonehengeDao.HPData> heroes = new ArrayList();
      int totalRemain = 0;
      int totalCalc = 0;
      BattlePKTeam myPkTeam = battleDao.scene.getPKTeam((byte)0);

      for(Map.Entry<Byte, Entity> entry : myPkTeam.getAllEntity().entrySet()) {
         Byte pos = (Byte)entry.getKey();
         if (pos <= 5) {
            Entity entity = (Entity)entry.getValue();
            StonehengeDao.HPData hpData = stonehengeDao.getHeroHPData(entity.getHeroCode());
            hpData.hpPercent = CalculateUtil.calPercent(entity.getBaseProperty(99), entity.getBaseProperty(1));
            hpData.power = entity.getCombatPower();
            stonehengeDao.updateOp();
            heroes.add(hpData);
            totalRemain += hpData.hpPercent;
            totalCalc += 100;
         }
      }

      StonehengeRoomModel roomModel = (StonehengeRoomModel)ApplicationContextProvider.getModelPoolEntity("stonehengeRoom", battleDao.modelId);
      List<Integer> dataList = (List)stonehengeDao.tempMap.get(roomModel.getId());
      if (!CollectionUtils.isEmpty(dataList)) {
         StonehengeBattleModel battleModel = (StonehengeBattleModel)ApplicationContextProvider.getModelPoolEntity("stonehengeBattle", (Integer)dataList.get(0));
         if (battleModel != null) {
            boolean condition = battleModel.getValue() == 0 || totalRemain * 100 >= battleModel.getValue() * totalCalc;
            boolean victory = battleDao.scene.getWinForce() == 0 && condition;
            if (battleModel.getIsEvent() == 2) {
               HashMap<Byte, Entity> enemyMap = battleDao.scene.getPKTeam((byte)1).getAllEntity();

               for(Map.Entry<Byte, Entity> enemyEntry : enemyMap.entrySet()) {
                  byte pos = (Byte)enemyEntry.getKey();
                  if (pos <= 5) {
                     Entity entity = (Entity)enemyEntry.getValue();
                     StonehengeDao.HPData hpData = new StonehengeDao.HPData();
                     hpData.code = pos;
                     hpData.hpPercent = CalculateUtil.calPercent(entity.getBaseProperty(99), entity.getBaseProperty(1));
                     ((Map)stonehengeDao.enemyHpMap.computeIfAbsent(battleModel.getBattleId(battleDao.scene.getWave()), (k) -> new HashMap())).put(Integer.valueOf(pos), hpData);
                     stonehengeDao.updateOp();
                  }
               }
            }

            battleDao.scene.getBattleMsg().addExParams(roomModel.getId());
            short wave = battleDao.scene.getWave();
            if (dataList.size() >= wave + 1) {
               dataList.set(wave, victory ? 1 : 2);
            } else {
               dataList.add(victory ? 1 : 2);
            }

            battleDao.scene.getBattleMsg().setIsEnd(false);
            battleDao.scene.getBattleMsg().setIsNextWave(CollectionUtils.isEmpty(battleDao.params) && wave > 1);
            battleDao.updateOp();
            if (dataList.size() == 3) {
               BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
               result.setResult(1);
               battleDao.scene.getBattleMsg().setResult(result);
               boolean realVictory = (Integer)dataList.get(1) == 1 && (Integer)dataList.get(2) == 1;
               if (realVictory) {
                  Map<Integer, StonehengeRewardModel> rewardMap = ApplicationContextProvider.<Integer, StonehengeRewardModel>getModelPoolMap("stonehengeReward");
                  List<StonehengeRewardModel> list = (List)rewardMap.values().stream().filter((r) -> r.checkCon(stonehengeDao.hardId, roomModel.getEventType(), battleModel.getBattleType())).collect(Collectors.toList());
                  StonehengeRewardModel rewardModel = (StonehengeRewardModel)TempUtil.getOneForCollection(list);
                  if (rewardModel != null) {
                     stonehengeDao.awards.add(rewardModel.getId());
                     result.addAllAwardItems(ResourceModel.builderList(rewardModel.getRewards())).setResult(0);
                  }

                  stonehengeDao.enemyHpMap.remove(battleModel.getBattleId1());
                  stonehengeDao.enemyHpMap.remove(battleModel.getBattleId2());
                  stonehengeDao.tempMap.remove(roomModel.getId());
                  stonehengeDao.passIds.add(roomModel.getRoomId());
                  stonehengeDao.moveIds.addAll(roomModel.getMoveRoom());
                  if (!stonehengeDao.isPass) {
                     stonehengeDao.isPass = roomModel.getSite() == 2;
                     stonehengeDao.bossId = roomModel.getId();
                  }

                  stonehengeDao.updateOp();
                  battleDao.scene.getBattleMsg().setResult(result);
                  battleDao.updateOp();
               } else if (battleModel.getIsEvent() == 1) {
                  Map<Integer, StonehengeBuffModel> buffMap = ApplicationContextProvider.<Integer, StonehengeBuffModel>getModelPoolMap("stonehengeBuff");
                  Map<Integer, Integer> randomBuffMap = (Map)buffMap.values().stream().filter((b) -> b.checkCon(2, 0, stonehengeDao.buffs)).collect(Collectors.toMap(StonehengeBuffModel::getId, StonehengeBuffModel::getWeight));
                  List<Integer> deBuffs = TempUtil.<Integer>getLotForMap(randomBuffMap, 3, false);
                  stonehengeDao.enemyHpMap.remove(battleModel.getBattleId1());
                  stonehengeDao.enemyHpMap.remove(battleModel.getBattleId2());
                  ((List)stonehengeDao.tempMap.computeIfAbsent(roomModel.getId(), (k) -> new ArrayList())).addAll(deBuffs);
                  stonehengeDao.deBuffs.addAll(deBuffs);
                  stonehengeDao.updateOp();
                  battleDao.scene.getBattleMsg().addAllExParams(deBuffs);
                  battleDao.updateOp();
               }

               if (wave == 2 || realVictory || (Integer)dataList.get(2) == 1) {
                  battleDao.scene.getBattleMsg().setIsEnd(true);
                  battleDao.status = 0;
                  battleDao.updateOp();
               }
            }

            this.send22920(heroes);
            if (wave == 1) {
               this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "石兵八阵", "1");
            }

         }
      }
   }

   private void setHP(HashMap<Byte, Entity> heroMap, Map<Integer, StonehengeDao.HPData> percentMap, boolean isPlayer) {
      if (!CollectionUtils.isEmpty(percentMap)) {
         for(Map.Entry<Byte, Entity> entry : heroMap.entrySet()) {
            int sel = isPlayer ? ((Entity)entry.getValue()).getHeroCode() : (Byte)entry.getKey();
            StonehengeDao.HPData hpData = (StonehengeDao.HPData)percentMap.get(sel);
            if (hpData != null && hpData.hpPercent != 100) {
               long round = Math.round((double)hpData.hpPercent / (double)100.0F * (double)((Entity)entry.getValue()).getBaseProperty(99));
               ((Entity)entry.getValue()).setBaseProperty(99, round);
            }
         }

      }
   }

   public boolean rejectArraying(List<HeroMsg.ArrayingList> arrayingInfoList) {
      StonehengeDao stonehengeDao = this.getStonehengeDao();
      if (stonehengeDao.id == -1) {
         return false;
      } else {
         Map<Integer, Byte> heroMap1 = (Map)stonehengeDao.battlePosMap1.get(stonehengeDao.id);
         Map<Integer, Byte> heroMap2 = (Map)stonehengeDao.battlePosMap2.get(stonehengeDao.id);
         if (CollectionUtils.isEmpty(heroMap1) && CollectionUtils.isEmpty(heroMap2)) {
            stonehengeDao.arrayVerify = true;
            stonehengeDao.updateOp();
            return false;
         } else {
            Iterator var5 = arrayingInfoList.iterator();

            while(true) {
               HeroMsg.ArrayingList arrayingList;
               List<HeroMsg.ArrayingInfo> heroes;
               label47:
               while(true) {
                  if (!var5.hasNext()) {
                     stonehengeDao.arrayVerify = true;
                     stonehengeDao.updateOp();
                     return false;
                  }

                  arrayingList = (HeroMsg.ArrayingList)var5.next();
                  heroes = arrayingList.getInfoList();
                  if (arrayingList.getArrayingType() != CommonMsg.HeroState.HERO_STATE_STONEHENGE_1) {
                     break;
                  }

                  if (!CollectionUtils.isEmpty(heroMap2)) {
                     Iterator var8 = heroes.iterator();

                     HeroMsg.ArrayingInfo hero;
                     do {
                        if (!var8.hasNext()) {
                           break label47;
                        }

                        hero = (HeroMsg.ArrayingInfo)var8.next();
                     } while(!heroMap2.containsKey(hero.getCode()));

                     stonehengeDao.arrayVerify = false;
                     stonehengeDao.updateOp();
                     return true;
                  }
               }

               if (arrayingList.getArrayingType() == CommonMsg.HeroState.HERO_STATE_STONEHENGE_2 && !CollectionUtils.isEmpty(heroMap1)) {
                  for(HeroMsg.ArrayingInfo hero : heroes) {
                     if (heroMap1.containsKey(hero.getCode())) {
                        stonehengeDao.arrayVerify = false;
                        stonehengeDao.updateOp();
                        return true;
                     }
                  }
               }
            }
         }
      }
   }

   private void addPassLog() {
      StonehengeDao stonehengeDao = this.getStonehengeDao();
      String[] logParams = new String[4];
      logParams[0] = "通关难度: " + stonehengeDao.hardId;
      logParams[1] = this.buildHeroLog((Map)stonehengeDao.battlePosMap1.get(stonehengeDao.bossId), "阵营一: ");
      logParams[2] = this.buildHeroLog((Map)stonehengeDao.battlePosMap2.get(stonehengeDao.bossId), "阵营二: ");
      logParams[3] = "房间探索度: " + stonehengeDao.passIds.size();
      this.player.getOperationMgr().addExtraLog(this.player, 221, logParams);
   }

   private String buildHeroLog(Map<Integer, Byte> posMap, String front) {
      StringBuilder builder = new StringBuilder(front);
      if (CollectionUtils.isEmpty(posMap)) {
         return builder.append("boss房间战斗布阵数据为null").toString();
      } else {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         long totalPower = 0L;

         for(Map.Entry<Integer, Byte> entry : posMap.entrySet()) {
            HeroDao heroDao = heroBagPart.getHeroByCode((Integer)entry.getKey(), CommonMsg.HeroState.HERO_STATE_STONEHENGE_1);
            if (heroDao != null) {
               HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
               builder.append("[").append(entry.getValue()).append("_").append(heroModel.getName()).append("_").append(heroDao.getStar()).append("星_战力·").append(heroDao.combatPower).append("]; ");
               totalPower += heroDao.combatPower;
            }
         }

         builder.append("总战力=").append(totalPower);
         return builder.toString();
      }
   }

   public boolean systemNotOpen() {
      int stonehengeServerOpen = this.configManager.getIntDefault("stonehengeServerOpen", 90);
      int openServerDay = DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime())) + 1;
      return openServerDay < stonehengeServerOpen || !this.player.isSystemOpen(6310);
   }

   public void send22920(ArrayList<StonehengeDao.HPData> heroes) {
      StonehengeMsg.S2C_StonehengeEvent_22920.Builder builder = StonehengeMsg.S2C_StonehengeEvent_22920.newBuilder();
      StonehengeDao stonehengeDao = this.getStonehengeDao();
      builder.addAllPassId(stonehengeDao.passIds);
      builder.addAllMoveId(stonehengeDao.moveIds);
      builder.addAllBuff(stonehengeDao.buffs);
      if (!CollectionUtils.isEmpty(heroes)) {
         heroes.forEach((hpData) -> builder.addHero(hpData.toBuild()));
      }

      builder.setIsPass(stonehengeDao.isPass);
      this.player.sendMsg(builder.build());
   }

   public void gmOp(String order) {
      StonehengeDao stonehengeDao = this.getStonehengeDao();
      String[] split = order.split(",");
      WorldDao<ArrayList<Integer>> worldDao = this.worldMgr.<ArrayList<Integer>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_STONEHENGE_PATH);
      switch (split[0]) {
         case "room":
            int id = Integer.parseInt(split[1]);
            stonehengeDao.tempMap.remove(id);
            stonehengeDao.passIds.remove(id);
            break;
         case "hard":
            stonehengeDao.maxHardId = Integer.parseInt(split[1]);
            break;
         case "reset1":
            stonehengeDao.time = 0;
            break;
         case "reset2":
            stonehengeDao.reviveTime = 0;
            break;
         case "hp":
            for(StonehengeDao.HPData data : stonehengeDao.heroHpMap.values()) {
               data.hpPercent = 100;
            }
            break;
         case "pass":
            stonehengeDao.isPass = true;
            this.C2S_StonehengePass_22910(StonehengeMsg.C2S_StonehengePass_22910.newBuilder().setStatus(true).build(), (String)null);
            break;
         case "week":
            this.resetWeek();
            WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
            worldMgrPushTaskPart.resetStonehengePathType(DateUtil.getWeekStartTimeStamp());
            break;
         case "move":
            int roomId = Integer.parseInt(split[1]);
             id = 0;
            Map<Integer, StonehengeRoomModel> roomModelMap = ApplicationContextProvider.<Integer, StonehengeRoomModel>getModelPoolMap("stonehengeRoom");

            for(StonehengeRoomModel value : roomModelMap.values()) {
               if (value.getType() == stonehengeDao.inType && value.getRoomId() == roomId) {
                  if (!value.getIsMove()) {
                     this.player.failure(53, "房间[" + value.getRoomId() + "]不可移动");
                     return;
                  }

                  id = value.getId();
                  break;
               }
            }

            if (id == 0) {
               this.player.failure(53, "房间[" + roomId + "]找不到");
               return;
            }

            stonehengeDao.id = id;
            stonehengeDao.moveIds.add(id);
            break;
         case "rank":
            this.C2S_StonehengeRank_22916(StonehengeMsg.C2S_StonehengeRank_22916.newBuilder().build(), (String)null);
            break;
         case "end":
            stonehengeDao.clear();
            break;
         case "type":
            stonehengeDao.inType = Integer.parseInt(split[1]);
            break;
         case "reset3":
            (worldDao.jsonData).clear();
            worldDao.updateOp();
            break;
         case "buff":
            for(int i = 1; i < split.length; ++i) {
               stonehengeDao.buffs.add(Integer.parseInt(split[i]));
            }
            break;
         case "100":
            int level = Integer.parseInt(split[1]);
            Map<Integer, StonehengeRoomModel> roomMap = ApplicationContextProvider.<Integer, StonehengeRoomModel>getModelPoolMap("stonehengeRoom");
           worldDao = this.worldMgr.<ArrayList<Integer>>getWorldDao(GameDefine.WorldModule.WORLD_DAO_STONEHENGE_PATH);
            int type = CollectionUtils.isEmpty((Collection)worldDao.jsonData) ? 1 : (Integer)((ArrayList)worldDao.jsonData).get(((ArrayList)worldDao.jsonData).size() - 1);
            ArrayList<Integer> awards = new ArrayList();
            roomMap.values().stream().filter((room) -> room.getType() == type && (room.getEventType() == 1 || room.getEventType() == 2)).forEach((room) -> {
               Map<Integer, StonehengeRewardModel> rewardMap = ApplicationContextProvider.<Integer, StonehengeRewardModel>getModelPoolMap("stonehengeReward");
               List<StonehengeRewardModel> list = (List)rewardMap.values().stream().filter((r) -> r.checkCon(level, room.getEventType(), room.getEventId1())).collect(Collectors.toList());
               StonehengeRewardModel rewardModel = (StonehengeRewardModel)TempUtil.getOneForCollection(list);
               if (rewardModel != null) {
                  awards.add(rewardModel.getId());
               }

            });
            if (CollectionUtils.isEmpty(awards)) {
               this.player.failure(6);
               return;
            }

            ArrayList<ResourceModel> models = new ArrayList();

            for(Integer award : awards) {
               StonehengeRewardModel reward = (StonehengeRewardModel)ApplicationContextProvider.getModelPoolEntity("stonehengeReward", award);
               ResourceModel.addResourceToListPlus(models, reward.getRewards());
            }

            if (level == 1) {
               stonehengeDao.isPassNormal = true;
            }

            stonehengeDao.maxPassHard = Math.max(stonehengeDao.maxPassHard, level);
            stonehengeDao.maxHardId = Math.max(stonehengeDao.maxHardId, level);
            stonehengeDao.clear();
            this.player.addResource(models, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 133, 13301, 0, 0, "");
            this.C2S_StonehengeMain_22901((StonehengeMsg.C2S_StonehengeMain_22901)null, (String)null);
      }

      this.player.failure(1);
      stonehengeDao.updateOp();
      this.C2S_StonehengeMain_22901((StonehengeMsg.C2S_StonehengeMain_22901)null, "");
   }
}
