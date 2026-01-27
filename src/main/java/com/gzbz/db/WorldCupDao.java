package com.gzbz.db;

import com.gzbz.db.bean.WorldCupData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_worldCup",
   resultType = 5,
   mapKey = {"id"}
)
public class WorldCupDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "场次序号"
   )
   public int id;
   @DBColumnAnno(
      comment = "单场数据",
      columnType = "LONGTEXT",
      loadFun = "loadWorldCupData",
      saveFun = "saveWorldCupData"
   )
   public WorldCupData worldCupData;

   public void loadWorldCupData(String data) {
      this.worldCupData = (WorldCupData)JsonUtil.jsonToBean(data, WorldCupData.class);
   }

   public String saveWorldCupData() {
      return JsonUtil.beanToJson(this.worldCupData);
   }
}
