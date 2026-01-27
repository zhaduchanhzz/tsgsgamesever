package com.yy.db;

import com.yy.countryWar.bean.CountryWarLog;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_country_war_log",
   dbType = 2,
   resultType = 2,
   selectKey = {"group"},
   mapKey = {"serverId"}
)
public class CrossCountryWarLogDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "务器ID"
   )
   public int serverId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "所属分区"
   )
   public int group;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "国家日志",
      loadFun = "loadCountryLog",
      saveFun = "saveCountryLog"
   )
   public CountryWarLog countryLog;

   public void loadCountryLog(String data) {
      this.countryLog = (CountryWarLog)JsonUtil.jsonToBean(data, CountryWarLog.class);
   }

   public String saveCountryLog() {
      return JsonUtil.beanToJson(this.countryLog);
   }
}
