package com.gzbz.db;

import com.google.protobuf.InvalidProtocolBufferException;
import com.gzbz.protobuf.BattleMsg;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@DBTableAnno(
   name = "tb_battle_record",
   resultType = 0,
   selectKey = {"id"}
)
public class BattleRecordDao extends DBDao {
   @DBColumnAnno(
      isAutoInc = true,
      isPrimary = true,
      comment = "记录ID"
   )
   public int id;
   @DBColumnAnno(
      comment = "玩家ID",
      index = 0
   )
   public int playerId;
   @DBColumnAnno(
      comment = "模块",
      index = 0
   )
   public int model;
   @DBColumnAnno(
      comment = "对战玩家ID"
   )
   public int defPlayerId;
   @DBColumnAnno(
      comment = "关卡ID"
   )
   public int chapterId;
   @DBColumnAnno(
      columnName = "creatTime",
      comment = "创建时间"
   )
   public Timestamp creatTime;
   @DBColumnAnno(
      columnType = "MEDIUMBLOB",
      comment = "对战记录"
   )
   public byte[] stream;
   @DBColumnAnno(
      skip = true
   )
   public List<Integer> tempCollectList = new ArrayList();
   @DBColumnAnno(
      comment = "输赢"
   )
   public int win;
   @DBColumnAnno(
      comment = "关联记录ID"
   )
   public int relationId;
   @DBColumnAnno(
      comment = "生效时间"
   )
   public long enableTime;

   public BattleMsg.S2C_BattleResult_6102.Builder toS2C_BattleResult_6102() throws InvalidProtocolBufferException {
      BattleMsg.S2C_BattleResult_6102.Builder builder = BattleMsg.S2C_BattleResult_6102.parseFrom(this.stream).toBuilder();
      builder.setIsRecord(1).build();
      builder.setWave(0);
      builder.setTotalWave(1);
      builder.setIsNextWave(false);
      return builder;
   }

   public BattleMsg.S2C_BattleResult_6102.Builder toS2C_BattleResult_6102(boolean isNeedRoundData) throws InvalidProtocolBufferException {
      BattleMsg.S2C_BattleResult_6102.Builder builder = BattleMsg.S2C_BattleResult_6102.parseFrom(this.stream).toBuilder();
      builder.setIsRecord(1).build();
      builder.setWave(0);
      builder.setTotalWave(1);
      if (!isNeedRoundData) {
         builder.clearRounds();
      }

      builder.setIsNextWave(false);
      return builder;
   }
}
