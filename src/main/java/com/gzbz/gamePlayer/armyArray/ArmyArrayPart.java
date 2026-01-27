package com.gzbz.gamePlayer.armyArray;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.ArmyArrayDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.HeroDressDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.db.bean.ArmyArrayData;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerBag.BagParent;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.model.ArmyArrayEyePropertyModel;
import com.gzbz.model.ArmyArrayLockModel;
import com.gzbz.model.ArmyArrayModel;
import com.gzbz.model.ArmyArrayPropertyModel;
import com.gzbz.model.ArmyDressLimitModel;
import com.gzbz.model.HeroDressModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ArmyArrayMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ArmyArrayPart extends PlayerPart {
   private Map<Integer, List<PropertyModel>> property_army_array_normal;
   private Map<Integer, List<PropertyModel>> property_army_array_eye;

   public void loginHandle() {
      if (this.isOpen()) {
         this.unlockByLvUp(this.player.getPlayerDao().lv, true);
         this.checkArmyEye();
      }

      this.getPropertyNormalAll();
      this.getPropertyEyeAdditions(1);
   }

   private ArmyArrayDao getArmyArrayDao() {
      return (ArmyArrayDao)this.player.getData("tb_army_array", this.player.getPlayerId());
   }

   private ArmyArrayData getArmyArrayData(int grid) {
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();
      return (ArmyArrayData)armyArrayDao.arrayDataMap.get(grid);
   }

   @MsgHandlerAnno
   public void C2S_Info_20601(ArmyArrayMsg.C2S_Info_20601 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_Unlock_20603(ArmyArrayMsg.C2S_Unlock_20603 msg, String source) {
      this.unlock(msg.getGrid());
   }

   @MsgHandlerAnno
   public void C2S_SelectArray_20605(ArmyArrayMsg.C2S_SelectArray_20605 msg, String source) {
      this.selectArray(msg.getGrid(), msg.getArrayId());
   }

   @MsgHandlerAnno
   public void C2S_PutEye_20607(ArmyArrayMsg.C2S_PutEye_20607 msg, String source) {
      this.putEye(msg.getGrid(), msg.getEye());
   }

   @MsgHandlerAnno
   public void C2S_PutMaterial_20609(ArmyArrayMsg.C2S_PutMaterial_20609 msg, String source) {
      this.putMaterial(msg.getGrid(), msg.getPos(), msg.getItemId());
   }

   private void sendInfo() {
      ArmyArrayMsg.S2C_Info_20602.Builder msg = ArmyArrayMsg.S2C_Info_20602.newBuilder();
      msg.setIsOpen(this.isOpen());
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();
      if (armyArrayDao.showGridNum < 6) {
         armyArrayDao.showGridNum = 6;
         armyArrayDao.updateOp();
      }

      msg.setShowGridNum(armyArrayDao.showGridNum);
      msg.addAllGrids(armyArrayDao.gridSet);

      for(ArmyArrayData data : armyArrayDao.arrayDataMap.values()) {
         ArmyArrayMsg.ArrayData.Builder arrayDataMsg = ArmyArrayMsg.ArrayData.newBuilder();
         arrayDataMsg.setGrid(data.grid);
         arrayDataMsg.setArrayId(data.arrayId);
         arrayDataMsg.setEye(data.eye);

         for(Map.Entry<Integer, ResourceModel> entry : data.protectedMap.entrySet()) {
            CommonMsg.ItemInfo.Builder itemInfo = CommonMsg.ItemInfo.newBuilder();
            ResourceModel resourceModel = (ResourceModel)entry.getValue();
            itemInfo.setPos((Integer)entry.getKey());
            itemInfo.setType(resourceModel.getType());
            itemInfo.setId(resourceModel.getId());
            itemInfo.setNum(resourceModel.getValue());
            arrayDataMsg.addProtectData(itemInfo);
         }

         msg.addArrayData(arrayDataMsg);
      }

      this.player.sendMsg(msg.build());
   }

   private void unlock(int grid) {
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();
      if (armyArrayDao.gridSet.contains(grid)) {
         this.player.failure(76117);
      } else {
         ArmyArrayLockModel unlockModel = (ArmyArrayLockModel)ApplicationContextProvider.getModelPoolEntity("armyArrayLock", grid);
         if (unlockModel != null) {
            List<Integer> unlock = unlockModel.getUnlock();
            if (!unlock.contains(2)) {
               this.logger.info("{}不可通过资源解锁该格子{}", this.player.getPlayerId(), grid);
            } else if (!this.player.checkResourceNum(unlockModel.getUnlockItem())) {
               this.logger.info("资源不足");
            } else {
               this.player.delResource((List)unlockModel.getUnlockItem(), 104, 10401, grid, 0, "");
               armyArrayDao.gridSet.add(grid);
               armyArrayDao.updateOp();
               this.notifyUnlock(grid);
            }
         }
      }
   }

   private void notifyUnlock(int grid) {
      ArmyArrayMsg.S2C_Unlock_20604.Builder msg = ArmyArrayMsg.S2C_Unlock_20604.newBuilder();
      msg.setGrid(grid);
      this.player.sendMsg(msg.build());
   }

   private void selectArray(int grid, int arrayId) {
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();
      if (arrayId > 0) {
         ArmyArrayData armyArrayData = (ArmyArrayData)armyArrayDao.arrayDataMap.get(grid);
         if (armyArrayData != null) {
            if (armyArrayData.arrayId == arrayId) {
               this.player.failure(76118);
               return;
            }

            this.switchArray(armyArrayDao, armyArrayData, arrayId);
         } else {
            if (armyArrayDao.arrayDataMap.size() >= armyArrayDao.showGridNum) {
               this.player.failure(76119);
               return;
            }

            this.putOnArray(grid, arrayId);
         }
      } else {
         this.takeOffArray(grid);
      }

      this.sendInfo();
   }

   private void takeOffArray(int grid) {
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();
      ArmyArrayData armyArrayData = (ArmyArrayData)armyArrayDao.arrayDataMap.get(grid);
      if (armyArrayData != null) {
         List<ResourceModel> resourceModels = new ArrayList();

         for(Map.Entry<Integer, ResourceModel> entry : armyArrayData.protectedMap.entrySet()) {
            ResourceModel resourceModel = (ResourceModel)entry.getValue();
            resourceModels.add(resourceModel.clone());
         }

         this.cancelEye(armyArrayData);
         armyArrayDao.arrayDataMap.remove(grid);
         armyArrayDao.updateOp();
         if (resourceModels.size() > 0) {
            this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 104, 10402, grid, 0, "");
         }

         this.updatePropertyAddtion(grid);
         this.flushPropertys();
      }
   }

   private boolean putOnArray(int grid, int arrayId) {
      if (arrayId == 0) {
         return false;
      } else {
         ArmyArrayDao armyArrayDao = this.getArmyArrayDao();
         if (!armyArrayDao.gridSet.contains(grid)) {
            this.player.failure(76120);
            return false;
         } else {
            ArmyArrayData armyArrayData = (ArmyArrayData)armyArrayDao.arrayDataMap.get(grid);
            if (armyArrayData == null) {
               armyArrayData = new ArmyArrayData();
               armyArrayData.grid = grid;
               armyArrayDao.arrayDataMap.put(grid, armyArrayData);
            }

            armyArrayData.arrayId = arrayId;
            armyArrayDao.updateOp();
            return true;
         }
      }
   }

   private void switchArray(ArmyArrayDao armyArrayDao, ArmyArrayData armyArrayData, int newArrayId) {
      ArmyArrayModel armyArrayModel = (ArmyArrayModel)ApplicationContextProvider.getModelPoolEntity("armyArray", newArrayId);
      if (armyArrayData.eye > 0) {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(armyArrayData.eye);
         if (heroDao == null) {
            this.logger.warn("玩家军阵阵眼数据有误 playerId:{} grid:{} eye:{}", new Object[]{this.player.getPlayerId(), armyArrayData.grid, armyArrayData.eye});
         } else {
            heroDao.armyArraySkill.clear();
            heroDao.updateOp();
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
            if (!armyArrayModel.getEyeType().contains(0) && !armyArrayModel.getEyeType().contains(heroModel.getNation())) {
               this.cancelEye(armyArrayData);
            }
         }
      }

      List<ResourceModel> returnList = new ArrayList();
      Set<Integer> removeSet = new HashSet();

      for(Map.Entry<Integer, ResourceModel> entry : armyArrayData.protectedMap.entrySet()) {
         ResourceModel resourceModel = (ResourceModel)entry.getValue();
         if (resourceModel.getType() != 0 && resourceModel.getId() != 0) {
            int pos = (Integer)entry.getKey();
            boolean isKeepOn = this.checkCampProtect(armyArrayModel, pos, resourceModel.getId());
            if (!isKeepOn) {
               returnList.add(resourceModel);
               removeSet.add(pos);
            }
         }
      }

      String strPos = "";
      if (removeSet.size() > 0) {
         for(int pos : removeSet) {
            armyArrayData.protectedMap.remove(pos);
            strPos = strPos + pos + ",";
         }
      }

      armyArrayData.arrayId = newArrayId;
      armyArrayDao.updateOp();
      if (returnList.size() > 0) {
         this.logger.info("玩家切换军阵，卸下护卫道具 playerId:{} grid:{} oriArrayId:{} newArrayId:{} pos:{}", new Object[]{this.player.getPlayerId(), armyArrayData.grid, armyArrayData.arrayId, newArrayId, strPos});
         this.player.addResource(returnList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 104, 10403, armyArrayData.grid, newArrayId, "切换军阵" + strPos);
      }

      this.updateHeroArmySkill(armyArrayData);
      this.updatePropertyAddtion(armyArrayData.grid);
      this.flushPropertys();
   }

   private void putEye(int grid, int heroCode) {
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();
      ArmyArrayData armyArrayData = (ArmyArrayData)armyArrayDao.arrayDataMap.get(grid);
      if (armyArrayData == null) {
         this.player.failure(76120);
      } else if (armyArrayData.arrayId == 0) {
         this.player.failure(76122);
      } else {
         boolean result;
         if (heroCode > 0) {
            result = this.setEye(armyArrayData, heroCode);
         } else {
            result = this.cancelEye(armyArrayData);
         }

         if (result) {
            this.checkUnlockGrid(armyArrayData);
            this.updateHeroArmySkill(armyArrayData);
            this.updatePropertyAddtion(grid);
            this.flushPropertys();
            this.sendInfo();
         }

      }
   }

   private boolean setEye(ArmyArrayData armyArrayData, int heroCode) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (heroDao == null) {
         return false;
      } else if (HeroModel.isReplacementHero(heroDao.id)) {
         return false;
      } else if (heroDao.armyArrayGrids.contains(armyArrayData.grid)) {
         this.logger.info("玩家{}武将code:{}已经是该阵法 grid:{}的阵眼", new Object[]{this.player.getPlayerId(), heroCode, armyArrayData.grid});
         return false;
      } else if (heroDao.armyArrayGrids.size() > 0) {
         this.logger.info("玩家{}武将code:{}已经是阵眼", this.player.getPlayerId(), heroCode);
         this.player.failure(76121);
         return false;
      } else {
         ArmyArrayModel armyArrayModel = (ArmyArrayModel)ApplicationContextProvider.getModelPoolEntity("armyArray", armyArrayData.arrayId);
         if (armyArrayModel == null) {
            return false;
         } else {
            if (!armyArrayModel.getEyeType().contains(0)) {
               HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
               if (!armyArrayModel.getEyeType().contains(heroModel.getNation())) {
                  return this.player.failure(76125);
               }
            }

            this.cancelEye(armyArrayData);
            heroDao.armyArrayGrids.add(armyArrayData.grid);
            heroDao.updateOp();
            armyArrayData.eye = heroCode;
            ArmyArrayDao armyArrayDao = this.getArmyArrayDao();
            armyArrayDao.updateOp();
            return true;
         }
      }
   }

   private boolean cancelEye(ArmyArrayData armyArrayData) {
      if (armyArrayData.eye > 0) {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(armyArrayData.eye);
         if (heroDao != null) {
            heroDao.armyArrayGrids.clear();
            heroDao.armyArraySkill.clear();
            heroDao.updateOp();
            ArmyArrayDao armyArrayDao = this.getArmyArrayDao();
            armyArrayData.eye = 0;
            armyArrayDao.updateOp();
            return true;
         }
      }

      return false;
   }

   private void putMaterial(int grid, int pos, int itemId) {
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();
      ArmyArrayData armyArrayData = (ArmyArrayData)armyArrayDao.arrayDataMap.get(grid);
      if (armyArrayData == null) {
         this.player.failure(76120);
      } else if (armyArrayData.arrayId == 0) {
         this.player.failure(76122);
      } else {
         ResourceModel newResource = null;
         ArmyArrayModel armyArrayModel = (ArmyArrayModel)ApplicationContextProvider.getModelPoolEntity("armyArray", armyArrayData.arrayId);
         if (armyArrayModel != null) {
            if (itemId > 0) {
               for(ResourceModel resourceModel : armyArrayData.protectedMap.values()) {
                  if (resourceModel.getId() == itemId) {
                     this.player.failure(76126);
                     return;
                  }
               }

               if (!this.checkCampProtect(armyArrayModel, pos, itemId)) {
                  this.player.failure(76139);
                  return;
               }

               String strProtect = this.getProtected(armyArrayModel, pos);
               String[] arr = strProtect.split("\\|");
               newResource = new ResourceModel(2, itemId, Integer.parseInt(arr[1]));
               if (!this.player.checkResourceNum(newResource)) {
                  this.logger.info("物品数量不足");
                  return;
               }

               this.player.delResource(newResource, 104, 10403, grid, pos, "itemId:" + itemId);
            }

            ResourceModel oldResourceModel = (ResourceModel)armyArrayData.protectedMap.get(pos);
            if (oldResourceModel != null) {
               this.player.addResource(oldResourceModel, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 104, 10403, grid, pos, "itemId:" + itemId);
               armyArrayData.protectedMap.remove(pos);
            }

            if (newResource != null) {
               armyArrayData.protectedMap.put(pos, newResource);
               this.checkUnlockGrid(armyArrayData);
            }

            armyArrayDao.updateOp();
            this.updateHeroArmySkill(armyArrayData);
            this.updatePropertyAddtion(grid);
            this.flushPropertys();
            ArmyArrayMsg.S2C_PutMaterial_20610.Builder msg = ArmyArrayMsg.S2C_PutMaterial_20610.newBuilder();
            msg.setGrid(grid);
            msg.setPos(pos);
            msg.setItemId(itemId);
            this.player.sendMsg(msg.build());
         }
      }
   }

   private boolean checkQuality(String campProtect, int itemId) {
      if ("".equals(campProtect)) {
         return false;
      } else {
         String[] arr = campProtect.split("\\|");
         if (arr.length != 2) {
            return false;
         } else {
            ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", itemId);
            if (itemModel != null && itemModel.getTargetclass() == 10) {
               if (itemModel.getTimeOut() > 0) {
                  return false;
               } else {
                  HeroDressModel heroDressModel = (HeroDressModel)ApplicationContextProvider.getModelPoolEntity("heroDress", itemModel.getUseFuncId());
                  if (heroDressModel == null) {
                     return false;
                  } else {
                     ArmyDressLimitModel armyDressLimitModel = (ArmyDressLimitModel)ApplicationContextProvider.getModelPoolEntity("armyDressLimit", heroDressModel.getItemId());
                     return armyDressLimitModel == null ? false : arr[0].contains(String.valueOf(armyDressLimitModel.getCharacter()));
                  }
               }
            } else {
               return false;
            }
         }
      }
   }

   private String getProtected(ArmyArrayModel armyArrayModel, int pos) {
      List<String> campProtect = armyArrayModel.getCampProtect();
      return pos >= campProtect.size() ? "" : (String)campProtect.get(pos);
   }

   private void flushPropertys() {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODULE_ARMY_ARRAY);
   }

   private boolean isOpen() {
      boolean systemOpen = this.player.isSystemOpen(5030);
      return systemOpen;
   }

   private boolean hadAwakenDress() {
      Map<Integer, HeroDressDao> map = this.player.<Integer, HeroDressDao>getMap("tb_hero_dress", this.player.getPlayerId());

      for(HeroDressDao heroDressDao : map.values()) {
         HeroDressModel heroDressModel = (HeroDressModel)ApplicationContextProvider.getModelPoolEntity("heroDress", heroDressDao.id);
         if (heroDressModel != null && heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_AWAKEN) {
            return true;
         }
      }

      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      BagParent<ItemBase> bag = itemBagDao.getBagBySublass(1);

      for(ItemBase itemBase : bag.getMap().values()) {
         if (this.isAwakenDress(itemBase.id)) {
            return true;
         }
      }

      return false;
   }

   public boolean isAwakenDress(int itemId) {
      ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", itemId);
      if (itemModel != null && itemModel.getTargetclass() == 10) {
         HeroDressModel heroDressModel = (HeroDressModel)ApplicationContextProvider.getModelPoolEntity("heroDress", itemModel.getId());
         return heroDressModel != null && heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_AWAKEN;
      } else {
         return false;
      }
   }

   public void levelUp(int preLv, int newLv) {
      this.unlockByLvUp(newLv, false);
   }

   public void unlockByLvUp(int playerLv, boolean isLogin) {
      int enableNum = this.getEnableEysSkillNum();
      int showGridNum = 0;
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();
      Set<Integer> unlockSet = new HashSet();
      Map<Integer, ArmyArrayLockModel> modelMap = ApplicationContextProvider.<Integer, ArmyArrayLockModel>getModelPoolMap("armyArrayLock");

      for(ArmyArrayLockModel model : modelMap.values()) {
         if (model.getActiveNum() <= enableNum) {
            ++showGridNum;
            if (!armyArrayDao.gridSet.contains(model.getId()) && model.getUnlock().contains(1) && playerLv >= model.getLevel()) {
               unlockSet.add(model.getId());
            }
         }
      }

      if (showGridNum > armyArrayDao.showGridNum) {
         armyArrayDao.showGridNum = Math.max(6, showGridNum);
         armyArrayDao.updateOp();
         ArmyArrayMsg.S2C_UpdateShowGridNum_20612.Builder builder = ArmyArrayMsg.S2C_UpdateShowGridNum_20612.newBuilder();
         builder.setShowGridNum(armyArrayDao.showGridNum);
         this.player.sendMsg(builder.build());
      }

      if (unlockSet.size() != 0) {
         armyArrayDao.gridSet.addAll(unlockSet);
         armyArrayDao.updateOp();
         if (!isLogin) {
            for(int grid : unlockSet) {
               this.notifyUnlock(grid);
            }
         }

      }
   }

   public int getProvideNation(int itemId) {
      ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", itemId);
      if (itemModel != null && itemModel.getTargetclass() == 10) {
         HeroDressModel heroDressModel = (HeroDressModel)ApplicationContextProvider.getModelPoolEntity("heroDress", itemModel.getUseFuncId());
         if (heroDressModel == null) {
            return -1;
         } else {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDressModel.getHeroId());
            return heroModel != null ? heroModel.getNation() : -1;
         }
      } else {
         return -1;
      }
   }

   private boolean checkCampProtect(ArmyArrayModel armyArrayModel, int pos, int itemId) {
      ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", itemId);
      if (armyArrayModel != null && itemModel != null && itemModel.getTargetclass() == 10) {
         if (itemModel.getTimeOut() > 0) {
            return false;
         } else {
            HeroDressModel heroDressModel = (HeroDressModel)ApplicationContextProvider.getModelPoolEntity("heroDress", itemModel.getUseFuncId());
            if (heroDressModel == null) {
               return false;
            } else if (heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_COLLECTION) {
               return false;
            } else {
               int dressType = (Integer)armyArrayModel.getDressType().get(pos);
               if (dressType != 0 && dressType != heroDressModel.getDressType()) {
                  return false;
               } else {
                  ArmyDressLimitModel armyDressLimitModel = (ArmyDressLimitModel)ApplicationContextProvider.getModelPoolEntity("armyDressLimit", heroDressModel.getId());
                  if (armyDressLimitModel == null) {
                     return false;
                  } else {
                     String campProtect = this.getProtected(armyArrayModel, pos);
                     return campProtect.contains(String.valueOf(armyDressLimitModel.getCharacter()));
                  }
               }
            }
         }
      } else {
         return false;
      }
   }

   private void updatePropertyAddtion(int grid) {
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();
      ArmyArrayData armyArrayData = (ArmyArrayData)armyArrayDao.arrayDataMap.get(grid);
      if (armyArrayData == null) {
         this.property_army_array_normal.remove(grid);
         this.property_army_array_eye.remove(grid);
      } else {
         List<PropertyModel> normalPros = this.getPropertysByGrid(1, grid);
         this.property_army_array_normal.put(grid, normalPros);
         List<PropertyModel> eyePros = this.getPropertysByGrid(2, grid);
         this.property_army_array_eye.put(grid, eyePros);
      }

   }

   public List<PropertyModel> getPropertyNormalAll() {
      if (this.property_army_array_normal == null) {
         this.property_army_array_normal = new HashMap();
         ArmyArrayDao armyArrayDao = this.getArmyArrayDao();

         for(Integer grid : armyArrayDao.arrayDataMap.keySet()) {
            List<PropertyModel> propertyModels = this.getPropertysByGrid(1, grid);
            this.property_army_array_normal.put(grid, propertyModels);
         }
      }

      List<PropertyModel> propertyModels = new ArrayList();

      for(List<PropertyModel> list : this.property_army_array_normal.values()) {
         for(PropertyModel propertyModel : list) {
            PropertyModel.addLvProtities(propertyModels, propertyModel);
         }
      }

      return propertyModels;
   }

   public List<PropertyModel> getPropertyEyeAdditions(int grid) {
      if (this.property_army_array_eye == null) {
         this.property_army_array_eye = new HashMap();
         ArmyArrayDao armyArrayDao = this.getArmyArrayDao();

         for(Map.Entry<Integer, ArmyArrayData> entry : armyArrayDao.arrayDataMap.entrySet()) {
            List<PropertyModel> propertyModels = this.getPropertysByGrid(2, (Integer)entry.getKey());
            this.property_army_array_eye.put(entry.getKey(), propertyModels);
         }
      }

      return (List)this.property_army_array_eye.getOrDefault(grid, new ArrayList());
   }

   private List<PropertyModel> getPropertysByGrid(int type, int grid) {
      List<PropertyModel> propertyModels = new ArrayList();
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();
      ArmyArrayData armyArrayData = (ArmyArrayData)armyArrayDao.arrayDataMap.get(grid);
      if (armyArrayData == null) {
         return propertyModels;
      } else {
         if (type == 2) {
            propertyModels = this.getEyePropertys(armyArrayData);
         } else {
            propertyModels = this.getNormalPropertys(armyArrayData);
         }

         return propertyModels;
      }
   }

   private List<PropertyModel> getNormalPropertys(ArmyArrayData armyArrayData) {
      List<PropertyModel> propertyModels = new ArrayList();
      if (armyArrayData == null) {
         return propertyModels;
      } else {
         Map<Integer, ArmyArrayPropertyModel> propertyModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("curtomArmyArrayProperty", armyArrayData.arrayId);

         for(Map.Entry<Integer, ResourceModel> entry : armyArrayData.protectedMap.entrySet()) {
            ArmyArrayPropertyModel arrayPropertyModel = (ArmyArrayPropertyModel)propertyModelMap.get((Integer)entry.getKey() + 1);

            for(PropertyModel property : arrayPropertyModel.getProperty()) {
               PropertyModel.addLvProtities(propertyModels, property);
            }
         }

         return propertyModels;
      }
   }

   private List<PropertyModel> getEyePropertys(ArmyArrayData armyArrayData) {
      List<PropertyModel> propertyModels = new ArrayList();
      if (armyArrayData == null) {
         return propertyModels;
      } else {
         Map<Integer, ArmyArrayEyePropertyModel> propertyModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("curtomArmyEysProperty", armyArrayData.arrayId);

         for(Map.Entry<Integer, ResourceModel> entry : armyArrayData.protectedMap.entrySet()) {
            ArmyArrayEyePropertyModel arrayPropertyModel = (ArmyArrayEyePropertyModel)propertyModelMap.get((Integer)entry.getKey() + 1);

            for(PropertyModel property : arrayPropertyModel.getProperty()) {
               PropertyModel.addLvProtities(propertyModels, property);
            }
         }

         return propertyModels;
      }
   }

   public void checkEyes(List<Integer> heroCodeList) {
      boolean isChange = false;
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();

      for(ArmyArrayData armyArrayData : armyArrayDao.arrayDataMap.values()) {
         if (heroCodeList.contains(armyArrayData.eye)) {
            this.logger.info("1军阵 - 移除玩家{} 军阵{} 阵眼武将 {}", new Object[]{this.player.getPlayerId(), armyArrayData.arrayId, armyArrayData.eye});
            armyArrayData.eye = 0;
            isChange = true;
            this.updatePropertyAddtion(armyArrayData.grid);
            this.updateHeroArmySkill(armyArrayData);
         }
      }

      if (isChange) {
         armyArrayDao.updateOp();
         this.flushPropertys();
         this.sendInfo();
      }

   }

   public void checkEyes(int heroId) {
      boolean isChange = false;
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();

      for(ArmyArrayData armyArrayData : armyArrayDao.arrayDataMap.values()) {
         if (armyArrayData.eye != 0) {
            HeroDao heroDao = heroBagPart.getHeroByCode(armyArrayData.eye);
            if (heroDao != null && heroDao.id == heroId) {
               this.logger.info("2军阵 - 移除玩家{} 军阵{} 阵眼武将 {}", new Object[]{this.player.getPlayerId(), armyArrayData.arrayId, armyArrayData.eye});
               isChange = true;
               this.cancelEye(armyArrayData);
               this.updatePropertyAddtion(armyArrayData.grid);
               this.updateHeroArmySkill(armyArrayData);
            }
         }
      }

      if (isChange) {
         armyArrayDao.updateOp();
         this.flushPropertys();
         this.sendInfo();
      }

   }

   private void updateHeroArmySkill(ArmyArrayData armyArrayData) {
      if (armyArrayData != null) {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(armyArrayData.eye);
         if (heroDao != null) {
            ArmyArrayModel armyArrayModel = (ArmyArrayModel)ApplicationContextProvider.getModelPoolEntity("armyArray", armyArrayData.arrayId);
            if (armyArrayModel != null) {
               if (this.enableEysSkill(armyArrayData)) {
                  heroDao.armyArraySkill.add(armyArrayModel.getEffect());
               } else {
                  heroDao.armyArraySkill.clear();
               }

               heroDao.updateOp();
            }
         }
      }
   }

   private boolean enableEysSkill(ArmyArrayData armyArrayData) {
      if (armyArrayData == null) {
         return false;
      } else if (armyArrayData.eye == 0) {
         return false;
      } else {
         return armyArrayData.protectedMap.size() >= 3;
      }
   }

   public void resetDaily() {
      this.armyLogInfo();
   }

   public void armyLogInfo() {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();

      for(ArmyArrayData armyArrayData : armyArrayDao.arrayDataMap.values()) {
         if (this.enableEysSkill(armyArrayData)) {
            String armyArrayName = "";
            ArmyArrayModel armyArrayModel = (ArmyArrayModel)ApplicationContextProvider.getModelPoolEntity("armyArray", armyArrayData.arrayId);
            if (armyArrayModel != null) {
               armyArrayName = armyArrayModel.getName();
            }

            String heroInfo = "";
            HeroDao heroDao = heroBagPart.getHeroByCode(armyArrayData.eye);
            if (heroDao != null) {
               HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
               heroInfo = heroModel.getName() + "&" + heroDao.getLv() + "&" + heroDao.getStar();
            }

            String strProtected = "";

            for(ResourceModel resourceModel : armyArrayData.protectedMap.values()) {
               ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", resourceModel.getId());
               if (itemModel != null) {
                  strProtected = strProtected + itemModel.getName() + "|";
               }
            }

            this.player.getOperationMgr().addExtraLog(this.player, 220, armyArrayName, heroInfo, strProtected);
         }
      }

   }

   private int getEnableEysSkillNum() {
      int enableNum = 0;
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();

      for(ArmyArrayData armyArrayData : armyArrayDao.arrayDataMap.values()) {
         if (this.enableEysSkill(armyArrayData)) {
            ++enableNum;
         }
      }

      return enableNum;
   }

   private void checkUnlockGrid(ArmyArrayData armyArrayData) {
      if (this.enableEysSkill(armyArrayData)) {
         this.unlockByLvUp(this.player.getPlayerDao().lv, false);
      }

   }

   public void gmTest(String string) {
      String[] arr = string.split(",");
      switch (arr[0]) {
         case "unlock":
            this.gmUnlock(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
            break;
         case "select":
            this.selectArray(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
            break;
         case "eye":
            this.putEye(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
            break;
         case "item":
            this.putMaterial(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
            break;
         case "checkhero":
            this.gmCheckHeroArmy();
      }

   }

   private void gmUnlock(int type, int grid) {
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();
      if (type == 1) {
         this.unlock(grid);
      } else if (grid == 0) {
         for(ArmyArrayData armyArrayData : armyArrayDao.arrayDataMap.values()) {
            this.selectArray(armyArrayData.grid, 0);
         }

         armyArrayDao.arrayDataMap.clear();
         armyArrayDao.gridSet.clear();
      } else {
         ArmyArrayData armyArrayData = (ArmyArrayData)armyArrayDao.arrayDataMap.get(grid);
         if (armyArrayData != null) {
            this.selectArray(armyArrayData.grid, 0);
            armyArrayDao.gridSet.remove(grid);
         }
      }

      armyArrayDao.updateOp();
      this.logger.info("当前解锁的军阵是:{}", armyArrayDao.gridSet);
      this.sendInfo();
   }

   private void checkArmyEye() {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();

      for(ArmyArrayData armyArrayData : armyArrayDao.arrayDataMap.values()) {
         if (armyArrayData.eye > 0) {
            HeroDao heroDao = heroBagPart.getHeroByCode(armyArrayData.eye);
            if (heroDao == null || !heroDao.armyArrayGrids.contains(armyArrayData.grid)) {
               this.logger.warn("playerId:{} grid:{} arrayId:{}阵眼数据和武将{}数据不匹配，重置军阵阵眼", new Object[]{this.player.getPlayerId(), armyArrayData.grid, armyArrayData.arrayId, armyArrayData.eye});
               armyArrayData.eye = 0;
            }
         }
      }

      armyArrayDao.updateOp();
   }

   public void gmCheckHeroArmy() {
      this.logger.info("检查玩家{}军阵数据", this.player.getPlayerId());
      this.checkArmyEye();
      ArmyArrayDao armyArrayDao = this.getArmyArrayDao();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      Map<Integer, HeroDao> heroDaoMap = heroBagPart.getHeroDaoMap();

      for(HeroDao heroDao : heroDaoMap.values()) {
         if (heroDao.armyArrayGrids.size() != 0) {
            Set<Integer> invalid = new HashSet();

            for(int grid : heroDao.armyArrayGrids) {
               ArmyArrayData armyArrayData = (ArmyArrayData)armyArrayDao.arrayDataMap.get(grid);
               if (armyArrayData == null || armyArrayData.eye != heroDao.code) {
                  invalid.add(grid);
               }
            }

            if (invalid.size() > 0) {
               heroDao.armyArrayGrids.removeAll(invalid);
               heroDao.armyArraySkill.clear();
               this.logger.info("移除玩家 {} 武将 code:{} 的军阵格子数据{}，移除后为:{}", new Object[]{this.player.getPlayerId(), heroDao.code, invalid, heroDao.armyArrayGrids});
               heroDao.updateOp();
            }
         }
      }

      this.flushPropertys();
   }
}
