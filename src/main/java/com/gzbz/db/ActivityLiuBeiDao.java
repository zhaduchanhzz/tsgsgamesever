package com.gzbz.db;

import com.gzbz.db.baseDao.AddUpAndConBaseDao;
import db.DBColumnAnno;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_activity_liu_bei",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ActivityLiuBeiDao extends AddUpAndConBaseDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "今日挑战次数"
   )
   public byte fight;
   @DBColumnAnno(
      comment = "总伤害（累计伤害）"
   )
   public long totalDamage;
   @DBColumnAnno(
      comment = "第一波伤害"
   )
   public long firstDamage;
   @DBColumnAnno(
      comment = "第二波伤害"
   )
   public long secondDamage;
   @DBColumnAnno(
      comment = "mvp英雄id"
   )
   public int mvpHeroId;
   @DBColumnAnno(
      comment = "已领取的挑战奖励",
      columnType = "TEXT",
      loadFun = "loadFightReward",
      saveFun = "saveFightReward"
   )
   public Set<Integer> fightReward = new HashSet();
   @DBColumnAnno(
      comment = "累计获得的积分(货币)"
   )
   public int totalPoint;
   @DBColumnAnno(
      comment = "已领取的积分奖励",
      columnType = "TEXT",
      loadFun = "loadPointReward",
      saveFun = "savePointReward"
   )
   public Set<Integer> pointReward = new HashSet();
   @DBColumnAnno(
      comment = "匹配的队友"
   )
   public int matchPlayerId;
   @DBColumnAnno(
      comment = "招募-总抽取次数"
   )
   public int totalLootNum;
   @DBColumnAnno(
      comment = "招募-此轮抽取次数"
   )
   public int curLootNum;
   @DBColumnAnno(
      comment = "招募-心仪奖励"
   )
   public int enjoyId;

   public void loadFightReward(String str) {
      this.fightReward = DataUtils.stringToIntSet(str);
   }

   public String saveFightReward() {
      return DataUtils.intSetToString(this.fightReward);
   }

   public void loadPointReward(String str) {
      this.pointReward = DataUtils.stringToIntSet(str);
   }

   public String savePointReward() {
      return DataUtils.intSetToString(this.pointReward);
   }

   public void reset() {
      this.fight = 0;
      this.totalDamage = 0L;
      this.firstDamage = 0L;
      this.fightReward.clear();
      this.totalPoint = 0;
      this.pointReward.clear();
      this.matchPlayerId = 0;
      this.totalLootNum = 0;
      this.curLootNum = 0;
      this.enjoyId = 0;
      this.secondDamage = 0L;
      this.mvpHeroId = 0;
      this.updateOp();
   }
}
