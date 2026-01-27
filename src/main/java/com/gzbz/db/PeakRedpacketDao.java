package com.gzbz.db;

import com.gzbz.gamePlayer.peak.bean.PeakRedPacketData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_peak_red_packet",
   resultType = 5
)
public class PeakRedpacketDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true,
      comment = "红包id"
   )
   public int id;
   @DBColumnAnno(
      comment = "配置中的红包类型"
   )
   public int packetId;
   @DBColumnAnno(
      comment = "发红包时间"
   )
   public int time;
   @DBColumnAnno(
      comment = "已领红包物品数量"
   )
   public int receivePropNum;
   @DBColumnAnno(
      columnName = "sendData",
      columnType = "TEXT",
      comment = "发送红包玩家",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public PeakRedPacketData sendData;
   @DBColumnAnno(
      comment = "已领取玩家列表",
      columnType = "TEXT",
      loadFun = "loadReceive",
      saveFun = "saveReceive"
   )
   public List<PeakRedPacketData> receiveList = new ArrayList();

   public void loadData(String data) {
      this.sendData = (PeakRedPacketData)JsonUtil.jsonToBean(data, PeakRedPacketData.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.sendData);
   }

   public void loadReceive(String data) {
      this.receiveList = JsonUtil.jsonToList(data, PeakRedPacketData.class);
   }

   public String saveReceive() {
      return JsonUtil.listToJson(this.receiveList);
   }
}
