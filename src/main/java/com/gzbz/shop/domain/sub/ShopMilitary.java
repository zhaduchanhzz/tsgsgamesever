package com.gzbz.shop.domain.sub;

import com.gzbz.countryWar.CountryWarMgr;
import com.gzbz.db.ShopDao;
import com.gzbz.db.bean.ShopItemData;
import com.gzbz.db.bean.ShopJsonData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopItemBaseModel;
import com.gzbz.model.ShopMilitaryModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Map;

public class ShopMilitary extends AbstractShop {
   public ShopMilitary(GamePlayer player) {
      super(player);
   }

   public ArrayList<ShopItemData> getShopList() {
      ShopDao shopDao = (ShopDao)this.player.getData("tb_shop", this.player.getPlayerId());
      int shopId = this.getShopId();
      ShopJsonData jsonData = shopDao.getData(shopId);
      if (jsonData == null) {
         jsonData = new ShopJsonData();
         shopDao.setData(shopId, jsonData);
         shopDao.updateOp();
      }

      ArrayList<ShopItemData> list = new ArrayList();
      Map<Integer, ShopItemBaseModel> modelMap = this.player.getGameModelPool().getMap(this.getExcelName());
      if (modelMap == null) {
         return list;
      } else {
         CountryWarMgr countryWarMgr = (CountryWarMgr)ApplicationContextProvider.getContext().getBean(CountryWarMgr.class);
         int mapId = countryWarMgr.getMapId();

         for(Map.Entry<Integer, ShopItemBaseModel> entry : modelMap.entrySet()) {
            ShopMilitaryModel model = (ShopMilitaryModel)entry.getValue();
            if (model.getMapType() == 1 && this.checkLv(model.getLvLimit(), model.getLvLimitEx(), model.getWorldlvLimit()) && (model.getMapId() == 0 || model.getMapId() == mapId)) {
               int hadBuyNum = (Integer)jsonData.map.getOrDefault(model.getId(), 0);
               ShopItemData shopItemData = new ShopItemData();
               shopItemData.id = model.getId();
               int restNum = 0 == model.getBuyLimit() ? 0 : Math.max(model.getBuyLimit() - hadBuyNum, 0);
               shopItemData.restNum = restNum;
               list.add(shopItemData);
            }
         }

         return list;
      }
   }

   public boolean buyItem(int id, int num) {
      ShopMilitaryModel model = (ShopMilitaryModel)this.player.getGameModelPool().getEntity(this.getExcelName(), id);
      if (model != null && model.getMapType() == 1) {
         CountryWarMgr countryWarMgr = (CountryWarMgr)ApplicationContextProvider.getContext().getBean(CountryWarMgr.class);
         int mapId = countryWarMgr.getMapId();
         return model.getMapId() != 0 && model.getMapId() != mapId ? false : super.buyItem(id, num);
      } else {
         return false;
      }
   }

   public String getExcelName() {
      return "shopMilitary";
   }

   public int getShopId() {
      return 13;
   }
}
