package com.yy.db;

import com.gzbz.activity.DragonTreasureRecord;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_dragon_treasure_record",
   dbType = 2,
   selectKey = {"group"}
)
public class DragonTreasureRecordDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "分区id"
   )
   public int group;
   @DBColumnAnno(
      comment = "结算时间"
   )
   public int endTime;
   @DBColumnAnno(
      comment = "活动id"
   )
   public int activityId;
   @DBColumnAnno(
      comment = "活动类型"
   )
   public int activityType;
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "中奖信息",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public List<DragonTreasureRecord> recordList = new ArrayList();

   public void loadData(String data) {
      this.recordList = JsonUtil.jsonToList(data, DragonTreasureRecord.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.recordList);
   }

   public void addRecord(int playerId, int awardId) {
      if (this.recordList.size() >= 20) {
         this.recordList.remove(0);
      }

      DragonTreasureRecord record = new DragonTreasureRecord();
      record.awardId = awardId;
      record.playerId = playerId;
      this.recordList.add(record);
   }
}
