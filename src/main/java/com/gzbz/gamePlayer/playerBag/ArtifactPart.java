package com.gzbz.gamePlayer.playerBag;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.ArtifactDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.bean.ArtifactData;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gift.GiftPart;
import com.gzbz.log.PlayerLogPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ArtifactModel;
import com.gzbz.model.ArtifactRefineModel;
import com.gzbz.model.ArtifactSkillModel;
import com.gzbz.model.ArtifactStrongModel;
import com.gzbz.model.ArtifactTaskModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.ArtifactMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ArtifactTaskPart;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ArtifactPart extends PlayerPart {
   @Autowired
   ConfigManager configManager;

   public void loginHandle() {
      this.loginCheck();
      this.S2C_ArtifactMainResult_7002();
   }

   public void loginCheck() {
      ArtifactDao artifactDao = (ArtifactDao)this.player.getData("tb_artifact", this.player.getPlayerId());
      if (artifactDao.artifacts.isEmpty()) {
         this.fristOpenArtifact(artifactDao);
      }

   }

   @MsgHandlerAnno
   public void C2S_Main_7001(ArtifactMsg.C2S_Main_7001 msg, String source) {
      this.S2C_ArtifactMainResult_7002();
   }

   @MsgHandlerAnno
   public void C2S_Strong_7005(ArtifactMsg.C2S_Strong_7005 msg, String source) {
      ArtifactDao artifactDao = (ArtifactDao)this.player.getData("tb_artifact", this.player.getPlayerId());
      if (artifactDao == null) {
         this.logger.info("强化神兵出错，没有神兵，玩家={}", this.player.getPlayerId());
      } else {
         ArtifactStrongModel artifactStrongModel = (ArtifactStrongModel)this.player.getGameModelPool().getEntity("artifactStrong", artifactDao.strongLv);
         if (artifactStrongModel == null) {
            this.logger.info("升级模块为空，{}", artifactDao.strongLv);
         } else {
            if (artifactDao.strongExp >= artifactStrongModel.getExp()) {
               ArtifactStrongModel nextArtifactStrongModel = (ArtifactStrongModel)this.player.getGameModelPool().getEntity("artifactStrong", artifactDao.strongLv + 1);
               if (nextArtifactStrongModel == null) {
                  this.logger.info("已经达到最大等级，strongLv={}", artifactDao.strongLv);
                  return;
               }
            }

            List<ResourceModel> needList = new ArrayList();

            for(ResourceModel item : artifactStrongModel.getItems()) {
               needList.add(item);
            }

            if (!this.player.checkResourceNum(needList)) {
               this.logger.info("神兵强化物品不够！");
            } else {
               int addExp = artifactStrongModel.getRandomExp();
               float attack = artifactStrongModel.getExpAtk() * (float)addExp;
               float hp = artifactStrongModel.getExpHp() * (float)addExp;
               PropertyModel attackModel = null;
               PropertyModel hpModel = null;
               List<PropertyModel> addPropertys = new ArrayList();
               int lvUp = 0;
               artifactDao.strongExp += addExp;
               if (artifactDao.strongExp >= artifactStrongModel.getExp()) {
                  ArtifactStrongModel nextArtifactStrongModel = (ArtifactStrongModel)this.player.getGameModelPool().getEntity("artifactStrong", artifactDao.strongLv + 1);
                  if (nextArtifactStrongModel == null) {
                     artifactDao.strongExp = artifactStrongModel.getExp();
                  } else {
                     artifactDao.strongExp -= artifactStrongModel.getExp();
                     ++artifactDao.strongLv;
                  }

                  lvUp = 1;
                  this.player.triggerTask(529, 0, (long)artifactDao.strongLv, 0);
                  GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                  giftPart.triggerTimeLimitGift(20, artifactDao.strongLv);
               }

               attackModel = new PropertyModel(2, 0, Float.valueOf(attack).longValue());
               hpModel = new PropertyModel(1, 0, Float.valueOf(hp).longValue());
               artifactDao.updateOp();
               PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
               playerLogPart.logArtifact(this.player.getPlayerId(), addExp, 11, 1101, lvUp, artifactDao.strongLv, "strong");
               addPropertys.add(attackModel);
               addPropertys.add(hpModel);
               this.player.delResource((List)needList, 11, 1101, 0, 0, "");
               long oldPower = this.player.getPlayerCombatPower();
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.setProperty_artifact_strong(this.getLvProperties());
               heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_STRONGLV);
               long newPower = this.player.getPlayerCombatPower();
               ArtifactMsg.S2C_StrongResult_7006.Builder builder = ArtifactMsg.S2C_StrongResult_7006.newBuilder();
               builder.setResult(1);
               builder.setProperty(this.toArtifactProperty(artifactDao));
               builder.setLvUp(lvUp);
               builder.setPowerChange((int)(newPower - oldPower));

               for(PropertyModel propertyModel : addPropertys) {
                  builder.addPropertyChanges(propertyModel.builder());
               }

               this.player.sendMsg(builder.build());
               this.player.triggerTask(512, 0, 1L, 1);
               int item1027 = 0;
               int copper = 0;

               for(ResourceModel model : needList) {
                  if (model.getId() == PlayerDefine.PLAYER_COPPER) {
                     copper += model.getValue();
                  }

                  if (model.getId() == 1027) {
                     item1027 += model.getValue();
                  }
               }

               int needExp = 0;
               ArtifactStrongModel nextArtifactStrongModel = (ArtifactStrongModel)this.player.getGameModelPool().getEntity("artifactStrong", artifactDao.strongLv + 1);
               if (nextArtifactStrongModel != null) {
                  needExp = nextArtifactStrongModel.getExp() - artifactDao.strongExp;
               }

               this.player.getOperationMgr().addExtraLog(this.player, 118, item1027 + "", copper + "", artifactDao.strongExp + "", needExp + "", artifactDao.strongLv + "");
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SkillUpgrade_7007(ArtifactMsg.C2S_SkillUpgrade_7007 msg, String source) {
      ArtifactDao artifactDao = (ArtifactDao)this.player.getData("tb_artifact", this.player.getPlayerId());
      ArtifactSkillModel artifactSkillModel = (ArtifactSkillModel)this.player.getGameModelPool().getEntity("artifactSkill", artifactDao.skillLv);
      if (artifactSkillModel == null) {
         this.logger.info("模板为空，{}", artifactDao.skillLv);
      } else if (artifactDao.strongLv < artifactSkillModel.getStrongLv()) {
         this.logger.info("强化等级不够！目前等级={},需要等级={}", artifactDao.strongLv, artifactSkillModel.getStrongLv());
      } else {
         int maxLv = this.player.getSystemLvLimit(1891);
         if (artifactDao.skillLv < maxLv) {
            ArtifactSkillModel nextArtifactSkillModel = (ArtifactSkillModel)this.player.getGameModelPool().getEntity("artifactSkill", artifactDao.skillLv + 1);
            if (nextArtifactSkillModel == null) {
               this.logger.info("已经达到最大等级，lv={}", artifactDao.skillLv);
            } else if (!this.player.checkResourceNum((List)artifactSkillModel.getItems())) {
               this.logger.info("神兵技能升级物品不足");
            } else {
               ++artifactDao.skillLv;
               ArtifactSkillModel artifactSkillModel_new = (ArtifactSkillModel)this.player.getGameModelPool().getEntity("artifactSkill", artifactDao.skillLv);

               for(Map.Entry<Integer, ArtifactData> entry : artifactDao.artifacts.entrySet()) {
                  ArtifactModel artifactModel = (ArtifactModel)this.player.getGameModelPool().getEntity("artifact", entry.getKey());
                  ((ArtifactData)entry.getValue()).skillId = (Integer)artifactSkillModel_new.getSkills().get(artifactModel.getSkillKey());
               }

               artifactDao.updateOp();
               PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
               playerLogPart.logArtifact(this.player.getPlayerId(), 1, 11, 1102, artifactDao.skillLv, 0, "skill");
               this.player.delResource((List)artifactSkillModel.getItems(), 11, 1102, 0, 0, "");
               ArtifactMsg.S2C_SkillUpgradeResult_7008.Builder builder = ArtifactMsg.S2C_SkillUpgradeResult_7008.newBuilder();
               builder.setResult(1);
               builder.setProperty(this.toArtifactProperty(artifactDao));
               this.player.sendMsg(builder.build());
               int item1028 = 0;
               int copper = 0;

               for(ResourceModel model : artifactSkillModel.getItems()) {
                  if (model.getId() == PlayerDefine.PLAYER_COPPER) {
                     copper += model.getValue();
                  }

                  if (model.getId() == 1028) {
                     item1028 += model.getValue();
                  }
               }

               this.player.getOperationMgr().addExtraLog(this.player, 119, item1028 + "", copper + "", artifactDao.skillLv - 1 + "", artifactDao.skillLv + "");
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RefineUpgrade_7009(ArtifactMsg.C2S_RefineUpgrade_7009 msg, String source) {
      ArtifactDao artifactDao = (ArtifactDao)this.player.getData("tb_artifact", this.player.getPlayerId());
      ArtifactRefineModel artifactRefineModel = (ArtifactRefineModel)this.player.getGameModelPool().getEntity("artifactRefine", artifactDao.refineLv);
      if (artifactRefineModel == null) {
         this.logger.info("找不到骑士精炼模板，{}", artifactDao.refineLv + 1);
      } else if (this.player.getPlayerDao().lv < artifactRefineModel.getLevelLimit()) {
         this.player.failure(20);
      } else if (this.player.checkResourceNum((List)artifactRefineModel.getItems())) {
         ++artifactDao.refineLv;
         int lvUp = 1;
         List<PropertyModel> addPropertys = new ArrayList(artifactRefineModel.getPropertys());
         List<PropertyModel> addPropertys_addit = new ArrayList(artifactRefineModel.getAddPropertys());
         artifactDao.updateOp();
         PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
         playerLogPart.logArtifact(this.player.getPlayerId(), 1, 11, 1103, artifactDao.refineLv, 0, "refine");
         this.player.delResource((List)artifactRefineModel.getItems(), 11, 1103, 0, 0, "");
         long oldPower = this.player.getPlayerCombatPower();
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         heroBagPart.setProperty_artifact_refine(this.getRefineProperties());
         heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_REFINEL);
         long newPower = this.player.getPlayerCombatPower();
         ArtifactMsg.S2C_RefineUpgradeResult_7010.Builder builder = ArtifactMsg.S2C_RefineUpgradeResult_7010.newBuilder();
         builder.setResult(1);
         builder.setProperty(this.toArtifactProperty(artifactDao));
         builder.setLvUp(lvUp);
         builder.setPowerChange((int)(newPower - oldPower));

         for(PropertyModel propertyModel : addPropertys) {
            builder.addPropertyChanges(propertyModel.builder());
         }

         for(PropertyModel propertyModel : addPropertys_addit) {
            builder.addPropertyChangesAdd(propertyModel.builder());
         }

         this.player.sendMsg(builder.build());
         int item1029 = 0;
         int item1030 = 0;

         for(ResourceModel model : artifactRefineModel.getItems()) {
            if (model.getId() == 1029) {
               item1029 += model.getValue();
            }

            if (model.getId() == 1030) {
               item1030 += model.getValue();
            }
         }

         this.player.getOperationMgr().addExtraLog(this.player, 120, item1029 + "", item1030 + "", artifactDao.refineLv - 1 + "", artifactDao.refineLv + "");
      }
   }

   @MsgHandlerAnno
   public void C2S_TakeTask_7011(ArtifactMsg.C2S_TakeTask_7011 msg, String source) {
      ArtifactTaskPart artifactTaskPart = (ArtifactTaskPart)this.player.getMgrPart(ArtifactTaskPart.class);
      artifactTaskPart.commit(msg.getTaskId());
      this.player.updateGuideStep(msg.getGuideStep());
   }

   @MsgHandlerAnno
   public void C2S_CastSoul_7013(ArtifactMsg.C2S_CastSoul_7013 msg, String source) {
      int num = msg.getNum();
      if (num <= 0) {
         this.logger.info("铸魂数量有问题={}，玩家={}", num, this.player.getPlayerId());
      } else {
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         ArtifactDao artifactDao = this.getArtifactDao();
         if (artifactDao == null) {
            this.logger.info("没有神兵信息，玩家={}", this.player.getPlayerId());
         } else {
            ArtifactStrongModel artifactStrongModel = (ArtifactStrongModel)this.player.getGameModelPool().getEntity("artifactStrong", artifactDao.strongLv);
            if (playerExtend.soulNum + num > artifactStrongModel.getArtifactSoulNum()) {
               this.logger.info("铸魂次数达到上限，强化等级={},已铸魂次数={},铸魂={}", new Object[]{artifactDao.strongLv, playerExtend.soulNum, num});
            } else {
               int item = this.configManager.getIntDefault("artifactSoulItemID", 1089);
               ResourceModel resourceModel = new ResourceModel(2, item, num);
               if (!this.player.checkResourceNum(resourceModel)) {
                  this.logger.info("升级物品不足！{}", num);
               } else {
                  playerExtend.soulNum += num;
                  this.player.updatePlayerExtend(13);
                  long oldPower = this.player.getPlayerCombatPower();
                  PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
                  playerLogPart.logArtifact(this.player.getPlayerId(), num, 11, 1104, 0, 0, "soul");
                  this.player.delResource(resourceModel, 11, 1104, 0, 0, "");
                  HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                  heroBagPart.setProperty_artifact_castSoul(this.getTotalSoulProperties());
                  heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_SOUL);
                  long newPower = this.player.getPlayerCombatPower();
                  ArtifactMsg.S2C_CastSoulResult_7014.Builder builder = ArtifactMsg.S2C_CastSoulResult_7014.newBuilder();
                  builder.setResult(1);
                  builder.setSoulInfo(this.toSoulInfo());
                  builder.setPowerChange((int)(newPower - oldPower));

                  for(PropertyModel propertyModel : this.getSoulProperties(num)) {
                     builder.addPropertyChanges(propertyModel.builder());
                  }

                  this.player.sendMsg(builder.build());
                  this.player.getOperationMgr().addExtraLog(this.player, 121, num + "", playerExtend.soulNum + "");
               }
            }
         }
      }
   }

   public void S2C_ArtifactMainResult_7002() {
      ArtifactMsg.S2C_MainResult_7002.Builder result_builder = ArtifactMsg.S2C_MainResult_7002.newBuilder();
      ArtifactDao artifactDao = (ArtifactDao)this.player.getData("tb_artifact", this.player.getPlayerId());
      if (artifactDao == null) {
         this.logger.info("没有神兵，玩家={}", this.player.getPlayerId());
      } else {
         for(Map.Entry<Integer, ArtifactData> entry : artifactDao.artifacts.entrySet()) {
            result_builder.addArtifactInfos(this.toArtifactInfo(artifactDao, (Integer)entry.getKey()));
         }

         result_builder.setSoulInfo(this.toSoulInfo());
         result_builder.setArtifactProperty(this.toArtifactProperty(artifactDao));
         this.player.sendMsg(result_builder.build());
      }
   }

   public void updateTask(List<TaskData> taskDataList) {
      ArtifactMsg.S2C_UpdateTask_7015.Builder builder = ArtifactMsg.S2C_UpdateTask_7015.newBuilder();

      for(TaskData taskData : taskDataList) {
         builder.addTasks(taskData.toBuilder());
      }

      this.player.sendMsg(builder.build());
   }

   public void takeSuccess(int taskId) {
      ArtifactModel artifactModel = this.getArtifactModel(taskId);
      if (artifactModel != null) {
         if (this.allUnlockTask(artifactModel)) {
            ArtifactDao artifactDao = this.getArtifactDao();
            ((ArtifactData)artifactDao.artifacts.get(artifactModel.getId())).state = 2;
            artifactDao.updateOp();
            this.delFinishTask(artifactModel);
            if (artifactModel.getId() == 101) {
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.setProperty_artifact_strong(this.getLvProperties());
               heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_STRONGLV);
               Map<Integer, HeroArrayingDao> map = this.player.<Integer, HeroArrayingDao>getMap("tb_hero_arraying", this.player.getPlayerId());

               for(Map.Entry<Integer, HeroArrayingDao> entry : map.entrySet()) {
                  ((HeroArrayingDao)entry.getValue()).elements.put((byte)6, artifactModel.getId());
               }

               HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
               heroArrayingPart.sendArrayingListToClient();
            }

            if (artifactModel.getNextId() > 0) {
               ((ArtifactData)artifactDao.artifacts.get(artifactModel.getNextId())).state = 1;
               artifactDao.updateOp();
            }

            if (artifactModel.getId() == 105) {
               this.logger.info("解锁神兵最后一个，下发幻化信息");
               artifactDao.allUnlock = 2;
               artifactDao.updateOp();
               ArtifactDressPart artifactDressPart = (ArtifactDressPart)this.player.getMgrPart(ArtifactDressPart.class);
               artifactDressPart.S2C_MainResult_11102();
            }

            ArtifactMsg.S2C_UnlockArtifact_7016.Builder builder = ArtifactMsg.S2C_UnlockArtifact_7016.newBuilder();
            builder.setInfo(this.toArtifactInfo(artifactDao, artifactModel.getId()));
            if (artifactModel.getNextId() > 0) {
               builder.setNextId(artifactModel.getNextId());
            }

            for(PropertyModel propertyModel : this.getLvProperties()) {
               builder.addLvPropertys(propertyModel.builder());
            }

            this.player.sendMsg(builder.build());
            this.player.triggerTask(528, 0, 1L, 1);
            PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
            playerLogPart.logArtifact(this.player.getPlayerId(), 0, 11, 1105, artifactModel.getId(), 0, "unlock");
         } else {
            ArtifactMsg.S2C_UpdateTask_7015.Builder builder = ArtifactMsg.S2C_UpdateTask_7015.newBuilder();
            TaskData taskData = this.player.getTask(TaskDefine.TaskModule.MODULE_ARTIFACT, taskId);
            if (taskData == null) {
               this.logger.info("任务有问题！" + taskId);
               return;
            }

            builder.addTasks(taskData.toBuilder());
            this.player.sendMsg(builder.build());
         }

         ArtifactTaskModel artifactTaskModel = (ArtifactTaskModel)this.player.getGameModelPool().getEntity("artifactTask", taskId);
         String[] rewardsInfo = LogOperationMgr.toRewardsInfo(artifactTaskModel.getRewards());
         this.player.getOperationMgr().addExtraLog(this.player, 117, artifactModel.getName(), artifactTaskModel == null ? "" : artifactTaskModel.getTaskDesc(), rewardsInfo[0], rewardsInfo[1], rewardsInfo[2]);
      }
   }

   public void fristOpenArtifact(ArtifactDao artifactDao) {
      artifactDao.skillLv = 1;
      Map<Integer, ArtifactModel> modelMap = this.player.getGameModelPool().getMap("artifact");

      for(Map.Entry<Integer, ArtifactModel> entry : modelMap.entrySet()) {
         ArtifactData artifactData = new ArtifactData();
         artifactData.id = (Integer)entry.getKey();
         artifactData.skillId = ((ArtifactModel)entry.getValue()).getArtifactSkill();
         ArtifactSkillModel artifactSkillModel = (ArtifactSkillModel)this.player.getGameModelPool().getEntity("artifactSkill", artifactDao.skillLv);
         if (artifactSkillModel != null) {
            artifactData.skillId = (Integer)artifactSkillModel.getSkills().get(((ArtifactModel)entry.getValue()).getSkillKey());
         }

         if (artifactData.id == 101) {
            artifactData.state = 1;
         } else {
            artifactData.state = 0;
         }

         artifactDao.artifacts.put(entry.getKey(), artifactData);
      }

      artifactDao.updateOp();
      PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
      playerLogPart.logArtifact(this.player.getPlayerId(), 1, 11, 1105, 0, 0, "add");
      ArtifactTaskPart artifactTaskPart = (ArtifactTaskPart)this.player.getMgrPart(ArtifactTaskPart.class);
      artifactTaskPart.trigger();
   }

   private void openArtifact(ArtifactDao artifactDao, int artifactId) {
      if (artifactDao == null) {
         this.logger.info("已经有一个神兵了");
      } else if (((ArtifactData)artifactDao.artifacts.get(artifactId)).state == 0) {
         ((ArtifactData)artifactDao.artifacts.get(artifactId)).state = 1;
         artifactDao.updateOp();
         PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
         playerLogPart.logArtifact(this.player.getPlayerId(), 0, 11, 1105, 0, 0, "open");
      }
   }

   public ArtifactDao getArtifactDao() {
      ArtifactDao artifactDao = (ArtifactDao)this.player.getData("tb_artifact", this.player.getPlayerId());
      if (artifactDao.artifacts.isEmpty()) {
         this.fristOpenArtifact(artifactDao);
      }

      return artifactDao;
   }

   public ArtifactModel getArtifactModel(int taskId) {
      Map<Integer, ArtifactModel> modelMap = this.player.getGameModelPool().getMap("artifact");

      for(Map.Entry<Integer, ArtifactModel> entry : modelMap.entrySet()) {
         if (((ArtifactModel)entry.getValue()).getTasks().containsValue(taskId)) {
            return (ArtifactModel)entry.getValue();
         }
      }

      return null;
   }

   public boolean isCompletedTask(int artifactId) {
      ArtifactModel artifactModel = (ArtifactModel)this.player.getGameModelPool().getEntity("artifact", artifactId);
      ArtifactDao artifactDao = this.getArtifactDao();
      if (artifactDao == null) {
         return false;
      } else if (((ArtifactData)artifactDao.artifacts.get(artifactId)).state == 2) {
         return true;
      } else {
         for(Integer taskId : artifactModel.getTasks().values()) {
            TaskData taskData = this.player.getTask(TaskDefine.TaskModule.MODULE_ARTIFACT, taskId);
            if (taskData.state != CommonMsg.TaskState.STATE_FINISH.getNumber() || taskData.state != CommonMsg.TaskState.STATE_COMPLETE.getNumber()) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean isUnlockArtifact(int artifactId) {
      ArtifactDao artifactDao = this.getArtifactDao();
      if (artifactDao == null) {
         return false;
      } else {
         return ((ArtifactData)artifactDao.artifacts.get(artifactId)).state == 2;
      }
   }

   public ArtifactMsg.ArtifactProperty.Builder toArtifactProperty(ArtifactDao artifactDao) {
      ArtifactMsg.ArtifactProperty.Builder info_builder = ArtifactMsg.ArtifactProperty.newBuilder();
      info_builder.setStrongLv(artifactDao.strongLv);
      info_builder.setStrongExp(artifactDao.strongExp);
      info_builder.setRefineLv(artifactDao.refineLv);
      info_builder.setSkillLv(artifactDao.skillLv);

      for(PropertyModel lvProtity : this.getLvProperties()) {
         info_builder.addLvPropertys(lvProtity.builder());
      }

      for(PropertyModel refineProtity : (List<PropertyModel>)this.getRefineProperties().get(1)) {
         info_builder.addRefinepropertys(refineProtity.builder());
      }

      for(PropertyModel refineProtity : (List<PropertyModel>)this.getRefineProperties().get(2)) {
         info_builder.addRefinepropertysAdd(refineProtity.builder());
      }

      return info_builder;
   }

   public ArtifactMsg.ArtifactInfo.Builder toArtifactInfo(ArtifactDao artifactDao, int id) {
      ArtifactModel artifactModel = (ArtifactModel)this.player.getGameModelPool().getEntity("artifact", id);
      ArtifactMsg.ArtifactInfo.Builder info_builder = ArtifactMsg.ArtifactInfo.newBuilder();
      info_builder.setId(id);
      info_builder.setUnlock(((ArtifactData)artifactDao.artifacts.get(id)).state);
      if (((ArtifactData)artifactDao.artifacts.get(id)).state != 2) {
         for(Integer taskId : artifactModel.getTasks().values()) {
            TaskData taskData = this.player.getTask(TaskDefine.TaskModule.MODULE_ARTIFACT, taskId);
            if (taskData == null) {
               this.logger.info("任务有问题！" + taskId);
            } else {
               info_builder.addTasks(taskData.toBuilder());
            }
         }
      }

      return info_builder;
   }

   public boolean allUnlockTask(ArtifactModel artifactModel) {
      boolean allUnlock = true;

      for(Integer taskId : artifactModel.getTasks().values()) {
         TaskData taskData = this.player.getTask(TaskDefine.TaskModule.MODULE_ARTIFACT, taskId);
         if (taskData == null) {
            this.logger.info("任务有问题！" + taskId);
            allUnlock = false;
            break;
         }

         if (taskData.state != CommonMsg.TaskState.STATE_FINISH.getNumber()) {
            allUnlock = false;
            break;
         }
      }

      return allUnlock;
   }

   public void delFinishTask(ArtifactModel artifactModel) {
      for(Integer taskId : artifactModel.getTasks().values()) {
         TaskData taskData = this.player.getTask(TaskDefine.TaskModule.MODULE_ARTIFACT, taskId);
         taskData.delete();
      }

   }

   public ArtifactMsg.SoulInfo.Builder toSoulInfo() {
      ArtifactMsg.SoulInfo.Builder soulBuilder = ArtifactMsg.SoulInfo.newBuilder();
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      soulBuilder.setSoulNum(playerExtend.soulNum);

      for(PropertyModel propertyModel : this.getTotalSoulProperties()) {
         CommonMsg.PropertyInfo.Builder properyBuilder = CommonMsg.PropertyInfo.newBuilder();
         properyBuilder.setId(propertyModel.getType());
         properyBuilder.setWay(propertyModel.getWay());
         properyBuilder.setValue((double)propertyModel.getValue());
         soulBuilder.addProperty(properyBuilder);
      }

      return soulBuilder;
   }

   public List<PropertyModel> getLvProperties() {
      List<PropertyModel> resultList = new ArrayList();
      ArtifactDao artifactDao = this.getArtifactDao();
      if (artifactDao != null && !artifactDao.artifacts.isEmpty() && ((ArtifactData)artifactDao.artifacts.get(101)).state == 2) {
         ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
         int baseHp = configManager.getInt("artifactBaseHp");
         int baseAttack = configManager.getInt("artifactBaseAttack");
         float totalAtt = (float)baseAttack;
         float totalHp = (float)baseHp;
         if (artifactDao.strongLv > 0) {
            for(int i = 0; i < artifactDao.strongLv; ++i) {
               ArtifactStrongModel artifactStrongModel = (ArtifactStrongModel)this.player.getGameModelPool().getEntity("artifactStrong", i);
               totalAtt += (float)artifactStrongModel.getExp() * artifactStrongModel.getExpAtk();
               totalHp += (float)artifactStrongModel.getExp() * artifactStrongModel.getExpHp();
               totalAtt += (float)artifactStrongModel.getRewardAtk();
               totalHp += (float)artifactStrongModel.getRewardHp();
            }
         }

         ArtifactStrongModel artifactStrongModel = (ArtifactStrongModel)this.player.getGameModelPool().getEntity("artifactStrong", artifactDao.strongLv);
         totalAtt += (float)artifactDao.strongExp * artifactStrongModel.getExpAtk();
         totalHp += (float)artifactDao.strongExp * artifactStrongModel.getExpHp();
         PropertyModel attPropertyModel = new PropertyModel(2, 0, (long)Float.valueOf(totalAtt).intValue());
         PropertyModel hpPropertyModel = new PropertyModel(1, 0, (long)Float.valueOf(totalHp).intValue());
         resultList.add(attPropertyModel);
         resultList.add(hpPropertyModel);
         return resultList;
      } else {
         return resultList;
      }
   }

   public Map<Integer, List<PropertyModel>> getRefineProperties() {
      Map<Integer, List<PropertyModel>> resultMap = new HashMap();
      List<PropertyModel> commonList = new ArrayList();
      List<PropertyModel> addList = new ArrayList();
      resultMap.put(1, commonList);
      resultMap.put(2, addList);
      ArtifactDao artifactDao = this.getArtifactDao();
      if (artifactDao != null && artifactDao.allUnlock == 2) {
         if (artifactDao.refineLv > 0) {
            for(int i = 0; i < artifactDao.refineLv; ++i) {
               ArtifactRefineModel artifactRefineModel = (ArtifactRefineModel)this.player.getGameModelPool().getEntity("artifactRefine", i);
               if (artifactRefineModel != null) {
                  for(PropertyModel property : artifactRefineModel.getPropertys()) {
                     PropertyModel propertyModel = new PropertyModel(property.getType(), property.getWay(), property.getValue());
                     PropertyModel.addLvProtities(commonList, propertyModel);
                  }

                  for(PropertyModel addProperty : artifactRefineModel.getAddPropertys()) {
                     PropertyModel propertyModel = new PropertyModel(addProperty.getType(), addProperty.getWay(), addProperty.getValue());
                     PropertyModel.addLvProtities(addList, propertyModel);
                  }
               }
            }

            resultMap.put(1, commonList);
            resultMap.put(2, addList);
         }

         return resultMap;
      } else {
         return resultMap;
      }
   }

   public List<PropertyModel> getTotalSoulProperties() {
      List<PropertyModel> result = new ArrayList();
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend == null) {
         return result;
      } else {
         int artifactSoulAttackUp = configManager.getInt("artifactSoulAttackUp");
         int artifactSoulHealthPointUp = configManager.getInt("artifactSoulHealthPointUp");
         result.add(new PropertyModel(2, 0, (long)(artifactSoulAttackUp * playerExtend.soulNum)));
         result.add(new PropertyModel(1, 0, (long)(artifactSoulHealthPointUp * playerExtend.soulNum)));
         return result;
      }
   }

   public List<PropertyModel> getSoulProperties(int num) {
      List<PropertyModel> result = new ArrayList();
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      int artifactSoulAttackUp = configManager.getInt("artifactSoulAttackUp");
      int artifactSoulHealthPointUp = configManager.getInt("artifactSoulHealthPointUp");
      result.add(new PropertyModel(2, 0, (long)(artifactSoulAttackUp * num)));
      result.add(new PropertyModel(1, 0, (long)(artifactSoulHealthPointUp * num)));
      return result;
   }

   public void unlockArtifact() {
      ArtifactDao artifactDao = this.getArtifactDao();

      for(Map.Entry<Integer, ArtifactData> entry : artifactDao.artifacts.entrySet()) {
         ((ArtifactData)entry.getValue()).state = 2;
      }

      artifactDao.allUnlock = 2;
      artifactDao.updateOp();
      PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
      playerLogPart.logArtifact(this.player.getPlayerId(), 0, 11, 1105, 0, 0, "unlockAll");
      this.S2C_ArtifactMainResult_7002();
      ArtifactDressPart artifactDressPart = (ArtifactDressPart)this.player.getMgrPart(ArtifactDressPart.class);
      artifactDressPart.S2C_MainResult_11102();
   }

   public void superArtifact() {
      ArtifactDao artifactDao = this.getArtifactDao();
      if (artifactDao.strongLv < 70) {
         artifactDao.strongLv = 70;
      }

      if (artifactDao.refineLv < 240) {
         artifactDao.refineLv = 240;
      }

      artifactDao.updateOp();

      for(Map.Entry<Integer, ArtifactData> entry : artifactDao.artifacts.entrySet()) {
         ((ArtifactData)entry.getValue()).state = 2;
      }

      artifactDao.allUnlock = 2;
      artifactDao.updateOp();
      this.S2C_ArtifactMainResult_7002();
      ArtifactDressPart artifactDressPart = (ArtifactDressPart)this.player.getMgrPart(ArtifactDressPart.class);
      artifactDressPart.S2C_MainResult_11102();
   }

   public void addArtifactStrongLv(int addLv) {
      ArtifactDao artifactDao = this.getArtifactDao();
      artifactDao.strongLv += addLv;
      if (artifactDao.strongLv > 70) {
         artifactDao.strongLv = 70;
      }

      artifactDao.updateOp();

      for(Map.Entry<Integer, ArtifactData> entry : artifactDao.artifacts.entrySet()) {
         ((ArtifactData)entry.getValue()).state = 2;
      }

      artifactDao.allUnlock = 2;
      artifactDao.updateOp();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_STRONGLV);
      this.S2C_ArtifactMainResult_7002();
      ArtifactDressPart artifactDressPart = (ArtifactDressPart)this.player.getMgrPart(ArtifactDressPart.class);
      artifactDressPart.S2C_MainResult_11102();
   }

   public void addArtifactRefineLv(int addLv) {
      ArtifactDao artifactDao = this.getArtifactDao();
      artifactDao.refineLv += addLv;
      if (artifactDao.refineLv > 240) {
         artifactDao.refineLv = 240;
      }

      artifactDao.updateOp();

      for(Map.Entry<Integer, ArtifactData> entry : artifactDao.artifacts.entrySet()) {
         ((ArtifactData)entry.getValue()).state = 2;
      }

      artifactDao.allUnlock = 2;
      artifactDao.updateOp();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_REFINEL);
      this.S2C_ArtifactMainResult_7002();
      ArtifactDressPart artifactDressPart = (ArtifactDressPart)this.player.getMgrPart(ArtifactDressPart.class);
      artifactDressPart.S2C_MainResult_11102();
   }

   public void resetLv() {
      ArtifactDao artifactDao = this.getArtifactDao();
      artifactDao.strongLv = 0;
      artifactDao.strongExp = 0;
      artifactDao.refineLv = 0;
      artifactDao.skillLv = 1;
      artifactDao.soulNum = 0;
      artifactDao.artifacts.clear();
      Map<Integer, ArtifactModel> modelMap = this.player.getGameModelPool().getMap("artifact");

      for(Map.Entry<Integer, ArtifactModel> entry : modelMap.entrySet()) {
         ArtifactData artifactData = new ArtifactData();
         artifactData.id = (Integer)entry.getKey();
         artifactData.skillId = ((ArtifactModel)entry.getValue()).getArtifactSkill();
         ArtifactSkillModel artifactSkillModel = (ArtifactSkillModel)this.player.getGameModelPool().getEntity("artifactSkill", artifactDao.skillLv);
         if (artifactSkillModel != null) {
            artifactData.skillId = (Integer)artifactSkillModel.getSkills().get(((ArtifactModel)entry.getValue()).getSkillKey());
         }

         artifactData.state = 2;
         artifactDao.artifacts.put(entry.getKey(), artifactData);
      }

      artifactDao.updateOp();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ALL);
      this.S2C_ArtifactMainResult_7002();
      ArtifactDressPart artifactDressPart = (ArtifactDressPart)this.player.getMgrPart(ArtifactDressPart.class);
      artifactDressPart.S2C_MainResult_11102();
   }
}
