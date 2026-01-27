package com.gzbz.db;

import com.gzbz.db.bean.TaskGroupData;
import com.gzbz.duel.bean.DuelChampionData;
import com.gzbz.duel.bean.DuelJadeData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_duel",
   resultType = 0,
   selectKey = {"playerId"}
)
public class DuelDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      comment = "当前参与赛季开始时间"
   )
   public long startTime;
   @DBColumnAnno(
      comment = "当前参与赛季"
   )
   public int season;
   @DBColumnAnno(
      comment = "赛季任务",
      columnType = "TEXT",
      loadFun = "loadTaskGroup",
      saveFun = "saveTaskGroup"
   )
   public Map<Integer, TaskGroupData> taskGroupData = new HashMap();
   @DBColumnAnno(
      comment = "已挑战次数"
   )
   public int fightTimes;
   @DBColumnAnno(
      comment = "已购买次数"
   )
   public int buyTimes;
   @DBColumnAnno(
      comment = "今日最高伤害"
   )
   public long todayMaxDamage;
   @DBColumnAnno(
      comment = "当前伤害"
   )
   public long damage;
   @DBColumnAnno(
      comment = "总伤害"
   )
   public long totalDamage;
   @DBColumnAnno(
      comment = "任务积分"
   )
   public int point;
   @DBColumnAnno(
      comment = "登录弹窗"
   )
   public int notifyGuess;
   @DBColumnAnno(
      comment = "已领任务宝箱ID",
      columnType = "TEXT",
      loadFun = "loadTaskBoxReward",
      saveFun = "saveTaskBoxReward"
   )
   public Set<Integer> taskBoxReward = new HashSet();
   @DBColumnAnno(
      comment = "已推送排行的阶段",
      loadFun = "loadShowRankStage",
      saveFun = "saveShowRankStage"
   )
   public Set<Integer> showRankStage = new HashSet();
   @DBColumnAnno(
      comment = "阶段历史最高排名zone+stage->rank",
      loadFun = "loadStageRank",
      saveFun = "saveStageRank"
   )
   public Map<Long, Integer> stageRank = new HashMap();
   @DBColumnAnno(
      comment = "巅峰回顾今日已点赞玩家season+player",
      loadFun = "loadTodayHistoryLike",
      saveFun = "saveTodayHistoryLike"
   )
   public Set<Long> todayHistoryLike = new HashSet();
   @DBColumnAnno(
      comment = "巅峰膜拜今日已点赞分区+战区",
      loadFun = "loadTodayWorshipLike",
      saveFun = "saveTodayWorshipLike"
   )
   public Set<Long> todayWorshipLike = new HashSet();
   @DBColumnAnno(
      comment = "夺冠信息",
      loadFun = "loadChampionData",
      saveFun = "saveChampionData"
   )
   public DuelChampionData championData = new DuelChampionData();
   @DBColumnAnno(
      comment = "赛季玉珏",
      columnType = "TEXT",
      loadFun = "loadJadeData",
      saveFun = "saveJadeData"
   )
   public Map<Integer, DuelJadeData> jadeData = new HashMap();
   @DBColumnAnno(
      comment = "新赛季玉珏",
      columnType = "LONGTEXT",
      loadFun = "loadTempJadeData",
      saveFun = "saveTempJadeData"
   )
   public List<DuelJadeData> tempJadeData = new ArrayList();

   public void loadTaskGroup(String data) {
      this.taskGroupData = JsonUtil.jsonToMap(data, Integer.class, TaskGroupData.class);
   }

   public String saveTaskGroup() {
      return JsonUtil.beanToJson(this.taskGroupData);
   }

   public void loadJadeData(String data) {
      this.jadeData = JsonUtil.jsonToMap(data, Integer.class, DuelJadeData.class);
   }

   public String saveJadeData() {
      return JsonUtil.beanToJson(this.jadeData);
   }

   public void loadTaskBoxReward(String data) {
      this.taskBoxReward = (Set)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveTaskBoxReward() {
      return JsonUtil.beanToJson(this.taskBoxReward);
   }

   public void loadStageRank(String data) {
      this.stageRank = JsonUtil.jsonToMap(data, Long.class, Integer.class);
   }

   public String saveStageRank() {
      return JsonUtil.beanToJson(this.stageRank);
   }

   public void loadTodayHistoryLike(String data) {
      this.todayHistoryLike = (Set)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveTodayHistoryLike() {
      return JsonUtil.beanToJson(this.todayHistoryLike);
   }

   public void loadTodayWorshipLike(String data) {
      this.todayWorshipLike = (Set)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveTodayWorshipLike() {
      return JsonUtil.beanToJson(this.todayWorshipLike);
   }

   public void loadShowRankStage(String data) {
      this.showRankStage = (Set)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveShowRankStage() {
      return JsonUtil.beanToJson(this.showRankStage);
   }

   public void loadChampionData(String data) {
      this.championData = (DuelChampionData)JsonUtil.jsonToBean(data, DuelChampionData.class);
   }

   public String saveChampionData() {
      return JsonUtil.beanToJson(this.championData);
   }

   public void loadTempJadeData(String data) {
      this.tempJadeData = JsonUtil.jsonToList(data, DuelJadeData.class);
   }

   public String saveTempJadeData() {
      return JsonUtil.beanToJson(this.tempJadeData);
   }
}
