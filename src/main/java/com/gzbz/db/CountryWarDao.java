package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_country_war",
   resultType = 0,
   selectKey = {"playerId"}
)
public class CountryWarDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "活动ID"
   )
   public int activityId;
   @DBColumnAnno(
      comment = "攻城令领取时间"
   )
   public long attTokenTime;
   @DBColumnAnno(
      comment = "迁移令领取时间"
   )
   public long moveTokenTime;
   @DBColumnAnno(
      comment = "开始时间"
   )
   public long startTime;
   @DBColumnAnno(
      comment = "玩家积分"
   )
   public int score;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadTakedRewards",
      saveFun = "saveTakedRewards"
   )
   public List<Integer> takedRewards = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadTakedSeniorRewards",
      saveFun = "saveTakedSeniorRewards"
   )
   public List<Integer> takedSeniorRewards = new ArrayList();
   @DBColumnAnno(
      comment = "每日结束时间"
   )
   public long dailyEndTime;
   @DBColumnAnno(
      comment = "5日结束时间"
   )
   public long fiveEndTime;
   @DBColumnAnno(
      comment = "赛季结束时间"
   )
   public long seasonEndTime;
   @DBColumnAnno(
      comment = "状态"
   )
   public int state;
   @DBColumnAnno(
      comment = "是否领取"
   )
   public boolean isTaked;
   @DBColumnAnno(
      comment = "本期合服礼包ID"
   )
   public int shopLimitId;
   @DBColumnAnno(
      comment = "是否允许被派遣"
   )
   public boolean allowTransfer = false;
   @DBColumnAnno(
      comment = "是否紧限本军团玩家派遣"
   )
   public boolean sameUnionTransfer = true;

   public void loadTakedRewards(String data) {
      this.takedRewards = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveTakedRewards() {
      return JSON.toJSONString(this.takedRewards);
   }

   public void loadTakedSeniorRewards(String data) {
      this.takedSeniorRewards = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveTakedSeniorRewards() {
      return JSON.toJSONString(this.takedSeniorRewards);
   }
}
