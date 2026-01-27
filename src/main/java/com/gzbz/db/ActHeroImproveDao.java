package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_act_hero_improve",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ActHeroImproveDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "选择的英雄id"
   )
   public int selectHeroId;
   @DBColumnAnno(
      comment = "英雄活动期间最高星级"
   )
   public int heroMaxStar;
   @DBColumnAnno(
      comment = "所有周期选择过的英雄id列表,活动结束不清除",
      columnType = "TEXT",
      loadFun = "loadHasSelectHeroIds",
      saveFun = "saveHasSelectHeroIds"
   )
   public Set<Integer> hasSelectHeroIds = new HashSet();
   @DBColumnAnno(
      comment = "已领取的英雄星级奖励",
      columnType = "TEXT",
      loadFun = "loadRecStarRewards",
      saveFun = "saveRecStarRewards"
   )
   public Set<Integer> recStarRewards = new HashSet();

   public void loadHasSelectHeroIds(String data) {
      this.hasSelectHeroIds = DataUtils.stringToIntSet(data);
   }

   public String saveHasSelectHeroIds() {
      return DataUtils.intSetToString(this.hasSelectHeroIds);
   }

   public void loadRecStarRewards(String data) {
      this.recStarRewards = DataUtils.stringToIntSet(data);
   }

   public String saveRecStarRewards() {
      return DataUtils.intSetToString(this.recStarRewards);
   }
}
