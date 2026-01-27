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
   name = "tb_war_horse",
   resultType = 0,
   selectKey = {"playerId"}
)
public class WarHorseDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "祭祀已使用免费次数"
   )
   public int sacrificeFreeCount;
   @DBColumnAnno(
      comment = "已祭祀次数"
   )
   public int sacrificeCount;
   @DBColumnAnno(
      comment = "祭祀积分"
   )
   public int sacrificePoint;
   @DBColumnAnno(
      comment = "已领取祭祀宝箱",
      columnType = "TEXT",
      loadFun = "loadSacrificeBoxes",
      saveFun = "saveSacrificeBoxes"
   )
   public Set<Integer> sacrificeBoxes = new HashSet();
   @DBColumnAnno(
      comment = "今天是否记录了普通阵容英雄的战马日志"
   )
   public boolean hasLogArrayingHeroHorse;

   public void reset() {
      this.sacrificeFreeCount = 0;
      this.updateOp();
   }

   public void loadSacrificeBoxes(String columnData) {
      List<String> list = Splitter.on("|").splitToList(columnData);
      list.forEach((value) -> this.sacrificeBoxes.add(Integer.parseInt(value)));
   }

   public String saveSacrificeBoxes() {
      return Joiner.on("|").join(this.sacrificeBoxes);
   }
}
