package com.gzbz.db;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;

@DBTableAnno(
   name = "tb_merge_war_union",
   resultType = 5,
   mapKey = {"unionId"}
)
public class MergeWarUnionDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "军团id"
   )
   public int unionId;
   @DBColumnAnno(
      comment = "今日挑战次数"
   )
   public int figth;
   @DBColumnAnno(
      comment = "累计战斗次数"
   )
   public int totalFight;
   @DBColumnAnno(
      comment = "总伤害值"
   )
   public long totalDamage;
   @DBColumnAnno(
      comment = "是否已发奖"
   )
   public boolean awarded;
   @DBColumnAnno(
      comment = "军团成员伤害",
      columnType = "TEXT",
      loadFun = "loadDamageMap",
      saveFun = "saveDamageMap"
   )
   public Map<Integer, Long> damageMap = new HashMap();

   public void init(int unionId) {
      this.unionId = unionId;
   }

   public void loadDamageMap(String data) {
      if (data != null && data.length() != 0) {
         Map<String, String> map = Splitter.on("|").withKeyValueSeparator(",").split(data);
         map.forEach((key, value) -> {
            Long var10000 = (Long)this.damageMap.put(Integer.parseInt(key), Long.parseLong(value));
         });
      }
   }

   public String saveDamageMap() {
      return Joiner.on("|").withKeyValueSeparator(",").join(this.damageMap);
   }
}
