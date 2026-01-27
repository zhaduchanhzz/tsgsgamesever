package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_mine_info",
   dbType = 2,
   resultType = 0,
   selectKey = {"group"}
)
public class MineInfoDao extends DBDao {
   @DBColumnAnno(
      comment = "所属分区",
      isPrimary = true
   )
   public int group;
   @DBColumnAnno(
      comment = "活动状态"
   )
   public int state;
   @DBColumnAnno(
      comment = "矿山事件",
      columnType = "TEXT",
      loadFun = "loadHillEvent",
      saveFun = "saveHillEvent"
   )
   public Map<Integer, Map<Integer, Integer>> hillEventMap = new HashMap();
   @DBColumnAnno(
      comment = "巨型矿脉事件",
      columnType = "TEXT",
      loadFun = "loadBigEvent",
      saveFun = "saveBigEvent"
   )
   public Map<Integer, Map<Integer, Integer>> bigEventMap = new HashMap();

   public void loadHillEvent(String str) {
      Map<Integer, String> map = JsonUtil.jsonToMap(str, Integer.class, String.class);
      map.entrySet().forEach((entry) -> {
         Map<Integer, Integer> v = JsonUtil.jsonToMap((String)entry.getValue(), Integer.class, Integer.class);
         this.hillEventMap.put(entry.getKey(), v);
      });
   }

   public String saveHillEvent() {
      return JsonUtil.beanToJson(this.hillEventMap);
   }

   public void loadBigEvent(String str) {
      Map<Integer, String> map = JsonUtil.jsonToMap(str, Integer.class, String.class);

      for(Map.Entry<Integer, String> entry : map.entrySet()) {
         Map<Integer, Integer> v = JsonUtil.jsonToMap((String)entry.getValue(), Integer.class, Integer.class);
         this.bigEventMap.put(entry.getKey(), v);
      }

   }

   public String saveBigEvent() {
      return JsonUtil.beanToJson(this.bigEventMap);
   }

   public void init() {
      this.hillEventMap.clear();
      this.bigEventMap.clear();
   }
}
