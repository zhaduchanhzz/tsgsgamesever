package com.gzbz.db;

import com.gzbz.protobuf.WaterTransportMsg;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;

@DBTableAnno(
   name = "tb_water_transport_record",
   resultType = 1,
   selectKey = {"playerId"}
)
public class WaterTransportRecordDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "id"
   )
   public int id;
   @DBColumnAnno(
      comment = "日志类型"
   )
   public int type;
   @DBColumnAnno(
      comment = "拦截者服务器"
   )
   public int enemyServer;
   @DBColumnAnno(
      comment = "拦截者id"
   )
   public int enemyId;
   @DBColumnAnno(
      comment = "拦截者名称"
   )
   public String enemyName = "";
   @DBColumnAnno(
      comment = "漕运船品质"
   )
   public int quality;
   @DBColumnAnno(
      comment = "护卫服务器"
   )
   public int guardServer;
   @DBColumnAnno(
      comment = "护卫名称"
   )
   public String guardName = "";
   @DBColumnAnno(
      comment = "记录时间"
   )
   public int recordTime;
   @DBColumnAnno(
      comment = "获得/损失道具数量(女儿红)"
   )
   public int itemNum;
   @DBColumnAnno(
      comment = "获得/损失铜钱数量"
   )
   public int copper;
   @DBColumnAnno(
      comment = "CargoShipRandomTime表id"
   )
   public int randomId;
   @DBColumnAnno(
      comment = "经过多少分钟"
   )
   public int minute;
   @DBColumnAnno(
      comment = "获得额外道具数量(女儿红)"
   )
   public int exItemNum;
   @DBColumnAnno(
      comment = "获得额外铜钱数量"
   )
   public int exCopper;
   @DBColumnAnno(
      comment = "战斗录像id"
   )
   public int recordId;
   @DBColumnAnno(
      comment = "漕运船配置ID"
   )
   public int shipModelId;

   public WaterTransportMsg.TransportRecord buildMsg() {
      WaterTransportMsg.TransportRecord.Builder msg = WaterTransportMsg.TransportRecord.newBuilder();
      msg.setGuardName(this.guardName);
      msg.setGuardServer(this.guardServer);
      msg.setEnemyName(this.enemyName);
      msg.setEnemyServer(this.enemyServer);
      msg.setType(this.type);
      msg.setShipModelId(this.shipModelId);
      msg.setRecordTime(this.recordTime);
      msg.setItemNum(this.itemNum);
      msg.setCopper(this.copper);
      msg.setRandomId(this.randomId);
      msg.setMinute(this.minute);
      msg.setExItemNum(this.exItemNum);
      msg.setExCopper(this.exCopper);
      msg.setBattleRecordId(this.recordId);
      msg.setEnemyPlayerId(this.enemyId);
      return msg.build();
   }

   public void fromMsg(WaterTransportMsg.TransportRecord msg) {
      if (msg.hasGuardName()) {
         this.guardName = msg.getGuardName();
      }

      if (msg.hasGuardServer()) {
         this.guardServer = msg.getGuardServer();
      }

      if (msg.hasEnemyName()) {
         this.enemyName = msg.getEnemyName();
      }

      if (msg.hasEnemyServer()) {
         this.enemyServer = msg.getEnemyServer();
      }

      if (msg.hasEnemyPlayerId()) {
         this.enemyId = msg.getEnemyPlayerId();
      }

      this.type = msg.getType();
      this.shipModelId = msg.getShipModelId();
      this.recordTime = msg.getRecordTime();
      if (msg.hasMinute()) {
         this.minute = msg.getMinute();
      }

      if (msg.hasRandomId()) {
         this.randomId = msg.getRandomId();
      }

   }
}
