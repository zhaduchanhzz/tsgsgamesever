package com.yy.db;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.gzbz.gameDefine.CrossCodeDefine;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DBTableAnno(
   name = "tb_cross_record_code",
   dbType = 2,
   resultType = 0,
   selectKey = {"id"}
)
public class CrossRecordCodeDao extends DBDao {
   @DBColumnAnno(
      skip = true
   )
   static Logger logger = LoggerFactory.getLogger(CrossRecordCodeDao.class);
   @DBColumnAnno(
      isPrimary = true,
      comment = "id"
   )
   public int id;
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

   public int getCode(CrossCodeDefine codeDefine) {
      Integer code = (Integer)this.codeStr.get(codeDefine.getId());
      if (code == null) {
         code = 1;
         this.codeStr.put(codeDefine.getId(), code);
         this.updateOp();
         return code;
      } else {
         code = code + 1;
         if (code >= 2147483646) {
            code = 1;
         }

         this.codeStr.put(codeDefine.getId(), code);
         this.updateOp();
         return code;
      }
   }

   public void checkMaxCode(CrossCodeDefine codeDefine, int maxCode) {
      int curCode = (Integer)this.codeStr.getOrDefault(codeDefine.getId(), 1);
      if (curCode < maxCode) {
         logger.error("发现已有最大CODE超过数据库CODE,ID={}，模块={}，已有CODE={},数据库CODE={}", new Object[]{this.id, codeDefine.getId(), maxCode, curCode});
         this.codeStr.put(codeDefine.getId(), maxCode);
         this.updateOp();
      }
   }
}
