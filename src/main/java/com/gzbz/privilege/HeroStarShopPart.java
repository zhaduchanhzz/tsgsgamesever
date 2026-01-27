package com.gzbz.privilege;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerDao;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ShopStarModel;
import com.gzbz.privilege.bean.PlayerPrivilegeExtend;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.PrivilegeMsg;
import com.gzbz.shop.ShopHelper;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class HeroStarShopPart extends PlayerPart {
   @Autowired
   private WorldMgr worldMgr;

   @MsgHandlerAnno
   public void C2S_HeroStartShopInfo_7915(PrivilegeMsg.C2S_HeroStartShopInfo_7915 msg, String source) {
      PrivilegeMsg.S2C_HeroStartShopResult_7916.Builder resp = PrivilegeMsg.S2C_HeroStartShopResult_7916.newBuilder();
      PlayerPrivilegeExtend playerPrivilegeExtend = (PlayerPrivilegeExtend)this.player.getPlayerExtend(19);
      playerPrivilegeExtend.heroStarBuyItems.entrySet().forEach((item) -> resp.addBuyItems(ShopHelper.builder((Integer)item.getKey(), (Integer)item.getValue())));
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_HeroStartShopBuy_7917(PrivilegeMsg.C2S_HeroStartShopBuy_7917 msg, String source) {
      int buyId = msg.getGoodId();
      ShopStarModel shopStarModel = (ShopStarModel)ApplicationContextProvider.getModelPoolEntity("shopStar", buyId);
      if (shopStarModel == null) {
         this.player.failure(0);
      } else {
         PlayerPrivilegeExtend playerPrivilegeExtend = (PlayerPrivilegeExtend)this.player.getPlayerExtend(19);
         if (shopStarModel.getBuyLimit() > 0 && playerPrivilegeExtend.heroStarBuyItems.containsKey(buyId) && (Integer)playerPrivilegeExtend.heroStarBuyItems.get(buyId) >= shopStarModel.getBuyLimit()) {
            this.player.failure(19001);
         } else {
            PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
            int worldLv = this.worldMgr.getWorldLv();
            if (shopStarModel.getLvLimitEx() <= 0 || playerDao.lv < shopStarModel.getLvLimitEx()) {
               if (playerDao.lv < worldLv) {
                  this.player.failure(29);
                  return;
               }

               if (playerDao.lv < shopStarModel.getLvLimit()) {
                  this.player.failure(20);
                  return;
               }

               if (playerDao.vip_lv < shopStarModel.getVipLimit()) {
                  this.player.failure(19);
                  return;
               }
            }

            if (shopStarModel.getPriceType() > 0 && shopStarModel.getPriceId() > 0 && shopStarModel.getDisPrice() > 0) {
               this.player.delResource(shopStarModel.getPriceType(), shopStarModel.getPriceId(), (long)shopStarModel.getDisPrice(), 19, 1903, shopStarModel.getPriceId(), shopStarModel.getDisPrice(), "");
            }

            if (shopStarModel.getItemType() > 0 && shopStarModel.getItemId() > 0) {
               this.player.addResource(shopStarModel.getItemType(), shopStarModel.getItemId(), 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 19, 1903, shopStarModel.getItemId(), 1, "");
            }

            playerPrivilegeExtend.heroStarBuyItems.put(buyId, (Integer)playerPrivilegeExtend.heroStarBuyItems.getOrDefault(buyId, 0) + 1);
            this.player.updatePlayerExtend(19);
            this.sendBuyResult(buyId);
         }
      }
   }

   public void resetDaily() {
      this.resetStarShop(1);
   }

   public void resetWeek() {
      this.resetStarShop(2);
   }

   public void resetMonth() {
      this.resetStarShop(3);
   }

   private void resetStarShop(int autoReset) {
      Set<Integer> removeIds = new HashSet();
      PlayerPrivilegeExtend playerPrivilegeExtend = (PlayerPrivilegeExtend)this.player.getPlayerExtend(19);
      playerPrivilegeExtend.heroStarBuyItems.keySet().forEach((goodId) -> {
         ShopStarModel shopStarModel = (ShopStarModel)ApplicationContextProvider.getModelPoolEntity("shopStar", goodId);
         if (shopStarModel.getAutoReset() == autoReset) {
            removeIds.add(goodId);
         }

      });
      if (removeIds.size() > 0) {
         removeIds.forEach((goodId) -> {
            Integer var10000 = (Integer)playerPrivilegeExtend.heroStarBuyItems.remove(goodId);
         });
         this.player.updatePlayerExtend(19);
      }

   }

   private void sendBuyResult(int buyId) {
      PrivilegeMsg.S2C_HeroStartShopBuyResult_7918.Builder msg = PrivilegeMsg.S2C_HeroStartShopBuyResult_7918.newBuilder();
      msg.setBuyId(buyId);
      this.player.sendMsg(msg.build());
   }
}
