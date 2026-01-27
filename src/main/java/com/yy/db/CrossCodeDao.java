package com.yy.db;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;

@DBTableAnno(
   name = "tb_cross_code",
   dbType = 2,
   resultType = 0,
   selectKey = {"heroId"}
)
public class CrossCodeDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "英雄id"
   )
   public int heroId;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadList",
      saveFun = "saveList"
   )
   public Map<Integer, Integer> codeStr = new HashMap();

   public void loadList(String str) {
      if (str != null && str.length() != 0) {
         Map<String, String> map = Splitter.on("|").withKeyValueSeparator("=").split(str);
         map.forEach((key, value) -> {
            Integer var10000 = (Integer)this.codeStr.put(Integer.parseInt(key), Integer.parseInt(value));
         });
      }
   }

   public String saveList() {
      return Joiner.on("|").withKeyValueSeparator("=").join(this.codeStr);
   }

   public int getCode(int heroId) {
      Integer code = (Integer)this.codeStr.get(heroId);
      if (code == null) {
         code = 1;
         this.codeStr.put(heroId, code);
         this.updateOp();
         return code;
      } else {
         code = code + 1;
         if (code >= 2147483646) {
            code = 1;
         }

         this.codeStr.put(heroId, code);
         this.updateOp();
         return code;
      }
   }
}
