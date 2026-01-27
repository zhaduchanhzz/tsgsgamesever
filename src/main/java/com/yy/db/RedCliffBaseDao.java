package com.yy.db;

import com.yy.redCliff.RedCliffBaseData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_red_cliff_base",
   dbType = 2,
   selectKey = {"group"}
)
public class RedCliffBaseDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "分区id"
   )
   public int group;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "赤壁之战分区服务器信息",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public RedCliffBaseData jsonData;

   public void loadData(String data) {
      this.jsonData = (RedCliffBaseData)JsonUtil.jsonToBean(data, RedCliffBaseData.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.jsonData);
   }
}
