package com.gzbz.db;

import com.gzbz.db.bean.TempleData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import misc.DateUtil;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_battle_temple"
)
public class BattleTempleDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "副本id"
   )
   public int id;
   @DBColumnAnno(
      comment = "boss进化等级"
   )
   public int level;
   @DBColumnAnno(
      comment = "当前神位占有者code"
   )
   public int playerCode;
   @DBColumnAnno(
      comment = "当前挑战状态"
   )
   public int stats;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadRecord",
      saveFun = "saveRecord",
      comment = "挑战记录-10条"
   )
   public List<TempleData> record = new ArrayList();

   public void loadRecord(String data) {
      this.record = JsonUtil.jsonToList(data, TempleData.class);
   }

   public String saveRecord() {
      return JsonUtil.object2String(this.record);
   }

   public List<TempleData> addRecord(int addLevel, int recordId, String name, int startTime) {
      List<TempleData> delList = new ArrayList();
      TempleData data = new TempleData();
      data.time = startTime;
      data.addLevel = addLevel;
      data.recordId = recordId;
      data.name = name;
      this.record.add(data);
      Iterator<TempleData> iterator = this.record.iterator();

      while(iterator.hasNext()) {
         TempleData templeData = (TempleData)iterator.next();
         if (templeData.time + 604800 < DateUtil.getIntTime(System.currentTimeMillis())) {
            delList.add(templeData);
            iterator.remove();
         }
      }

      while(this.record.size() > 10) {
         delList.add(this.record.get(0));
         this.record.remove(0);
      }

      return delList;
   }
}
