package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_player_report",
   resultType = 0,
   selectKey = {"playerId"}
)
public class PlayerReportDao extends DBDao {
   @DBColumnAnno(
      comment = "被举报者id",
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      comment = "被举报次数"
   )
   public int count;
   @DBColumnAnno(
      comment = "举报内容",
      columnType = "TEXT",
      loadFun = "loadReportInfo",
      saveFun = "saveReportInfo"
   )
   public Map<Integer, Set<Integer>> reportInfo = new HashMap();

   public void loadReportInfo(String str) {
      Map<Integer, String> map = JsonUtil.jsonToMap(str, Integer.class, String.class);
      map.entrySet().forEach((entry) -> {
         Set<Integer> v = JsonUtil.jsonToBean((String)entry.getValue(), HashSet.class);
         this.reportInfo.put(entry.getKey(), v);
      });
   }

   public String saveReportInfo() {
      return JsonUtil.beanToJson(this.reportInfo);
   }
}
