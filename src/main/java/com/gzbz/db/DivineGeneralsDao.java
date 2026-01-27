package com.gzbz.db;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_divine_generals",
   selectKey = {"playerId"},
   resultType = 0
)
public class DivineGeneralsDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadFunc",
      saveFun = "saveFunc"
   )
   public Map<Integer, Integer> infoMap = new HashMap();
   @DBColumnAnno(
      comment = "使用新消耗配置",
      columnType = "TEXT",
      loadFun = "loadUseNewIds",
      saveFun = "saveUseNewIds"
   )
   public Set<Integer> useNewIds = new HashSet();

   public void loadFunc(String str) {
      if (str != null && str.length() != 0) {
         Map<String, String> map = Splitter.on("|").withKeyValueSeparator(":").split(str);
         map.forEach((key, value) -> {
            Integer var10000 = (Integer)this.infoMap.put(Integer.parseInt(key), Integer.parseInt(value));
         });
      }
   }

   public String saveFunc() {
      return Joiner.on("|").withKeyValueSeparator(":").join(this.infoMap);
   }

   public void loadUseNewIds(String str) {
      this.useNewIds = (Set)JsonUtil.jsonToBean(str, HashSet.class);
   }

   public String saveUseNewIds() {
      return JsonUtil.beanToJson(this.useNewIds);
   }

   public void upgrad(int id) {
      int lv = (Integer)this.infoMap.getOrDefault(id, 0);
      this.infoMap.put(id, lv + 1);
      this.updateOp();
   }
}
