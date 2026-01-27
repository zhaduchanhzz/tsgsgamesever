package com.yy.db;

import com.yy.peak.bean.PeakSeasonData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_peak_season",
   dbType = 2,
   selectKey = {"zoneId"}
)
public class CrossPeakSeasonDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "分区id"
   )
   public int zoneId;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "巅峰对决分区赛季信息",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public PeakSeasonData seasonData = new PeakSeasonData();

   public void loadData(String data) {
      this.seasonData = (PeakSeasonData)JsonUtil.jsonToBean(data, PeakSeasonData.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.seasonData);
   }
}
