package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_activity_zhang_fei",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ActivityZhangFeiDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "今日挑战次数"
   )
   public byte fight = 0;
   @DBColumnAnno(
      comment = "总伤害（累计伤害）"
   )
   public long totalDamage = 0L;
   @DBColumnAnno(
      comment = "第一波伤害"
   )
   public long firstDamage = 0L;
   @DBColumnAnno(
      comment = "第二波伤害"
   )
   public long secondDamage = 0L;
   @DBColumnAnno(
      comment = "mvp英雄id"
   )
   public int mvpHeroId = 0;
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
      comment = "金刚轰临-总抽取次数"
   )
   public int totalLootNum = 0;
   @DBColumnAnno(
      comment = "金刚轰临-此轮抽取次数"
   )
   public int curLootNum = 0;
   @DBColumnAnno(
      comment = "金刚轰临-心仪奖励"
   )
   public int enjoyId = 0;

   public void loadFightReward(String str) {
      this.fightReward = JsonUtil.jsonToBean(str, HashSet.class);
   }

   public String saveFightReward() {
      return JsonUtil.beanToJson(this.fightReward);
   }

   public void loadPointReward(String str) {
      this.pointReward = JsonUtil.jsonToBean(str, HashSet.class);
   }

   public String savePointReward() {
      return JsonUtil.beanToJson(this.pointReward);
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
      this.updateOp();
   }
}
