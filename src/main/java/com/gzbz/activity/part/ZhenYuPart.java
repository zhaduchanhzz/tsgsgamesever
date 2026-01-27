package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.ZhenYuShopDetailsModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.ZhenYuMsg;
import java.util.Map;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ZhenYuPart extends AbstractActivityPart {
   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         this.sendShopInfo();
      }
   }

   public int getActivityType() {
      return 117;
   }

   public void rotateReset(int oldActivityId) {
      this.shopEnd();
   }

   public void activityEnd(int oldActivityId) {
      this.shopEnd();
   }

   public PlayerActivityDao getPlayerActDao() {
      return (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
   }

   @MsgHandlerAnno
   public void C2S_ShopInfo_29001(ZhenYuMsg.C2S_ShopInfo_29001 msg, String source) {
      this.sendShopInfo();
   }

   @MsgHandlerAnno
   public void C2S_Buy_29003(ZhenYuMsg.C2S_Buy_29003 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         PlayerActivityDao playerActDao = this.getPlayerActDao();
         int openServerDays = this.getActivityOpenDay();
         Integer buyNum = (Integer)MapUtil.getOrDefault(playerActDao.zhenYuShopData, id, 0);
         ZhenYuShopDetailsModel model = (ZhenYuShopDetailsModel)this.player.getGameModelPool().getEntity("ZhenYuShopDetails", id);
         if (model != null && model.getLimitBuyFrequency() > buyNum && model.theDayInRegion(openServerDays)) {
            ResourceModel consume = new ResourceModel(model.getResourceType(), model.getResourceId(), model.getPrice());
            ResourceModel reward = new ResourceModel(2, model.getItemId(), model.getQuantity());
            if (!this.player.checkResourceNum(consume)) {
               this.player.failure(21010);
            } else {
               playerActDao.zhenYuShopData.merge(id, 1, Integer::sum);
               playerActDao.updateOp();
               this.player.delResource(consume, 161, 16101, 0, 0, "");
               this.player.addResource(reward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 161, 16101, 0, 0, "");
               this.sendShopInfo();
            }
         } else {
            this.player.failure(6);
         }
      }
   }

   public void sendShopInfo() {
      ZhenYuMsg.S2C_ShopInfo_29002.Builder builder = ZhenYuMsg.S2C_ShopInfo_29002.newBuilder();
      PlayerActivityDao playerActDao = this.getPlayerActDao();
      builder.setActDay(this.getSeverActivityDay());
      builder.setOpenServerDay(this.getActivityOpenDay());

      for(Map.Entry<Integer, Integer> shop : playerActDao.zhenYuShopData.entrySet()) {
         builder.addShop(ZhenYuMsg.ShopInfo.newBuilder().setId((Integer)shop.getKey()).setBuy((Integer)shop.getValue()));
      }

      this.player.sendMsg(builder.build());
   }

   private void shopEnd() {
      PlayerActivityDao playerActDao = this.getPlayerActDao();
      playerActDao.zhenYuShopData.clear();
      playerActDao.updateOp();
   }
}
