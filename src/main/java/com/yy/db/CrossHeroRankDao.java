package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_hero_rank",
   dbType = 2,
   resultType = 0,
   selectKey = {"group"}
)
public class CrossHeroRankDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "所属分区"
   )
   public int group;
   @DBColumnAnno(
      comment = "上一次刷新时间"
   )
   public long flushTime;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "前一天补偿",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public Map<Integer, Integer> lastCompensate = new HashMap();

   public void loadData(String data) {
      this.lastCompensate = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.lastCompensate);
   }
}
