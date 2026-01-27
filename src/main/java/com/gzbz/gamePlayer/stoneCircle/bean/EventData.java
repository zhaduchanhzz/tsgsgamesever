package com.gzbz.gamePlayer.stoneCircle.bean;

import com.gzbz.protobuf.StoneCircleMsg;
import java.util.HashMap;
import java.util.Map;

public class EventData {
   public MapLocation location;
   public int eventId;
   public int eventType;
   public Map<Integer, Boolean> goods = new HashMap();
   public boolean end = false;

   public StoneCircleMsg.EventInfo builder() {
      StoneCircleMsg.EventInfo.Builder builder = StoneCircleMsg.EventInfo.newBuilder();
      StoneCircleMsg.MapIdentify.Builder locationBuiler = StoneCircleMsg.MapIdentify.newBuilder();
      locationBuiler.setMapGrid(this.location.grid);
      locationBuiler.setMapCell(this.location.cell);
      builder.setPosition(locationBuiler);
      builder.setEventId(this.eventId);
      builder.setEventType(this.eventType);

      for(Map.Entry<Integer, Boolean> entry : this.goods.entrySet()) {
         StoneCircleMsg.ShopGoods.Builder shop = StoneCircleMsg.ShopGoods.newBuilder();
         shop.setShopId((Integer)entry.getKey());
         shop.setBought((Boolean)entry.getValue());
         builder.addGoods(shop);
      }

      builder.setEnd(this.end);
      return builder.build();
   }
}
