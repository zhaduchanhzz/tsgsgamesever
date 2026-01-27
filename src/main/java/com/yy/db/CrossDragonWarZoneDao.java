package com.yy.db;

import db.DBColumnAnno;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_dragon_war_zone",
   dbType = 2,
   resultType = 5,
   selectKey = {"group"}
)
public class CrossDragonWarZoneDao extends CrossZoneDao {
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadSubGroups",
      saveFun = "saveSubGroups",
      comment = "小分区"
   )
   public Set<Integer> subGroups = new HashSet();

   public void loadSubGroups(String data) {
      this.subGroups = (Set)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveSubGroups() {
      return JsonUtil.beanToJson(this.subGroups);
   }
}
