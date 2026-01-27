package com.gzbz.db;

import com.gzbz.gamePlayer.peak.bean.PeakRecordData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_peak_pvp",
   resultType = 0,
   selectKey = {"playerId"}
)
public class PeakPvpDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "常规赛已挑战次数"
   )
   public int commonFightTimes;
   @DBColumnAnno(
      comment = "常规赛已购买次数"
   )
   public int commonBuyFightTimes;
   @DBColumnAnno(
      comment = "天梯赛已挑战次数"
   )
   public int peakFightTimes;
   @DBColumnAnno(
      comment = "天梯赛已购买次数"
   )
   public int peakBuyFightTimes;
   @DBColumnAnno(
      comment = "巅峰对决积分"
   )
   public int peakPoint;
   @DBColumnAnno(
      comment = "巅峰对决段位经验"
   )
   public int exp;
   @DBColumnAnno(
      comment = "巅峰对决缓冲经验"
   )
   public int bufferExp;
   @DBColumnAnno(
      comment = "巅峰对决当前赛季最高段位"
   )
   public int maxStep;
   @DBColumnAnno(
      comment = "巅峰对决当前赛季已领取段位奖励"
   )
   public int stepAward;
   @DBColumnAnno(
      comment = "巅峰对决当前赛季"
   )
   public int season;
   @DBColumnAnno(
      comment = "巅峰对决当前赛季开始时间"
   )
   public int seasonTime;
   @DBColumnAnno(
      comment = "赛季传奇累计被点赞次数"
   )
   public int likeNum;
   @DBColumnAnno(
      comment = "巅峰对决晋级赛场次",
      columnType = "TEXT",
      loadFun = "loadRise",
      saveFun = "saveRise"
   )
   public List<Integer> riseInfo = new ArrayList();
   @DBColumnAnno(
      columnName = "matchData",
      columnType = "TEXT",
      comment = "当前匹配对象",
      loadFun = "loadMatch",
      saveFun = "saveMatch"
   )
   public PeakRecordData matchData;
   @DBColumnAnno(
      comment = "常规赛点赞得玩家列表",
      columnName = "commonLike",
      columnType = "TEXT",
      loadFun = "loadCommonLike",
      saveFun = "saveCommonLike"
   )
   public List<Integer> commonLike = new ArrayList();
   @DBColumnAnno(
      comment = "巅峰赛点赞得玩家列表",
      columnName = "peakLike",
      columnType = "TEXT",
      loadFun = "loadPeakLike",
      saveFun = "savePeakLike"
   )
   public List<Integer> peakLike = new ArrayList();
   @DBColumnAnno(
      comment = "上一次调整跨服结算时间戳"
   )
   public long serverTerminationTime;
   @DBColumnAnno(
      comment = "上一次调整跨服结算排名时间戳"
   )
   public long serverTerminationRankTime;

   public void loadMatch(String data) {
      this.matchData = (PeakRecordData)JsonUtil.jsonToBean(data, PeakRecordData.class);
   }

   public String saveMatch() {
      return JsonUtil.beanToJson(this.matchData);
   }

   public void loadCommonLike(String data) {
      if (!StringUtils.isEmpty(data)) {
         this.commonLike = JsonUtil.jsonToList(data, Integer.class);
      }
   }

   public String saveCommonLike() {
      return JsonUtil.listToJson(this.commonLike);
   }

   public void loadRise(String data) {
      if (!StringUtils.isEmpty(data)) {
         this.riseInfo = JsonUtil.jsonToList(data, Integer.class);
      }
   }

   public String saveRise() {
      return JsonUtil.listToJson(this.riseInfo);
   }

   public void loadPeakLike(String data) {
      if (!StringUtils.isEmpty(data)) {
         this.peakLike = JsonUtil.jsonToList(data, Integer.class);
      }
   }

   public String savePeakLike() {
      return JsonUtil.listToJson(this.peakLike);
   }
}
