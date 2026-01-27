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
import org.apache.commons.lang3.StringUtils;

@DBTableAnno(
   name = "tb_activity_yuan_xiao"
)
public class ActivityYuanXiaoDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      columnName = "addUpGotRewards",
      comment = "累充已领取奖励id",
      columnType = "TEXT",
      loadFun = "loadAddUpGotRewards",
      saveFun = "saveAddUpGotRewards"
   )
   public Set<Integer> addUpGotRewards = new HashSet();
   @DBColumnAnno(
      comment = "当前累充阶段,初始阶段为1"
   )
   public int stage = 1;
   @DBColumnAnno(
      comment = "当前阶段累充金额，与活动期间累充做区分"
   )
   public int stageRechargeMoney = 0;
   @DBColumnAnno(
      comment = "好感度（送花次数）"
   )
   public int favorCount;
   @DBColumnAnno(
      comment = "好感度奖励领取状态 0:未领取 1:已领取"
   )
   public int receiveState;
   @DBColumnAnno(
      comment = "今日已制作甜品次数"
   )
   public int makeCount;
   @DBColumnAnno(
      comment = "是否首次制作甜品"
   )
   public boolean firstMake = true;
   @DBColumnAnno(
      comment = "总甜品积分"
   )
   public int totalPoint;
   @DBColumnAnno(
      comment = "砸蛋阶段"
   )
   public int eggStage;
   @DBColumnAnno(
      comment = "心仪奖励",
      skipMerge = true
   )
   public int fancyRewardId;
   @DBColumnAnno(
      comment = "砸蛋总次数"
   )
   public int smashEggNum;
   @DBColumnAnno(
      comment = "本轮砸蛋次数",
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
      comment = "抽奖记录",
      columnType = "LONGTEXT",
      loadFun = "loadRecords",
      saveFun = "saveRecords"
   )
   public List<String> recordList = new ArrayList();
   @DBColumnAnno(
      columnName = "nowRechargeMoney",
      comment = "当前充值金额,当充值解锁高挡位时需要重置,每日刷新也会重置"
   )
   public int nowRechargeMoney = -1;
   @DBColumnAnno(
      columnName = "rechargeCut",
      comment = "充值扣除,低档位充值扣除,解锁低档位时需要扣除的值,解锁之后需要把解锁消耗的充值加上"
   )
   public int rechargeCut;
   @DBColumnAnno(
      columnName = "canReceiveLowRewardIds",
      comment = "当前已解锁领取的低档位奖励id(每日累充解锁)",
      columnType = "TEXT",
      loadFun = "loadCanReceiveLowRewardIds",
      saveFun = "saveCanReceiveLowRewardIds"
   )
   public Set<Integer> canReceiveLowRewardIds = new HashSet();
   @DBColumnAnno(
      columnName = "canReceiveHighRewardIds",
      comment = "当前已解锁领取的高档位奖励id(每日累充解锁)",
      columnType = "TEXT",
      loadFun = "loadCanReceiveHighRewardIds",
      saveFun = "saveCanReceiveHighRewardIds"
   )
   public Set<Integer> canReceiveHighRewardIds = new HashSet();
   @DBColumnAnno(
      columnName = "hasReceiveRewardIds",
      comment = "已领取奖励id",
      columnType = "TEXT",
      loadFun = "loadHasReceiveRewardIds",
      saveFun = "saveHasReceiveRewardIds"
   )
   public Set<Integer> hasReceiveRewardIds = new HashSet();

   public void loadAddUpGotRewards(String data) {
      this.addUpGotRewards = DataUtils.stringToIntSet(data);
   }

   public String saveAddUpGotRewards() {
      return DataUtils.intSetToString(this.addUpGotRewards);
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

   public void loadRoundSmashNum(String data) {
      this.roundSmashNum = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveRoundSmashNum() {
      return JsonUtil.beanToJson(this.roundSmashNum);
   }

   public void loadRecords(String data) {
      this.recordList = DataUtils.stringToStringList(data);
   }

   public String saveRecords() {
      return DataUtils.stringListToString(this.recordList);
   }

   public void loadCanReceiveLowRewardIds(String data) {
      if (!StringUtils.isBlank(data)) {
         String[] rewardIdsStr = data.split(",");
         if (rewardIdsStr != null && rewardIdsStr.length > 0) {
            Set<Integer> canReceiveRewardIds_ = new HashSet();

            for(String rewardId : rewardIdsStr) {
               canReceiveRewardIds_.add(Integer.parseInt(rewardId));
            }

            this.canReceiveLowRewardIds = DataUtils.stringToIntSet(data);
         }
      }
   }

   public String saveCanReceiveLowRewardIds() {
      StringBuilder stringBuilder = new StringBuilder();
      if (this.canReceiveLowRewardIds.size() > 0) {
         for(Integer canReceiveRewardId : this.canReceiveLowRewardIds) {
            stringBuilder.append(canReceiveRewardId + ",");
         }

         if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         }
      }

      return stringBuilder.toString();
   }

   public void loadCanReceiveHighRewardIds(String data) {
      if (!StringUtils.isBlank(data)) {
         String[] rewardIdsStr = data.split(",");
         if (rewardIdsStr != null && rewardIdsStr.length > 0) {
            Set<Integer> canReceiveRewardIds_ = new HashSet();

            for(String rewardId : rewardIdsStr) {
               canReceiveRewardIds_.add(Integer.parseInt(rewardId));
            }

            this.canReceiveHighRewardIds = canReceiveRewardIds_;
         }
      }
   }

   public String saveCanReceiveHighRewardIds() {
      StringBuilder stringBuilder = new StringBuilder();
      if (this.canReceiveHighRewardIds.size() > 0) {
         for(Integer canReceiveRewardId : this.canReceiveHighRewardIds) {
            stringBuilder.append(canReceiveRewardId + ",");
         }

         if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         }
      }

      return stringBuilder.toString();
   }

   public void loadHasReceiveRewardIds(String data) {
      if (!StringUtils.isBlank(data)) {
         String[] rewardIdsStr = data.split(",");
         if (rewardIdsStr != null && rewardIdsStr.length > 0) {
            Set<Integer> hasReceiveRewardIds_ = new HashSet();

            for(String rewardId : rewardIdsStr) {
               hasReceiveRewardIds_.add(Integer.parseInt(rewardId));
            }

            this.hasReceiveRewardIds = hasReceiveRewardIds_;
         }
      }
   }

   public String saveHasReceiveRewardIds() {
      StringBuilder stringBuilder = new StringBuilder();
      if (this.hasReceiveRewardIds.size() > 0) {
         for(Integer hasReceiveRewardId : this.hasReceiveRewardIds) {
            stringBuilder.append(hasReceiveRewardId + ",");
         }

         if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         }
      }

      return stringBuilder.toString();
   }
}
