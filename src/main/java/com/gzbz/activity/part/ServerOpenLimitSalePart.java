package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.GiftDao;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.ItemModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.sql.Timestamp;
import java.util.Map;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ServerOpenLimitSalePart extends AbstractActivityPart {
   public void sendInfo() {
      ActivityInfo playerActivityInfo = this.getPlayerActivityInfo();
      ActivityMsg.S2C_OpenServerLimitSale_6778.Builder resp = ActivityMsg.S2C_OpenServerLimitSale_6778.newBuilder();
      resp.setEndTime(playerActivityInfo.end);
      int day = DateUtil.difftimeDay(new Timestamp((long)playerActivityInfo.start * 1000L));
      resp.setDay(day);
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      Map<Integer, GiftDao> giftDaoMap = giftPart.getBuyGifts(14);
      giftPart.getShopLimits(14, playerActivityInfo.id).values().forEach((shopLimitModel) -> {
         if (shopLimitModel.getPeriod() == day) {
            ActivityMsg.OpenServerLimitSaleData.Builder builder = ActivityMsg.OpenServerLimitSaleData.newBuilder();
            builder.setGiftId(shopLimitModel.getId());
            GiftDao giftDao = (GiftDao)giftDaoMap.get(shopLimitModel.getId());
            builder.setBuyCount(giftDao == null ? 0 : giftDao.count);
            ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", shopLimitModel.getItemId());
            if (itemModel != null) {
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               itemBagPart.getResourcesByUseFun(itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue(), 1).forEach((resourceModel) -> builder.addItems(resourceModel.builder()));
            }

            resp.addDataList(builder);
         }

      });
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_OpenServerLimitSale_6777(ActivityMsg.C2S_OpenServerLimitSale_6777 msg, String source) {
      this.sendInfo();
   }

   public int getActivityType() {
      return 11;
   }

   public void afterBuy(int buyId) {
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      Map<Integer, GiftDao> giftDaoMap = giftPart.getBuyGifts(14);
      GiftDao giftDao = (GiftDao)giftDaoMap.get(buyId);
      ActivityMsg.S2C_OpenServerLimitSale_6780.Builder msg = ActivityMsg.S2C_OpenServerLimitSale_6780.newBuilder();
      msg.setGiftId(buyId);
      msg.setBuyCount(giftDao == null ? 0 : giftDao.count);
      this.player.sendMsg(msg.build());
   }
}
