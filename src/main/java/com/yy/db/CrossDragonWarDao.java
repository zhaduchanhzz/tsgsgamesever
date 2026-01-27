package com.yy.db;

import com.yy.dragonWar.CrossDragonWarData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_dragon_war",
   dbType = 2,
   resultType = 2,
   mapKey = {"playerId"},
   selectKey = {"groupId"}
)
public class CrossDragonWarDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "playerId"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "group"
   )
   public int groupId;
   @DBColumnAnno(
      comment = "通关阵容",
      columnType = "LONGTEXT",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public Map<Integer, CrossDragonWarData> floorInfo = new HashMap();

   public void loadData(String str) {
      this.floorInfo = JsonUtil.jsonToMap(str, Integer.class, CrossDragonWarData.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.floorInfo);
   }
}
