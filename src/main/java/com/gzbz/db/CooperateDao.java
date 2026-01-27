package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cooperate",
   resultType = 2,
   selectKey = {"playerId"},
   mapKey = {"cooperateType"}
)
public class CooperateDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "同心策类型"
   )
   public int cooperateType;
   @DBColumnAnno(
      comment = "同心策美人",
      loadFun = "loadCooperateBeauty",
      saveFun = "saveCooperateBeauty",
      columnType = "TEXT"
   )
   public List<Integer> cooperateBeauty = new ArrayList();

   public void loadCooperateBeauty(String str) {
      this.cooperateBeauty = JsonUtil.jsonToList(str, Integer.class);
   }

   public String saveCooperateBeauty() {
      return JsonUtil.beanToJson(this.cooperateBeauty);
   }
}
