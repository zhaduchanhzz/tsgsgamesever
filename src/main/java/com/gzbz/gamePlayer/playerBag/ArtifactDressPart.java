package com.gzbz.gamePlayer.playerBag;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.activity.part.ArtifactActivityPart;
import com.gzbz.activity.part.ArtifactRotateActivityPart;
import com.gzbz.activity.part.ArtifactSkinActivityPart;
import com.gzbz.db.ArtifactDressDao;
import com.gzbz.db.WorldDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.db.worldBean.WorldData;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.ArtifactDressModel;
import com.gzbz.model.ArtifactDressUpgradeModel;
import com.gzbz.model.ArtifactExchangeModel;
import com.gzbz.model.ArtifactSkinRelationModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.ArtifactDressMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.DressTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ArtifactDressPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(ArtifactDressPart.class);
   public static final int UNLOCK_TYPE_TASK = 0;
   public static final int UNLOCK_TYPE_MANA = 1;
   @Autowired
   ConfigManager configManager;
   @Autowired
   WorldMgr worldMgr;

   public void loginHandle() {
      DressTaskPart dressTaskPart = (DressTaskPart)this.player.getMgrPart(DressTaskPart.class);
      dressTaskPart.checkData();
      this.checkEndTime(false);
      this.loginCheck();
      this.S2C_MainResult_11102();
   }

   public void resetDaily() {
      super.resetDaily();
      this.checkEndTime(true);
   }

   public void loginCheck() {
      Map<Integer, ArtifactDressModel> dressModelMap = this.player.getGameModelPool().getMap("artifactDress");

      for(Map.Entry<Integer, ArtifactDressModel> entry : dressModelMap.entrySet()) {
         ArtifactDressModel artifactDressModel = (ArtifactDressModel)entry.getValue();
         ArtifactDressDao artifactDressDao = this.getDressDaoByCode(artifactDressModel.getId());
         if (artifactDressDao == null && artifactDressModel.getOpen() == 1 && this.worldMgr.getOpenServerDays() >= artifactDressModel.getOpenTime()) {
            artifactDressDao = new ArtifactDressDao();
            artifactDressDao.playerId = this.player.getPlayerId();
            artifactDressDao.id = artifactDressModel.getId();
            artifactDressDao.state = artifactDressModel.getOpen();
            if (artifactDressModel.getUnlockType() == 0) {
               DressTaskPart dressTaskPart = (DressTaskPart)this.player.getMgrPart(DressTaskPart.class);
               List<Integer> taskIds = new ArrayList();

               for(Map.Entry<Integer, Integer> taskEntry : artifactDressModel.getTasks().entrySet()) {
                  taskIds.add(taskEntry.getValue());
               }

               dressTaskPart.initTask(taskIds);
            }

            this.player.insertDao(artifactDressDao);
         }
      }

      WorldDao<WorldData> worldDao = this.worldMgr.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);

      for(Integer dressId : ((WorldData)worldDao.jsonData).openArtDress) {
         this.openArtifactDressNoSend(dressId);
      }

   }

   public boolean checkEndTime(boolean isSendDressInfo) {
      boolean result = false;
      Map<Integer, ArtifactDressDao> map = this.player.<Integer, ArtifactDressDao>getMap("tb_artifact_dress", this.player.getPlayerId());
      if (map == null) {
         return false;
      } else {
         List<ArtifactDressDao> updateList = new ArrayList();

         for(Map.Entry<Integer, ArtifactDressDao> entry : map.entrySet()) {
            ArtifactDressDao artifactDressDao = (ArtifactDressDao)entry.getValue();
            if (artifactDressDao.endTime > 0L && System.currentTimeMillis() > artifactDressDao.endTime) {
               artifactDressDao.artifact = 0;
               artifactDressDao.state = 1;
               artifactDressDao.endTime = 0L;
               artifactDressDao.updateOp();
               result = true;
               updateList.add(entry.getValue());
            }
         }

         if (!result) {
            return false;
         } else {
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            heroBagPart.setProperty_artifact_dress(this.getDressProperties());
            heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_DRESSID);
            if (isSendDressInfo) {
               ArtifactDressMsg.S2C_MainResult_11102.Builder builder = ArtifactDressMsg.S2C_MainResult_11102.newBuilder();
               builder.setIsUpdate(true);

               for(ArtifactDressDao dao : updateList) {
                  builder.addInfos(this.toDressInfo(dao));
               }

               this.player.sendMsg(builder.build());
            }

            return true;
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Main_11101(ArtifactDressMsg.C2S_Main_11101 msg, String source) {
      this.checkEndTime(false);
      this.S2C_MainResult_11102();
   }

   public void S2C_MainResult_11102() {
      ArtifactDressMsg.S2C_MainResult_11102.Builder builder = ArtifactDressMsg.S2C_MainResult_11102.newBuilder();
      Map<Integer, ArtifactDressDao> map = this.player.<Integer, ArtifactDressDao>getMap("tb_artifact_dress", this.player.getPlayerId());
      if (map != null) {
         for(Map.Entry<Integer, ArtifactDressDao> entry : map.entrySet()) {
            builder.addInfos(this.toDressInfo((ArtifactDressDao)entry.getValue()));
         }
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_TakeTask_11103(ArtifactDressMsg.C2S_TakeTask_11103 msg, String source) {
      System.out.println("------收到客户端请求： 领取任务, playerId: " + this.player.getPlayerId());
      DressTaskPart dressTaskPart = (DressTaskPart)this.player.getMgrPart(DressTaskPart.class);
      dressTaskPart.commit(msg.getTaskId());
   }

   public void updateTask(List<TaskData> taskDataList) {
      ArtifactDressMsg.S2C_UpdateTask_11104.Builder builder = ArtifactDressMsg.S2C_UpdateTask_11104.newBuilder();

      for(TaskData taskData : taskDataList) {
         builder.addTasks(this.toTaskInfo(taskData));
      }

      this.player.sendMsg(builder.build());
   }

   public void takeSuccess(int taskId) {
      ArtifactDressModel artifactDressModel = this.getDressModel(taskId);
      if (artifactDressModel == null) {
         this.logger.info("神兵幻化为空，ID={}", taskId);
      } else {
         if (this.allUnlockTask(artifactDressModel)) {
            ArtifactDressDao artifactDressDao = this.getDressDaoByCode(artifactDressModel.getId());
            artifactDressDao.state = 2;
            artifactDressDao.lv = 1;
            if (artifactDressModel.getTime() > 0) {
               artifactDressDao.endTime = DateUtil.getSomeDayEndTime(System.currentTimeMillis()) + 86400000L * (long)(artifactDressModel.getTime() - 1);
            }

            artifactDressDao.updateOp();
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            heroBagPart.setProperty_artifact_dress(this.getDressProperties());
            heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_DRESSID);
            ArtifactDressMsg.S2C_UnlockDress_11106.Builder builder = ArtifactDressMsg.S2C_UnlockDress_11106.newBuilder();
            builder.setInfo(this.toDressInfo(artifactDressDao));
            this.player.sendMsg(builder.build());
         } else {
            ArtifactDressMsg.S2C_UpdateTask_11104.Builder builder = ArtifactDressMsg.S2C_UpdateTask_11104.newBuilder();
            TaskData taskData = this.player.getTask(TaskDefine.TaskModule.MODULE_DRESS, taskId);
            if (taskData != null) {
               builder.addTasks(this.toTaskInfo(taskData));
            }

            this.player.sendMsg(builder.build());
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_Activation_11107(ArtifactDressMsg.C2S_Activation_11107 msg, String source) {
      int id = msg.getId();
      int type = msg.getType();
      ArtifactDressModel artifactDressModel = (ArtifactDressModel)this.player.getGameModelPool().getEntity("artifactDress", id);
      if (artifactDressModel == null) {
         this.logger.info("幻化ID不存在，ID={}", id);
      } else if (artifactDressModel.getUnlockType() != 1) {
         this.logger.info("解锁类型不对，需要={}", artifactDressModel.getUnlockType());
      } else {
         ArtifactDressDao artifactDressDao = this.getDressDaoByCode(id);
         if (artifactDressDao == null || artifactDressDao.endTime != 0L || artifactDressDao.state != 2) {
            List<ResourceModel> needResources = new ArrayList();
            if (type == 1) {
               ArtifactActivityPart artifactActivityPart = (ArtifactActivityPart)this.player.getMgrPart(ArtifactActivityPart.class);
               ArtifactRotateActivityPart artifactRotateActivityPart = (ArtifactRotateActivityPart)this.player.getMgrPart(ArtifactRotateActivityPart.class);
               ArtifactSkinActivityPart artifactSkinActivityPart = (ArtifactSkinActivityPart)this.player.getMgrPart(ArtifactSkinActivityPart.class);
               boolean checkResult = false;
               if (!artifactActivityPart.isServerActivityInvalid() && this.checkArtifactDress(artifactActivityPart.getPlayerActivityId(), id)) {
                  checkResult = true;
               }

               if (!checkResult && !artifactRotateActivityPart.isServerActivityInvalid() && this.checkArtifactDress(artifactRotateActivityPart.getPlayerActivityId(), id)) {
                  checkResult = true;
               }

               if (!checkResult && !artifactSkinActivityPart.isServerActivityInvalid()) {
                  ArtifactSkinRelationModel skinRelationModel = artifactSkinActivityPart.getSkinRelationModel();
                  if (skinRelationModel != null && skinRelationModel.getDressId() == id) {
                     checkResult = true;
                  }
               }

               if (!checkResult) {
                  this.player.failure(8007);
                  return;
               }

               needResources.addAll(artifactDressModel.getActivityItems());
            } else {
               needResources.addAll(artifactDressModel.getItems());
            }

            if (this.player.checkResourceNum(needResources)) {
               this.player.delResource((List)needResources, 41, 4102, 0, 0, "");
               if (artifactDressDao == null) {
                  artifactDressDao = new ArtifactDressDao();
                  artifactDressDao.playerId = this.player.getPlayerId();
                  artifactDressDao.id = artifactDressModel.getId();
                  artifactDressDao.lv = 1;
                  artifactDressDao.state = 2;
                  this.player.insertDao(artifactDressDao);
               } else {
                  if (artifactDressDao.endTime > System.currentTimeMillis()) {
                     int artifactforcenum = this.configManager.getIntDefault("artifactforcenum", 200);
                     StringBuffer sb = new StringBuffer();
                     sb.append("神兵id=").append(artifactDressDao.id);
                     sb.append("过期时间=").append(DateUtil.transferLongToDate(artifactDressDao.endTime)).append(",");
                     sb.append("当前时间=").append(DateUtil.transferLongToDate()).append(",");
                     this.player.addResource(2, 1090, artifactforcenum, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 41, 4102, 0, 0, sb.toString());
                  }

                  artifactDressDao.state = 2;
                  artifactDressDao.lv = 1;
                  artifactDressDao.endTime = 0L;
                  artifactDressDao.updateOp();
               }

               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.setProperty_artifact_dress(this.getDressProperties());
               heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_DRESSID);
               ArtifactDressMsg.S2C_ActivationResult_11108.Builder builder = ArtifactDressMsg.S2C_ActivationResult_11108.newBuilder();
               builder.setInfo(this.toDressInfo(artifactDressDao));
               builder.setType(msg.getType());
               this.player.sendMsg(builder.build());
               String[] logStr = LogOperationMgr.toRewardsInfo(needResources);
               this.player.getOperationMgr().addExtraLog(this.player, 199, "激活", artifactDressModel.getName(), logStr[0], logStr[1]);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Smelt_11115(ArtifactDressMsg.C2S_Smelt_11115 msg, String source) {
      int itemId = msg.getItemId();
      ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemId);
      if (itemModel != null) {
         ArtifactExchangeModel artifactExchangeModel = (ArtifactExchangeModel)this.player.getGameModelPool().getEntity("artifactexchange", itemModel.getId());
         if (artifactExchangeModel != null) {
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            int num = itemBagPart.getItemNum(itemId);
            if (num > 0) {
               ResourceModel needModel = new ResourceModel(2, itemId, num);
               this.player.delResource(needModel, 41, 4103, 0, 0, "");
               ResourceModel resourceModel = (ResourceModel)artifactExchangeModel.getExchange().get(0);
               int exchangeNum = resourceModel.getValue() * num;
               ResourceModel addModel = new ResourceModel(resourceModel.getType(), resourceModel.getId(), exchangeNum);
               this.player.addResource(addModel, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 41, 4103, 0, 0, "");
               ArtifactDressMsg.S2C_Smelt_11116.Builder builder = ArtifactDressMsg.S2C_Smelt_11116.newBuilder();
               builder.setResult(1);
               builder.setNum(exchangeNum);
               this.player.sendMsg(builder.build());
               String[] needStr = LogOperationMgr.toRewardsInfo(needModel);
               String[] addStr = LogOperationMgr.toRewardsInfo(addModel);
               this.player.getOperationMgr().addExtraLog(this.player, 200, needStr[0], needStr[1], addStr[0], addStr[1]);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Upgrade_11109(ArtifactDressMsg.C2S_Upgrade_11109 msg, String source) {
      int id = msg.getId();
      ArtifactDressDao artifactDressDao = this.getDressDaoByCode(id);
      if (artifactDressDao == null) {
         this.logger.info("升级的神兵皮肤为空，id={}", id);
      } else if (artifactDressDao.endTime > 0L) {
         this.logger.info("不是永久皮肤，不能升级，{}", id);
      } else if (artifactDressDao == null) {
         this.logger.info("没有幻化ID，{}", id);
      } else if (artifactDressDao.state != 2) {
         this.logger.info("皮肤未解锁，{}", artifactDressDao.state);
      } else {
         ArtifactDressModel artifactDressModel = (ArtifactDressModel)this.player.getGameModelPool().getEntity("artifactDress", id);
         if (artifactDressModel == null) {
            this.logger.info("神兵皮肤不存在，ID={}", id);
         } else {
            Map<Integer, ArtifactDressUpgradeModel> artifactSkinModelMap = (Map)this.player.getGameModelPool().getEntity("customArtifactSkin", artifactDressModel.getId());
            if (artifactSkinModelMap == null) {
               this.logger.info("皮肤没有升级数据，ID={}", artifactDressModel.getId());
            } else {
               ArtifactDressUpgradeModel artifactDressUpgradeModel = (ArtifactDressUpgradeModel)artifactSkinModelMap.get(artifactDressDao.lv);
               if (artifactDressUpgradeModel == null) {
                  this.logger.info("升级级别模板不存在，ID={},级别={}", artifactDressModel.getId(), artifactDressDao.lv);
               } else {
                  ArtifactDressUpgradeModel nextModel = (ArtifactDressUpgradeModel)artifactSkinModelMap.get(artifactDressDao.lv + 1);
                  if (nextModel != null) {
                     if (artifactDressUpgradeModel.getItems().isEmpty()) {
                        this.logger.info("升级需要材料为空，表示已经达到最大等级，ID={},级别={}", artifactDressModel.getId(), artifactDressDao.lv);
                     } else if (!this.player.checkResourceNum(artifactDressUpgradeModel.getItems())) {
                        this.logger.info("升级材料不足，ID={},级别={}", artifactDressModel.getId(), artifactDressDao.lv);
                     } else {
                        this.player.delResource((List)artifactDressUpgradeModel.getItems(), 41, 4101, 0, 0, "");
                        ++artifactDressDao.lv;
                        artifactDressDao.updateOp();
                        HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                        heroBagPart.setProperty_artifact_dress(this.getDressProperties());
                        heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_DRESSID);
                        ArtifactDressMsg.S2C_UpgradeResult_11110.Builder builder = ArtifactDressMsg.S2C_UpgradeResult_11110.newBuilder();
                        builder.setInfo(this.toDressInfo(artifactDressDao));
                        this.player.sendMsg(builder.build());
                        String[] logStr = LogOperationMgr.toRewardsInfo(artifactDressUpgradeModel.getItems());
                        this.player.getOperationMgr().addExtraLog(this.player, 199, "升级", artifactDressModel.getName(), logStr[0], logStr[1]);
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Wear_11111(ArtifactDressMsg.C2S_Wear_11111 msg, String source) {
      if (this.player.isSystemOpen(1211)) {
         int id = msg.getId();
         int artifactId = msg.getArtifactId();
         ArtifactDressDao artifactDressDao = this.getDressDaoByCode(id);
         if (artifactDressDao == null) {
            this.logger.info("没有幻化ID，{}", id);
         } else {
            this.checkEndTime(true);
            if (artifactDressDao.state != 2) {
               this.logger.info("皮肤未解锁，{}", artifactDressDao.state);
            } else if (artifactDressDao.artifact == artifactId) {
               this.logger.info("有正在使用的皮肤，ID={}", artifactDressDao.artifact);
            } else {
               ArtifactDressDao removeArtifact = null;
               Map<Integer, ArtifactDressDao> map = this.player.<Integer, ArtifactDressDao>getMap("tb_artifact_dress", this.player.getPlayerId());

               for(Map.Entry<Integer, ArtifactDressDao> entry : map.entrySet()) {
                  if (((ArtifactDressDao)entry.getValue()).artifact == artifactId) {
                     ((ArtifactDressDao)entry.getValue()).artifact = 0;
                     removeArtifact = (ArtifactDressDao)entry.getValue();
                  }
               }

               artifactDressDao.artifact = artifactId;
               artifactDressDao.updateOp();
               ArtifactDressMsg.S2C_WearResult_11112.Builder builder = ArtifactDressMsg.S2C_WearResult_11112.newBuilder();
               builder.setInfo(this.toDressInfo(artifactDressDao));
               this.player.sendMsg(builder.build());
               if (removeArtifact != null) {
                  ArtifactDressMsg.S2C_UndressResult_11114.Builder undressBuilder = ArtifactDressMsg.S2C_UndressResult_11114.newBuilder();
                  undressBuilder.setInfo(this.toDressInfo(removeArtifact));
                  this.player.sendMsg(undressBuilder.build());
               }

            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Undress_11113(ArtifactDressMsg.C2S_Undress_11113 msg, String source) {
      int id = msg.getId();
      ArtifactDressDao artifactDressDao = this.getDressDaoByCode(id);
      if (artifactDressDao == null) {
         this.logger.info("没有幻化ID，{}", id);
      } else if (artifactDressDao.artifact <= 0) {
         this.logger.info("该神兵皮肤没有使用，ID={}", id);
      } else {
         artifactDressDao.artifact = 0;
         artifactDressDao.updateOp();
         ArtifactDressMsg.S2C_UndressResult_11114.Builder builder = ArtifactDressMsg.S2C_UndressResult_11114.newBuilder();
         builder.setInfo(this.toDressInfo(artifactDressDao));
         this.player.sendMsg(builder.build());
      }
   }

   public boolean addArtifactDress(int id) {
      this.logger.info("玩家={}，获取一个神兵皮肤={}", this.player.getPlayerId(), id);
      ArtifactDressModel artifactDressModel = (ArtifactDressModel)this.player.getGameModelPool().getEntity("artifactDress", id);
      if (artifactDressModel == null) {
         return false;
      } else {
         boolean isSuccess = false;
         ArtifactDressDao artifactDressDao = this.getDressDaoByCode(artifactDressModel.getId());
         boolean isUpdate = false;
         if (artifactDressDao == null) {
            artifactDressDao = new ArtifactDressDao();
            artifactDressDao.playerId = this.player.getPlayerId();
            artifactDressDao.id = artifactDressModel.getId();
            artifactDressDao.state = 2;
            if (artifactDressDao.lv == 0) {
               artifactDressDao.lv = 1;
            }

            if (artifactDressModel.getTime() > 0) {
               artifactDressDao.endTime = System.currentTimeMillis() + 86400000L * (long)artifactDressModel.getTime();
            }

            this.player.insertDao(artifactDressDao);
            isUpdate = true;
            isSuccess = true;
         } else if (artifactDressDao.state != 2 || artifactDressDao.state == 2 && artifactDressDao.endTime > 0L && artifactDressDao.endTime < System.currentTimeMillis()) {
            artifactDressDao.id = artifactDressModel.getId();
            artifactDressDao.state = 2;
            if (artifactDressDao.lv == 0) {
               artifactDressDao.lv = 1;
            }

            if (artifactDressModel.getTime() > 0) {
               artifactDressDao.endTime = DateUtil.getSomeDayEndTime(System.currentTimeMillis()) + 86400000L * (long)(artifactDressModel.getTime() - 1);
            }

            artifactDressDao.updateOp();
            isUpdate = true;
            isSuccess = true;
         }

         if (isUpdate) {
            ArtifactDressMsg.S2C_UseDress_11118.Builder builder = ArtifactDressMsg.S2C_UseDress_11118.newBuilder();
            builder.setInfo(this.toDressInfo(artifactDressDao));
            this.player.sendMsg(builder.build());
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            heroBagPart.setProperty_artifact_dress(this.getDressProperties());
            heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_DRESSID);
         }

         return isSuccess;
      }
   }

   public boolean addArtifactDressForver(int id) {
      this.logger.info("玩家={}，获取一个永久神兵皮肤={}", this.player.getPlayerId(), id);
      ArtifactDressModel artifactDressModel = (ArtifactDressModel)this.player.getGameModelPool().getEntity("artifactDress", id);
      if (artifactDressModel == null) {
         return false;
      } else {
         boolean isSuccess = false;
         ArtifactDressDao artifactDressDao = this.getDressDaoByCode(artifactDressModel.getId());
         boolean isUpdate = false;
         if (artifactDressDao == null) {
            artifactDressDao = new ArtifactDressDao();
            artifactDressDao.playerId = this.player.getPlayerId();
            artifactDressDao.id = artifactDressModel.getId();
            artifactDressDao.state = 2;
            if (artifactDressDao.lv == 0) {
               artifactDressDao.lv = 1;
            }

            artifactDressDao.endTime = 0L;
            this.player.insertDao(artifactDressDao);
            isUpdate = true;
            isSuccess = true;
         } else if (artifactDressDao.state == 2 && artifactDressDao.endTime == 0L) {
            this.logger.error("玩家={}，已经有永久神兵皮肤={}", this.player.getPlayerId(), id);
         } else {
            artifactDressDao.id = artifactDressModel.getId();
            artifactDressDao.state = 2;
            if (artifactDressDao.lv == 0) {
               artifactDressDao.lv = 1;
            }

            artifactDressDao.endTime = 0L;
            artifactDressDao.updateOp();
            isUpdate = true;
            isSuccess = true;
         }

         if (isUpdate) {
            ArtifactDressMsg.S2C_UseDress_11118.Builder builder = ArtifactDressMsg.S2C_UseDress_11118.newBuilder();
            builder.setInfo(this.toDressInfo(artifactDressDao));
            this.player.sendMsg(builder.build());
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            heroBagPart.setProperty_artifact_dress(this.getDressProperties());
            heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_DRESSID);
         }

         return isSuccess;
      }
   }

   @TaskMethod
   public void openArtifactDress(int dressId) {
      ArtifactDressModel artifactDressModel = (ArtifactDressModel)this.player.getGameModelPool().getEntity("artifactDress", dressId);
      if (artifactDressModel != null) {
         ArtifactDressDao artifactDressDao = this.getDressDaoByCode(artifactDressModel.getId());
         if (artifactDressDao != null) {
            if (artifactDressDao.state != 2) {
               artifactDressDao.state = 1;
               artifactDressDao.updateOp();
            }
         } else {
            artifactDressDao = new ArtifactDressDao();
            artifactDressDao.playerId = this.player.getPlayerId();
            artifactDressDao.id = artifactDressModel.getId();
            artifactDressDao.state = 1;
            if (artifactDressModel.getUnlockType() == 0) {
               DressTaskPart dressTaskPart = (DressTaskPart)this.player.getMgrPart(DressTaskPart.class);
               List<Integer> taskIds = new ArrayList();

               for(Map.Entry<Integer, Integer> entry : artifactDressModel.getTasks().entrySet()) {
                  taskIds.add(entry.getValue());
               }

               dressTaskPart.initTask(taskIds);
            }

            this.player.insertDao(artifactDressDao);
         }

         this.S2C_MainResult_11102();
      }
   }

   public void openArtifactDressNoSend(int dressId) {
      ArtifactDressModel artifactDressModel = (ArtifactDressModel)this.player.getGameModelPool().getEntity("artifactDress", dressId);
      if (artifactDressModel != null) {
         ArtifactDressDao artifactDressDao = this.getDressDaoByCode(artifactDressModel.getId());
         if (artifactDressDao != null) {
            if (artifactDressDao.state != 2) {
               artifactDressDao.state = 1;
               artifactDressDao.updateOp();
            }
         } else {
            artifactDressDao = new ArtifactDressDao();
            artifactDressDao.playerId = this.player.getPlayerId();
            artifactDressDao.id = artifactDressModel.getId();
            artifactDressDao.state = 1;
            if (artifactDressModel.getUnlockType() == 0) {
               DressTaskPart dressTaskPart = (DressTaskPart)this.player.getMgrPart(DressTaskPart.class);
               List<Integer> taskIds = new ArrayList();

               for(Map.Entry<Integer, Integer> entry : artifactDressModel.getTasks().entrySet()) {
                  taskIds.add(entry.getValue());
               }

               dressTaskPart.initTask(taskIds);
            }

            this.player.insertDao(artifactDressDao);
         }

      }
   }

   public ArtifactDressMsg.DressInfo.Builder toDressInfo(ArtifactDressDao artifactDressDao) {
      ArtifactDressModel artifactDressModel = (ArtifactDressModel)this.player.getGameModelPool().getEntity("artifactDress", artifactDressDao.id);
      ArtifactDressMsg.DressInfo.Builder info_builder = ArtifactDressMsg.DressInfo.newBuilder();
      info_builder.setId(artifactDressDao.id);
      info_builder.setUnlock(artifactDressDao.state);
      info_builder.setUnlockType(artifactDressModel.getUnlockType());
      info_builder.setLv(artifactDressDao.lv);
      info_builder.setArtifactId(artifactDressDao.artifact);
      info_builder.setEndTime((int)(artifactDressDao.endTime / 1000L));
      if (artifactDressDao.state == 1) {
         for(Integer taskId : artifactDressModel.getTasks().values()) {
            TaskData taskData = this.player.getTask(TaskDefine.TaskModule.MODULE_DRESS, taskId);
            if (taskData != null) {
               info_builder.addTasks(this.toTaskInfo(taskData));
            }
         }
      }

      return info_builder;
   }

   public CommonMsg.Task.Builder toTaskInfo(TaskData taskData) {
      CommonMsg.Task.Builder task_builder = CommonMsg.Task.newBuilder();
      task_builder.setTaskId(taskData.id);
      task_builder.setState(CommonMsg.TaskState.forNumber(taskData.state));
      task_builder.setTaskNum(taskData.tVal);
      return task_builder;
   }

   public List<PropertyModel> getDressProperties() {
      List<PropertyModel> result = new ArrayList();
      Map<Integer, ArtifactDressDao> map = this.player.<Integer, ArtifactDressDao>getMap("tb_artifact_dress", this.player.getPlayerId());
      if (map == null) {
         return result;
      } else {
         for(Map.Entry<Integer, ArtifactDressDao> entry : map.entrySet()) {
            if (((ArtifactDressDao)entry.getValue()).state == 2) {
               Map<Integer, ArtifactDressUpgradeModel> artifactSkinModelMap = (Map)this.player.getGameModelPool().getEntity("customArtifactSkin", ((ArtifactDressDao)entry.getValue()).id);
               ArtifactDressUpgradeModel model = (ArtifactDressUpgradeModel)artifactSkinModelMap.get(((ArtifactDressDao)entry.getValue()).lv);
               if (model != null) {
                  for(PropertyModel dressProperty : model.getPropertys()) {
                     result.add(dressProperty);
                  }
               }
            }
         }

         return result;
      }
   }

   public ArtifactDressModel getDressModel(int taskId) {
      Map<Integer, ArtifactDressModel> modelMap = this.player.getGameModelPool().getMap("artifactDress");

      for(Map.Entry<Integer, ArtifactDressModel> entry : modelMap.entrySet()) {
         if (((ArtifactDressModel)entry.getValue()).getTasks().containsValue(taskId)) {
            return (ArtifactDressModel)entry.getValue();
         }
      }

      return null;
   }

   public boolean allUnlockTask(ArtifactDressModel artifactDressModel) {
      boolean allUnlock = true;

      for(Integer taskId : artifactDressModel.getTasks().values()) {
         TaskData taskData = this.player.getTask(TaskDefine.TaskModule.MODULE_DRESS, taskId);
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

   public ArtifactDressDao getDressDaoByCode(int code) {
      Map<Integer, ArtifactDressDao> map = this.player.<Integer, ArtifactDressDao>getMap("tb_artifact_dress", this.player.getPlayerId());
      return map == null ? null : (ArtifactDressDao)map.get(code);
   }

   public ArtifactDressDao getArtifactDressDaoByArtifactId(int artifactId) {
      Map<Integer, ArtifactDressDao> map = this.player.<Integer, ArtifactDressDao>getMap("tb_artifact_dress", this.player.getPlayerId());
      if (map == null) {
         return null;
      } else {
         for(Map.Entry<Integer, ArtifactDressDao> entry : map.entrySet()) {
            if (((ArtifactDressDao)entry.getValue()).artifact > 0 && ((ArtifactDressDao)entry.getValue()).artifact == artifactId) {
               return (ArtifactDressDao)entry.getValue();
            }
         }

         return null;
      }
   }

   public void gmClearDress(int dressId) {
      ArtifactDressDao artifactDressDao = this.getDressDaoByCode(dressId);
      if (artifactDressDao != null) {
         this.player.deleteDao(artifactDressDao, true);
         this.S2C_MainResult_11102();
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         heroBagPart.setProperty_artifact_dress(this.getDressProperties());
         heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_ARTIFACT_DRESSID);
      }

   }

   public void gmOpenArtifactDress(int dressId) {
      this.openArtifactDress(dressId);
      WorldDao<WorldData> worldDao = this.worldMgr.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
      ((WorldData)worldDao.jsonData).openArtDress.add(dressId);
      worldDao.updateOp();
   }

   public void gmUnlockDress() {
      Map<Integer, ArtifactDressDao> map = this.player.<Integer, ArtifactDressDao>getMap("tb_artifact_dress", this.player.getPlayerId());
      if (map != null) {
         for(Map.Entry<Integer, ArtifactDressDao> entry : map.entrySet()) {
            ((ArtifactDressDao)entry.getValue()).state = 2;
            if (((ArtifactDressDao)entry.getValue()).lv == 0) {
               ((ArtifactDressDao)entry.getValue()).lv = 1;
            }

            ((ArtifactDressDao)entry.getValue()).updateOp();
         }
      }

   }

   public void gmClearWorldDress(int dressId) {
      WorldDao<WorldData> worldDao = this.worldMgr.<WorldData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_WORLD);
      ((WorldData)worldDao.jsonData).openArtDress.remove(dressId);
      worldDao.updateOp();
   }

   private boolean checkArtifactDress(int activityId, int dressId) {
      ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", activityId);
      return activityOpenTimeModel == null ? false : activityOpenTimeModel.getExtendParams().equals(String.valueOf(dressId));
   }
}
