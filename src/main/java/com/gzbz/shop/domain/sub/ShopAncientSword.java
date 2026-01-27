package com.gzbz.shop.domain.sub;

import com.gzbz.db.AncientSwordDao;
import com.gzbz.db.bean.ShopItemData;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.AncientSwordShopModel;
import com.gzbz.shop.domain.AbstractShop;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.util.TempUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.util.CollectionUtils;

public class ShopAncientSword extends AbstractShop {
   public ShopAncientSword(GamePlayer player) {
      super(player);
   }

   public String getExcelName() {
      return "AncientSwordShop";
   }

   public int getShopId() {
      return 54;
   }

   public boolean buyItem(int id, int num) {
      boolean success = super.buyItem(id, num);
      if (success) {
         this.player.triggerTask(755, 0, (long)num, 1);
      }

      AncientSwordDao dao = (AncientSwordDao)this.player.getData("tb_ancient_sword", this.player.getPlayerId());
      boolean haveShop = false;

      for(Integer shopId : dao.shopIds) {
         int restNum = this.getRestNum(shopId);
         if (restNum > 0) {
            haveShop = true;
            break;
         }
      }

      if (!haveShop) {
         dao.shopDeadline = 0L;
         dao.updateOp();
      }

      return success;
   }

   public ArrayList<ShopItemData> getShopList() {
      AncientSwordDao dao = (AncientSwordDao)this.player.getData("tb_ancient_sword", this.player.getPlayerId());
      if (dao.shopDeadline <= System.currentTimeMillis()) {
         return null;
      } else {
         List<Integer> shopList = new ArrayList();
         if (CollectionUtils.isEmpty(dao.shopIds)) {
            String ancientSwordNum = ApplicationContextProvider.getConfigString("AncientSwordNum", "1,1|2,2");
            String[] split = ancientSwordNum.split("\\|");
            HashMap<Integer, Integer> countMap = new HashMap();

            for(String con : split) {
               String[] shopCon = con.split(",");
               countMap.put(Integer.parseInt(shopCon[0]), Integer.parseInt(shopCon[1]));
            }

            Map<Integer, Integer> shopTimeMap = dao.shopTimeMap;

            for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
               Map<AncientSwordShopModel, Integer> modelMap = (Map)ApplicationContextProvider.getModelPoolEntity("cAncientSwordShop", (Integer)entry.getKey());
               HashMap<AncientSwordShopModel, Integer> map = new HashMap(modelMap);
               map.keySet().removeIf((model) -> model.getMaxTimes() != 0 && (Integer)shopTimeMap.getOrDefault(model.getId(), 0) >= model.getMaxTimes());
               TempUtil.getLotForMap(map, (Integer)entry.getValue(), false).forEach((m) -> shopList.add(m.getId()));
            }

            this.resetShop();
            dao.shopIds.addAll(shopList);

            for(Integer shopId : dao.shopIds) {
               dao.shopTimeMap.merge(shopId, 1, Integer::sum);
            }

            dao.updateOp();
         }

         ArrayList<ShopItemData> list = new ArrayList();

         for(ShopItemData shopItemData : super.getShopList()) {
            if (dao.shopIds.contains(shopItemData.id)) {
               list.add(shopItemData);
            }
         }

         return list;
      }
   }
}
