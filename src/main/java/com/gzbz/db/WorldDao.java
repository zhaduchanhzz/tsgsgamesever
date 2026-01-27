package com.gzbz.db;

import com.gzbz.gameDefine.GameDefine;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.JsonUtil;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_world",
   resultType = 0,
   selectKey = {"id"}
)
public class WorldDao<T> extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "编号"
   )
   public int id;
   @DBColumnAnno(
      columnName = "jsonData",
      columnType = "LONGTEXT",
      comment = "数据",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public T jsonData;

   public void loadData(String data) {
      GameDefine.WorldModule module = null;

      for(GameDefine.WorldModule worldModule : GameDefine.WorldModule.values()) {
         if (worldModule.id == this.id) {
            module = worldModule;
            break;
         }
      }

      if (module == null) {
         throw new RuntimeException("未知world信息类,请检查GameDefine.WorldModule");
      } else {
         if (StringUtils.isEmpty(data)) {
            try {
               if (module.mapClz != null) {
                  this.jsonData = (T)module.mapClz.newInstance();
               } else {
                  this.jsonData = (T)module.clz.newInstance();
               }
            } catch (Exception e) {
               e.printStackTrace();
            }
         } else if (module.mapClz != null) {
            this.jsonData = (T)JsonUtil.jsonToMap(data, module.mapKeyClz, module.mapValClz, module.mapClz);
         } else {
            this.jsonData = (T)JsonUtil.jsonToBean(data, module.clz);
         }

      }
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.jsonData);
   }
}
