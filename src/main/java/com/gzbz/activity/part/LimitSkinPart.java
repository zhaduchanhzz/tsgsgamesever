package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.ActivityLimitSkinDao;
import com.gzbz.db.ArmyArrayDao;
import com.gzbz.db.HeroDressDao;
import com.gzbz.db.HeroPalaceDao;
import com.gzbz.db.bean.ArmyArrayData;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.model.HeroDressModel;
import com.gzbz.model.LimitSkinModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityLimitSkinMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class LimitSkinPart extends AbstractActivityPart {
   public void sendInfo() {
   }

   public int getActivityType() {
      return 96;
   }

   public void activityEnd(int oldActivityId) {
      this.clearData();
   }

   public void loginHandle() {
   }

   @MsgHandlerAnno
   public void C2S_LimitSkinInfo_23401(ActivityLimitSkinMsg.C2S_LimitSkinInfo_23401 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.handleData();
         ActivityLimitSkinMsg.S2C_LimitSkinInfo_23402.Builder resp = ActivityLimitSkinMsg.S2C_LimitSkinInfo_23402.newBuilder();
         ActivityLimitSkinDao activityLimitSkinDao = (ActivityLimitSkinDao)this.player.getData("tb_activity_limit_skin", this.player.getPlayerId());
         resp.addAllLimitSkinList(activityLimitSkinDao.limitSkinIds);
         this.player.sendMsg(resp.build());
      }
   }

   private void handleData() {
      ActivityLimitSkinDao activityLimitSkinDao = (ActivityLimitSkinDao)this.player.getData("tb_activity_limit_skin", this.player.getPlayerId());
      if (!activityLimitSkinDao.hadInit) {
         activityLimitSkinDao.hadInit = true;
         activityLimitSkinDao.limitSkinIds = this.getSkinInFirstDay();
         activityLimitSkinDao.updateOp();
      }
   }

   private void clearData() {
      ActivityLimitSkinDao activityLimitSkinDao = (ActivityLimitSkinDao)this.player.getData("tb_activity_limit_skin", this.player.getPlayerId());
      activityLimitSkinDao.hadInit = false;
      activityLimitSkinDao.limitSkinIds.clear();
      activityLimitSkinDao.updateOp();
   }

   private List<Integer> getSkinInFirstDay() {
      Map<Integer, LimitSkinModel> modelSkinMap = ApplicationContextProvider.<Integer, LimitSkinModel>getModelPoolMap("limitSkin");
      Map<Integer, ShopLimitModel> modelShopMap = ApplicationContextProvider.<Integer, ShopLimitModel>getModelPoolMap("shopLimit");
      if (!ObjectUtils.isEmpty(modelSkinMap) && !ObjectUtils.isEmpty(modelShopMap)) {
         List<Integer> dressIds = new LinkedList();
         int day = this.getActivityOpenDay();

         for(LimitSkinModel model : modelSkinMap.values()) {
            if (modelShopMap.containsKey(model.getGiftBagId())) {
               ShopLimitModel shopLimitModel = (ShopLimitModel)modelShopMap.get(model.getGiftBagId());
               if (day >= shopLimitModel.getDateStart() && day <= shopLimitModel.getDateEnd() || day >= shopLimitModel.getDateStart() && shopLimitModel.getDateEnd() == -1) {
                  dressIds.add(model.getDressId());
               }
            }
         }

         Map<Integer, HeroDressDao> heroDressDaoMap = this.player.<Integer, HeroDressDao>getMap("tb_hero_dress", this.player.getPlayerId());
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         HeroPalaceDao heroPalaceDao = (HeroPalaceDao)this.player.getData("tb_hero_palace", this.player.getPlayerId());
         Map<Integer, HeroDressModel> heroDressModelMap = ApplicationContextProvider.<Integer, HeroDressModel>getModelPoolMap("heroDress");
         if (heroPalaceDao.heroCode > 0) {
            for(int i = dressIds.size() - 1; i >= 0; --i) {
               Integer id = (Integer)dressIds.get(i);
               HeroDressModel heroDressModel = (HeroDressModel)heroDressModelMap.get(id);
               if (heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_PALACE && !this.isHadFrontSkin(heroDressModel, heroDressDaoMap, itemBagPart)) {
                  dressIds.remove(id);
               }
            }
         } else {
            for(int i = dressIds.size() - 1; i >= 0; --i) {
               Integer id = (Integer)dressIds.get(i);
               HeroDressModel heroDressModel = (HeroDressModel)heroDressModelMap.get(id);
               if (heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_PALACE) {
                  dressIds.remove(id);
               }
            }
         }

         return dressIds;
      } else {
         return null;
      }
   }

   private List<Integer> getArmyArrayItems() {
      List<Integer> result = new ArrayList();
      ArmyArrayDao armyArrayDao = (ArmyArrayDao)this.player.getData("tb_army_array", this.player.getPlayerId());

      for(ArmyArrayData data : armyArrayDao.arrayDataMap.values()) {
         for(Map.Entry<Integer, ResourceModel> entry : data.protectedMap.entrySet()) {
            ResourceModel resourceModel = (ResourceModel)entry.getValue();
            result.add(resourceModel.getId());
         }
      }

      return result;
   }

   private int getItemIdByDressId(int dressId) {
      Map<Integer, HeroDressModel> modelDressMap = ApplicationContextProvider.<Integer, HeroDressModel>getModelPoolMap("heroDress");
      HeroDressModel heroDressModel = (HeroDressModel)modelDressMap.get(dressId);
      return heroDressModel.getItemId();
   }

   private boolean isHadFrontSkin(HeroDressModel heroDressModel, Map<Integer, HeroDressDao> heroDressDaoMap, ItemBagPart itemBagPart) {
      List<Integer> frontDressId = heroDressModel.getFrontDressId();
      if (frontDressId.isEmpty()) {
         return true;
      } else {
         for(int id : frontDressId) {
            int itemId = this.getItemIdByDressId(id);
            if (heroDressDaoMap.containsKey(id) || itemBagPart.getItemBaseById(itemId).size() > 0) {
               return true;
            }
         }

         return false;
      }
   }
}
