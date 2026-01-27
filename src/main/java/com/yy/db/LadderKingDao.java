package com.yy.db;

import com.yy.ladder.LadderCrossRecord;
import com.yy.ladder.LadderKingData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_ladder_king",
   dbType = 2,
   selectKey = {"serverKey"}
)
public class LadderKingDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "服务器组key"
   )
   public int serverKey;
   @DBColumnAnno(
      comment = "天梯赛结算状态"
   )
   public int state = 0;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadInfo",
      saveFun = "saveInfo",
      comment = "玩家信息"
   )
   public Map<Integer, LadderKingData> kingMap = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadRecord",
      saveFun = "saveRecord",
      comment = "战绩信息"
   )
   public List<LadderCrossRecord> record = new ArrayList();

   public void loadInfo(String data) {
      this.kingMap = JsonUtil.jsonToMap(data, Integer.class, LadderKingData.class);
   }

   public String saveInfo() {
      return JsonUtil.object2String(this.kingMap);
   }

   public void loadRecord(String data) {
      this.record = JsonUtil.jsonToList(data, LadderCrossRecord.class);
   }

   public String saveRecord() {
      return JsonUtil.object2String(this.record);
   }

   public List<LadderCrossRecord> addRecord(LadderCrossRecord data) {
      List<LadderCrossRecord> delList = new ArrayList();
      this.record.add(data);

      while(this.record.size() > 20) {
         delList.add(this.record.get(0));
         this.record.remove(0);
      }

      this.updateOp();
      return delList;
   }

   public void reset() {
      this.record.clear();
      this.updateOp();
   }
}
