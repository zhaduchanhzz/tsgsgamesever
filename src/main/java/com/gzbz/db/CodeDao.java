package com.gzbz.db;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.gzbz.gameDefine.CodeDefine;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DBTableAnno(
   name = "tb_code",
   resultType = 0,
   selectKey = {"playerId"}
)
public class CodeDao extends DBDao {
   @DBColumnAnno(
      skip = true
   )
   static Logger logger = LoggerFactory.getLogger(CodeDao.class);
   public static final int CODE_PLAYERID_BATTLE_RECORD = 1;
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
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

   public int getCode(CodeDefine codeDefine) {
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

   public void checkMaxCode(CodeDefine codeDefine, int maxCode) {
      int curCode = (Integer)this.codeStr.getOrDefault(codeDefine.getId(), 1);
      if (curCode < maxCode) {
         logger.error("发现已有最大CODE超过数据库CODE,玩家={}，模块={}，已有CODE={},数据库CODE={}", new Object[]{this.playerId, codeDefine.getId(), maxCode, curCode});
         this.codeStr.put(codeDefine.getId(), maxCode);
         this.updateOp();
      }
   }
}
