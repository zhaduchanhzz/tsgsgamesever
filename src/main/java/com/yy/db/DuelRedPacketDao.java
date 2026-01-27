package com.yy.db;

import com.yy.duelWar.DuelRedPacketData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_duel_red_packet",
   dbType = 2,
   resultType = 2,
   mapKey = {"id"},
   selectKey = {"group"}
)
public class DuelRedPacketDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true,
      comment = "红包id"
   )
   public int id;
   @DBColumnAnno(
      isPrimary = true,
      comment = "分区id"
   )
   public int group;
   @DBColumnAnno(
      comment = "配置中的红包类型"
   )
   public int type;
   @DBColumnAnno(
      comment = "发送服务器类型"
   )
   public int serverType;
   @DBColumnAnno(
      comment = "发红包时间"
   )
   public int time;
   @DBColumnAnno(
      comment = "红包结束领取时间"
   )
   public int endTime;
   @DBColumnAnno(
      comment = "领取道具最大数额"
   )
   public int maxProp;
   @DBColumnAnno(
      comment = "领取道具最大数额玩家"
   )
   public int receivePlayerId;
   @DBColumnAnno(
      columnName = "sendData",
      columnType = "TEXT",
      comment = "发送红包玩家",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public DuelRedPacketData sendData;
   @DBColumnAnno(
      comment = "已领取玩家列表",
      columnType = "LONGTEXT",
      loadFun = "loadReceive",
      saveFun = "saveReceive"
   )
   public List<DuelRedPacketData> receiveList = new ArrayList();

   public void loadData(String data) {
      this.sendData = (DuelRedPacketData)JsonUtil.jsonToBean(data, DuelRedPacketData.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.sendData);
   }

   public void loadReceive(String data) {
      this.receiveList = JsonUtil.jsonToList(data, DuelRedPacketData.class);
   }

   public String saveReceive() {
      return JsonUtil.listToJson(this.receiveList);
   }
}
