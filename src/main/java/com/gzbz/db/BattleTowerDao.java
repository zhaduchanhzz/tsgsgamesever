package com.gzbz.db;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_battle_tower"
)
public class BattleTowerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家code"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "已通关最高记录"
   )
   public int towerId;
   @DBColumnAnno(
      comment = "今日已挑战、扫荡次数"
   )
   public int sweepCount;
   @DBColumnAnno(
      comment = "今日已购买次数"
   )
   public int buyTimes;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadRewards",
      saveFun = "saveRewards",
      comment = "已领取"
   )
   public Set<Integer> hadRewards = new HashSet();
   @DBColumnAnno(
      comment = "进行中的战斗id"
   )
   public int fightTowerId;

   public void loadRewards(String str) {
      if (!StringUtils.isEmpty(str)) {
         List<String> list = Splitter.on("|").splitToList(str);
         list.forEach((value) -> this.hadRewards.add(Integer.parseInt(value)));
      }
   }

   public String saveRewards() {
      return Joiner.on("|").join(this.hadRewards);
   }
}
