package com.yy.db;

import com.gzbz.protobuf.CrossWaterTransportMsg;
import com.gzbz.protobuf.WaterTransportMsg;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_cross_water_transport_remains",
   dbType = 2,
   resultType = 2,
   selectKey = {"group"},
   mapKey = {"id"}
)
public class CrossCargoShipRemainsDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "残骸ID",
      isAutoInc = true
   )
   public int id;
   @DBColumnAnno(
      isPrimary = true,
      comment = "所属分区"
   )
   public int group;
   @DBColumnAnno(
      comment = "所属玩家"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "品质"
   )
   public int quality;
   @DBColumnAnno(
      comment = "残骸生成时,已航行的百分比"
   )
   public int sailPercent;
   @DBColumnAnno(
      comment = "所在河道"
   )
   public int river;
   @DBColumnAnno(
      comment = "战力"
   )
   public long combatPower;
   @DBColumnAnno(
      comment = "所属服务器"
   )
   public int server;
   @DBColumnAnno(
      comment = "残骸生成时间"
   )
   public int createTime;
   @DBColumnAnno(
      comment = "漕运船ID"
   )
   public int shipModelId;

   public WaterTransportMsg.RemainsInfo.Builder buildRemainMsg() {
      WaterTransportMsg.RemainsInfo.Builder msg = WaterTransportMsg.RemainsInfo.newBuilder();
      msg.setId(this.id);
      msg.setShipModelId(this.shipModelId);
      msg.setSailPercent(this.sailPercent);
      msg.setRiver(this.river);
      msg.setCombatPower(this.combatPower);
      msg.setServerName(this.server + "");
      msg.setIsReward(false);
      return msg;
   }

   public CrossWaterTransportMsg.CrossRemainsData.Builder buildCrossRemainMsg() {
      CrossWaterTransportMsg.CrossRemainsData.Builder msg = CrossWaterTransportMsg.CrossRemainsData.newBuilder();
      msg.setBelongPlayer(this.playerId);
      msg.setId(this.id);
      msg.setShipModelId(this.shipModelId);
      return msg;
   }
}
