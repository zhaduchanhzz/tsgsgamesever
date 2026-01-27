package com.gzbz.shop.domain.sub;

import com.gzbz.activity.part.FlowerPart;
import com.gzbz.db.bean.ShopItemData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopFlowerModel;
import com.gzbz.model.ShopItemBaseModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShopFlower extends AbstractShop {
   Logger logger = LoggerFactory.getLogger(ShopFlower.class);

   public ShopFlower(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopFlower";
   }

   public int getShopId() {
      return 53;
   }

   public boolean buyItem(int id, int num) {
      ShopFlowerModel shopFlowerModel = (ShopFlowerModel)ApplicationContextProvider.getModelPoolEntity("shopFlower", id);
      if (null == shopFlowerModel) {
         return this.player.failure(8007);
      } else {
         FlowerPart flowerPart = (FlowerPart)this.player.getMgrPart(FlowerPart.class);
         return flowerPart.getCrossActOpenDay() < shopFlowerModel.getOpenTime() ? this.player.failure(8007) : super.buyItem(id, num);
      }
   }

   public ArrayList<ShopItemData> getShopList() {
      return this.getShopItemDataList(this.getGoldShopItemModelList());
   }

   public List<ShopItemBaseModel> getGoldShopItemModelList() {
      Map<Integer, ShopItemBaseModel> modelMap = this.player.getGameModelPool().getMap(this.getExcelName());
      if (modelMap == null) {
         this.logger.info("商城配置出错 shopId:{}, excelName:{}", this.getShopId(), this.getExcelName());
         return null;
      } else {
         List<ShopItemBaseModel> list = new ArrayList();

         for(Map.Entry<Integer, ShopItemBaseModel> modelEntry : modelMap.entrySet()) {
            ShopItemBaseModel shopItemBaseModel = (ShopItemBaseModel)modelEntry.getValue();
            list.add(shopItemBaseModel);
         }

         return list;
      }
   }
}
