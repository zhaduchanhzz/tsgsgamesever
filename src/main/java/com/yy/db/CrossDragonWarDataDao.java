package com.yy.db;

import com.yy.dragonWar.DragonWarFloorData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_dragon_war_data",
   dbType = 2,
   selectKey = {"groupId"}
)
public class CrossDragonWarDataDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "groupId"
   )
   public int groupId;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadInfo",
      saveFun = "saveInfo",
      comment = "排行榜数据"
   )
   public Map<String, DragonWarFloorData> rankData = new HashMap();

   public void loadInfo(String str) {
      this.rankData = JsonUtil.jsonToMap(str, String.class, DragonWarFloorData.class);
   }

   public String saveInfo() {
      return JsonUtil.beanToJson(this.rankData);
   }
}
