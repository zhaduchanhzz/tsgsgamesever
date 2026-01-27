package com.gzbz.db;

import com.gzbz.db.bean.ArrayingMirror;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.io.Serializable;

@DBTableAnno(
   name = "tb_union_war_attack_log",
   resultType = 1,
   selectKey = {"unionId"}
)
public class UnionWarAttackLogDao extends DBDao implements Serializable {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true,
      comment = "主键id"
   )
   public int id;
   @DBColumnAnno(
      comment = "记录id"
   )
   public int recordId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "军团id"
   )
   public int unionId;
   @DBColumnAnno(
      comment = "挑战战略点位置"
   )
   public int position;
   @DBColumnAnno(
      comment = "挑战战略点玩家id"
   )
   public int holdPlayerId;
   @DBColumnAnno(
      comment = "挑战战略点玩家id"
   )
   public String holdPlayerName;
   @DBColumnAnno(
      comment = "挑战者玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "挑战者玩家名"
   )
   public String playerName;
   @DBColumnAnno(
      comment = "挑战者玩家战力"
   )
   public long power;
   @DBColumnAnno(
      comment = "挑战难度"
   )
   public int star;
   @DBColumnAnno(
      comment = "是否胜利"
   )
   public boolean isWin;
   @DBColumnAnno(
      comment = "挑战者阵容",
      columnType = "BLOB"
   )
   public byte[] arrayingData;
   @DBColumnAnno(
      comment = "创建时间"
   )
   public long time;
   @DBColumnAnno(
      comment = "当前联盟总星数"
   )
   public int total;
   @DBColumnAnno(
      comment = "当前战绩"
   )
   public int record;
   @DBColumnAnno(
      comment = "当前buff等级"
   )
   public int buff;
   @DBColumnAnno(
      comment = "哪一方,1为进攻方,2为防守方"
   )
   public int size = 1;
   @DBColumnAnno(
      comment = "挑战者服务器"
   )
   public int server;

   public ArrayingMirror getArrayingMirror() {
      return this.arrayingData != null && this.arrayingData.length > 0 ? ArrayingMirror.toArrayingMirror(this.arrayingData) : null;
   }
}
