package com.yy.db;

import com.google.protobuf.InvalidProtocolBufferException;
import com.gzbz.protobuf.BattleMsg;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;

@DBTableAnno(
   name = "tb_cross_record",
   dbType = 2,
   resultType = 0,
   selectKey = {"id"}
)
public class CrossRecordDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "记录ID"
   )
   public int id;
   @DBColumnAnno(
      comment = "模块",
      index = 0
   )
   public int model;
   @DBColumnAnno(
      comment = "左边玩家ID"
   )
   public int leftPlayerId;
   @DBColumnAnno(
      comment = "右边玩家ID"
   )
   public int rightPlayerId;
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

   public BattleMsg.S2C_BattleResult_6102.Builder toS2C_BattleResult_6102() throws InvalidProtocolBufferException {
      BattleMsg.S2C_BattleResult_6102.Builder builder = BattleMsg.S2C_BattleResult_6102.parseFrom(this.stream).toBuilder();
      builder.setIsRecord(1);
      if (this.model != 2030) {
         builder.setWave(0);
         builder.setTotalWave(1);
         builder.setIsNextWave(false);
      }

      return builder;
   }

   public BattleMsg.S2C_BattleResult_6102.Builder toS2C_BattleResult_6102(boolean isNeedRoundData) throws InvalidProtocolBufferException {
      BattleMsg.S2C_BattleResult_6102.Builder builder = BattleMsg.S2C_BattleResult_6102.parseFrom(this.stream).toBuilder();
      builder.setIsRecord(1);
      if (this.model != 2030) {
         builder.setWave(0);
         builder.setTotalWave(1);
         builder.setIsNextWave(false);
      }

      if (!isNeedRoundData) {
         builder.clearRounds();
      }

      return builder;
   }
}
