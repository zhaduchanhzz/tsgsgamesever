package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.ThemeActivityDao;
import com.gzbz.db.bean.ActivityHeroThemeData;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.expedition.ExpeditionPart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.EventHeroBonusRewardModel;
import com.gzbz.model.EventHeroBossRewardModel;
import com.gzbz.model.EventHeroCallModel;
import com.gzbz.model.EventHeroCallTaskModel;
import com.gzbz.model.EventHeroConfigModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.HeroThemeMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.shop.part.ShopPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.HeroThemeTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class HeroThemePart extends AbstractActivityPart {
   @Autowired
   RankMgr rankMgr;
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   ConfigManager configManager;
   @Autowired
   private HeroRankMgr heroRankMgr;
   private static final int MAST_ID = 1;

   public void rotateReset(int oldActivityId) {
      ActivityHeroThemeData activityHeroThemeData = this.getHeroThemeData();
      activityHeroThemeData.reset();
      this.updateThemeDao();
      ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
      shopPart.resetShopById(25);
      HeroThemeTaskPart heroThemeTaskPart = (HeroThemeTaskPart)this.player.getMgrPart(HeroThemeTaskPart.class);
      heroThemeTaskPart.getTasksMap().values().forEach(TaskData::delete);
      heroThemeTaskPart.trigger();
      this.clearActivityGift(24);
      ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)this.player.getGameModelPool().getEntity("activityopenTime", this.getPlayerActivityId());
      if (activityOpenTimeModel != null) {
         ExpeditionPart expeditionPart = (ExpeditionPart)this.player.getMgrPart(ExpeditionPart.class);
         int expeditionId = activityOpenTimeModel.getExpeditionId();
         expeditionPart.resetChatpter(expeditionId);
      }

   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         ActivityHeroThemeData activityHeroThemeData = this.getHeroThemeData();
         HeroThemeMsg.S2C_HeroThemeInfo_13002.Builder builder = HeroThemeMsg.S2C_HeroThemeInfo_13002.newBuilder();
         builder.setFight(activityHeroThemeData.fight);
         builder.setTotalDamage(activityHeroThemeData.totalDamage);
         builder.setEmployTime(activityHeroThemeData.employTime);
         builder.addAllFightReward(activityHeroThemeData.fightReward);
         builder.setTotalPoint(activityHeroThemeData.totalPoint);
         builder.addAllPointReward(activityHeroThemeData.pointReward);
         ActivityInfo activityInfo = this.getServerActivityInfo();
         builder.setStartTime(activityInfo.start);
         builder.setEndTime(activityInfo.end);
         HeroThemeTaskPart heroThemeTaskPart = (HeroThemeTaskPart)this.player.getMgrPart(HeroThemeTaskPart.class);

         for(TaskData taskData : heroThemeTaskPart.getTasksMap().values()) {
            builder.addTask(heroThemeTaskPart.buildTask(taskData));
         }

         this.player.sendMsg(builder.build());
      }
   }

   public ActivityHeroThemeData getHeroThemeData() {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      return themeActivityDao.heroThemeData;
   }

   public void updateThemeDao() {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      themeActivityDao.updateOp();
   }

   public int getActivityType() {
      return 18;
   }

   public int getPlayerActivityId() {
      return super.getPlayerActivityId();
   }

   public EventHeroConfigModel getConfigModel() {
      EventHeroConfigModel model = (EventHeroConfigModel)this.player.getGameModelPool().getEntity("eventHeroConfig", this.getPlayerActivityId());
      if (model == null) {
         this.logger.error("主题武将活动配置错误！！！");
      }

      return model;
   }

   @MsgHandlerAnno
   public void C2S_HeroThemeInfo_13001(HeroThemeMsg.C2S_HeroThemeInfo_13001 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_Mate_13003(HeroThemeMsg.C2S_Mate_13003 msg, String source) {
      EventHeroConfigModel configModel = this.getConfigModel();
      int limitFight = configModel.getEventHeroFightTime();
      ActivityHeroThemeData themeData = this.getHeroThemeData();
      if (themeData.fight >= limitFight) {
         this.player.failure(0);
      } else {
         long power = this.player.getPlayerCombatPower();
         String matchLimit = configModel.getEventHeroMatchPower();
         String[] powerLimit = matchLimit.split(",");
         int matchPlayerId = 0;

         for(int i = 0; i < powerLimit.length; ++i) {
            int minLimit = Integer.parseInt(powerLimit[i].split("\\|")[0]);
            int maxLimit = Integer.parseInt(powerLimit[i].split("\\|")[1]);
            long minPower = power * (long)minLimit / 10000L;
            long maxPower = power * (long)maxLimit / 10000L;
            List<RankData> rankDataList = this.rankMgr.getRanks(RankDefine.RankModule.COMBAT_POWER, minPower, Math.max(maxPower, 20000L));
            if (!rankDataList.isEmpty()) {
               List<Integer> matchList = new ArrayList();

               for(RankData rankData : rankDataList) {
                  matchList.add(rankData.value);
               }

               Collections.shuffle(matchList);
               if (matchList.size() != 1 || (Integer)matchList.get(0) != this.player.getPlayerId()) {
                  int match = 0;
                  if ((Integer)matchList.get(0) == this.player.getPlayerId()) {
                     match = (Integer)matchList.get(matchList.size() - 1);
                  } else {
                     match = (Integer)matchList.get(0);
                  }

                  GamePlayer matchPlayer = this.worldMgr.getPlayerById(match);
                  if (matchPlayer != null) {
                     matchPlayerId = matchPlayer.getPlayerId();
                     break;
                  }
               }
            }
         }

         if (matchPlayerId == 0) {
            List<RankData> rankDataList = this.rankMgr.getRanks(RankDefine.RankModule.COMBAT_POWER, 100);
            if (rankDataList.isEmpty()) {
               this.player.failure(59002);
               return;
            }

            Collections.shuffle(rankDataList);
            matchPlayerId = ((RankData)rankDataList.get(0)).value;
         }

         if (matchPlayerId == 0) {
            if (this.worldMgr.getOnlinePlayerMap().isEmpty()) {
               this.player.failure(59002);
               return;
            }

            List<Integer> playerList = new ArrayList();
            playerList.addAll(this.worldMgr.getOnlinePlayerMap().keySet());
            Collections.shuffle(playerList);
            if (playerList.isEmpty() || playerList.size() == 1 && (Integer)playerList.get(0) == this.player.getPlayerId()) {
               this.player.failure(59002);
               return;
            }

            if ((Integer)playerList.get(0) == this.player.getPlayerId()) {
               matchPlayerId = (Integer)playerList.get(playerList.size() - 1);
            } else {
               matchPlayerId = (Integer)playerList.get(0);
            }
         }

         GamePlayer matchPlayer = this.worldMgr.getPlayerById(matchPlayerId);
         themeData.matchPlayerId = matchPlayerId;
         this.updateThemeDao();
         PlayerPublicDao matchDao = matchPlayer.getPublicDao();
         HeroThemeMsg.S2C_Mate_13004.Builder builder = HeroThemeMsg.S2C_Mate_13004.newBuilder();
         builder.setPower(matchPlayer.getPlayerCombatPower());
         builder.setMonarchId(matchDao.monarchId);
         builder.setPlayerName(matchDao.playerName);
         builder.setSex(matchDao.sex);
         ArrayingMirror arrayingMirror = matchPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_THEME);
         if (arrayingMirror == null || arrayingMirror.arrayingElementsMap.isEmpty()) {
            arrayingMirror = matchPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         }

         builder.setArraying(arrayingMirror.toPlayerArrayingInfo());
         this.player.sendMsg(builder.build());
      }
   }

   public int enterBattle(BattleDao battleDao) {
      int limitFight = this.getConfigModel().getEventHeroFightTime();
      ActivityHeroThemeData themeData = this.getHeroThemeData();
      if (themeData.fight >= limitFight) {
         return 0;
      } else if (themeData.matchPlayerId == 0) {
         return 59002;
      } else {
         int bossId = this.getConfigModel().getEventHeroBossId();
         PlayerDao playerDao = this.player.getPlayerDao();
         ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_THEME);
         if (arrayingMirror == null || arrayingMirror.arrayingElementsMap.isEmpty()) {
            arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         }

         BattlePKTeam battlePKTeam1 = new BattlePKTeam(playerDao.playerId, playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, false));
         BattlePKTeam battlePKTeam2 = new BattlePKTeam(bossId);
         battleDao.scene.addPKTeam((byte)0, battlePKTeam1);
         battleDao.scene.addPKTeam((byte)1, battlePKTeam2);
         battleDao.scene.setWave((short)1, (short)2);
         int maxRound = this.getConfigModel().getEventHeroBossRound();
         battleDao.scene.setMaxRound((byte)maxRound);
         return 1;
      }
   }

   public int nextBattle(BattleDao battleDao) {
      ActivityHeroThemeData themeData = this.getHeroThemeData();
      GamePlayer matchPlayer = this.worldMgr.getPlayerById(themeData.matchPlayerId);
      if (matchPlayer == null) {
         return 0;
      } else {
         PlayerPublicDao matchDao = matchPlayer.getPublicDao();
         HeroArrayingPart matchArrayingPart = (HeroArrayingPart)matchPlayer.getMgrPart(HeroArrayingPart.class);
         ArrayingMirror matchArraying;
         if (matchArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_THEME).isEmpty()) {
            matchArraying = matchPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         } else {
            matchArraying = matchPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_THEME);
         }

         BattlePKTeam battlePKTeam3 = new BattlePKTeam(matchDao.playerId, matchDao.playerName, matchArraying, matchDao.lv, matchDao.head, matchDao.headFrame, this.heroRankMgr.getHeroRankCompensate(matchArraying, false));
         battleDao.scene.addPKTeam((byte)0, battlePKTeam3);
         int maxRound = this.getConfigModel().getEventHeroBossRound();
         battleDao.scene.setMaxRound((byte)maxRound);
         battleDao.scene.setWave((short)2, (short)2);
         return 1;
      }
   }

   public void afterFight(BattleDao battleDao) {
      if (battleDao.scene.getWave() == 1) {
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
         result.setResult(0);
         long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
         result.addSettleInfo(damage);
         battleDao.scene.getBattleMsg().setResult(result);
         ActivityHeroThemeData themeData = this.getHeroThemeData();
         themeData.totalDamage += damage;
         ++themeData.fight;
         themeData.firstDamage = damage;
         int mvpHeroId = 0;
         long tempDamage = 0L;

         for(Entity entity : battleDao.scene.getPKTeam((byte)0).getEntityMap().values()) {
            if (entity.getAttackValue() > tempDamage) {
               tempDamage = entity.getAttackValue();
               mvpHeroId = entity.getDressHeroId();
            }
         }

         themeData.mvpHeroId = mvpHeroId;
         this.updateThemeDao();
      } else {
         battleDao.status = 0;
         battleDao.updateOp();
         long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
         ActivityHeroThemeData themeData = this.getHeroThemeData();
         long realDamage = damage - themeData.firstDamage;
         themeData.totalDamage += realDamage;
         themeData.secondDamage = realDamage;
         this.updateThemeDao();
         List<ResourceModel> commonAward = new ArrayList();
         ActivityInfo activityInfo = this.getServerActivityInfo();
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)this.player.getGameModelPool().getEntity("activityopenTime", activityInfo.id);
         EventHeroBossRewardModel damageAwardModel = this.getDamageRewardModel(themeData.firstDamage + themeData.secondDamage);
         if (damageAwardModel != null) {
            for(ResourceModel resourceModel : damageAwardModel.getReward()) {
               ResourceModel.addResourceToList(commonAward, resourceModel);
               if (resourceModel.getType() == activityOpenTimeModel.getIntegralType() && resourceModel.getId() == activityOpenTimeModel.getIntegralId()) {
                  themeData.totalPoint += resourceModel.getValue();
               }
            }
         } else {
            this.logger.error("主题武将伤害奖励获取错误！");
         }

         battleDao.rewards.addAll(commonAward);
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();

         for(ResourceModel resource : commonAward) {
            int type = resource.getType();
            int resourceId = resource.getId();
            int value = resource.getValue();
            result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(type).setId(resourceId).setNum(value));
         }

         result.setResult(0);
         battleDao.scene.getBattleMsg().setResult(result);
         BattleMsg.S2C_BattleResult_6102.Builder builder = battleDao.scene.getBattleMsg();
         builder.setIsNextWave(true);
         builder.addExParams(themeData.mvpHeroId);
         battleDao.scene.setBattleMsg(builder);
      }

   }

   public void endBattle(BattleDao battleDao) {
      String award = "";
      if (!battleDao.rewards.isEmpty()) {
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 61, 6101, 0, 0, "");

         for(ResourceModel reward : battleDao.rewards) {
            award = award + reward.getId() + "-" + reward.getValue() + ",";
         }
      }

      battleDao.rewards.clear();
      if (battleDao.scene.getWave() > 1) {
         ActivityHeroThemeData themeData = this.getHeroThemeData();
         HeroThemeMsg.S2C_MatchBattle_13012.Builder builder = HeroThemeMsg.S2C_MatchBattle_13012.newBuilder();
         builder.setDamage(themeData.firstDamage + themeData.secondDamage);
         builder.setFightNum(themeData.fight);
         builder.setTotalDamage(themeData.totalDamage);
         builder.setTotalPoint(themeData.totalPoint);
         this.player.sendMsg(builder.build());
         long damage = themeData.firstDamage + themeData.secondDamage;
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "魔仙挑战", award, damage + "", 0, 0, 1);
      }

   }

   public EventHeroBossRewardModel getDamageRewardModel(long damage) {
      ActivityInfo activityInfo = this.getServerActivityInfo();
      List<EventHeroBossRewardModel> list = (List)ApplicationContextProvider.getModelPoolEntity("customEventHeroBossReward", activityInfo.id);
      if (list != null && !list.isEmpty()) {
         for(EventHeroBossRewardModel model : list) {
            if (model.getActivityId() == activityInfo.id && damage >= model.getMinDamage() && (model.getMaxDamage() == 0L || damage < model.getMaxDamage())) {
               return model;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_PointReward_13007(HeroThemeMsg.C2S_PointReward_13007 msg, String source) {
      ActivityHeroThemeData themeData = this.getHeroThemeData();
      if (themeData.pointReward.contains(msg.getId())) {
         this.logger.info("已领取该奖励");
      } else {
         EventHeroBonusRewardModel bonusRewardModel = (EventHeroBonusRewardModel)ApplicationContextProvider.getModelPoolEntity("eventHeroBonusReward", msg.getId());
         if (bonusRewardModel == null) {
            this.logger.info("配置不存在");
         } else if (bonusRewardModel.getActivityId() != this.getPlayerActivityId()) {
            this.logger.info("领取的奖励不是该活动奖励 activityId:{}", this.getActivityType());
         } else if (themeData.totalPoint < bonusRewardModel.getBonus()) {
            this.logger.info("总积分不足，不可领取");
         } else {
            themeData.pointReward.add(msg.getId());
            this.updateThemeDao();
            this.player.addResource(bonusRewardModel.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 61, 6102, msg.getId(), 0, "");
            HeroThemeMsg.S2C_PointReward_13008.Builder builder = HeroThemeMsg.S2C_PointReward_13008.newBuilder();
            builder.setId(msg.getId());
            this.player.sendMsg(builder.build());
            this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 16, 18, "魔仙挑战", bonusRewardModel.getBonus() + "", bonusRewardModel.getBonus() + "", 0, 0, 1);
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Employ_13009(HeroThemeMsg.C2S_Employ_13009 msg, String source) {
      int number = msg.getNumber();
      if (number <= 0) {
         return this.player.failure(6);
      } else {
         int itemId = this.getConfigModel().getEventHeroCall();
         if (!this.player.checkResourceNum(2, itemId, number)) {
            return this.player.failure(18);
         } else {
            ActivityHeroThemeData themeData = this.getHeroThemeData();
            List<EventHeroCallModel> modelList = (List)this.player.getGameModelPool().getEntity("customEventHeroCall", this.getPlayerActivityId());
            if (CollectionUtils.isEmpty(modelList)) {
               return false;
            } else {
               int totalEmployCount = this.getConfigModel().getEventHeroRandomCount();
               List<KeyValFun> keyValFunList = new ArrayList();
               List<Integer> mustList = new ArrayList();

               for(EventHeroCallModel model : modelList) {
                  int hadCount = (Integer)themeData.employLimit.getOrDefault(model.getId(), 0);
                  int needCount = model.getRewardLimit() - hadCount;
                  if (model.getRandomid() == 1 && model.getRewardLimit() > 0) {
                     for(int i = 0; i < needCount; ++i) {
                        mustList.add(model.getId());
                     }
                  } else if (model.getRewardLimit() == 0 || needCount > 0) {
                     keyValFunList.add(new KeyValFun(model.getId(), model.getRewardheight()));
                  }
               }

               List<ResourceModel> resourceModelList = new ArrayList();
               int mustCallNum = 0;
               int remainderNum = themeData.employTime % totalEmployCount;
               if (mustList.size() > 0 && remainderNum + number >= totalEmployCount) {
                  mustCallNum = Math.min(number, mustList.size());

                  for(int i = 0; i < mustCallNum; ++i) {
                     EventHeroCallModel model = (EventHeroCallModel)ApplicationContextProvider.getModelPoolEntity("eventHeroCall", (Integer)mustList.get(i));
                     if (model == null) {
                        break;
                     }

                     if (model.getRewardLimit() > 0) {
                        int hadNum = (Integer)themeData.employLimit.getOrDefault(model.getId(), 0);
                        themeData.employLimit.put(model.getId(), hadNum + 1);
                     }

                     for(ResourceModel resourceModel : model.getReward()) {
                        resourceModelList.add(resourceModel);
                     }

                     int oriNum = (Integer)themeData.employRecord.getOrDefault(model.getId(), 0);
                     themeData.employRecord.put(model.getId(), oriNum + 1);
                  }
               }

               if (keyValFunList.size() == 0) {
                  this.logger.error("主题武将活动配置错误 eventHeroCall 表配置概率错误 playerId:{}", this.player.getPlayerId());
                  return false;
               } else {
                  int tempCount = number - mustCallNum;
                  if (tempCount > 0) {
                     for(int i = 0; i < tempCount; ++i) {
                        int id = GamePlayer.countRate(keyValFunList);
                        this.logger.info("主题武将活动-随机抽取物品 id:{}", id);
                        EventHeroCallModel model = (EventHeroCallModel)ApplicationContextProvider.getModelPoolEntity("eventHeroCall", id);
                        if (model.getRewardLimit() > 0) {
                           int hadNum = (Integer)themeData.employLimit.getOrDefault(model.getId(), 0);
                           themeData.employLimit.put(model.getId(), hadNum + 1);
                        }

                        for(ResourceModel resourceModel : model.getReward()) {
                           resourceModelList.add(resourceModel);
                        }

                        int oriNum = (Integer)themeData.employRecord.getOrDefault(model.getId(), 0);
                        themeData.employRecord.put(model.getId(), oriNum + 1);
                     }
                  }

                  themeData.employTime += number;
                  remainderNum += number;
                  this.player.delResource(2, itemId, (long)number, 61, 6103, 0, number, "");
                  this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 61, 6103, 0, number, "");
                  HeroThemeMsg.S2C_Employ_13010.Builder builder = HeroThemeMsg.S2C_Employ_13010.newBuilder();
                  builder.setNumber(number);
                  builder.setEmployTime(themeData.employTime);
                  this.player.sendMsg(builder.build());
                  if (remainderNum >= totalEmployCount) {
                     this.logger.info("本轮招募结束：{}", themeData.employRecord);
                     themeData.employLimit.clear();
                     themeData.employRecord.clear();
                  }

                  this.updateThemeDao();

                  for(ResourceModel resourceModel : resourceModelList) {
                     String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                     this.player.getOperationMgr().addExtraLog(this.player, 198, "魔仙堡-魔仙降临", itemId + "", number + "", strings[0], strings[2], strings[1], "0");
                  }

                  return true;
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TaskCommitTask_13013(HeroThemeMsg.C2S_TaskCommitTask_13013 msg, String source) {
      HeroThemeTaskPart heroThemeTaskPart = (HeroThemeTaskPart)this.player.getMgrPart(HeroThemeTaskPart.class);
      heroThemeTaskPart.commit(msg.getTaskId());
   }

   public void activityEnd(int oldActivityId) {
      ShopPart shopPart = (ShopPart)this.player.getMgrPart(ShopPart.class);
      shopPart.resetShopById(25);
      HeroMsg.S2C_HeroBaseData_5002.Builder result_builder = HeroMsg.S2C_HeroBaseData_5002.newBuilder();
      HeroArrayingPart mgrPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroArrayingDao arrayingDao = mgrPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_THEME);
      if (arrayingDao != null && !arrayingDao.elements.isEmpty()) {
         for(Map.Entry<Byte, Integer> entry : arrayingDao.elements.entrySet()) {
            switch ((Byte)entry.getKey()) {
               case 0:
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
                  HeroDao heroDao = heroBagPart.getHeroByCode((Integer)entry.getValue());
                  if (heroDao != null && heroDao.containState(CommonMsg.HeroState.HERO_STATE_THEME.getNumber())) {
                     heroDao.delState(CommonMsg.HeroState.HERO_STATE_THEME.getNumber());
                     heroDao.updateOp();
                     result_builder.addHeros(heroDao.toHeroInfo());
                  }
            }
         }

         arrayingDao.soulHeroCode = 0;
         arrayingDao.elements.clear();
         arrayingDao.updateOp();
         this.player.sendMsg(result_builder.build());
      }

      int switchItemId = this.configManager.getIntDefault("heroThemeSwitchItemId", 1003);
      int costId = this.getConfigModel().getEventHeroCall();
      List<ResourceModel> resourceModelList = new ArrayList();
      List<ResourceModel> switchResourceModels = new ArrayList();
      ActivityHeroThemeData themeData = this.getHeroThemeData();

      for(EventHeroBonusRewardModel bonusRewardModel : (List<EventHeroBonusRewardModel>)this.player.getGameModelPool().getEntity("customEventHeroBonusReward", this.getPlayerActivityId())) {
         if (!themeData.pointReward.contains(bonusRewardModel.getId()) && themeData.totalPoint >= bonusRewardModel.getBonus()) {
            for(ResourceModel resourceModel : bonusRewardModel.getReward()) {
               if (resourceModel.getType() == 2 && resourceModel.getId() == costId) {
                  ResourceModel.addResourceToList(switchResourceModels, new ResourceModel(resourceModel.getType(), switchItemId, resourceModel.getValue()));
               } else {
                  ResourceModel.addResourceToList(resourceModelList, resourceModel);
               }
            }
         }
      }

      HeroThemeTaskPart heroThemeTaskPart = (HeroThemeTaskPart)this.player.getMgrPart(HeroThemeTaskPart.class);
      Map<Integer, TaskData> tasksMap = heroThemeTaskPart.getTasksMap();

      for(TaskData taskData : tasksMap.values()) {
         if (taskData.state == 2) {
            EventHeroCallTaskModel callTaskModel = (EventHeroCallTaskModel)ApplicationContextProvider.getModelPoolEntity("eventHeroCallTask", taskData.id);
            if (callTaskModel != null) {
               resourceModelList.addAll(callTaskModel.getRewards());
            }
         }
      }

      EventHeroConfigModel model = (EventHeroConfigModel)this.player.getGameModelPool().getEntity("eventHeroConfig", this.getPlayerActivityId());
      Map<String, Integer> mailMap = new HashMap();
      String mailId = model.getMailId();
      String[] mailIdArr = mailId.split("\\|");

      for(String str : mailIdArr) {
         String[] cell = str.split(":");
         mailMap.put(cell[0], Integer.parseInt(cell[1]));
      }

      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      CentreAwardModel centreAwardModel = (CentreAwardModel)this.player.getGameModelPool().getEntity("centreAward", mailMap.get("end"));
      if (centreAwardModel != null && resourceModelList.size() > 0) {
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModelList, 604800000L, 61, 6105);
      }

      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      int num = itemBagPart.getItemNum(costId);
      if (num > 0) {
         switchResourceModels.add(new ResourceModel(2, switchItemId, num));
      }

      itemBagPart.deleteItems(costId, 61, 6105, costId, num, "主题武将活动结束");
      centreAwardModel = (CentreAwardModel)this.player.getGameModelPool().getEntity("centreAward", mailMap.get("change"));
      if (centreAwardModel != null && switchResourceModels.size() > 0) {
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), switchResourceModels, 604800000L, 61, 6105);
      }

      ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)this.player.getGameModelPool().getEntity("activityopenTime", oldActivityId);
      if (activityOpenTimeModel != null) {
         if (activityOpenTimeModel.getIntegralType() == 2) {
            itemBagPart.deleteItems(activityOpenTimeModel.getIntegralId(), 61, 6105, activityOpenTimeModel.getIntegralType(), activityOpenTimeModel.getIntegralId(), "主题武将活动结束" + oldActivityId);
         } else if (activityOpenTimeModel.getIntegralType() == 1) {
            this.player.updateProperty(activityOpenTimeModel.getIntegralId(), 0L, 61, 6105, 0, 0, "activityId:" + oldActivityId);
         }
      }

      heroThemeTaskPart.getTasksMap().values().forEach(TaskData::delete);
   }

   public void resetDaily() {
      ActivityHeroThemeData themeData = this.getHeroThemeData();
      themeData.fight = 0;
      this.updateThemeDao();
   }

   public void gmHeroTheme(String params) {
      ActivityHeroThemeData themeData = this.getHeroThemeData();
      String[] strArr = params.split(",");
      switch (strArr[0]) {
         case "dam":
            themeData.totalDamage += Long.parseLong(strArr[1]);
            break;
         case "resumeemploy":
            themeData.employTime = 0;
            break;
         case "resumefight":
            themeData.fight = 0;
            break;
         case "allreset":
            themeData.reset();
      }

      this.updateThemeDao();
      this.sendInfo();
   }
}
