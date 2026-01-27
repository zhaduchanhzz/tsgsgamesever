package com.yy.db;

import com.gzbz.union.bean.UnionWarAgainstData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_union_war",
   dbType = 2,
   resultType = 2,
   selectKey = {"group"},
   mapKey = {"unionId"}
)
public class UnionWarDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "所属分区"
   )
   public int group;
   @DBColumnAnno(
      isPrimary = true,
      comment = "军团id"
   )
   public int unionId;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "军团对阵信息",
      loadFun = "loadWarAgainstData",
      saveFun = "saveWarAgainstData"
   )
   public UnionWarAgainstData warAgainstData;

   public void loadWarAgainstData(String data) {
      this.warAgainstData = (UnionWarAgainstData)JsonUtil.jsonToBean(data, UnionWarAgainstData.class);
   }

   public String saveWarAgainstData() {
      return JsonUtil.beanToJson(this.warAgainstData);
   }
}
