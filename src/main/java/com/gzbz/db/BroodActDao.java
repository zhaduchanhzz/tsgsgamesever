package com.gzbz.db;

import db.DBColumnAnno;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_act_brood",
   resultType = 0,
   selectKey = {"playerId"}
)
public class BroodActDao extends DrawActDao {
   @DBColumnAnno(
      columnName = "score",
      comment = "获取的积分"
   )
   public int score;
   @DBColumnAnno(
      comment = "直购中的购买次数",
      columnName = "broodBuyMap",
      columnType = "TEXT",
      loadFun = "loadBroodBuy",
      saveFun = "saveBroodBuy"
   )
   public Map<Integer, Integer> broodBuy = new HashMap();
   @DBColumnAnno(
      comment = "道具抽中次数",
      columnName = "itemDrawTimes",
      columnType = "TEXT",
      loadFun = "loadItemDrawTimes",
      saveFun = "saveItemDrawTimes"
   )
   public Map<Integer, Integer> itemDrawTimes = new HashMap();
   @DBColumnAnno(
      comment = "每日获取次数限制"
   )
   public int drapItemCountDaily;

   public void loadBroodBuy(String data) {
      this.broodBuy = DataUtils.stringToInt_intMap(data);
   }

   public String saveBroodBuy() {
      return DataUtils.int_intMapToString(this.broodBuy);
   }

   public void loadItemDrawTimes(String data) {
      this.itemDrawTimes = DataUtils.stringToInt_intMap(data);
   }

   public String saveItemDrawTimes() {
      return DataUtils.int_intMapToString(this.itemDrawTimes);
   }
}
