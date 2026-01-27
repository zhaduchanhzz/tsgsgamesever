package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import com.gzbz.db.bean.AdventureData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_adventure",
   selectKey = {"playerId"}
)
public class AdventureDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadJson",
      saveFun = "saveJson"
   )
   public Map<String, AdventureData> jsonData = new HashMap();
   @DBColumnAnno(
      comment = "连续刷新不出6星次数"
   )
   public int noSixQualityNum;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadQualityLvJson",
      saveFun = "saveQualityLvJson"
   )
   public List<Integer> qualityLv = new ArrayList();

   public void loadJson(String data) {
      this.jsonData = JsonUtil.jsonToMap(data, String.class, AdventureData.class);
   }

   public String saveJson() {
      return JSON.toJSONString(this.jsonData);
   }

   public void loadQualityLvJson(String data) {
      this.qualityLv = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveQualityLvJson() {
      return JSON.toJSONString(this.qualityLv);
   }
}
