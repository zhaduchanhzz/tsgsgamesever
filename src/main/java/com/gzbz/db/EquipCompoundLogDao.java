package com.gzbz.db;

import com.gzbz.model.fun.ResourceModel;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_equip_compound_log",
   resultType = 1,
   selectKey = {"playerId"}
)
public class EquipCompoundLogDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadCost",
      saveFun = "saveCost",
      comment = "消耗物品"
   )
   public List<ResourceModel> cost = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadObtain",
      saveFun = "saveObtain",
      comment = "获得物品"
   )
   public List<ResourceModel> obtain = new ArrayList();
   @DBColumnAnno(
      comment = "合成时间"
   )
   public long createTime;

   public void loadCost(String data) {
      this.cost = JsonUtil.jsonToList(data, ResourceModel.class);
   }

   public String saveCost() {
      return JsonUtil.listToJson(this.cost);
   }

   public void loadObtain(String data) {
      this.obtain = JsonUtil.jsonToList(data, ResourceModel.class);
   }

   public String saveObtain() {
      return JsonUtil.listToJson(this.obtain);
   }
}
