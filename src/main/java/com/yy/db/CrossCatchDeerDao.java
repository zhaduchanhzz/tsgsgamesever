package com.yy.db;

import com.gzbz.catchDeer.CatchDeerData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_catch_deer",
   dbType = 2,
   resultType = 0,
   selectKey = {"group"}
)
public class CrossCatchDeerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "所属分区"
   )
   public int group;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "逐鹿中原数据",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public CatchDeerData catchDerrData;
   @DBColumnAnno(
      comment = "是否调整跨服需要移动分区"
   )
   public boolean isMoveServer;

   public void loadData(String data) {
      this.catchDerrData = (CatchDeerData)JsonUtil.jsonToBean(data, CatchDeerData.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.catchDerrData);
   }
}
