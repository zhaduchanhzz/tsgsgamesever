package com.gzbz.db;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@DBTableAnno(
   name = "tb_rune_lottery",
   resultType = 0,
   selectKey = {"playerId"}
)
public class RuneLotteryDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "抽奖已使用免费次数"
   )
   public int lotteryFreeCount;
   @DBColumnAnno(
      comment = "已抽奖次数"
   )
   public int lotteryCount;
   @DBColumnAnno(
      comment = "抽奖积分"
   )
   public int lotteryPoint;
   @DBColumnAnno(
      comment = "已领取抽奖宝箱",
      columnType = "TEXT",
      loadFun = "loadReceiveBoxes",
      saveFun = "saveReceiveBoxes"
   )
   public Set<Integer> receiveBoxes = new HashSet();
   @DBColumnAnno(
      comment = "是否已发放首次必得"
   )
   public boolean firstGot = false;

   public void reset() {
      this.lotteryFreeCount = 0;
      this.updateOp();
   }

   public void loadReceiveBoxes(String columnData) {
      List<String> list = Splitter.on("|").splitToList(columnData);
      list.forEach((value) -> this.receiveBoxes.add(Integer.parseInt(value)));
   }

   public String saveReceiveBoxes() {
      return Joiner.on("|").join(this.receiveBoxes);
   }
}
