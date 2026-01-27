package com.gzbz.db;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;

@DBTableAnno(
   name = "tb_trail_tower_star",
   resultType = 2,
   selectKey = {"playerId"},
   mapKey = {"towerId"}
)
public class TrailTowerStarDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "层数"
   )
   public int towerId;
   @DBColumnAnno(
      comment = "达成的条件",
      columnType = "TEXT",
      loadFun = "loadCondition",
      saveFun = "saveCondition"
   )
   public List<Integer> conditionList = new ArrayList();

   public void loadCondition(String str) {
      if (str != null && str.length() != 0) {
         List<String> list = Splitter.on("|").splitToList(str);
         list.forEach((value) -> this.conditionList.add(Integer.parseInt(value)));
      }
   }

   public String saveCondition() {
      return Joiner.on("|").join(this.conditionList);
   }

   public void init(int playerId, int towerId, List<Integer> conditionList) {
      this.playerId = playerId;
      this.towerId = towerId;
      this.conditionList.clear();
      this.conditionList.addAll(conditionList);
   }
}
