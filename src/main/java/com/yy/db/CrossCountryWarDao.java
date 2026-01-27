package com.yy.db;

import com.yy.countryWar.bean.CountryWarData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_country_war",
   dbType = 2,
   resultType = 2,
   selectKey = {"group"},
   mapKey = {"id"}
)
public class CrossCountryWarDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "所属分区"
   )
   public int group;
   @DBColumnAnno(
      isPrimary = true,
      comment = "国战ID"
   )
   public int id;
   @DBColumnAnno(
      comment = "活动分期标志"
   )
   public int activityId;
   @DBColumnAnno(
      comment = "地图ID"
   )
   public int mapId;
   @DBColumnAnno(
      comment = "活动状态"
   )
   public int state;
   @DBColumnAnno(
      comment = "对战服务器ID",
      loadFun = "loadserverIds",
      saveFun = "saveserverIds"
   )
   public List<Integer> mainServerIds = new ArrayList();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "国战对阵信息",
      loadFun = "loadCountryWarData",
      saveFun = "saveCountryWarData"
   )
   public CountryWarData countryWarData;

   public void loadserverIds(String data) {
      this.mainServerIds = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveserverIds() {
      return JsonUtil.beanToJson(this.mainServerIds);
   }

   public void loadCountryWarData(String data) {
      this.countryWarData = (CountryWarData)JsonUtil.jsonToBean(data, CountryWarData.class);
   }

   public String saveCountryWarData() {
      return JsonUtil.beanToJson(this.countryWarData);
   }
}
