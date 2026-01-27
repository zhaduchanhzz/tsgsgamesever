package com.gzbz.db;

import com.gzbz.db.baseDao.AddUpAndConBaseDao;
import db.DBColumnAnno;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_activity_fa_qiu",
   resultType = 0,
   selectKey = {"playerId"}
)
public class FaQiuDao extends AddUpAndConBaseDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "已经抽到的地图碎片",
      loadFun = "loadOpenChips",
      saveFun = "saveOpenChips",
      columnType = "VARCHAR"
   )
   public Set<Integer> openChips = new HashSet();
   @DBColumnAnno(
      comment = "已经领取的收集奖励",
      loadFun = "loadCollectRewards",
      saveFun = "saveCollectRewards",
      columnType = "VARCHAR"
   )
   public Set<Integer> collectRewards = new HashSet();
   @DBColumnAnno(
      comment = "是否领取最终奖励"
   )
   public boolean finalReward;
   @DBColumnAnno(
      comment = "累计抽奖次数"
   )
   public int totalDraw;

   public void loadOpenChips(String data) {
      this.openChips = DataUtils.stringToIntSet(data);
   }

   public String saveOpenChips() {
      return DataUtils.intSetToString(this.openChips);
   }

   public void loadCollectRewards(String data) {
      this.collectRewards = DataUtils.stringToIntSet(data);
   }

   public String saveCollectRewards() {
      return DataUtils.intSetToString(this.collectRewards);
   }

   public void clear() {
      this.openChips.clear();
      this.collectRewards.clear();
      this.totalDraw = 0;
      this.finalReward = false;
      this.updateOp();
   }
}
