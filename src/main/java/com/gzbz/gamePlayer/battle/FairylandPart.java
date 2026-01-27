package com.gzbz.gamePlayer.battle;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.google.protobuf.ByteString;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.FairylandDao;
import com.gzbz.db.GiftDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.UnionDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.FairylandRecordData;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.record.BattleRecordMgr;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.HolyPlaceModel;
import com.gzbz.model.HolyPlaceRewardModel;
import com.gzbz.model.HolyPlaceVipRewardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.FairylandMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.UnionMgrParent;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import misc.DateUtil;
import net.CrossSubscribeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class FairylandPart extends PlayerPart {
   @Autowired
   ConfigManager configManager;
   @Autowired
   RankMgr rankMgr;
   @Autowired
   ActivityMgr activityMgr;
   @Autowired
   BattleRecordMgr battleRecordMgr;
   @Autowired
   private CrossNettyClient crossNettyClient;

   @MsgHandlerAnno
   public void C2S_FairylandInfo_4701(FairylandMsg.C2S_FairylandInfo_4701 msg, String channelId) {
      if (this.player.isSystemOpen(3005)) {
         FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
         FairylandMsg.S2C_FairylandInfo_4702.Builder builder = FairylandMsg.S2C_FairylandInfo_4702.newBuilder();
         Map<Integer, HolyPlaceModel> modelMap = this.player.getGameModelPool().getMap("holyPlace");
         if (landDao.stageId == 0) {
            List<HolyPlaceModel> list = new ArrayList();

            for(HolyPlaceModel model : modelMap.values()) {
               if (model.getType() == 1 && model.getStageNum() == 1) {
                  list.add(model);
               }
            }

            if (list.isEmpty()) {
               landDao.stageId = 1001;
            } else {
               landDao.stageId = ((HolyPlaceModel)list.get(0)).getId();
            }

            landDao.updateOp();
         }

         HolyPlaceModel model = (HolyPlaceModel)modelMap.get(landDao.stageId);
         if (model != null) {
            if (model.getNextStageID() != 0 && landDao.passState > 0) {
               landDao.passState = 0;
               landDao.updateOp();
            }

            builder.setPassState(landDao.passState);
            builder.setStageId(landDao.stageId);
            builder.addAllReceivedAward(landDao.commonAward);
            builder.addAllExtraAward(landDao.extraAward);
            builder.setTicketNum(landDao.ticketNum);
            builder.setCommonSweep(landDao.commonSweep);
            if (landDao.heroInfo != null && landDao.heroInfo.length > 0) {
               HeroMirror heroMirror = HeroMirror.toHeroMirror(landDao.heroInfo);
               builder.setHeroInfo(heroMirror.toBuilder());
            }

            for(FairylandRecordData data : landDao.recordData) {
               FairylandMsg.RecordData.Builder record = FairylandMsg.RecordData.newBuilder();
               record.setRecordId(data.recordId);
               record.setServerId(data.serverId);
               record.setPlayerId(data.playerId);
               record.setPlayerName(data.playerName);
               record.setHead(data.head);
               record.setHeadFrame(data.headFrame);
               record.setStageId(data.stageId);
               record.setTime(data.time);
               record.setPoint(data.point);
               record.setIsWin(data.isWin);
               record.setEnd(data.end);
               record.setLevel(data.level);
               builder.addRecords(record);
            }

            this.player.sendMsg(builder.build());
            PlayerPublicDao playerDao = this.player.getPublicDao();
            FairylandMsg.C2S_FairylandInfo_4701.Builder crossBuilder = msg.toBuilder();
            crossBuilder.setServerId(playerDao.serverId);
            crossBuilder.setPlayerId(this.player.getPlayerId());
            crossBuilder.setPlayerName(playerDao.playerName);
            crossBuilder.setSex(playerDao.sex);
            crossBuilder.setLv(playerDao.lv);
            crossBuilder.setCombatPower(this.player.getPlayerCombatPower());
            crossBuilder.setHeadId(playerDao.head);
            crossBuilder.setHeadFrame(playerDao.headFrame);
            crossBuilder.setPrestige(playerDao.prestige);
            crossBuilder.setMonarchId(playerDao.monarchId);
            crossBuilder.setUnionId(playerDao.unionId);
            crossBuilder.setUnionName("");
            crossBuilder.setVipLev(playerDao.vip_lv);
            if (playerDao.unionId > 0) {
               UnionMgrParent unionMgrParent = (UnionMgrParent)ApplicationContextProvider.getContext().getBean(UnionMgrParent.class);
               UnionDao unionDao = unionMgrParent.getUnionMgr(playerDao.unionId).getUnion();
               crossBuilder.setUnionName(unionDao.unionName);
            }

            PlayerDao dao = this.player.getPlayerDao();
            crossBuilder.setStepId(dao.peak_lv);
            crossBuilder.setProvince(this.player.getIpProvince());
            crossBuilder.setCity(this.player.getIpCity());
            crossBuilder.setTicketNum(landDao.ticketNum);
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), crossBuilder.build());
         }
      }
   }

   public int enterBattle(BattleDao battleDao) {
      int id = battleDao.modelId;
      FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
      if (id != landDao.stageId) {
         return 61002;
      } else {
         HolyPlaceModel model = (HolyPlaceModel)this.player.getGameModelPool().getEntity("holyPlace", id);
         if (Objects.isNull(model)) {
            return 61002;
         } else if (model.getNextStageID() == 0 && landDao.passState > 0) {
            return 62006;
         } else {
            BattlePKTeam rightTeam = new BattlePKTeam(model.getBattleId());
            battleDao.scene.addPKTeam((byte)1, rightTeam);
            battleDao.scene.setMaxRound((byte)20);
            this.player.getOperationMgr().addCopyLog(this.player, id, "游牧桃源");
            return 1;
         }
      }
   }

   public void afterFight(BattleDao battleDao) {
      HolyPlaceModel model = (HolyPlaceModel)this.player.getGameModelPool().getEntity("holyPlace", battleDao.modelId);
      if (model != null) {
         this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "游牧草原", "1");
         if (battleDao.scene.getWinForce() == 1) {
            this.player.getOperationMgr().addExtraLog(this.player, 213, model.getId() + "", "否", model.getId() + "");
         } else {
            BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();

            for(ResourceModel resource : model.getPassAwards()) {
               int type = resource.getType();
               int resourceId = resource.getId();
               int value = resource.getValue();
               result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(type).setId(resourceId).setNum(value));
            }

            battleDao.scene.getBattleMsg().setResult(result);
            BattleMsg.S2C_BattleResult_6102.Builder builder = battleDao.scene.getBattleMsg();
            builder.addExParams(model.getStageNum());
            if (model.getNextStageID() != 0) {
               builder.addExParams(model.getNextStageID());
            } else {
               builder.addExParams(model.getId());
            }

            battleDao.scene.setBattleMsg(builder);
            this.player.getOperationMgr().addExtraLog(this.player, 213, model.getId() + "", "是", model.getNextStageID() + "");
         }
      }
   }

   public void endBattle(BattleDao battleDao) {
      if (battleDao.scene.getWinForce() == 0) {
         int id = battleDao.modelId;
         HolyPlaceModel model = (HolyPlaceModel)this.player.getGameModelPool().getEntity("holyPlace", id);
         this.player.addResource(model.getPassAwards(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 62, 6201, 0, 0, "");
         FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
         if (model.getNextStageID() != 0) {
            landDao.stageId = model.getNextStageID();
         } else {
            landDao.passState = 1;
         }

         landDao.updateOp();
         this.rankMgr.pushTaskEx("updateRankHigherEx", new Object[]{RankDefine.RankModule.FAIRYLAND_BATTLE, model.getStageNum(), this.player.getPlayerId()});
         this.player.triggerTask(622, 0, (long)model.getStageNum(), 0);
      }

      battleDao.rewards.clear();
      FairylandMsg.S2C_BattleEnd_4716.Builder builder = FairylandMsg.S2C_BattleEnd_4716.newBuilder();
      FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
      builder.setStageId(landDao.stageId);
      builder.setPassState(landDao.passState);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_FairylandHero_4703(FairylandMsg.C2S_FairylandHero_4703 msg, String channelId) {
      if (DateUtil.isDayOfWeek(1) && DateUtil.cHour() >= 23) {
         this.player.failure(61119);
      } else {
         FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
         if (landDao.heroInfo == null || landDao.heroInfo.length <= 0) {
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
            if (heroModel.getNation() == 10 && heroDao.inheritNation <= 0) {
               this.logger.info("魂武将未继承阵营不能支援：" + msg.getHeroCode());
            } else if (heroDao == null) {
               this.logger.info("英雄不存在：" + msg.getHeroCode());
            } else if (!HeroModel.isReplacementHero(heroDao.id)) {
               if (heroDao.type == HeroDefine.HERO_SP_TYPE_PALACE) {
                  this.player.failure(76042);
               } else if (heroDao.type == HeroDefine.HERO_SP_TYPE_LINK && heroDao.linkCode <= 0) {
                  this.player.failure(76509);
               } else if (heroDao.invalidTime > 0) {
                  this.player.failure(76512);
               } else {
                  heroBagPart.heroBagFlushProperties(heroDao);
                  HeroMirror heroMirror = HeroMirror.fromHeroBean(heroDao);
                  landDao.heroInfo = heroMirror.toByteArray();
                  landDao.updateOp();
                  FairylandMsg.S2C_FairylandHero_4704.Builder builder = FairylandMsg.S2C_FairylandHero_4704.newBuilder();
                  builder.setHeroCode(msg.getHeroCode());
                  builder.setHeroInfo(heroMirror.toBuilder());
                  this.player.sendMsg(builder.build());
                  FairylandMsg.S2S_FairylandHero_4711.Builder heroBuilder = FairylandMsg.S2S_FairylandHero_4711.newBuilder();
                  heroBuilder.setHeroData(ByteString.copyFrom(landDao.heroInfo));
                  heroBuilder.setHeroPower((int)heroDao.getCombatPower());
                  this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), heroBuilder.build());
                  String award = this.configManager.getStrByDefault("holyPlaceInCycleReward", "2|1114|50");
                  String[] realAward = award.split("\\|");
                  this.player.addResource(Integer.parseInt(realAward[0]), Integer.parseInt(realAward[1]), Integer.parseInt(realAward[2]), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 62, 6208, 0, 0, "");
                  GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
                  guanJiaPart.checkState(3013, (List)null);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_FairylandExplore_4705(FairylandMsg.C2S_FairylandExplore_4705 msg, String channelId) {
      FairylandMsg.C2S_FairylandExplore_4705.Builder builder = msg.toBuilder();
      FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
      if (landDao.exploreHero != null && !landDao.exploreHero.isEmpty()) {
         builder.setFlushHero(false);
      } else {
         builder.setFlushHero(true);
      }

      HeroDao maxHero = this.player.getHeroOfMaxCombatPower();
      if (maxHero != null) {
         builder.setHeroPower((int)maxHero.getCombatPower());
      } else {
         builder.setHeroPower(100000);
      }

      builder.setTicketNum(landDao.ticketNum);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_FairylandBattle_4707(FairylandMsg.C2S_FairylandBattle_4707 msg, String channelId) {
      if (msg.getDegreeType() <= 4 && msg.getDegreeType() >= 1) {
         String holyPlaceEnterCost = this.configManager.getStrByDefault("holyPlaceEnterCost", "1|1|2|2");
         FairylandMsg.C2S_FairylandBattle_4707.Builder builder = msg.toBuilder();
         if (msg.getDegreeType() == 1 || msg.getDegreeType() == 2) {
            FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
            if (landDao.ticketNum < Integer.parseInt(holyPlaceEnterCost.split("\\|")[msg.getDegreeType() - 1])) {
               this.player.failure(61001);
               return;
            }
         }

         PlayerDao playerDao = this.player.getPlayerDao();
         boolean isPrivilege = playerDao.fairyland > 0;
         if (isPrivilege) {
            builder.setIsSpecial(true);
         } else {
            builder.setIsSpecial(false);
         }

         builder.setMaxPower(this.player.getMaxPlayerCombatPower());
         HeroDao maxHero = this.player.getHeroOfMaxCombatPower();
         if (maxHero != null) {
            builder.setHeroPower((int)maxHero.getCombatPower());
         } else {
            builder.setHeroPower(100000);
         }

         ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_FAIRYLAND);
         if (arrayingMirror == null || arrayingMirror.arrayingElementsMap.isEmpty()) {
            arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         }

         FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
         builder.setStageId(landDao.stageId);
         builder.setArraying(ByteString.copyFrom(arrayingMirror.toByteArray()));
         builder.setTicketNum(landDao.ticketNum);
         String holyPlaceFastFight = this.configManager.getStrByDefault("holyPlaceFastFight", "0|0|0|0,0|0|0|0");
         String[] limit = holyPlaceFastFight.split(",");
         int flag = 0;
         if (isPrivilege) {
            flag = Integer.parseInt(limit[1].split("\\|")[msg.getDegreeType() - 1]);
         } else {
            flag = Integer.parseInt(limit[0].split("\\|")[msg.getDegreeType() - 1]);
         }

         if (flag == 0) {
            builder.setIsSweep(false);
         } else {
            builder.setIsSweep(true);
         }

         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
         guanJiaPart.checkState(3012, (List)null);
      }
   }

   @MsgHandlerAnno
   public void S2S_UpdateHero_4721(FairylandMsg.S2S_UpdateHero_4721 msg, CrossSubscribeMsg crossSubscribeMsg) {
      FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
      if (landDao.exploreHero.isEmpty()) {
         landDao.exploreHero.put(1, 1);
         landDao.updateOp();
      }

   }

   @MsgHandlerAnno
   public void S2S_ExploreAward_4713(FairylandMsg.S2S_ExploreAward_4713 msg, CrossSubscribeMsg crossSubscribeMsg) {
      FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
      HolyPlaceModel model = (HolyPlaceModel)this.player.getGameModelPool().getEntity("holyPlace", landDao.stageId);
      String holyPlaceEnterCost = this.configManager.getStrByDefault("holyPlaceEnterCost", "1|1|2|2");
      int consume = Integer.parseInt(holyPlaceEnterCost.split("\\|")[msg.getDegreeType() - 1]);
      landDao.ticketNum -= consume;
      if (landDao.ticketNum < 0) {
         landDao.ticketNum = 0;
      }

      landDao.updateOp();
      if (msg.getIsWin()) {
         String award = this.configManager.getStrByDefault("holyPlaceSearchReward", "1|1.3|2.8|3");
         String[] awardLimit = award.split("\\|");
         List<ResourceModel> awardList = new ArrayList();

         for(ResourceModel searchModel : model.getSearchAwards()) {
            double value = Math.floor((double)(searchModel.getValue() * 10) * Double.parseDouble(awardLimit[msg.getDegreeType() - 1]) / (double)10.0F);
            ResourceModel resourceModel = new ResourceModel(searchModel.getType(), searchModel.getId(), (int)value);
            awardList.add(resourceModel);
         }

         if (msg.getIsShow()) {
            this.player.addResource(awardList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 62, 6203, 0, 0, "");
         } else {
            this.player.addResource(awardList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 62, 6203, 0, 0, "");
         }
      } else {
         String award = this.configManager.getStrByDefault("holyPlaceLoseReward", "5000|5000|5000|5000");
         String[] awardLimit = award.split("\\|");
         List<ResourceModel> awardList = new ArrayList();

         for(ResourceModel searchModel : model.getSearchAwards()) {
            double value = Math.floor((double)(searchModel.getValue() * Integer.parseInt(awardLimit[msg.getDegreeType() - 1]) / 10000));
            ResourceModel resourceModel = new ResourceModel(searchModel.getType(), searchModel.getId(), (int)value);
            awardList.add(resourceModel);
         }

         if (msg.getIsShow()) {
            this.player.addResource(awardList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 62, 6203, 0, 0, "");
         } else {
            this.player.addResource(awardList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 62, 6203, 0, 0, "");
         }
      }

      if (msg.hasResult()) {
         this.battleRecordMgr.pushTaskEx("saveFairyLandBattle", new Object[]{msg.getResult().toBuilder(), this.player});
      }

   }

   @MsgHandlerAnno
   public void S2S_NotifyBattle_4723(FairylandMsg.S2S_NotifyBattle_4723 msg, CrossSubscribeMsg crossSubscribeMsg) {
      FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
      ++landDao.recordFlag;
      FairylandRecordData data = new FairylandRecordData();
      data.recordId = landDao.recordFlag;
      data.serverId = msg.getServerId();
      data.playerId = msg.getPlayerId();
      data.playerName = msg.getPlayerName();
      data.head = msg.getHead();
      data.headFrame = msg.getHeadFrame();
      data.stageId = landDao.stageId;
      data.time = msg.getTime();
      data.point = msg.getPoint();
      data.end = false;
      data.level = msg.getLevel();
      data.isWin = msg.getIsWin();
      if (landDao.recordData.size() >= 20) {
         FairylandRecordData delData = (FairylandRecordData)landDao.recordData.remove(0);
         if (!delData.end) {
            HolyPlaceModel model = (HolyPlaceModel)this.player.getGameModelPool().getEntity("holyPlace", delData.stageId);
            if (model != null) {
               List<ResourceModel> rewardList = new ArrayList();
               if (delData.isWin) {
                  for(ResourceModel award : model.getRobSuccessAwards()) {
                     rewardList.add(new ResourceModel(award.getType(), award.getId(), award.getValue()));
                  }
               } else {
                  for(ResourceModel award : model.getRobFailAwards()) {
                     rewardList.add(new ResourceModel(award.getType(), award.getId(), award.getValue()));
                  }
               }

               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               CentreAwardModel rewardModel = this.getCentreAwardModel(CentreAwardModel.TYPE_FAIRYLAND_RECORD_AWARD, 0L);
               int logReason = 6207;
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), rewardModel.getDesc(), rewardList, 604800000L, 62, logReason);
            }
         }
      }

      landDao.recordData.add(data);
      landDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_FairylandRank_4709(FairylandMsg.C2S_FairylandRank_4709 msg, String channelId) {
      FairylandMsg.C2S_FairylandRank_4709.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_BattleRecord_4724(FairylandMsg.C2S_BattleRecord_4724 msg, String channelId) {
      FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
      FairylandMsg.S2C_BattleRecord_4725.Builder builder = FairylandMsg.S2C_BattleRecord_4725.newBuilder();

      for(FairylandRecordData data : landDao.recordData) {
         FairylandMsg.RecordData.Builder record = FairylandMsg.RecordData.newBuilder();
         record.setRecordId(data.recordId);
         record.setServerId(data.serverId);
         record.setPlayerId(data.playerId);
         record.setPlayerName(data.playerName);
         record.setHead(data.head);
         record.setHeadFrame(data.headFrame);
         record.setStageId(data.stageId);
         record.setTime(data.time);
         record.setPoint(data.point);
         record.setIsWin(data.isWin);
         record.setEnd(data.end);
         record.setLevel(data.level);
         builder.addRecords(record);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ReceiveRecordAward_4726(FairylandMsg.C2S_ReceiveRecordAward_4726 msg, String channelId) {
      Map<Integer, HolyPlaceModel> modelMap = this.player.getGameModelPool().getMap("holyPlace");
      FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
      List<ResourceModel> resourceList = new ArrayList();
      if (msg.getRecordId() == 0) {
         for(FairylandRecordData data : landDao.recordData) {
            if (!data.end) {
               if (modelMap.containsKey(data.stageId)) {
                  HolyPlaceModel model = (HolyPlaceModel)modelMap.get(data.stageId);
                  if (data.isWin) {
                     for(ResourceModel award : model.getRobSuccessAwards()) {
                        resourceList.add(new ResourceModel(award.getType(), award.getId(), award.getValue()));
                     }
                  } else {
                     for(ResourceModel award : model.getRobFailAwards()) {
                        resourceList.add(new ResourceModel(award.getType(), award.getId(), award.getValue()));
                     }
                  }
               }

               data.end = true;
            }
         }
      } else {
         for(FairylandRecordData data : landDao.recordData) {
            if (data.recordId == msg.getRecordId()) {
               if (data.end) {
                  return;
               }

               if (modelMap.containsKey(data.stageId)) {
                  HolyPlaceModel model = (HolyPlaceModel)modelMap.get(data.stageId);
                  if (data.isWin) {
                     for(ResourceModel award : model.getRobSuccessAwards()) {
                        resourceList.add(new ResourceModel(award.getType(), award.getId(), award.getValue()));
                     }
                  } else {
                     for(ResourceModel award : model.getRobFailAwards()) {
                        resourceList.add(new ResourceModel(award.getType(), award.getId(), award.getValue()));
                     }
                  }
               }

               data.end = true;
               break;
            }
         }
      }

      if (!resourceList.isEmpty()) {
         this.player.addResource(resourceList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 62, 6207, 0, 0, "");
         landDao.updateOp();
         FairylandMsg.S2C_ReceiveRecordAward_4727.Builder builder = FairylandMsg.S2C_ReceiveRecordAward_4727.newBuilder();
         builder.setRecordId(msg.getRecordId());
         this.player.sendMsg(builder.build());
         GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
         guanJiaPart.checkState(3013, (List)null);
      }
   }

   public int getStageSum() {
      FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
      HolyPlaceModel placeModel = (HolyPlaceModel)this.player.getGameModelPool().getEntity("holyPlace", landDao.stageId);
      if (placeModel != null) {
         return landDao.passState > 0 ? placeModel.getStageNum() : placeModel.getStageNum() - 1;
      } else {
         return 0;
      }
   }

   @MsgHandlerAnno
   public void C2S_ReceiveCommonAward_4717(FairylandMsg.C2S_ReceiveCommonAward_4717 msg, String channelId) {
      int stageSum = msg.getStageSum();
      FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
      if (this.getStageSum() < stageSum) {
         this.player.failure(61003);
      } else {
         HolyPlaceRewardModel model = (HolyPlaceRewardModel)this.player.getGameModelPool().getEntity("holyPlaceReward", stageSum);
         if (model != null) {
            if (model.getAllPassAwards().isEmpty()) {
               this.player.failure(61004);
            } else if (landDao.commonAward.contains(stageSum)) {
               this.player.failure(61004);
            } else {
               this.player.addResource(model.getAllPassAwards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 62, 6204, 0, 0, "");
               landDao.commonAward.add(stageSum);
               landDao.updateOp();
               FairylandMsg.S2C_ReceiveCommonAward_4718.Builder builder = FairylandMsg.S2C_ReceiveCommonAward_4718.newBuilder();
               builder.setStageSum(stageSum);
               builder.addAllReceiveAward(landDao.commonAward);
               builder.setResult(1);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ReceiveExtraAward_4719(FairylandMsg.C2S_ReceiveExtraAward_4719 msg, String channelId) {
      int stageSum = msg.getStageSum();
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      Map<Integer, GiftDao> giftDaoMap = giftPart.getBuyGifts(10);
      if (!giftDaoMap.containsKey(2039)) {
         this.player.failure(61005);
      } else {
         FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
         if (this.getStageSum() < stageSum) {
            this.player.failure(62005);
         } else {
            HolyPlaceVipRewardModel model = (HolyPlaceVipRewardModel)this.player.getGameModelPool().getEntity("holyPlaceVipReward", stageSum);
            if (model != null) {
               if (model.getAllPassAwards().isEmpty()) {
                  this.player.failure(61006);
               } else if (landDao.extraAward.contains(stageSum)) {
                  this.player.failure(61006);
               } else {
                  landDao.extraAward.add(stageSum);
                  landDao.updateOp();
                  this.player.addResource(model.getAllPassAwards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 62, 6205, 0, 0, "");
                  FairylandMsg.S2C_ReceiveExtraAward_4720.Builder builder = FairylandMsg.S2C_ReceiveExtraAward_4720.newBuilder();
                  builder.setStageSum(stageSum);
                  builder.setResult(1);
                  builder.addAllReceiveExtra(landDao.extraAward);
                  this.player.sendMsg(builder.build());
               }
            }
         }
      }
   }

   public void resetDaily() {
      FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
      landDao.ticketNum = 4;
      landDao.commonSweep = 0;
      landDao.exploreHero.clear();
      landDao.heroInfo = null;
      landDao.updateOp();
   }

   public void resetWeek() {
   }

   @MsgHandlerAnno
   public void S2S_SendRankAward_4722(FairylandMsg.S2S_SendRankAward_4722 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int rank = msg.getRank();
      CentreAwardModel rewardModel = this.getCentreAwardModel(CentreAwardModel.TYPE_FAIRY_LAND_JOIN, (long)rank);
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      String content = MessageFormat.format(rewardModel.getDesc(), rank);
      mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), content, rewardModel.getItems(), 604800000L, 62, 6206);
      this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "福地乱入", "排行奖励-" + rank, "排行奖励-" + rank, 0, 0, 1);
      if (msg.getChangeCross()) {
         FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
         if (landDao.heroInfo != null) {
            landDao.heroInfo = null;
            landDao.updateOp();
         }
      }

   }

   public void gmOp(int stageId) {
      FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
      if (stageId == -1) {
         ++landDao.recordFlag;
         FairylandRecordData data = new FairylandRecordData();
         data.recordId = landDao.recordFlag;
         data.serverId = this.player.getServerId();
         data.playerId = 100000;
         data.playerName = "测试数据" + landDao.recordFlag;
         data.head = this.player.getPublicDao().head;
         data.headFrame = this.player.getPublicDao().headFrame;
         data.stageId = 1016;
         data.time = DateUtil.getIntTime(System.currentTimeMillis());
         data.point = 100;
         data.end = false;
         data.level = 100;
         data.isWin = true;
         if (landDao.recordData.size() >= 20) {
            FairylandRecordData delData = (FairylandRecordData)landDao.recordData.remove(0);
            if (!delData.end) {
               HolyPlaceModel model = (HolyPlaceModel)this.player.getGameModelPool().getEntity("holyPlace", delData.stageId);
               if (model != null) {
                  List<ResourceModel> rewardList = new ArrayList();
                  if (delData.isWin) {
                     for(ResourceModel award : model.getRobSuccessAwards()) {
                        rewardList.add(new ResourceModel(award.getType(), award.getId(), award.getValue()));
                     }
                  } else {
                     for(ResourceModel award : model.getRobFailAwards()) {
                        rewardList.add(new ResourceModel(award.getType(), award.getId(), award.getValue()));
                     }
                  }

                  MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
                  CentreAwardModel rewardModel = this.getCentreAwardModel(CentreAwardModel.TYPE_FAIRYLAND_RECORD_AWARD, 0L);
                  int logReason = 6207;
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), rewardModel.getDesc(), rewardList, 604800000L, 62, logReason);
               }
            }
         }

         landDao.recordData.add(data);
         landDao.updateOp();
      } else if (stageId == 0) {
         landDao.ticketNum = 4;
         landDao.updateOp();
      } else {
         HolyPlaceModel model = (HolyPlaceModel)this.player.getGameModelPool().getEntity("holyPlace", stageId);
         if (model == null) {
            return;
         }

         landDao.stageId = stageId;
         landDao.updateOp();
      }

   }

   private CentreAwardModel getCentreAwardModel(int type, long rank) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardModelMap = this.player.getGameModelPool().getMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> rewardMap = (TreeMap)centreAwardModelMap.get(type);
      CentreAwardModel rewardModel = null;

      for(CentreAwardModel awardModel : rewardMap.values()) {
         if ((long)awardModel.getMinRank() <= rank && (long)awardModel.getMaxRank() >= rank) {
            rewardModel = awardModel;
            break;
         }
      }

      if (rewardModel == null) {
         rewardModel = (CentreAwardModel)rewardMap.lastEntry().getValue();
      }

      return rewardModel;
   }

   public boolean isOpen() {
      FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
      return landDao.stageId > 1001;
   }

   public void guanJiaOperateExplore(int systemId, int type) {
      FairylandMsg.C2S_FairylandExplore_4705.Builder builder1 = FairylandMsg.C2S_FairylandExplore_4705.newBuilder();
      FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
      builder1.setFlushHero(true);
      HeroDao maxHero = this.player.getHeroOfMaxCombatPower();
      if (maxHero != null) {
         builder1.setHeroPower((int)maxHero.getCombatPower());
      } else {
         builder1.setHeroPower(100000);
      }

      builder1.setTicketNum(landDao.ticketNum);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder1.build());
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      if (type <= 4 && type >= 1) {
         int realNum = 0;
         FairylandMsg.C2S_FairylandGuanJia_4728.Builder builder = FairylandMsg.C2S_FairylandGuanJia_4728.newBuilder();
         String holyPlaceEnterCost = this.configManager.getStrByDefault("holyPlaceEnterCost", "1|1|2|2");
         int cost = Integer.parseInt(holyPlaceEnterCost.split("\\|")[type - 1]);
         if (landDao.ticketNum < cost) {
            guanJiaPart.checkState(systemId, (List)null);
         } else {
            if (cost == 0) {
               realNum = landDao.ticketNum;
            } else {
               realNum = landDao.ticketNum / cost;
            }

            PlayerDao playerDao = this.player.getPlayerDao();
            boolean isPrivilege = playerDao.fairyland > 0;
            if (isPrivilege) {
               builder.setIsSpecial(true);
            } else {
               builder.setIsSpecial(false);
            }

            builder.setMaxPower(this.player.getMaxPlayerCombatPower());
            if (maxHero != null) {
               builder.setHeroPower((int)maxHero.getCombatPower());
            } else {
               builder.setHeroPower(100000);
            }

            ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_FAIRYLAND);
            if (arrayingMirror == null || arrayingMirror.arrayingElementsMap.isEmpty()) {
               arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
            }

            builder.setStageId(landDao.stageId);
            builder.setArraying(ByteString.copyFrom(arrayingMirror.toByteArray()));
            builder.setTicketNum(landDao.ticketNum);
            String holyPlaceFastFight = this.configManager.getStrByDefault("holyPlaceFastFight", "0|0|0|0,0|0|0|0");
            String[] limit = holyPlaceFastFight.split(",");
            int flag = 0;
            if (isPrivilege) {
               flag = Integer.parseInt(limit[1].split("\\|")[type - 1]);
            } else {
               flag = Integer.parseInt(limit[0].split("\\|")[type - 1]);
            }

            if (flag == 0) {
               builder.setIsSweep(false);
            } else {
               builder.setIsSweep(true);
            }

            if (realNum == 0) {
               guanJiaPart.checkState(systemId, (List)null);
            } else {
               builder.setNum(realNum);
               builder.setDegreeType(type);
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
               this.logger.info("探索成功：{}", realNum);
            }
         }
      } else {
         guanJiaPart.checkState(systemId, (List)null);
      }
   }

   @MsgHandlerAnno
   public void S2C_FairylandGuanJia_4729(FairylandMsg.S2C_FairylandGuanJia_4729 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.logger.info("收到探索结果：{}--{}---{}", new Object[]{msg.getNum(), msg.getWinNum(), msg.getTotalNum()});
      FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
      HolyPlaceModel model = (HolyPlaceModel)this.player.getGameModelPool().getEntity("holyPlace", landDao.stageId);
      String holyPlaceEnterCost = this.configManager.getStrByDefault("holyPlaceEnterCost", "1|1|2|2");
      int consume = Integer.parseInt(holyPlaceEnterCost.split("\\|")[msg.getDegreeType() - 1]);
      landDao.ticketNum -= consume;
      if (landDao.ticketNum < 0) {
         landDao.ticketNum = 0;
      }

      landDao.updateOp();
      if (msg.getIsWin()) {
         String award = this.configManager.getStrByDefault("holyPlaceSearchReward", "1|1.3|2.8|3");
         String[] awardLimit = award.split("\\|");
         List<ResourceModel> awardList = new ArrayList();

         for(ResourceModel searchModel : model.getSearchAwards()) {
            double value = Math.floor((double)(searchModel.getValue() * 10) * Double.parseDouble(awardLimit[msg.getDegreeType() - 1]) / (double)10.0F);
            ResourceModel resourceModel = new ResourceModel(searchModel.getType(), searchModel.getId(), (int)value);
            awardList.add(resourceModel);
         }

         this.player.addResource(awardList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 62, 6203, 0, 0, "");
      } else {
         String award = this.configManager.getStrByDefault("holyPlaceLoseReward", "5000|5000|5000|5000");
         String[] awardLimit = award.split("\\|");
         List<ResourceModel> awardList = new ArrayList();

         for(ResourceModel searchModel : model.getSearchAwards()) {
            double value = Math.floor((double)(searchModel.getValue() * Integer.parseInt(awardLimit[msg.getDegreeType() - 1]) / 10000));
            ResourceModel resourceModel = new ResourceModel(searchModel.getType(), searchModel.getId(), (int)value);
            awardList.add(resourceModel);
         }

         this.player.addResource(awardList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 62, 6203, 0, 0, "");
      }

      if (msg.hasResult()) {
         this.battleRecordMgr.pushTaskEx("saveFairyLandBattle", new Object[]{msg.getResult().toBuilder(), this.player});
      }

      if (msg.getTotalNum() == msg.getNum()) {
         List<ResourceModel> awardList = new ArrayList();

         for(int i = 0; i < msg.getWinNum(); ++i) {
            String award = this.configManager.getStrByDefault("holyPlaceSearchReward", "1|1.3|2.8|3");
            String[] awardLimit = award.split("\\|");

            for(ResourceModel searchModel : model.getSearchAwards()) {
               double value = Math.floor((double)(searchModel.getValue() * 10) * Double.parseDouble(awardLimit[msg.getDegreeType() - 1]) / (double)10.0F);
               ResourceModel resourceModel = new ResourceModel(searchModel.getType(), searchModel.getId(), (int)value);
               awardList.add(resourceModel);
            }
         }

         for(int i = 0; i < msg.getTotalNum() - msg.getWinNum(); ++i) {
            String award = this.configManager.getStrByDefault("holyPlaceLoseReward", "5000|5000|5000|5000");
            String[] awardLimit = award.split("\\|");

            for(ResourceModel searchModel : model.getSearchAwards()) {
               double value = Math.floor((double)(searchModel.getValue() * Integer.parseInt(awardLimit[msg.getDegreeType() - 1]) / 10000));
               ResourceModel resourceModel = new ResourceModel(searchModel.getType(), searchModel.getId(), (int)value);
               awardList.add(resourceModel);
            }
         }

         GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
         guanJiaPart.checkState(3012, awardList);
      }

   }

   public void guanJiaOperate(int systemId) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      List<ResourceModel> rewardList = new ArrayList();
      FairylandDao landDao = (FairylandDao)this.player.getData("tb_player_fairland", this.player.getPlayerId());
      if (landDao.heroInfo == null) {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getMaxPower();
         if (heroDao == null) {
            guanJiaPart.checkState(systemId, (List)null);
            return;
         }

         heroBagPart.heroBagFlushProperties(heroDao);
         HeroMirror heroMirror = HeroMirror.fromHeroBean(heroDao);
         landDao.heroInfo = heroMirror.toByteArray();
         FairylandMsg.S2C_FairylandHero_4704.Builder builder = FairylandMsg.S2C_FairylandHero_4704.newBuilder();
         builder.setHeroCode(heroDao.code);
         builder.setHeroInfo(heroMirror.toBuilder());
         this.player.sendMsg(builder.build());
         FairylandMsg.S2S_FairylandHero_4711.Builder heroBuilder = FairylandMsg.S2S_FairylandHero_4711.newBuilder();
         heroBuilder.setHeroData(ByteString.copyFrom(landDao.heroInfo));
         heroBuilder.setHeroPower((int)heroDao.getCombatPower());
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), heroBuilder.build());
         String award = this.configManager.getStrByDefault("holyPlaceInCycleReward", "2|1114|50");
         String[] realAward = award.split("\\|");
         rewardList.add(new ResourceModel(Integer.parseInt(realAward[0]), Integer.parseInt(realAward[1]), Integer.parseInt(realAward[2])));
      }

      Map<Integer, HolyPlaceModel> modelMap = this.player.getGameModelPool().getMap("holyPlace");

      for(FairylandRecordData data : landDao.recordData) {
         if (!data.end) {
            if (modelMap.containsKey(data.stageId)) {
               HolyPlaceModel model = (HolyPlaceModel)modelMap.get(data.stageId);
               if (data.isWin) {
                  for(ResourceModel award : model.getRobSuccessAwards()) {
                     rewardList.add(new ResourceModel(award.getType(), award.getId(), award.getValue()));
                  }
               } else {
                  for(ResourceModel award : model.getRobFailAwards()) {
                     rewardList.add(new ResourceModel(award.getType(), award.getId(), award.getValue()));
                  }
               }
            }

            data.end = true;
         }
      }

      if (rewardList.size() >= 2) {
         FairylandMsg.S2C_ReceiveRecordAward_4727.Builder builder = FairylandMsg.S2C_ReceiveRecordAward_4727.newBuilder();
         builder.setRecordId(0);
         this.player.sendMsg(builder.build());
      }

      if (rewardList.isEmpty()) {
         guanJiaPart.checkState(systemId, (List)null);
      } else {
         landDao.updateOp();
         this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 62, 6207, 0, 0, "");
         guanJiaPart.checkState(systemId, rewardList);
      }
   }
}
