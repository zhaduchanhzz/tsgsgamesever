package com.gzbz.db;

import com.gzbz.demon.bean.DemonBossData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_demon_boss",
   resultType = 0,
   selectKey = {"bossId"}
)
public class DemonBossDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "bossId"
   )
   public int bossId;
   @DBColumnAnno(
      comment = "当天全服玩家获取的封魔令数量"
   )
   public int tokenNum;
   @DBColumnAnno(
      comment = "当前阶段累积被打伤害"
   )
   public long damage;
   @DBColumnAnno(
      comment = "boss当前等级"
   )
   public int bossLev;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadHero",
      saveFun = "saveHero",
      comment = "武将池中随机出的英雄列表"
   )
   public Map<Integer, ArrayList<DemonBossData>> heroMap = new ConcurrentHashMap();

   public void loadHero(String str) {
      Map<Integer, String> map = JsonUtil.jsonToMap(str, Integer.class, String.class);

      for(Map.Entry<Integer, String> entry : map.entrySet()) {
         ArrayList<DemonBossData> list = (ArrayList)JsonUtil.jsonToList((String)entry.getValue(), DemonBossData.class);
         this.heroMap.put(entry.getKey(), list);
      }

   }

   public String saveHero() {
      return JsonUtil.beanToJson(this.heroMap);
   }
}
