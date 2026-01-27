package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_act_flower",
   resultType = 0,
   selectKey = {"playerId"}
)
public class FlowerActDao extends DBDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "累计赠送鲜花数量"
   )
   public int sendFlowerNum;
   @DBColumnAnno(
      comment = "累计获取鲜花数量"
   )
   public int getFlowerNum;
   @DBColumnAnno(
      comment = "已购买的鲜花id及购买次数",
      columnName = "flowerBuyMap",
      columnType = "TEXT",
      loadFun = "loadFlowerBuy",
      saveFun = "saveFlowerBuy"
   )
   public Map<Integer, Integer> flowerBuy = new HashMap();
   @DBColumnAnno(
      comment = "已领取的鲜花积分奖励及次数",
      columnName = "scoreIdNum",
      columnType = "TEXT",
      loadFun = "loadScoreIdNum",
      saveFun = "saveScoreIdNum"
   )
   public Map<Integer, Integer> scoreIdNum = new HashMap();
   @DBColumnAnno(
      comment = "活动开始时间，用于判断当前数据是本轮活动的还是上一轮活动的"
   )
   public int start = 0;

   public void loadFlowerBuy(String data) {
      this.flowerBuy = DataUtils.stringToInt_intMap(data);
   }

   public String saveFlowerBuy() {
      return DataUtils.int_intMapToString(this.flowerBuy);
   }

   public void loadScoreIdNum(String data) {
      this.scoreIdNum = DataUtils.stringToInt_intMap(data);
   }

   public String saveScoreIdNum() {
      return DataUtils.int_intMapToString(this.scoreIdNum);
   }
}
