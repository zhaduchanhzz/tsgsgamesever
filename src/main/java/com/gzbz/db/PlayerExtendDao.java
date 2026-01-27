package com.gzbz.db;

import com.gzbz.gameDefine.PlayerExtendDefine;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.JsonUtil;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_player_extend",
   resultType = 0,
   selectKey = {"playerId", "module"}
)
public class PlayerExtendDao<T> extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "模块ID"
   )
   public int module;
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "扩展信息",
      loadFun = "loadValue",
      saveFun = "saveValue"
   )
   public T value = null;

   public void loadValue(String str) {
      Class<?> extendClz = (Class)PlayerExtendDefine.moduleExtendMap.get(this.module);
      if (extendClz == null) {
         throw new RuntimeException("未知扩展信息类,请检查PlayerExtendDefine.moduleExtendMap");
      } else {
         if (StringUtils.isEmpty(str)) {
            try {
               this.value = (T)extendClz.newInstance();
            } catch (Exception e) {
               e.printStackTrace();
            }
         } else {
            this.value = (T)JsonUtil.jsonToBean(str, extendClz);
         }

      }
   }

   public String saveValue() {
      return JsonUtil.beanToJson(this.value);
   }
}
