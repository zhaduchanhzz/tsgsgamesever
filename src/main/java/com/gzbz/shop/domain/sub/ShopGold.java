package com.gzbz.shop.domain.sub;

import com.gzbz.db.bean.ShopItemData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopGoldModel;
import com.gzbz.model.ShopItemBaseModel;
import com.gzbz.shop.domain.AbstractShop;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShopGold extends AbstractShop {
   Logger logger = LoggerFactory.getLogger(ShopGold.class);

   public ShopGold(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "shopGold";
   }

   public int getShopId() {
      return 43;
   }

   public boolean buyItem(int id, int num) {
      ShopGoldModel shopGoldModel = (ShopGoldModel)this.player.getGameModelPool().getEntity("shopGold", id);
      return null == shopGoldModel ? this.player.failure(8007) : super.buyItem(id, num);
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
