package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DataUtils;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_player_merge_activity",
   resultType = 0,
   selectKey = {"playerId"}
)
public class PlayerMergeActivityDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId = 0;
   @DBColumnAnno(
      comment = "参与合服活动时间"
   )
   public long lastJoinMergeActivityTime = 0L;
   @DBColumnAnno(
      comment = "合服活动的开启时间"
   )
   public long mergeActivityOpenTime = 0L;
   @DBColumnAnno(
      comment = "是否正参与合服活动"
   )
   public boolean isJoiningMergeActivity = false;
   @DBColumnAnno(
      comment = "今日VIP等级,跨天刷新"
   )
   public int todayVip;
   @DBColumnAnno(
      comment = "玩家正在参与的子活动",
      columnType = "TEXT",
      loadFun = "loadJoiningSubActivity",
      saveFun = "saveJoiningSubActivity"
   )
   public Set<Integer> joiningSubActivity = new HashSet();
   @DBColumnAnno(
      comment = "抽奖活动阶段"
   )
   public int lotteryStage;
   @DBColumnAnno(
      comment = "心仪奖励"
   )
   public int fancyRewardId;
   @DBColumnAnno(
      comment = "抽奖总次数"
   )
   public int smashEggNum;
   @DBColumnAnno(
      comment = "本轮抽奖次数",
      loadFun = "loadRoundSmashNum",
      saveFun = "saveRoundSmashNum"
   )
   public Map<Integer, Integer> roundSmashNum = new HashMap();
   @DBColumnAnno(
      comment = "已经领取幸运奖励",
      loadFun = "loadTakedLuck",
      saveFun = "saveTakedLuck"
   )
   public List<Integer> takedLuck = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "高级奖励记录",
      loadFun = "loadSeniorRewards",
      saveFun = "saveSeniorRewards"
   )
   public Map<Integer, Integer> seniorRewards = new HashMap();
   @DBColumnAnno(
      columnName = "signGotRewards",
      comment = "签到已领取奖励id",
      columnType = "TEXT",
      loadFun = "loadSignGotRewards",
      saveFun = "saveSignGotRewards"
   )
   public Set<Integer> signGotRewards = new HashSet();

   public void loadJoiningSubActivity(String data) {
      this.joiningSubActivity = DataUtils.stringToIntSet(data);
   }

   public String saveJoiningSubActivity() {
      return DataUtils.intSetToString(this.joiningSubActivity);
   }

   public void loadSignGotRewards(String data) {
      this.signGotRewards = DataUtils.stringToIntSet(data);
   }

   public String saveSignGotRewards() {
      return DataUtils.intSetToString(this.signGotRewards);
   }

   public void loadRoundSmashNum(String data) {
      this.roundSmashNum = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveRoundSmashNum() {
      return JsonUtil.beanToJson(this.roundSmashNum);
   }

   public void loadTakedLuck(String data) {
      this.takedLuck = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveTakedLuck() {
      return JsonUtil.beanToJson(this.takedLuck);
   }

   public void loadSeniorRewards(String data) {
      this.seniorRewards = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveSeniorRewards() {
      return JsonUtil.beanToJson(this.seniorRewards);
   }
}
