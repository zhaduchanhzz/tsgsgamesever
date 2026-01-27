package com.yy.db;

import com.gzbz.protobuf.WaterTransportMsg;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_water_transport_gold_ship",
   resultType = 0,
   selectKey = {"group"}
)
public class CrossWaterTransportGoldShipDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "所属分区"
   )
   public int group;
   @DBColumnAnno(
      comment = "已击沉阶段"
   )
   public int stage = 0;
   @DBColumnAnno(
      comment = "总伤害"
   )
   public long damage;
   @DBColumnAnno(
      comment = "到达时间"
   )
   public int arrive;
   @DBColumnAnno(
      comment = "当前黄金船类型,根据配置下标"
   )
   public int shipType;
   @DBColumnAnno(
      comment = "全区攻击总伤害"
   )
   public long attackDamage;
   @DBColumnAnno(
      comment = "击杀信息列表",
      columnType = "TEXT",
      loadFun = "loadKills",
      saveFun = "saveKills"
   )
   public List<String> kills = new ArrayList();

   public void loadKills(String data) {
      this.kills = JsonUtil.jsonToList(data, String.class);
   }

   public String saveKills() {
      return JsonUtil.beanToJson(this.kills);
   }

   public void kill(int server, String playerName) {
      this.kills.add(String.format("%d\u0001%s", server, playerName));
   }

   public WaterTransportMsg.GoldShipInfo.Builder buildGoldShipMsg() {
      WaterTransportMsg.GoldShipInfo.Builder builder = WaterTransportMsg.GoldShipInfo.newBuilder();
      builder.setStage(this.stage);
      builder.setShipTotalDamage(this.damage);
      builder.setAttackTotalDamage(this.attackDamage);
      builder.setArriveTime(this.arrive);
      return builder;
   }

   public List<WaterTransportMsg.GoldShipKillInfo> buildGoldShipLastKillMsg() {
      List<WaterTransportMsg.GoldShipKillInfo> builderList = new ArrayList();

      for(String killStr : this.kills) {
         String[] killInfo = killStr.split("\u0001");
         WaterTransportMsg.GoldShipKillInfo.Builder builder = WaterTransportMsg.GoldShipKillInfo.newBuilder();
         builder.setServer(Integer.parseInt(killInfo[0]));
         builder.setPlayerName(killInfo[1]);
         builderList.add(builder.build());
      }

      return builderList;
   }
}
