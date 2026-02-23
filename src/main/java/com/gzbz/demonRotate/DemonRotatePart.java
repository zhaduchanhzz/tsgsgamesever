package com.gzbz.demonRotate;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.part.AbstractActivityPart;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.ArtifactDao;
import com.gzbz.db.ArtifactDressDao;
import com.gzbz.db.BattleDao;
import com.gzbz.db.CooperateDao;
import com.gzbz.db.DemonRotateActivityDao;
import com.gzbz.db.DemonRotateBossDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.MagicBookDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.TongqueTerraceDao;
import com.gzbz.db.arraying.ArtifactArrayingEntity;
import com.gzbz.db.arraying.AssistantBeauty;
import com.gzbz.db.arraying.BeautyArrayingEntity;
import com.gzbz.db.arraying.DragonArrayingEntity;
import com.gzbz.db.arraying.FriendArrayingEntity;
import com.gzbz.db.arraying.HeroArrayingEntity;
import com.gzbz.db.arraying.PetArrayingEntity;
import com.gzbz.db.arraying.PetMirror;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.ArtifactData;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.demon.bean.DemonBossData;
import com.gzbz.dragon.part.DragonStrengthenPart;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.pet.PetPart;
import com.gzbz.gamePlayer.playerBag.ArtifactDressPart;
import com.gzbz.gamePlayer.playerBag.ArtifactPart;
import com.gzbz.gamePlayer.playerBag.StarMapPoint;
import com.gzbz.gamePlayer.tongque.TongqueTerracePart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ArtifactModel;
import com.gzbz.model.ArtifactSkillGroupModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.DuplicateRewardModel;
import com.gzbz.model.FengMoDynamicModel;
import com.gzbz.model.FengMoTianBoxModel;
import com.gzbz.model.FengMoTreasureModel;
import com.gzbz.model.FengMoWheelRewardModel;
import com.gzbz.model.FengmoBattleModel;
import com.gzbz.model.FengmoBuffModel;
import com.gzbz.model.FengmoDamageRewardModel;
import com.gzbz.model.FengmoDuplicateChanceModel;
import com.gzbz.model.FengmoFixedBuffModel;
import com.gzbz.model.FengmoShenShouModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.SevenDaysTaskModel;
import com.gzbz.model.TongQueSkillModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.DemonRotateActivityMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.DateUtil;
import misc.MapUtil;
import misc.MiscUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class DemonRotatePart extends AbstractActivityPart {
   static final Logger logger = LoggerFactory.getLogger(DemonRotatePart.class);
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private DemonRotateMgr demonRotateMgr;
   @Autowired
   private RankMgr rankMgr;
   @Autowired
   private HeroRankMgr heroRankMgr;
   public static final int DEMON_POINT = 1142;
   private static final String TIAN_MING_REWARD = "tianmingreward";

   public void sendInfo() {
   }

   public void rotateReset(int oldActivityId) {
      this.clearActivityGift(24);
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      demonActivityDao.wheel = 1;
      demonActivityDao.drawTimes = 0;
      demonActivityDao.totalDrawTimes = 0;
      demonActivityDao.jackpot.clear();
      demonActivityDao.timeRewards.clear();
      demonActivityDao.refreshReward = 0;
      demonActivityDao.records.clear();
      demonActivityDao.tianBoxCount = 0;
      demonActivityDao.destinyDrawed.clear();
      demonActivityDao.destinyBox = false;
      demonActivityDao.active = 0;
      demonActivityDao.fightNum = 0;
      demonActivityDao.buyFightNum = 0;
      demonActivityDao.randHeroNum = 0;
      demonActivityDao.bossFightNum = 0;
      demonActivityDao.refreshCopyNum = 0;
      demonActivityDao.randAward = 0;
      demonActivityDao.refreshFlag = 0;
      demonActivityDao.buff = 0;
      demonActivityDao.maxPoint = 0;
      demonActivityDao.receiveTask.clear();
      demonActivityDao.randRule.clear();
      demonActivityDao.randExist.clear();
      demonActivityDao.receiveBox.clear();
      demonActivityDao.copyIds.clear();
      demonActivityDao.fightCopys.clear();
      demonActivityDao.joinHero.clear();
      demonActivityDao.joinHero.clear();
      demonActivityDao.randHero.clear();
      demonActivityDao.hitHero.clear();
      demonActivityDao.arraying.clear();
      demonActivityDao.buffAward.clear();
      demonActivityDao.updateOp();
      PlayerDao playerDao = this.player.getPlayerDao();
      if (playerDao.fengmo_point != 0) {
         playerDao.fengmo_point = 0;
         playerDao.updateOp();
      }

      this.clearActivityGift(24);
   }

   @MsgHandlerAnno
   public void C2S_DemonCopyInfo_16301(DemonRotateActivityMsg.C2S_DemonCopyInfo_16301 msg, String source) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      this.demonRotateMgr.pushTaskEx("buildCopyInfo", new Object[]{this.player, demonActivityDao});
   }

   @MsgHandlerAnno
   public void C2S_DemonBossInfo_16303(DemonRotateActivityMsg.C2S_DemonBossInfo_16303 msg, String source) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      this.demonRotateMgr.pushTaskEx("buildBossInfo", new Object[]{this.player, demonActivityDao});
   }

   @MsgHandlerAnno
   public void C2S_LeaveBossUI_16350(DemonRotateActivityMsg.C2S_LeaveBossUI_16350 msg, String source) {
      this.demonRotateMgr.pushTaskEx("leaveBossUI", new Object[]{this.player});
   }

   @MsgHandlerAnno
   public void C2S_SelectBuff_16334(DemonRotateActivityMsg.C2S_SelectBuff_16334 msg, String source) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      DemonRotateBossDao bossDao = this.demonRotateMgr.getBossDao();
      Map<Integer, FengmoBuffModel> modelMap = this.player.getGameModelPool().getMap("FengmoBuff");
      int tempStage = 0;

      for(FengmoBuffModel model : modelMap.values()) {
         if (model.getValue() <= bossDao.tokenNum && model.getId() > tempStage && model.getActivityId() == this.getPlayerActivityId()) {
            tempStage = model.getId();
         }
      }

      if (tempStage == 0) {
         DemonRotateActivityMsg.S2C_SelectBuff_16335.Builder builder = DemonRotateActivityMsg.S2C_SelectBuff_16335.newBuilder();
         builder.setBuff(0);
         builder.setType(msg.getType());
         this.player.sendMsg(builder.build());
      } else {
         FengmoBuffModel model = (FengmoBuffModel)modelMap.get(tempStage);
         if (!model.getBuffId2().contains(msg.getBuffId())) {
            logger.error("buff选择错误:" + msg.getBuffId());
         }

         demonActivityDao.buff = msg.getBuffId();
         demonActivityDao.updateOp();
         DemonRotateActivityMsg.S2C_SelectBuff_16335.Builder builder = DemonRotateActivityMsg.S2C_SelectBuff_16335.newBuilder();
         builder.setBuff(demonActivityDao.buff);
         builder.setType(msg.getType());
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_DelBuff_16336(DemonRotateActivityMsg.C2S_DelBuff_16336 msg, String source) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      demonActivityDao.buff = 0;
      demonActivityDao.updateOp();
      DemonRotateActivityMsg.S2C_DelBuff_16337.Builder builder = DemonRotateActivityMsg.S2C_DelBuff_16337.newBuilder();
      builder.setBuff(demonActivityDao.buff);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ReceiveBuffAward_16338(DemonRotateActivityMsg.C2S_ReceiveBuffAward_16338 msg, String source) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      int realStage = msg.getBuffStage();
      if (this.getPlayerActivityId() == 3100) {
         realStage += 5;
      }

      FengmoBuffModel model = null;
      Map<Integer, FengmoBuffModel> modelMap = this.player.getGameModelPool().getMap("FengmoBuff");

      for(FengmoBuffModel buffModel : modelMap.values()) {
         if (realStage == buffModel.getId() && this.getPlayerActivityId() == buffModel.getActivityId()) {
            model = buffModel;
            break;
         }
      }

      DemonRotateBossDao bossDao = this.demonRotateMgr.getBossDao();
      if (model.getValue() > bossDao.tokenNum) {
         this.player.failure(61098);
      } else if (demonActivityDao.buffAward.contains(msg.getBuffStage())) {
         this.player.failure(61097);
      } else {
         this.player.addResource(model.getItem(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 67, 6706, 0, 0, "");
         demonActivityDao.buffAward.add(msg.getBuffStage());
         demonActivityDao.updateOp();
         DemonRotateActivityMsg.S2C_ReceiveBuffAward_16339.Builder builder = DemonRotateActivityMsg.S2C_ReceiveBuffAward_16339.newBuilder();
         builder.addAllBuffAward(demonActivityDao.buffAward);
         builder.setBuffStage(msg.getBuffStage());
         this.player.sendMsg(builder.build());
      }
   }

   public DemonRotateActivityDao getDemonActivityDao() {
      DemonRotateActivityDao demonActivityDao = (DemonRotateActivityDao)this.player.getData("tb_demon_rotate_activity", this.player.getPlayerId());
      if (demonActivityDao.copyIds.isEmpty()) {
         this.refreshCopy(demonActivityDao);
      }

      return demonActivityDao;
   }

   public void refreshCopy(DemonRotateActivityDao demonActivityDao) {
      DemonRotateBossDao bossDao = this.demonRotateMgr.getBossDao();
      int decValue = 0;
      int leftValue = 0;
      int duplicateType = 0;
      int addValue = 0;
      FengmoFixedBuffModel buffModel = this.getStaticRate(bossDao, 2);
      if (buffModel != null) {
         int num = buffModel.getDuplicateType() - 1;
         decValue = buffModel.getValue() / num;
         leftValue = buffModel.getValue() % num;
         duplicateType = buffModel.getDuplicateType();
         addValue = buffModel.getValue();
      }

      ++demonActivityDao.refreshFlag;
      int openCondition = 1;
      List<Integer> copyList = new ArrayList();
      int copyNum = this.configManager.getIntDefault("demonCopyNum", 2);
      List<Integer> copyTypeList = new ArrayList();
      Map<Integer, FengmoDuplicateChanceModel> map = this.player.getGameModelPool().getMap("fengmoDuplicatechance");

      for(FengmoDuplicateChanceModel model : map.values()) {
         if ((long)model.getWarPowerLow() <= this.player.getPlayerCombatPower() && (this.player.getPlayerCombatPower() < (long)model.getWarPowerMax() || model.getWarPowerMax() == 0)) {
            openCondition = model.getOpenCondition();
            List<KeyValFun> funList = new ArrayList();
            boolean flag = false;

            for(KeyValFun fun : model.getDuplicate()) {
               int value = fun.getVal();
               if (fun.getKey() < duplicateType) {
                  value -= decValue;
               }

               if (leftValue > 0 && (fun.getKey() == 1 || fun.getKey() == 2) && !flag) {
                  flag = true;
                  value -= leftValue;
               }

               if (fun.getKey() == duplicateType) {
                  value += addValue;
               }

               funList.add(new KeyValFun(fun.getKey(), value));
            }

            for(int i = 0; i < copyNum; ++i) {
               GamePlayer var10000 = this.player;
               int key = GamePlayer.countRate(funList);
               copyTypeList.add(key);
               funList.clear();
               boolean tempFlag = false;

               for(KeyValFun fun : model.getDuplicate()) {
                  if (fun.getKey() != key) {
                     int value = fun.getVal();
                     if (fun.getKey() < duplicateType) {
                        value -= decValue;
                     }

                     if (leftValue > 0 && (fun.getKey() == 1 || fun.getKey() == 2) && !tempFlag) {
                        tempFlag = true;
                        value -= leftValue;
                     }

                     if (fun.getKey() == duplicateType) {
                        value += addValue;
                     }

                     funList.add(new KeyValFun(fun.getKey(), value));
                  }
               }
            }
         }
      }

      Map<Integer, DuplicateRewardModel> duplicateMap = this.player.getGameModelPool().getMap("DuplicateRewards");
      boolean flag = false;
      if (demonActivityDao.refreshFlag != 4 && demonActivityDao.refreshFlag != 5 && demonActivityDao.refreshFlag != 6) {
         for(DuplicateRewardModel model : duplicateMap.values()) {
            if (model.getActivityID() == this.getServerActivityInfo().id && model.getOpenCondition() == (long)openCondition && copyTypeList.contains(model.getDuplicateType())) {
               copyList.add(model.getId());
               if (model.getDuplicateType() == 4 || model.getDuplicateType() == 5 || model.getDuplicateType() == 6) {
                  flag = true;
               }

               if (copyList.size() >= 2) {
                  break;
               }
            }
         }

         if (flag) {
            demonActivityDao.refreshFlag = 0;
         }
      } else {
         if (demonActivityDao.refreshFlag == 4) {
            for(DuplicateRewardModel model : duplicateMap.values()) {
               if (model.getActivityID() == this.getServerActivityInfo().id && model.getOpenCondition() == (long)openCondition && model.getDuplicateType() == 4) {
                  copyList.add(model.getId());
               }
            }
         } else if (demonActivityDao.refreshFlag == 5) {
            for(DuplicateRewardModel model : duplicateMap.values()) {
               if (model.getActivityID() == this.getServerActivityInfo().id && model.getOpenCondition() == (long)openCondition && model.getDuplicateType() == 5) {
                  copyList.add(model.getId());
                  if (copyList.size() >= 2) {
                     break;
                  }
               }
            }
         } else if (demonActivityDao.refreshFlag == 6) {
            for(DuplicateRewardModel model : duplicateMap.values()) {
               if (model.getActivityID() == this.getServerActivityInfo().id && model.getOpenCondition() == (long)openCondition && model.getDuplicateType() == 6) {
                  copyList.add(model.getId());
                  if (copyList.size() >= 2) {
                     break;
                  }
               }
            }
         }

         for(DuplicateRewardModel model : duplicateMap.values()) {
            if (model.getActivityID() == this.getServerActivityInfo().id && model.getOpenCondition() == (long)openCondition && copyTypeList.contains(model.getDuplicateType()) && !copyList.contains(model.getId())) {
               copyList.add(model.getId());
               if (copyList.size() >= 2) {
                  break;
               }
            }
         }
      }

      if (demonActivityDao.refreshFlag >= 6) {
         demonActivityDao.refreshFlag = 0;
      }

      demonActivityDao.copyIds.clear();
      Collections.sort(copyList);
      demonActivityDao.copyIds.addAll(copyList);
      demonActivityDao.fightCopys.clear();
      demonActivityDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_BuyFightNum_16305(DemonRotateActivityMsg.C2S_BuyFightNum_16305 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
         String buyCost = this.configManager.getStrByDefault("DuplicateChange", "3,50,100");
         String[] cost = buyCost.split(",");
         if (demonActivityDao.buyFightNum + 1 < cost.length) {
            int costNum = Integer.parseInt(cost[demonActivityDao.buyFightNum + 1]);
            if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, costNum)) {
               this.player.failure(31);
            } else {
               this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)costNum, 67, 856, demonActivityDao.fightNum + 1, 0, "");
               ++demonActivityDao.buyFightNum;
               demonActivityDao.updateOp();
               DemonRotateActivityMsg.S2C_BuyFightNum_16306.Builder builder = DemonRotateActivityMsg.S2C_BuyFightNum_16306.newBuilder();
               builder.setBuyFightNum(demonActivityDao.buyFightNum);
               builder.setFightNum(demonActivityDao.fightNum);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   public int enterBattle(BattleDao battleDao) {
      ActivityInfo activityInfo = this.getPlayerActivityInfo();
      if (activityInfo != null && activityInfo.open) {
         DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
         if (!demonActivityDao.copyIds.contains(battleDao.modelId)) {
            logger.info("挑战的id不对:" + battleDao.modelId + "----" + demonActivityDao.copyIds);
            return 61071;
         } else if (demonActivityDao.fightCopys.contains(battleDao.modelId)) {
            return 61100;
         } else {
            DuplicateRewardModel model = (DuplicateRewardModel)this.player.getGameModelPool().getEntity("DuplicateRewards", battleDao.modelId);
            if (model == null) {
               return 0;
            } else {
               String buyCost = this.configManager.getStrByDefault("DuplicateChange", "3,50,100");
               String[] cost = buyCost.split(",");
               int freeCount = Integer.parseInt(cost[0]);
               if (demonActivityDao.fightNum >= freeCount + demonActivityDao.buyFightNum) {
                  return 61072;
               } else {
                  Set<Integer> skillSet = new HashSet();
                  if (demonActivityDao.buff > 0) {
                     FengmoShenShouModel buffModel = (FengmoShenShouModel)this.player.getGameModelPool().getEntity("fengmoShenShou", demonActivityDao.buff);
                     if (buffModel != null) {
                        skillSet.add(buffModel.getEffect1());
                        skillSet.add(buffModel.getEffect2());
                        skillSet.add(buffModel.getEffect3());
                        skillSet.add(buffModel.getEffect4());
                        skillSet.add(buffModel.getEffect5());
                     }
                  }

                  for(Entity entity : battleDao.scene.getPKTeam((byte)0).getEntityMap().values()) {
                     entity.addUnderPalaceEffect(skillSet);
                  }

                  DemonRotateBossDao bossDao = this.demonRotateMgr.getBossDao();
                  PropertyModel addPro = this.getStaticDamageBuff(bossDao, 1);
                  if (addPro != null && addPro.getType() > 0) {
                     for(Entity entity : battleDao.scene.getPKTeam((byte)0).getEntityMap().values()) {
                        this.addProperty(entity, addPro.getType(), addPro.getWay(), addPro.getValue());
                     }
                  }

                  BattlePKTeam rightTeam = new BattlePKTeam(model.getBattleId());
                  battleDao.scene.addPKTeam((byte)1, rightTeam);
                  battleDao.scene.setMaxRound((byte)15);
                  return 1;
               }
            }
         }
      } else {
         return 61070;
      }
   }

   public void afterFight(BattleDao battleDao) {
      DuplicateRewardModel model = (DuplicateRewardModel)this.player.getGameModelPool().getEntity("DuplicateRewards", battleDao.modelId);
      DemonRotateBossDao bossDao = this.demonRotateMgr.getBossDao();
      int awardBuff = this.getStaticBuff(bossDao, 3);
      BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
      if (battleDao.scene.getWinForce() == 0) {
         for(ResourceModel resourceModel : model.getRewards()) {
            int realValue = resourceModel.getValue() * (100 + awardBuff) / 100;
            ResourceModel tempResource = new ResourceModel(resourceModel.getType(), resourceModel.getId(), realValue);
            result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(tempResource.getType()).setId(tempResource.getId()).setNum(tempResource.getValue()));
            battleDao.rewards.add(tempResource);
         }
      } else {
         for(ResourceModel resourceModel : model.getReissuerewards()) {
            int realValue = resourceModel.getValue() * (100 + awardBuff) / 100;
            ResourceModel tempResource = new ResourceModel(resourceModel.getType(), resourceModel.getId(), realValue);
            result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(tempResource.getType()).setId(tempResource.getId()).setNum(tempResource.getValue()));
            battleDao.rewards.add(tempResource);
         }
      }

      battleDao.scene.getBattleMsg().setResult(result);
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      ++demonActivityDao.fightNum;
      int tokenNum = 0;

      for(ResourceModel resourceModel : battleDao.rewards) {
         if (resourceModel.getId() == PlayerDefine.PLAYER_FENGMO_POINT && resourceModel.getType() == 1) {
            tokenNum = resourceModel.getValue();
            demonActivityDao.maxPoint += tokenNum;
         }
      }

      if (battleDao.scene.getWinForce() == 0) {
         demonActivityDao.fightCopys.add(battleDao.modelId);
      }

      demonActivityDao.updateOp();
      this.demonRotateMgr.pushTaskEx("updateTokenNum", new Object[]{this.player, tokenNum, demonActivityDao});
      RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
      int score = (int)rankPart.getScore(RankDefine.RankModule.DEMON_ROTATE_COPY_POINT);
      this.rankMgr.pushTaskEx("updateRankHigherEx", new Object[]{RankDefine.RankModule.DEMON_ROTATE_COPY_POINT, tokenNum + score, this.player.getPlayerId()});
      String award = "";

      for(ResourceModel reward : battleDao.rewards) {
         if (award.equals("")) {
            award = award + reward.getId() + ":" + reward.getValue();
         } else {
            award = award + "," + reward.getId() + ":" + reward.getValue();
         }
      }

      String desc = "失败";
      if (battleDao.scene.getWinForce() == 0) {
         desc = "成功";
      }

      if (award.equals("")) {
         award = "-";
      }

      this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getServerActivityInfo().id, "伏魔委托挑战", award, desc, model.getDuplicateType(), 0, 0);
   }

   public void endBattle(BattleDao battleDao) {
      if (!battleDao.rewards.isEmpty()) {
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 67, 6703, battleDao.modelId, 0, "");
         battleDao.rewards.clear();
      }

   }

   @MsgHandlerAnno
   public void C2S_RefreshCopy_16319(DemonRotateActivityMsg.C2S_RefreshCopy_16319 msg, String source) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      int freeCount = this.configManager.getInt("demonChange");
      if (demonActivityDao.refreshCopyNum >= freeCount) {
         String copyPurchase = this.configManager.getStrByDefault("copyPurchase", "1|9|50");
         String[] cost = copyPurchase.split("\\|");
         ResourceModel resourceModel = new ResourceModel(Integer.parseInt(cost[0]), Integer.parseInt(cost[1]), Integer.parseInt(cost[2]));
         if (!this.player.checkResourceNum(resourceModel)) {
            this.player.failure(61073);
            return;
         }

         this.player.delResource(resourceModel, 67, 6408, demonActivityDao.refreshCopyNum + 1, 0, "");
      }

      ++demonActivityDao.refreshCopyNum;
      this.refreshCopy(demonActivityDao);
      DemonRotateActivityMsg.S2C_RefreshCopy_16320.Builder builder = DemonRotateActivityMsg.S2C_RefreshCopy_16320.newBuilder();
      builder.setRefreshCopyNum(demonActivityDao.refreshCopyNum);
      builder.addAllCopyIds(demonActivityDao.copyIds);
      builder.addAllFightCopys(demonActivityDao.fightCopys);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_CommitTask_16344(DemonRotateActivityMsg.C2S_CommitTask_16344 msg, String source) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      SevenDaysTaskModel model = (SevenDaysTaskModel)ApplicationContextProvider.getModelPoolEntity("sevenDaysTasks", msg.getTaskId());
      if (model != null) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (model.getTargetNum() <= playerDao.fengmo_point) {
            if (!demonActivityDao.receiveTask.contains(msg.getTaskId())) {
               this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 67, 862, 0, 0, "");
               demonActivityDao.receiveTask.add(msg.getTaskId());
               demonActivityDao.updateOp();
               DemonRotateActivityMsg.S2C_CommitTask_16345.Builder builder = DemonRotateActivityMsg.S2C_CommitTask_16345.newBuilder();
               builder.setTaskId(msg.getTaskId());
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_receiveBox_16326(DemonRotateActivityMsg.C2S_receiveBox_16326 msg, String source) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      DemonRotateBossDao bossDao = this.demonRotateMgr.getBossDao();
      if (msg.getLevel() > bossDao.bossLev) {
         this.player.failure(61075);
      } else if (demonActivityDao.receiveBox.contains(msg.getLevel())) {
         this.player.failure(61074);
      } else {
         FengmoBattleModel model = (FengmoBattleModel)this.player.getGameModelPool().getEntity("fengmoBattle", msg.getLevel());
         if (model != null) {
            if (!model.getLevelReward().isEmpty()) {
               this.player.addResource(model.getLevelReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 67, 6705, 0, 0, "");
               demonActivityDao.receiveBox.add(msg.getLevel());
               demonActivityDao.updateOp();
               DemonRotateActivityMsg.S2C_ReceiveBox_16327.Builder builder = DemonRotateActivityMsg.S2C_ReceiveBox_16327.newBuilder();
               builder.setLevel(msg.getLevel());
               builder.addAllReceiveBox(demonActivityDao.receiveBox);
               this.player.sendMsg(builder.build());
               String award = "";

               for(ResourceModel resourceModel : model.getLevelReward()) {
                  if (award.equals("")) {
                     award = award + resourceModel.getId() + ":" + resourceModel.getValue();
                  } else {
                     award = award + "," + resourceModel.getId() + ":" + resourceModel.getValue();
                  }
               }

               this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getServerActivityInfo().id, "妖王宝箱", msg.getLevel() + "", award, 0, 0, 0);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SelectHero_16307(DemonRotateActivityMsg.C2S_SelectHero_16307 msg, String source) {
      int maxNum = this.configManager.getIntDefault("bossHeroPond", 2);
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      if (demonActivityDao.joinHero.size() >= maxNum) {
         logger.info("已经派遣两个英雄了！！！");
      } else {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
         if (heroDao != null) {
            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
            if (heroModel.getNation() != 10 || heroDao.inheritNation > 0) {
               if (!HeroModel.isReplacementHero(heroDao.id)) {
                  if (heroDao.type == HeroDefine.HERO_SP_TYPE_LINK && heroDao.linkCode <= 0) {
                     this.player.failure(76509);
                  } else if (heroDao.invalidTime > 0) {
                     this.player.failure(76512);
                  } else {
                     ArrayList<DemonBossData> byteList = new ArrayList();
                     heroBagPart.heroBagFlushProperties(heroDao);
                     HeroMirror heroMirror = HeroMirror.fromHeroBean(heroDao);
                     byte[] bytes = heroMirror.toByteArray();
                     DemonBossData data = new DemonBossData();
                     data.playerId = this.player.getPlayerId();
                     PlayerPublicDao playerPublicDao = this.player.getPublicDao();
                     data.playerName = playerPublicDao.playerName;
                     data.heroCode = heroDao.code;
                     data.heroId = heroDao.id;
                     data.heroLv = heroDao.getLv();
                     data.heroStar = heroDao.getStar();
                     data.heroPower = heroDao.getCombatPower();
                     data.bytes = bytes;
                     data.heroFlag = MiscUtil.comboInteger(data.playerId, heroDao.code);
                     Map<Integer, StarMapPoint> starMapPointMap = heroDao.recHeroStarMapPointMap();
                     if (null != starMapPointMap && starMapPointMap.size() > 0) {
                        data.resetStarMap(starMapPointMap);
                     }

                     if (heroModel != null) {
                        data.heroType = heroModel.getType();
                     }

                     data.dressId = heroDao.dressId;
                     byteList.add(data);
                     demonActivityDao.joinHero.add(bytes);
                     this.demonRotateMgr.pushTaskEx("addPoolHero", new Object[]{this.player, data});
                     if (demonActivityDao.randAward < 2) {
                        String putinReward = this.configManager.getStrByDefault("putinReward", "1|9|100");
                        String[] award = putinReward.split("\\|");
                        this.player.addResource(Integer.parseInt(award[0]), Integer.parseInt(award[1]), Integer.parseInt(award[2]), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 32, 3201, 0, 0, "");
                        ++demonActivityDao.randAward;
                     }

                     demonActivityDao.updateOp();
                     DemonRotateActivityMsg.S2C_SelectHero_16308.Builder builder = DemonRotateActivityMsg.S2C_SelectHero_16308.newBuilder();
                     builder.setResult(1);

                     for(byte[] joinBytes : demonActivityDao.joinHero) {
                        HeroMirror mirror = HeroMirror.toHeroMirror(joinBytes);
                        builder.addHeros(mirror.toBuilder());
                     }

                     this.player.sendMsg(builder.build());
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DelHero_16309(DemonRotateActivityMsg.C2S_DelHero_16309 msg, String source) {
      this.demonRotateMgr.pushTaskEx("delPoolHero", new Object[]{this.player, msg.getHeroCode()});
      DemonRotateActivityMsg.S2C_DelHero_16310.Builder builder = DemonRotateActivityMsg.S2C_DelHero_16310.newBuilder();
      builder.setResult(1);
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      List<byte[]> list = new ArrayList();

      for(byte[] bytes : demonActivityDao.joinHero) {
         HeroMirror mirror = HeroMirror.toHeroMirror(bytes);
         if (mirror.code != msg.getHeroCode()) {
            list.add(bytes);
         }
      }

      demonActivityDao.joinHero.clear();
      demonActivityDao.joinHero.addAll(list);
      demonActivityDao.updateOp();

      for(byte[] bytes : demonActivityDao.joinHero) {
         HeroMirror mirror = HeroMirror.toHeroMirror(bytes);
         builder.addHeros(mirror.toBuilder());
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_SupportHero_16347(DemonRotateActivityMsg.C2S_SupportHero_16347 msg, String source) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      demonActivityDao.updateOp();
      DemonRotateActivityMsg.S2C_SupportHero_16348.Builder builder = DemonRotateActivityMsg.S2C_SupportHero_16348.newBuilder();
      builder.setRandHeroNum(demonActivityDao.randHeroNum);
      if (demonActivityDao.randHero.isEmpty() && this.demonRotateMgr.checkBossOpen()) {
         this.demonRotateMgr.pushTaskEx("randPoolHero", new Object[]{this.player, demonActivityDao, 1});
      } else {
         for(DemonBossData data : demonActivityDao.randHero) {
            DemonRotateActivityMsg.RandHeroData.Builder heroBuilder = DemonRotateActivityMsg.RandHeroData.newBuilder();
            heroBuilder.setHeroPlayerId(data.playerId);
            heroBuilder.setHeroPlayerName(data.playerName);
            HeroMirror mirror = HeroMirror.toHeroMirror(data.bytes);
            heroBuilder.setHeroInfo(mirror.toBuilder());
            if (data.isSelect) {
               heroBuilder.setIsSelect(true);
            } else {
               heroBuilder.setIsSelect(false);
            }

            builder.addHeros(heroBuilder);
         }

         this.player.sendMsg(builder.build());
      }

   }

   @TaskMethod
   public void freeRandHeroResult(List<DemonBossData> list) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      demonActivityDao.randHero.clear();

      for(int i = 0; i < list.size(); ++i) {
         demonActivityDao.randHero.add(list.get(i));
         demonActivityDao.randExist.add(((DemonBossData)list.get(i)).heroFlag);
      }

      demonActivityDao.updateOp();
      DemonRotateActivityMsg.S2C_SupportHero_16348.Builder builder = DemonRotateActivityMsg.S2C_SupportHero_16348.newBuilder();
      builder.setRandHeroNum(demonActivityDao.randHeroNum);

      for(DemonBossData data : demonActivityDao.randHero) {
         DemonRotateActivityMsg.RandHeroData.Builder heroBuilder = DemonRotateActivityMsg.RandHeroData.newBuilder();
         heroBuilder.setHeroPlayerId(data.playerId);
         heroBuilder.setHeroPlayerName(data.playerName);
         HeroMirror mirror = HeroMirror.toHeroMirror(data.bytes);
         heroBuilder.setHeroInfo(mirror.toBuilder());
         if (data.isSelect) {
            heroBuilder.setIsSelect(true);
         } else {
            heroBuilder.setIsSelect(false);
         }

         builder.addHeros(heroBuilder);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_RandHero_16311(DemonRotateActivityMsg.C2S_RandHero_16311 msg, String source) {
      if (!this.demonRotateMgr.checkBossOpen()) {
         this.player.failure(61079);
      } else {
         DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
         String bossRandom = this.configManager.getStrByDefault("bossRandom", "3,50");
         String[] randNum = bossRandom.split(",");
         if (demonActivityDao.randHeroNum >= Integer.parseInt(randNum[0])) {
            if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, Integer.parseInt(randNum[1]))) {
               this.player.failure(31);
               return;
            }

            this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)Integer.parseInt(randNum[1]), 67, 6707, demonActivityDao.randHeroNum + 1, 0, "");
         }

         this.demonRotateMgr.pushTaskEx("randPoolHero", new Object[]{this.player, demonActivityDao, 2});
      }
   }

   @TaskMethod
   public void randHeroResult(List<DemonBossData> list) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      ++demonActivityDao.randHeroNum;
      demonActivityDao.randHero.clear();

      for(int i = 0; i < list.size(); ++i) {
         demonActivityDao.randHero.add(list.get(i));
         demonActivityDao.randExist.add(((DemonBossData)list.get(i)).heroFlag);
      }

      demonActivityDao.updateOp();
      DemonRotateActivityMsg.S2C_RandHero_16312.Builder builder = DemonRotateActivityMsg.S2C_RandHero_16312.newBuilder();
      builder.setRandHeroNum(demonActivityDao.randHeroNum);

      for(DemonBossData data : demonActivityDao.randHero) {
         DemonRotateActivityMsg.RandHeroData.Builder heroBuilder = DemonRotateActivityMsg.RandHeroData.newBuilder();
         heroBuilder.setHeroPlayerId(data.playerId);
         heroBuilder.setHeroPlayerName(data.playerName);
         HeroMirror mirror = HeroMirror.toHeroMirror(data.bytes);
         heroBuilder.setHeroInfo(mirror.toBuilder());
         if (data.isSelect) {
            heroBuilder.setIsSelect(true);
         } else {
            heroBuilder.setIsSelect(false);
         }

         builder.addHeros(heroBuilder);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_HeroPool_16328(DemonRotateActivityMsg.C2S_HeroPool_16328 msg, String source) {
      this.demonRotateMgr.pushTaskEx("heroPoolInfo", new Object[]{this.player});
   }

   @MsgHandlerAnno
   public void C2S_OneHeroInfo_16330(DemonRotateActivityMsg.C2S_OneHeroInfo_16330 msg, String source) {
      int playerId = msg.getHeroPlayerId();
      int heroCode = msg.getHeroCode();
      this.demonRotateMgr.pushTaskEx("oneHeroInfo", new Object[]{this.player, playerId, heroCode});
   }

   @MsgHandlerAnno
   public void C2S_ResetHero_16340(DemonRotateActivityMsg.C2S_ResetHero_16340 msg, String source) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      demonActivityDao.hitHero.clear();
      Iterator<DemonBossData> it = demonActivityDao.arraying.values().iterator();

      while(it.hasNext()) {
         DemonBossData data = (DemonBossData)it.next();
         if (data.playerId != this.player.getPlayerId()) {
            it.remove();
         }
      }

      demonActivityDao.updateOp();
      DemonRotateActivityMsg.S2C_ResetHero_16341.Builder builder = DemonRotateActivityMsg.S2C_ResetHero_16341.newBuilder();
      builder.setResult(1);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_RandHeroRule_16342(DemonRotateActivityMsg.C2S_RandHeroRule_16342 msg, String source) {
      if (msg.getRandRuleList().size() == 4) {
         for(int i = 1; i <= 4; ++i) {
            if (!msg.getRandRuleList().contains(i)) {
               return;
            }
         }

         DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
         if (!demonActivityDao.randRule.isEmpty() && demonActivityDao.randRule.get(0) != msg.getRandRuleList().get(0)) {
            demonActivityDao.randExist.clear();
         }

         demonActivityDao.randRule.clear();
         demonActivityDao.randRule.addAll(msg.getRandRuleList());
         demonActivityDao.updateOp();
         DemonRotateActivityMsg.S2C_RandHeroRule_16343.Builder builder = DemonRotateActivityMsg.S2C_RandHeroRule_16343.newBuilder();
         builder.addAllRandRule(demonActivityDao.randRule);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_SaveArraying_16313(DemonRotateActivityMsg.C2S_SaveArraying_16313 msg, String source) {
      if (!msg.getArrayingList().isEmpty()) {
         boolean flag = false;
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_DEMON_ROTATE_BOSS);
         DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         int limitStar = this.configManager.getIntDefault("SoulHeroLimitStar", 9);
         int targetSoulHeroCode = 0;
         List<Integer> linkHeroList = new ArrayList();

         for(DemonRotateActivityMsg.Arraying arraying : msg.getArrayingList()) {
            int heroPlayerId = arraying.getPlayerId();
            int heroCode = arraying.getHeroCode();
            if (heroPlayerId == this.player.getPlayerId()) {
               HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
               if (heroDao == null) {
                  this.player.failure(76109);
                  return;
               }

               if (HeroModel.isReplacementHero(heroDao.id)) {
                  this.player.failure(76182);
                  return;
               }

               if (heroDao.invalidTime > 0) {
                  this.player.failure(76513);
                  return;
               }

               if (heroDao.type == HeroDefine.HERO_SP_TYPE_LINK) {
                  if (heroDao.linkCode <= 0) {
                     this.player.failure(76509);
                     return;
                  }

                  HeroDao linkHeroDao = heroBagPart.getHeroByCode(heroDao.linkCode);
                  if (linkHeroDao != null) {
                     linkHeroList.add(linkHeroDao.id);
                  }
               }

               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
               if (heroModel == null) {
                  this.player.failure(0);
                  return;
               }

               if (heroModel.getNation() == 10 && heroDao.inheritNation <= 0) {
                  this.player.failure(76414);
                  return;
               }
            }
         }

         if (!linkHeroList.isEmpty() && msg.getArrayingList().stream().anyMatch((arrayingInfo) -> {
            if (arrayingInfo.getPlayerId() != this.player.getPlayerId()) {
               return false;
            } else {
               HeroDao heroDao = heroBagPart.getHeroByCode(arrayingInfo.getHeroCode());
               return heroDao == null || linkHeroList.contains(heroDao.id);
            }
         })) {
            this.player.failure(76510);
         } else {
            if (msg.hasSoulHeroCode() && msg.getSoulHeroCode() > 0) {
               HeroDao soulDao = heroBagPart.getHeroByCode(msg.getSoulHeroCode());
               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", soulDao.id);
               if (heroModel != null && heroModel.getNation() == 10 && soulDao.inheritNation > 0 && soulDao.getStar() >= limitStar && soulDao.heroStarSkills.size() >= heroModel.getFieldSkillSlotId()) {
                  demonActivityDao.soulHeroCode = msg.getSoulHeroCode();
               }
            }

            demonActivityDao.arraying.clear();

            for(DemonRotateActivityMsg.Arraying arraying : msg.getArrayingList()) {
               int heroPlayerId = arraying.getPlayerId();
               int heroCode = arraying.getHeroCode();
               if (heroPlayerId == this.player.getPlayerId()) {
                  HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                  if (arraying.getPos() == 5 && arraying.getHeroCode() == msg.getSoulHeroCode() && (heroArrayingDao == null || heroArrayingDao.friendState == 1) && demonActivityDao.soulHeroCode == arraying.getHeroCode()) {
                     demonActivityDao.soulHeroCode = 0;
                     demonActivityDao.updateOp();
                  }

                  if (heroModel.getNation() == 10 && targetSoulHeroCode == 0 && heroDao.getStar() >= limitStar && heroDao.heroStarSkills.size() >= heroModel.getFieldSkillSlotId() && (heroArrayingDao != null && heroArrayingDao.friendState == 0 || arraying.getPos() != 5)) {
                     targetSoulHeroCode = heroCode;
                  }

                  if (demonActivityDao.soulHeroCode == heroCode && heroDao.getStar() >= limitStar && heroDao.heroStarSkills.size() >= heroModel.getFieldSkillSlotId()) {
                     flag = true;
                  }

                  heroBagPart.heroBagFlushProperties(heroDao);
                  HeroMirror heroMirror = HeroMirror.fromHeroBean(heroDao);
                  byte[] bytes = heroMirror.toByteArray();
                  DemonBossData data = new DemonBossData();
                  data.playerId = this.player.getPlayerId();
                  PlayerPublicDao playerPublicDao = this.player.getPublicDao();
                  data.playerName = playerPublicDao.playerName;
                  data.bytes = bytes;
                  data.heroCode = heroDao.code;
                  data.heroId = heroDao.id;
                  data.heroLv = heroDao.getLv();
                  data.heroStar = heroDao.getStar();
                  data.heroPower = heroDao.getCombatPower();
                  data.heroFlag = MiscUtil.comboInteger(data.playerId, heroDao.code);
                  Map<Integer, StarMapPoint> starMapPointMap = heroDao.recHeroStarMapPointMap();
                  if (null != starMapPointMap && starMapPointMap.size() > 0) {
                     data.resetStarMap(starMapPointMap);
                  }

                  data.heroType = heroModel.getType();
                  data.dressId = heroDao.dressId;
                  data.bytes = bytes;
                  demonActivityDao.arraying.put(arraying.getPos(), data);
               } else {
                  for(DemonBossData bossData : demonActivityDao.hitHero) {
                     if (bossData.heroCode == heroCode && heroPlayerId == bossData.playerId) {
                        demonActivityDao.arraying.put(arraying.getPos(), bossData);
                     }
                  }
               }
            }

            if (!flag) {
               demonActivityDao.soulHeroCode = 0;
            }

            if (demonActivityDao.soulHeroCode == 0 && targetSoulHeroCode > 0) {
               demonActivityDao.soulHeroCode = targetSoulHeroCode;
            }

            demonActivityDao.updateOp();
            DemonRotateActivityMsg.S2C_SaveArraying_16314.Builder builder = DemonRotateActivityMsg.S2C_SaveArraying_16314.newBuilder();
            builder.setResult(1);
            builder.setSoulHeroCode(demonActivityDao.soulHeroCode);
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SelectSoulHero_16383(DemonRotateActivityMsg.C2S_SelectSoulHero_16383 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao != null) {
         HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
         if (heroModel != null && heroModel.getNation() == 10) {
            int limitStar = this.configManager.getIntDefault("SoulHeroLimitStar", 9);
            if (heroDao.inheritNation > 0 && heroDao.getStar() >= limitStar && heroDao.heroStarSkills.size() >= heroModel.getFieldSkillSlotId()) {
               Boolean flag = false;
               HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
               HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_DEMON_ROTATE_BOSS);
               DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();

               for(Map.Entry<Integer, DemonBossData> entry : demonActivityDao.arraying.entrySet()) {
                  if (((Integer)entry.getKey() != 5 || heroArrayingDao.friendState != 1) && ((DemonBossData)entry.getValue()).playerId == this.player.getPlayerId() && ((DemonBossData)entry.getValue()).heroCode == msg.getHeroCode()) {
                     flag = true;
                     break;
                  }
               }

               if (flag) {
                  demonActivityDao.soulHeroCode = msg.getHeroCode();
                  demonActivityDao.updateOp();
                  DemonRotateActivityMsg.S2C_SelectSoulHero_16384.Builder builder = DemonRotateActivityMsg.S2C_SelectSoulHero_16384.newBuilder();
                  builder.setArrayingType(msg.getArrayingType());
                  builder.setHeroCode(msg.getHeroCode());
                  this.player.sendMsg(builder.build());
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_MyArraying_16315(DemonRotateActivityMsg.C2S_MyArraying_16315 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      DemonRotateActivityMsg.S2C_MyArraying_16316.Builder builder = DemonRotateActivityMsg.S2C_MyArraying_16316.newBuilder();
      Iterator<Map.Entry<Integer, DemonBossData>> it = demonActivityDao.arraying.entrySet().iterator();

      while(it.hasNext()) {
         Map.Entry<Integer, DemonBossData> entry = (Map.Entry)it.next();
         DemonRotateActivityMsg.ExtraHero.Builder heroInfo = DemonRotateActivityMsg.ExtraHero.newBuilder();
         DemonBossData bossData = (DemonBossData)entry.getValue();
         heroInfo.setPos((Integer)entry.getKey());
         heroInfo.setHeroPlayerId(bossData.playerId);
         heroInfo.setHeroPlayerName(bossData.playerName);
         if (bossData.playerId == this.player.getPlayerId()) {
            HeroDao heroDao = heroBagPart.getHeroByCode(bossData.heroCode);
            if (heroDao == null) {
               it.remove();
               continue;
            }

            heroBagPart.heroBagFlushProperties(heroDao);
            HeroMirror heroMirror = HeroMirror.fromHeroBean(heroDao);
            byte[] bytes = heroMirror.toByteArray();
            bossData.bytes = bytes;
            heroInfo.setHeroPlayerId(this.player.getPlayerId());
            PlayerPublicDao playerPublicDao = this.player.getPublicDao();
            heroInfo.setHeroPlayerName(playerPublicDao.playerName);
            heroInfo.setInfo(heroMirror.toBuilder());
         } else {
            HeroMirror mirror = HeroMirror.toHeroMirror(bossData.bytes);
            heroInfo.setInfo(mirror.toBuilder());
         }

         builder.addExtra(heroInfo);
      }

      demonActivityDao.updateOp();
      builder.setTokeNum(this.demonRotateMgr.getBossDao().tokenNum);
      builder.setSoulHeroCode(demonActivityDao.soulHeroCode);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_HitOneHero_16332(DemonRotateActivityMsg.C2S_HitOneHero_16332 msg, String source) {
      if (!this.demonRotateMgr.checkBossOpen()) {
         this.player.failure(61079);
      } else {
         int heroPlayerId = msg.getHeroPlayerId();
         int heroCode = msg.getHeroCode();
         DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
         if (demonActivityDao.hitHero.size() < 2) {
            for(DemonBossData bossData : demonActivityDao.randHero) {
               if (bossData.heroCode == heroCode && bossData.playerId == heroPlayerId) {
                  bossData.isSelect = true;
                  demonActivityDao.hitHero.add(bossData);
               }
            }

            demonActivityDao.updateOp();
            DemonRotateActivityMsg.S2C_HitOneHero_16333.Builder builder = DemonRotateActivityMsg.S2C_HitOneHero_16333.newBuilder();
            builder.setResult(1);

            for(DemonBossData bossData : demonActivityDao.hitHero) {
               DemonRotateActivityMsg.RandHeroData.Builder heroBuilder = DemonRotateActivityMsg.RandHeroData.newBuilder();
               heroBuilder.setHeroPlayerId(bossData.playerId);
               heroBuilder.setHeroPlayerName(bossData.playerName);
               HeroMirror mirror = HeroMirror.toHeroMirror(bossData.bytes);
               heroBuilder.setHeroInfo(mirror.toBuilder());
               heroBuilder.setIsSelect(true);
               builder.addSelHeros(heroBuilder);
            }

            this.player.sendMsg(builder.build());
         }
      }
   }

   public int enterBossBattle(BattleDao battleDao) {
      if (this.isServerActivityInvalid()) {
         return 61070;
      } else if (!this.demonRotateMgr.checkBossOpen()) {
         return 61077;
      } else {
         int bossNum = this.configManager.getIntDefault("bossChange", 2);
         DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
         if (demonActivityDao.arraying.isEmpty()) {
            logger.info("未布阵！");
            return 61080;
         } else if (demonActivityDao.bossFightNum >= bossNum) {
            logger.info("boss挑战次数不足！");
            return 61081;
         } else {
            DemonRotateBossDao bossDao = this.demonRotateMgr.getBossDao();
            PlayerDao playerDao = this.player.getPlayerDao();
            HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
            ArrayingMirror arrayingMirror = new ArrayingMirror();
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            HeroDao heroDao = heroBagPart.getHeroByCode(demonActivityDao.soulHeroCode);
            if (heroDao != null) {
               arrayingMirror.soulHeroCode = demonActivityDao.soulHeroCode;
               arrayingMirror.soulHeroId = heroDao.id;
            }

            HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_DEMON_ROTATE_BOSS);
            if (heroArrayingDao != null) {
               arrayingMirror.friendNation = heroArrayingDao.friendNation;
               this.packArraying(arrayingMirror, heroArrayingDao);
            }

            for(Map.Entry<Integer, DemonBossData> entry : demonActivityDao.arraying.entrySet()) {
               HeroMirror heroMirror = HeroMirror.toHeroMirror(((DemonBossData)entry.getValue()).bytes);
               if ((Integer)entry.getKey() < 5) {
                  HeroArrayingEntity heroArrayingEntity = new HeroArrayingEntity();
                  heroArrayingEntity.positon = (Integer)entry.getKey();
                  heroArrayingEntity.code = -1;
                  heroArrayingEntity.mirror = heroMirror;
                  arrayingMirror.arrayingElementsMap.put(((Integer)entry.getKey()).byteValue(), heroArrayingEntity);
               } else if ((Integer)entry.getKey() == 5) {
                  FriendArrayingEntity friendArrayingEntity = new FriendArrayingEntity();
                  friendArrayingEntity.positon = (Integer)entry.getKey();
                  friendArrayingEntity.code = -1;
                  friendArrayingEntity.mirror = heroMirror;
                  arrayingMirror.arrayingElementsMap.put(((Integer)entry.getKey()).byteValue(), friendArrayingEntity);
               }
            }

            BattlePKTeam leftTeam = new BattlePKTeam(this.player.getPlayerId(), playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, this.player.isRobot()));
            Set<Integer> skillSet = new HashSet();
            if (demonActivityDao.buff > 0) {
               FengmoShenShouModel buffModel = (FengmoShenShouModel)this.player.getGameModelPool().getEntity("fengmoShenShou", demonActivityDao.buff);
               if (buffModel != null) {
                  skillSet.add(buffModel.getEffect1());
                  skillSet.add(buffModel.getEffect2());
                  skillSet.add(buffModel.getEffect3());
                  skillSet.add(buffModel.getEffect4());
                  skillSet.add(buffModel.getEffect5());
               }
            }

            battleDao.scene.addPKTeam((byte)0, leftTeam);

            for(Entity entity : battleDao.scene.getPKTeam((byte)0).getEntityMap().values()) {
               entity.addUnderPalaceEffect(skillSet);
            }

            PropertyModel addPro = this.getStaticDamageBuff(bossDao, 1);
            if (addPro != null && addPro.getType() > 0) {
               for(Entity entity : battleDao.scene.getPKTeam((byte)0).getEntityMap().values()) {
                  this.addProperty(entity, addPro.getType(), addPro.getWay(), addPro.getValue());
               }
            }

            FengmoBattleModel fengmoBattleModel = (FengmoBattleModel)this.player.getGameModelPool().getEntity("fengmoBattle", bossDao.bossLev);
            if (fengmoBattleModel == null) {
               return 0;
            } else {
               BattlePKTeam rightTeam = new BattlePKTeam(fengmoBattleModel.getBattleId());
               rightTeam.setLv(bossDao.bossLev);
               battleDao.scene.addPKTeam((byte)1, rightTeam);
               battleDao.scene.setMaxRound((byte)15);
               return 1;
            }
         }
      }
   }

   public void addProperty(Entity entity, int type, int way, long value) {
      if (way == 0) {
         entity.modifyBaseProperty(type, value);
      } else if (way == 1) {
         long oldValue = entity.getBaseProperty(type);
         long addValue = Double.valueOf((double)(oldValue * value) / (double)10000.0F).longValue();
         entity.modifyBaseProperty(type, addValue);
      }

   }

   public void packArraying(ArrayingMirror arrayingMirror, HeroArrayingDao heroArrayingDao) {
      for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
         switch ((Byte)entry.getKey()) {
            case 6:
               ArtifactPart artifactPart = (ArtifactPart)this.player.getMgrPart(ArtifactPart.class);
               ArtifactDao artifactDao = artifactPart.getArtifactDao();
               if (artifactDao != null && ((ArtifactData)artifactDao.artifacts.get(entry.getValue())).state == 2) {
                  ArtifactArrayingEntity artifactArrayingEntity = new ArtifactArrayingEntity();
                  artifactArrayingEntity.positon = (Byte)entry.getKey();
                  artifactArrayingEntity.code = (Integer)entry.getValue();
                  artifactArrayingEntity.skillId = ((ArtifactData)artifactDao.artifacts.get(entry.getValue())).skillId;
                  artifactArrayingEntity.level = artifactDao.skillLv;
                  ArtifactDressPart artifactDressPart = (ArtifactDressPart)this.player.getMgrPart(ArtifactDressPart.class);
                  ArtifactDressDao artifactDressDao = artifactDressPart.getArtifactDressDaoByArtifactId((Integer)entry.getValue());
                  if (artifactDressDao != null) {
                     ArtifactModel artifactModel = (ArtifactModel)ApplicationContextProvider.getModelPoolEntity("artifact", artifactArrayingEntity.code);
                     if (artifactModel != null) {
                        Map<Integer, ArtifactSkillGroupModel> groupModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customArtifactSkillGroup", artifactDressDao.id);
                        if (groupModelMap != null && !groupModelMap.isEmpty()) {
                           ArtifactSkillGroupModel model = (ArtifactSkillGroupModel)groupModelMap.get(artifactDao.skillLv);
                           if (model != null) {
                              artifactArrayingEntity.skinId = artifactDressDao.id;
                              artifactArrayingEntity.skillId = (Integer)model.getDressSkills().get(artifactModel.getSkillKey());
                           }
                        }
                     }
                  }

                  arrayingMirror.arrayingElementsMap.put(entry.getKey(), artifactArrayingEntity);
               }
               break;
            case 7:
               TongqueTerracePart tongqueTerracePart = (TongqueTerracePart)this.player.getMgrPart(TongqueTerracePart.class);
               TongqueTerraceDao tongqueTerraceDao = tongqueTerracePart.getTongqueTerraceDao((Integer)entry.getValue());
               if (tongqueTerraceDao != null && tongqueTerraceDao.state == 2) {
                  BeautyArrayingEntity beautyArrayingEntity = new BeautyArrayingEntity();
                  beautyArrayingEntity.positon = (Byte)entry.getKey();
                  beautyArrayingEntity.code = (Integer)entry.getValue();
                  beautyArrayingEntity.skillId = tongqueTerraceDao.skillId;
                  if (tongqueTerraceDao.cooperateType > 0) {
                     CooperateDao cooperateDao = tongqueTerracePart.getCooperateDao(tongqueTerraceDao.cooperateType);
                     if (cooperateDao != null) {
                        AssistantBeauty assistantBeauty = new AssistantBeauty();

                        for(Integer beautyId : cooperateDao.cooperateBeauty) {
                           assistantBeauty.beautyList.add(beautyId);
                           if (beautyId != 0 && beautyId != tongqueTerraceDao.beautyId) {
                              assistantBeauty.assistantList.add(beautyId);
                              TongqueTerraceDao extraBeautyDao = tongqueTerracePart.getTongqueTerraceDao(beautyId);
                              if (extraBeautyDao != null && extraBeautyDao.state == 2) {
                                 TongQueSkillModel tongQueSkillModel = (TongQueSkillModel)this.player.getGameModelPool().getEntity("TongQueSkill", extraBeautyDao.skillId);
                                 if (tongQueSkillModel != null) {
                                    assistantBeauty.assistantSkillList.add(tongQueSkillModel.getAssistantSkill());
                                    assistantBeauty.beautySkillList.add(tongQueSkillModel.getAssistantSkill());
                                 }
                              }
                           } else if (beautyId != 0) {
                              assistantBeauty.beautySkillList.add(tongqueTerraceDao.skillId);
                           } else {
                              assistantBeauty.beautySkillList.add(0);
                           }
                        }

                        beautyArrayingEntity.assistantBeauty = assistantBeauty;
                     }
                  }

                  arrayingMirror.arrayingElementsMap.put(entry.getKey(), beautyArrayingEntity);
               }
         }
      }

      MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
      if (magicBookDao.magicBookId > 0) {
         DragonArrayingEntity dragonArrayingEntity = new DragonArrayingEntity();
         dragonArrayingEntity.positon = 8;
         dragonArrayingEntity.code = magicBookDao.magicBookId;
         dragonArrayingEntity.skillIds.putAll(magicBookDao.skillPosition);
         DragonStrengthenPart dragonStrengthenPart = (DragonStrengthenPart)this.player.getMgrPart(DragonStrengthenPart.class);

         for(PropertyModel propertyModel : dragonStrengthenPart.getPropertyAdditions()) {
            dragonArrayingEntity.dragonStrengthen.put(propertyModel.getType(), propertyModel);
         }

         arrayingMirror.arrayingElementsMap.put((byte)8, dragonArrayingEntity);
      }

      PetPart petPart = (PetPart)this.player.getMgrPart(PetPart.class);
      if (petPart.isHavePetArraying()) {
         if (petPart.getPetMirrorMap().isEmpty()) {
         }

         TreeMap<Integer, PetMirror> petMap = new TreeMap();

         for(Map.Entry<Integer, PetMirror> entry : petPart.getPetMirrorMap().entrySet()) {
            petMap.put(((PetMirror)entry.getValue()).skillIndex, entry.getValue());
         }

         PetArrayingEntity petArrayingEntity = new PetArrayingEntity(9, 0, petMap);
         arrayingMirror.arrayingElementsMap.put((byte)9, petArrayingEntity);
      }

   }

   public int getStaticBuff(DemonRotateBossDao bossDao, int type) {
      int addValue = 0;
      List<Integer> buffList = new ArrayList();
      int temp = 0;
      Map<Integer, FengmoBuffModel> buffMap = this.player.getGameModelPool().getMap("FengmoBuff");

      for(FengmoBuffModel buffModel : buffMap.values()) {
         if (bossDao.tokenNum >= buffModel.getValue() && buffModel.getValue() > temp && buffModel.getActivityId() == this.getPlayerActivityId()) {
            temp = buffModel.getValue();
            buffList.clear();
            buffList.addAll(buffModel.getBuffId());
         }
      }

      Map<Integer, FengmoFixedBuffModel> fixedBuffModelMap = this.player.getGameModelPool().getMap("fengmoFixedBuff");

      for(int i = 0; i < buffList.size(); ++i) {
         int buffId = (Integer)buffList.get(i);
         if (fixedBuffModelMap.containsKey(buffId) && ((FengmoFixedBuffModel)fixedBuffModelMap.get(buffId)).getReasultType() == type) {
            addValue = ((FengmoFixedBuffModel)fixedBuffModelMap.get(buffId)).getValue();
            break;
         }
      }

      return addValue;
   }

   public PropertyModel getStaticDamageBuff(DemonRotateBossDao bossDao, int type) {
      List<Integer> buffList = new ArrayList();
      int temp = 0;
      Map<Integer, FengmoBuffModel> buffMap = this.player.getGameModelPool().getMap("FengmoBuff");

      for(FengmoBuffModel buffModel : buffMap.values()) {
         if (bossDao.tokenNum >= buffModel.getValue() && buffModel.getValue() > temp && buffModel.getActivityId() == this.getPlayerActivityId()) {
            temp = buffModel.getValue();
            buffList.clear();
            buffList.addAll(buffModel.getBuffId());
         }
      }

      Map<Integer, FengmoFixedBuffModel> fixedBuffModelMap = this.player.getGameModelPool().getMap("fengmoFixedBuff");

      for(int i = 0; i < buffList.size(); ++i) {
         int buffId = (Integer)buffList.get(i);
         if (fixedBuffModelMap.containsKey(buffId) && ((FengmoFixedBuffModel)fixedBuffModelMap.get(buffId)).getReasultType() == type) {
            PropertyModel model = new PropertyModel(((FengmoFixedBuffModel)fixedBuffModelMap.get(buffId)).getProId(), ((FengmoFixedBuffModel)fixedBuffModelMap.get(buffId)).getWay(), (long)((FengmoFixedBuffModel)fixedBuffModelMap.get(buffId)).getValue());
            return model;
         }
      }

      return null;
   }

   public FengmoFixedBuffModel getStaticRate(DemonRotateBossDao bossDao, int type) {
      FengmoFixedBuffModel model = null;
      List<Integer> buffList = new ArrayList();
      int temp = 0;
      Map<Integer, FengmoBuffModel> buffMap = this.player.getGameModelPool().getMap("FengmoBuff");

      for(FengmoBuffModel buffModel : buffMap.values()) {
         if (bossDao.tokenNum >= buffModel.getValue() && buffModel.getValue() > temp && buffModel.getActivityId() == this.getPlayerActivityId()) {
            temp = buffModel.getValue();
            buffList.clear();
            buffList.addAll(buffModel.getBuffId());
         }
      }

      Map<Integer, FengmoFixedBuffModel> fixedBuffModelMap = this.player.getGameModelPool().getMap("fengmoFixedBuff");

      for(int i = 0; i < buffList.size(); ++i) {
         int buffId = (Integer)buffList.get(i);
         if (fixedBuffModelMap.containsKey(buffId) && ((FengmoFixedBuffModel)fixedBuffModelMap.get(buffId)).getReasultType() == type) {
            model = (FengmoFixedBuffModel)fixedBuffModelMap.get(buffId);
            break;
         }
      }

      return model;
   }

   public void afterBossFight(BattleDao battleDao) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      DemonRotateBossDao bossDao = this.demonRotateMgr.getBossDao();
      BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
      long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
      Map<Integer, FengmoDamageRewardModel> damageMap = this.player.getGameModelPool().getMap("fengmoDamageReward");
      long tempDamage = 0L;
      int tempId = 0;
      boolean flag = false;

      for(FengmoDamageRewardModel model : damageMap.values()) {
         if (model.getMaxDamage() > tempDamage) {
            tempDamage = model.getMaxDamage();
            tempId = model.getId();
         }

         if (model.getMinDamage() <= damage && damage < model.getMaxDamage()) {
            flag = true;

            for(ResourceModel resourceModel : model.getReward()) {
               ResourceModel tempResource = new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue());
               result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(tempResource.getType()).setId(tempResource.getId()).setNum(tempResource.getValue()));
            }

            battleDao.rewards.addAll(model.getReward());
            break;
         }
      }

      if (!flag) {
         FengmoDamageRewardModel damageRewardModel = (FengmoDamageRewardModel)damageMap.get(tempId);

         for(ResourceModel resourceModel : damageRewardModel.getReward()) {
            result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(resourceModel.getType()).setId(resourceModel.getId()).setNum(resourceModel.getValue()));
         }

         battleDao.rewards.addAll(damageRewardModel.getReward());
      }

      result.addSettleInfo(damage);
      result.addSettleInfo(bossDao.damage + damage);
      result.addSettleInfo((long)bossDao.bossLev);
      result.setResult(0);
      battleDao.scene.getBattleMsg().setResult(result);
      ++demonActivityDao.bossFightNum;
      demonActivityDao.updateOp();
      this.demonRotateMgr.pushTaskEx("fightBoss", new Object[]{this.player, demonActivityDao, damage});
      this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getServerActivityInfo().id, "妖王降临", bossDao.bossLev + "", damage + "", 0, 0, 0);
   }

   public void endBossBattle(BattleDao battleDao) {
      if (!battleDao.rewards.isEmpty()) {
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 67, 6704, battleDao.modelId, 0, "");
         battleDao.rewards.clear();
      }

   }

   public int getActivityType() {
      return 44;
   }

   public void activityEnd(int oldActivityId) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      if (!demonActivityDao.destinyBox) {
         String[] strArr = ApplicationContextProvider.getConfigString("tianmingreward", "").split(",");
         if (demonActivityDao.active >= Integer.parseInt(strArr[0])) {
            List<ResourceModel> resourceModelList = new ArrayList();
            resourceModelList.add(ResourceModel.buildResource(strArr[1]));
            CentreAwardModel centreAwardModel = CentreAwardModel.getByType(CentreAwardModel.TYPE_TIAN_MING_BOX);
            if (centreAwardModel != null) {
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModelList, 604800000L, 67, 6708);
            }
         }
      }

      this.resetArraying();
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
         this.refreshCopy(demonActivityDao);
         demonActivityDao.randAward = 0;
         demonActivityDao.buyFightNum = 0;
         demonActivityDao.fightNum = 0;
         demonActivityDao.refreshCopyNum = 0;
         demonActivityDao.randHeroNum = 0;
         demonActivityDao.randHero.clear();
         demonActivityDao.joinHero.clear();
         demonActivityDao.bossFightNum = 0;
         demonActivityDao.hitHero.clear();
         demonActivityDao.refreshReward = 0;
         demonActivityDao.destinyDrawed.clear();
         demonActivityDao.randRule.clear();
         demonActivityDao.randExist.clear();
         demonActivityDao.refreshFlag = 0;
         demonActivityDao.buff = 0;
         Iterator<DemonBossData> it = demonActivityDao.arraying.values().iterator();

         while(it.hasNext()) {
            DemonBossData data = (DemonBossData)it.next();
            if (data.playerId != this.player.getPlayerId()) {
               it.remove();
            }
         }

         demonActivityDao.updateOp();
      }

   }

   public void resetArraying() {
      HeroArrayingPart mgrPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroMsg.S2C_HeroBaseData_5002.Builder result_builder = HeroMsg.S2C_HeroBaseData_5002.newBuilder();
      HeroArrayingDao arrayingDao = mgrPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_DEMON_ACTIVITY);
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
                  if (heroDao != null && heroDao.containState(CommonMsg.HeroState.HERO_STATE_DEMON_ACTIVITY.getNumber())) {
                     heroDao.delState(CommonMsg.HeroState.HERO_STATE_DEMON_ACTIVITY.getNumber());
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

   }

   @MsgHandlerAnno
   public void C2S_TreasureInfo_16361(DemonRotateActivityMsg.C2S_TreasureInfo_16361 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.sendTreasureInfo();
      }
   }

   private void sendTreasureInfo() {
      DemonRotateActivityMsg.S2C_TreasureInfo_16362.Builder builder = DemonRotateActivityMsg.S2C_TreasureInfo_16362.newBuilder();
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      builder.addAllId(demonActivityDao.jackpot);
      int curWheel = this.getCurWheel(demonActivityDao.wheel);
      builder.setWheel(curWheel);
      builder.setTianBoxCount(demonActivityDao.tianBoxCount);
      builder.addAllGotDrawTimes(demonActivityDao.timeRewards);
      builder.setRefreshReward(demonActivityDao.refreshReward);
      builder.setTotalDrawTimes(demonActivityDao.totalDrawTimes);
      builder.addAllEnjoyIds(demonActivityDao.enjoyIds);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_Enjoy_16363(DemonRotateActivityMsg.C2S_Enjoy_16363 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
         if (demonActivityDao.jackpot.size() != 0) {
            logger.info("现在不可选取心仪物品");
         } else {
            int curWheel = this.getCurWheel(demonActivityDao.wheel);
            List<FengMoTreasureModel> modelList = this.getFengMoTreasureModels(curWheel);
            if (modelList == null) {
               logger.info("找不到对应的配置 wheel:{}", curWheel);
            } else {
               Set<Integer> groupSet = new HashSet();

               for(FengMoTreasureModel model : modelList) {
                  groupSet.add(model.getGroup());
               }

               Map<Integer, Set<Integer>> groupMap = new HashMap();

               for(Integer id : msg.getIdList()) {
                  FengMoTreasureModel model = (FengMoTreasureModel)this.player.getGameModelPool().getEntity("fengmoTreasure", id);
                  if (model == null || model.getWheel() != curWheel) {
                     break;
                  }

                  ((Set)MapUtil.computeIfAbsent(groupMap, model.getGroup(), new HashSet())).add(model.getId());
               }

               if (groupMap.size() != groupSet.size()) {
                  logger.info("选择的心仪物品规则错误 组数不对 groupNum:{}", groupMap.size());
               } else {
                  int mibaoChoose = this.configManager.getIntDefault("mibaoChoose", 3);

                  for(Map.Entry<Integer, Set<Integer>> entry : groupMap.entrySet()) {
                     if (((Set)entry.getValue()).size() != mibaoChoose) {
                        logger.info("选择的心仪物品规则错误");
                        return;
                     }
                  }

                  demonActivityDao.jackpot.clear();
                  demonActivityDao.jackpot.addAll(msg.getIdList());
                  demonActivityDao.enjoyIds.clear();
                  demonActivityDao.enjoyIds.addAll(msg.getIdList());
                  demonActivityDao.updateOp();
                  DemonRotateActivityMsg.S2C_Enjoy_16364.Builder builder = DemonRotateActivityMsg.S2C_Enjoy_16364.newBuilder();
                  builder.addAllId(msg.getIdList());
                  this.player.sendMsg(builder.build());
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Draw_16365(DemonRotateActivityMsg.C2S_Draw_16365 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
         if (demonActivityDao.jackpot.size() == 0) {
            this.player.failure(61090);
         } else {
            int count = msg.getCount();
            if (demonActivityDao.jackpot.size() < count) {
               logger.info("奖池中的物品比抽奖次数少");
            } else {
               int countLimit = this.configManager.getIntDefault("demonDrawCountLimit", 5);
               if (count > countLimit) {
                  logger.info("一次性最多能进行{}次抽奖 count:{}", countLimit, count);
               } else {
                  int curWheel = this.getCurWheel(demonActivityDao.wheel);
                  List<FengMoTreasureModel> modelList = this.getFengMoTreasureModels(curWheel);
                  if (modelList != null && modelList.size() != 0) {
                     List<ResourceModel> materialList = new ArrayList();

                     for(ResourceModel resourceModel : ((FengMoTreasureModel)modelList.get(0)).getConsumeitem()) {
                        ResourceModel.addResourceToList(materialList, new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * count));
                     }

                     if (!this.player.checkResourceNum(materialList)) {
                        this.player.failure(3);
                     } else {
                        Set<Integer> rewardSet = new HashSet();
                        if (demonActivityDao.jackpot.size() == count) {
                           rewardSet.addAll(demonActivityDao.jackpot);
                        } else {
                           for(int i = 0; i < count; ++i) {
                              List<KeyValFun> keyValFunList = new ArrayList();

                              for(Integer id : demonActivityDao.jackpot) {
                                 if (!rewardSet.contains(id)) {
                                    FengMoTreasureModel model = (FengMoTreasureModel)this.player.getGameModelPool().getEntity("fengmoTreasure", id);
                                    if (demonActivityDao.drawTimes + i + 1 >= model.getFloorNum()) {
                                       keyValFunList.add(new KeyValFun(model.getId(), model.getWeight()));
                                    }
                                 }
                              }

                              int tempRewardId;
                              if (keyValFunList.size() == 0) {
                                 logger.warn("配置表配置有误，没有可抽出的物品，直接把奖池中第一个物品给玩家");
                                 tempRewardId = (Integer)demonActivityDao.jackpot.get(0);
                              } else {
                                 tempRewardId = GamePlayer.countRate(keyValFunList);
                              }

                              rewardSet.add(tempRewardId);
                           }
                        }

                        if (rewardSet.size() != count) {
                           logger.info("抽取的规则有误，请检查 count:{}", count);
                        } else {
                           int recordTimes = demonActivityDao.totalDrawTimes;
                           demonActivityDao.drawTimes += count;
                           demonActivityDao.totalDrawTimes += count;

                           for(int i = demonActivityDao.jackpot.size() - 1; i >= 0; --i) {
                              int rewardId = (Integer)demonActivityDao.jackpot.get(i);
                              if (rewardSet.contains(rewardId)) {
                                 demonActivityDao.jackpot.remove(i);
                              }
                           }

                           List<ResourceModel> resourceModelList = new ArrayList();

                           for(int rewardId : rewardSet) {
                              FengMoTreasureModel fengMoTreasureModel = (FengMoTreasureModel)this.player.getGameModelPool().getEntity("fengmoTreasure", rewardId);
                              resourceModelList.addAll(fengMoTreasureModel.getItem());
                              String record = "" + demonActivityDao.wheel + "," + rewardId + "," + DateUtil.getIntTime(System.currentTimeMillis());
                              demonActivityDao.records.add(record);
                           }

                           for(FengMoTianBoxModel tianBoxModel : (List<FengMoTianBoxModel>)ApplicationContextProvider.getModelPoolEntity("customFengmoTianBox", this.getPlayerActivityId())) {
                              int drawTIme = tianBoxModel.getDrawTime();
                              if (recordTimes < drawTIme && demonActivityDao.totalDrawTimes >= drawTIme) {
                                 ++demonActivityDao.tianBoxCount;
                                 resourceModelList.addAll(tianBoxModel.getTianreward());
                              }
                           }

                           demonActivityDao.updateOp();
                           int tempWheel = demonActivityDao.wheel;
                           if (demonActivityDao.jackpot.size() == 0) {
                              this.turnToNextWheel(demonActivityDao);
                           }

                           DemonRotateActivityMsg.S2C_Draw_16366.Builder builder = DemonRotateActivityMsg.S2C_Draw_16366.newBuilder();
                           builder.addAllId(rewardSet);
                           builder.setTianBoxCount(demonActivityDao.tianBoxCount);
                           builder.setTotalDrawTimes(demonActivityDao.totalDrawTimes);
                           builder.setWheel(this.getCurWheel(demonActivityDao.wheel));
                           this.player.delResource((List)materialList, 67, 856, 0, count, "");
                           this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 67, 856, tempWheel, 0, "");
                           this.player.sendMsg(builder.build());
                           int itemId = 0;
                           int itemNum = 0;

                           for(ResourceModel resourceModel : materialList) {
                              itemId = resourceModel.getId();
                              itemNum = resourceModel.getValue();
                           }

                           for(ResourceModel resourceModel : resourceModelList) {
                              String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                              this.player.getOperationMgr().addExtraLog(this.player, 198, "封魔秘宝", itemId + "", itemNum + "", strings[0], strings[2], strings[1], "0");
                           }

                        }
                     }
                  } else {
                     logger.info("找不到对应的配置 wheel:{}", curWheel);
                  }
               }
            }
         }
      }
   }

   private void turnToNextWheel(DemonRotateActivityDao demonActivityDao) {
      ++demonActivityDao.wheel;
      demonActivityDao.drawTimes = 0;
      demonActivityDao.updateOp();
   }

   private int getCurWheel(int totalWheel) {
      Map<Integer, List<FengMoTreasureModel>> map = (Map)ApplicationContextProvider.getModelPoolEntity("custom_fengmoTreasure", this.getPlayerActivityId());
      if (map.size() <= 1) {
         return 1;
      } else {
         int offset = totalWheel % map.size();
         return offset == 0 ? map.size() : offset;
      }
   }

   @MsgHandlerAnno
   public void C2S_DestinyInfo_16369(DemonRotateActivityMsg.C2S_DestinyInfo_16369 msg, String source) {
      this.sendDestinyInfo();
   }

   private void sendDestinyInfo() {
      if (!this.isServerActivityInvalid()) {
         DemonRotateActivityMsg.S2C_DestinyInfo_16370.Builder builder = DemonRotateActivityMsg.S2C_DestinyInfo_16370.newBuilder();
         DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
         builder.addAllId(demonActivityDao.destinyDrawed);
         builder.setDestinyBoxState(demonActivityDao.destinyBox);
         builder.setActive(demonActivityDao.active);
         int day = this.getSeverActivityDay();
         builder.setDay(day);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_DestinyDraw_16371(DemonRotateActivityMsg.C2S_DestinyDraw_16371 msg, String source) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      int destinyDrawTimes = this.getDestinyDrawTimes();
      if (demonActivityDao.destinyDrawed.size() >= destinyDrawTimes) {
         this.player.failure(61087);
      } else {
         int day = this.getSeverActivityDay();
         Map<Integer, List<FengMoDynamicModel>> modelMap = (Map)ApplicationContextProvider.getModelPoolEntity("custom_fengmoDynamic", this.getPlayerActivityId());
         if (CollectionUtils.isEmpty(modelMap)) {
            logger.info("天命赐福活动数据错误 activityId:{}", this.getPlayerActivityId());
         } else {
            List<FengMoDynamicModel> models = (List)modelMap.get(day);
            if (CollectionUtils.isEmpty(models)) {
               logger.info("天命赐福活动第{}天数据错误", day);
            } else {
               List<KeyValFun> funList = new ArrayList();

               for(FengMoDynamicModel model : models) {
                  if (!demonActivityDao.destinyDrawed.contains(model.getId())) {
                     funList.add(new KeyValFun(model.getId(), model.getWeight()));
                  }
               }

               if (funList.size() == 0) {
                  this.player.failure(61086);
               } else {
                  GamePlayer var10000 = this.player;
                  int id = GamePlayer.countRate(funList);
                  demonActivityDao.destinyDrawed.add(id);
                  demonActivityDao.updateOp();
                  FengMoDynamicModel model = (FengMoDynamicModel)this.player.getGameModelPool().getEntity("fengmoDynamic", id);
                  this.player.addResource(model.getItem(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 67, 858, 0, 0, "day:" + day);
                  DemonRotateActivityMsg.S2C_DestinyDraw_16372.Builder builder = DemonRotateActivityMsg.S2C_DestinyDraw_16372.newBuilder();
                  builder.setId(id);
                  this.player.sendMsg(builder.build());
               }
            }
         }
      }
   }

   private int getDestinyDrawTimes() {
      int times = 0;
      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());

      for(Integer value : this.configManager.getIntList("DynamicDraw")) {
         if (playerDao.active >= value) {
            ++times;
         }
      }

      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());

      for(Integer value : this.configManager.getIntList("targetSumOfMoney")) {
         if (playerRechargeDao.dailyRecharge >= value) {
            ++times;
         }
      }

      return times;
   }

   public void recordActive(int value) {
      if (!this.isServerActivityInvalid()) {
         DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
         demonActivityDao.active += value;
         demonActivityDao.updateOp();
         DemonRotateActivityMsg.S2C_UpdateActive_16380.Builder builder = DemonRotateActivityMsg.S2C_UpdateActive_16380.newBuilder();
         builder.setActive(demonActivityDao.active);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_DestinyBox_16373(DemonRotateActivityMsg.C2S_DestinyBox_16373 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
         if (demonActivityDao.destinyBox) {
            this.player.failure(61084);
         } else {
            String[] strArr = ApplicationContextProvider.getConfigString("tianmingreward", "").split(",");
            if (demonActivityDao.active < Integer.parseInt(strArr[0])) {
               this.player.failure(61085);
            } else {
               demonActivityDao.destinyBox = true;
               demonActivityDao.updateOp();
               ResourceModel resourceModel = ResourceModel.buildResource(strArr[1]);
               this.player.addResource(resourceModel, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 67, 859, 0, 0, "");
               DemonRotateActivityMsg.S2C_DestinyBox_16374.Builder builder = DemonRotateActivityMsg.S2C_DestinyBox_16374.newBuilder();
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TimeRewards_16375(DemonRotateActivityMsg.C2S_TimeRewards_16375 msg, String source) {
      Map<Integer, FengMoWheelRewardModel> modelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customFengmoWheelReward", this.getPlayerActivityId());
      if (CollectionUtils.isEmpty(modelMap)) {
         logger.info("没有该奖励");
      } else {
         FengMoWheelRewardModel model = (FengMoWheelRewardModel)modelMap.get(msg.getDrawTimes());
         DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
         if (demonActivityDao.timeRewards.contains(model.getDrawTime())) {
            this.player.failure(61084);
         } else {
            demonActivityDao.timeRewards.add(model.getDrawTime());
            demonActivityDao.updateOp();
            this.player.addResource(model.getBoxreward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 67, 860, model.getDrawTime(), 0, "");
            DemonRotateActivityMsg.S2C_TimeRewards_16376.Builder builder = DemonRotateActivityMsg.S2C_TimeRewards_16376.newBuilder();
            builder.setDrawTimes(model.getDrawTime());
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Refresh_16377(DemonRotateActivityMsg.C2S_Refresh_16377 msg, String source) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      List<ResourceModel> resourceModels = this.configManager.getResourceModelList("fengmoReplace", "");
      if (demonActivityDao.refreshReward >= resourceModels.size()) {
         this.player.failure(61083);
      } else {
         ResourceModel resourceModel = (ResourceModel)resourceModels.get(demonActivityDao.refreshReward);
         if (!this.player.checkResourceNum(resourceModel)) {
            this.player.failure(18);
         } else {
            if (resourceModel.getValue() > 0) {
               this.player.delResource(resourceModel, 67, 861, 0, 0, "");
            }

            ++demonActivityDao.refreshReward;
            demonActivityDao.jackpot.clear();
            demonActivityDao.drawTimes = 0;
            this.turnToNextWheel(demonActivityDao);
            demonActivityDao.updateOp();
            DemonRotateActivityMsg.S2C_Refresh_16378.Builder builder = DemonRotateActivityMsg.S2C_Refresh_16378.newBuilder();
            builder.setWheel(this.getCurWheel(demonActivityDao.wheel));
            builder.setRefreshReward(demonActivityDao.refreshReward);
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DrawRecord_16381(DemonRotateActivityMsg.C2S_DrawRecord_16381 msg, String source) {
      DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
      DemonRotateActivityMsg.S2C_DrawRecord_16382.Builder builder = DemonRotateActivityMsg.S2C_DrawRecord_16382.newBuilder();
      builder.addAllRecords(demonActivityDao.records);
      this.player.sendMsg(builder.build());
   }

   private List<FengMoTreasureModel> getFengMoTreasureModels(int curWheel) {
      Map<Integer, List<FengMoTreasureModel>> modelMap = (Map)ApplicationContextProvider.getModelPoolEntity("custom_fengmoTreasure", this.getPlayerActivityId());
      return !CollectionUtils.isEmpty(modelMap) && modelMap.containsKey(curWheel) ? (List)modelMap.get(curWheel) : null;
   }

   public void _slaveServerActSettle(boolean mainOpen, int mainServer) {
      if (!mainOpen) {
         List<ResourceModel> taskResources = new ArrayList();
         DemonRotateActivityDao demonActivityDao = this.getDemonActivityDao();
         Map<Integer, SevenDaysTaskModel> modelMap = ApplicationContextProvider.<Integer, SevenDaysTaskModel>getModelPoolMap("sevenDaysTasks");

         for(SevenDaysTaskModel model : modelMap.values()) {
            if (model.getActivityId() == this.getPlayerActivityId() && !demonActivityDao.receiveTask.contains(model.getId())) {
               demonActivityDao.receiveTask.add(model.getId());

               for(ResourceModel reward : model.getRewards()) {
                  ResourceModel.addResourceToList(taskResources, reward);
               }
            }
         }

         demonActivityDao.updateOp();
         this.sendMergeMail(CentreAwardModel.TYPE_MERGE_ACT_NOT_FINISH_REWARD, taskResources);
         if (!demonActivityDao.destinyBox) {
            demonActivityDao.destinyBox = true;
            demonActivityDao.updateOp();
            String[] strArr = ApplicationContextProvider.getConfigString("tianmingreward", "").split(",");
            List<ResourceModel> destinyResources = new ArrayList();
            destinyResources.add(ResourceModel.buildResource(strArr[1]));
            this.sendMergeMail(CentreAwardModel.TYPE_MERGE_ACT_NOT_FINISH_REWARD, destinyResources);
         }

      }
   }
}
