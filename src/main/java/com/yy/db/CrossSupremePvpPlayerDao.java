package com.yy.db;

import com.alibaba.fastjson.JSON;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_supreme_pvp_player",
   dbType = 2,
   resultType = 5,
   selectKey = {"playerId"}
)
public class CrossSupremePvpPlayerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "段位"
   )
   public int grade;
   @DBColumnAnno(
      comment = "积分"
   )
   public int score;
   @DBColumnAnno(
      comment = "防守阵型",
      columnType = "BLOB"
   )
   public byte[] arraying;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadChallenges",
      saveFun = "saveChallenges",
      comment = "对战列表"
   )
   public List<Integer> challenges = new ArrayList();
   @DBColumnAnno(
      comment = "参与时间"
   )
   public long joinTime;
   @DBColumnAnno(
      comment = "最后基本变更时间"
   )
   public long lastScoreChangeTime;
   @DBColumnAnno(
      comment = "上赛季分区编号"
   )
   public int prevGroup;
   @DBColumnAnno(
      comment = "上赛季队伍编号"
   )
   public int prevTeam;
   @DBColumnAnno(
      comment = "上赛季段位"
   )
   public int prevGrade;
   @DBColumnAnno(
      comment = "上赛季积分"
   )
   public int prevScore;
   @DBColumnAnno(
      comment = "上赛季排行"
   )
   public int prevRank;
   @DBColumnAnno(
      comment = "本赛季是否已弹上赛季结算框"
   )
   public boolean prevSettle;
   @DBColumnAnno(
      comment = "阵型战力"
   )
   public long arrayingPower;

   public void loadChallenges(String data) {
      this.challenges = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveChallenges() {
      return JSON.toJSONString(this.challenges);
   }
}
