package com.yy.db;

import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.protobuf.WaterTransportMsg;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.DateUtil;

@DBTableAnno(
   name = "tb_cross_water_transport",
   dbType = 2,
   resultType = 3,
   selectKey = {"group"}
)
public class CrossWaterTransportDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "所属分区"
   )
   public int group;
   @DBColumnAnno(
      isPrimary = true,
      comment = "船ID"
   )
   public int shipId;
   @DBColumnAnno(
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "玩家当前所在服务器id"
   )
   public int sourceServerId;
   @DBColumnAnno(
      comment = "品质"
   )
   public int quality;
   @DBColumnAnno(
      comment = "所在河道"
   )
   public int river;
   @DBColumnAnno(
      comment = "已选护卫好友id"
   )
   public int guardId;
   @DBColumnAnno(
      comment = "被拦截cd时间"
   )
   public long beInterceptCD = 0L;
   @DBColumnAnno(
      comment = "被拦截次数"
   )
   public int beInterceptCount = 0;
   @DBColumnAnno(
      comment = "额外奖励万分比"
   )
   public int rewardScale = 0;
   @DBColumnAnno(
      comment = "漕运到达时间"
   )
   public int arriveTime;
   @DBColumnAnno(
      columnType = "BLOB",
      comment = "阵容"
   )
   public byte[] arrayingData;
   @DBColumnAnno(
      comment = "是否已到达"
   )
   public boolean isArrive = true;
   @DBColumnAnno(
      comment = "出航时玩家等级"
   )
   public int playerLv;
   @DBColumnAnno(
      comment = "出航时间"
   )
   public int sailTime;
   @DBColumnAnno(
      comment = "被拦截停滞结束时间"
   )
   public int beInterceptStopTime;
   @DBColumnAnno(
      comment = "出航时最高战力"
   )
   public long highPower;
   @DBColumnAnno(
      comment = "漕运船配置ID"
   )
   public int shipModelId;
   @DBColumnAnno(
      comment = "是否是幸运船"
   )
   public boolean isLucky;
   @DBColumnAnno(
      comment = "幸运buffId"
   )
   public int luckBufId;
   @DBColumnAnno(
      skip = true,
      comment = "无法发送到服务器下次重试时间,重试次数+时间(秒)"
   )
   public long retryTime;
   @DBColumnAnno(
      comment = "出航时的世界等级"
   )
   public int worldLv;
   @DBColumnAnno(
      skip = true,
      comment = "是否机器人"
   )
   public boolean isRobot;

   public WaterTransportMsg.ShipInfo.Builder buildShipMsg() {
      WaterTransportMsg.ShipInfo.Builder shipData = WaterTransportMsg.ShipInfo.newBuilder();
      shipData.setShipModelId(this.shipModelId);
      shipData.setArriveTime(this.arriveTime);
      shipData.setRewardScale(10000 + this.rewardScale);
      shipData.setBeInterceptCount(this.beInterceptCount);
      shipData.setServer(this.sourceServerId);
      shipData.setServerName(String.valueOf(shipData.getServer()));
      shipData.setRiver(this.river);
      shipData.setProtectTime(DateUtil.getIntTime(this.beInterceptCD));
      shipData.setGuardId(this.guardId);
      shipData.setShipId(this.shipId);
      shipData.setCombatPower(this.getPower());
      shipData.setBeInterceptStopTime(this.beInterceptStopTime);
      shipData.setHighCombatPower(this.highPower);
      shipData.setLuckyBuf(this.luckBufId);
      shipData.setWorldLv(this.worldLv);
      return shipData;
   }

   public void fromMsg(WaterTransportMsg.ShipInfo msg) {
      this.rewardScale = msg.getRewardScale();
      this.shipModelId = msg.getShipModelId();
      this.arriveTime = msg.getArriveTime();
      this.beInterceptCount = msg.getBeInterceptCount();
      this.guardId = msg.getGuardId();
      this.highPower = msg.getHighCombatPower();
      this.luckBufId = msg.getLuckyBuf();
      this.worldLv = msg.getWorldLv();
   }

   public WaterTransportMsg.PlayerShipInfo.Builder buildMyShipMsg() {
      WaterTransportMsg.PlayerShipInfo.Builder msg = WaterTransportMsg.PlayerShipInfo.newBuilder();
      msg.setInRiver(this.river);
      msg.setArriveTime(this.arriveTime);
      msg.setShipModelId(this.shipModelId);
      msg.setRewardScale(10000 + this.rewardScale);
      msg.setShipId(this.shipId);
      msg.setBeInterceptCount(this.beInterceptCount);
      msg.setLevel(this.playerLv);
      msg.setProtectTime(DateUtil.getIntTime(this.beInterceptCD));
      msg.setLuckyBuf(this.luckBufId);
      msg.setWorldLv(this.worldLv);
      return msg;
   }

   public long getPower() {
      long power = 0L;
      if (this.arrayingData != null && this.arrayingData.length > 0) {
         ArrayingMirror arrayingMirror = ArrayingMirror.toArrayingMirror(this.arrayingData);
         power = arrayingMirror.power;
      }

      return power;
   }
}
