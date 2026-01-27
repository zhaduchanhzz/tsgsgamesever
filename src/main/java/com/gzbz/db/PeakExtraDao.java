package com.gzbz.db;

import com.gzbz.gamePlayer.peak.bean.PeakPersonalData;
import com.gzbz.gamePlayer.peak.bean.PeakRecordData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_peak_extra",
   resultType = 0,
   selectKey = {"playerId"}
)
public class PeakExtraDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "每个赛季个人数据",
      columnType = "LONGTEXT",
      loadFun = "loadPersonal",
      saveFun = "savePersonal"
   )
   public Map<Integer, PeakPersonalData> personalMap = new HashMap();
   @DBColumnAnno(
      columnName = "totalData",
      columnType = "TEXT",
      comment = "总战绩",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public PeakPersonalData totalData;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadCommonRecord",
      saveFun = "saveCommonRecord",
      comment = "常规赛挑战记录-20条"
   )
   public List<PeakRecordData> commonRecord = new ArrayList();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadPeakRecord",
      saveFun = "savePeakRecord",
      comment = "巅峰赛挑战记录-20条"
   )
   public List<PeakRecordData> peakRecord = new ArrayList();

   public void loadData(String data) {
      this.totalData = (PeakPersonalData)JsonUtil.jsonToBean(data, PeakPersonalData.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.totalData);
   }

   public void loadPersonal(String data) {
      this.personalMap = JsonUtil.jsonToMap(data, Integer.class, PeakPersonalData.class);
   }

   public String savePersonal() {
      return JsonUtil.beanToJson(this.personalMap);
   }

   public void loadCommonRecord(String data) {
      this.commonRecord = JsonUtil.jsonToList(data, PeakRecordData.class);
   }

   public String saveCommonRecord() {
      return JsonUtil.object2String(this.commonRecord);
   }

   public void loadPeakRecord(String data) {
      this.peakRecord = JsonUtil.jsonToList(data, PeakRecordData.class);
   }

   public String savePeakRecord() {
      return JsonUtil.object2String(this.peakRecord);
   }

   public List<PeakRecordData> addRecord(PeakRecordData data) {
      List<PeakRecordData> delList = new ArrayList();
      this.commonRecord.add(data);

      while(this.commonRecord.size() > 20) {
         delList.add(this.commonRecord.get(0));
         this.commonRecord.remove(0);
      }

      return delList;
   }

   public List<PeakRecordData> addPeakRecord(PeakRecordData data) {
      List<PeakRecordData> delList = new ArrayList();
      this.peakRecord.add(data);

      while(this.peakRecord.size() > 20) {
         delList.add(this.peakRecord.get(0));
         this.peakRecord.remove(0);
      }

      this.updateOp();
      return delList;
   }
}
