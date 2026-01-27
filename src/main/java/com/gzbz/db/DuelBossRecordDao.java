package com.gzbz.db;

import com.gzbz.protobuf.DuelBattleMsg;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.DateUtil;

@DBTableAnno(
   name = "tb_duel_boss_record",
   resultType = 5,
   mapKey = {"id"}
)
public class DuelBossRecordDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true
   )
   public long id;
   @DBColumnAnno(
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "角色名"
   )
   public String playerName;
   @DBColumnAnno(
      comment = "本次伤害"
   )
   public long damage;
   @DBColumnAnno(
      comment = "总伤害"
   )
   public long totalDamage;
   @DBColumnAnno(
      comment = "挑战时间"
   )
   public long challengeTime;

   public DuelBattleMsg.BattleBossRecord buildMsg() {
      DuelBattleMsg.BattleBossRecord.Builder builder = DuelBattleMsg.BattleBossRecord.newBuilder();
      builder.setDamage(this.damage);
      builder.setDamageSum(this.totalDamage);
      builder.setPlayerId(this.playerId);
      builder.setPlayerName(this.playerName);
      builder.setTime(DateUtil.getIntTime(this.challengeTime));
      return builder.build();
   }
}
