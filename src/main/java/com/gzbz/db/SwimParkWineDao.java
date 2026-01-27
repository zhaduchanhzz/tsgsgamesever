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
   name = "tb_swim_park_wine",
   resultType = 0,
   selectKey = {"playerId"}
)
public class SwimParkWineDao extends DBDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "祈愿抽奖总次数"
   )
   public int drawTime;
   @DBColumnAnno(
      comment = "保底抽奖次数",
      columnType = "TEXT",
      loadFun = "loadFloorDraw",
      saveFun = "saveFloorDraw"
   )
   public Map<Integer, Integer> floorDrawMap = new HashMap();
   @DBColumnAnno(
      comment = "已获得的物品",
      columnType = "TEXT",
      loadFun = "loadRewardCountMap",
      saveFun = "saveRewardCountMap"
   )
   public Map<Integer, Integer> rewardCountMap = new HashMap();
   @DBColumnAnno(
      comment = "已领取奖励",
      columnType = "TEXT",
      loadFun = "loadHadRewards",
      saveFun = "saveHadRewards"
   )
   public List<Integer> hadRewards = new ArrayList();
   @DBColumnAnno(
      comment = "剩余祈福次数"
   )
   public int prayNum;
   @DBColumnAnno(
      comment = "投壶次数",
      columnType = "TEXT",
      loadFun = "loadPrayIdxMap",
      saveFun = "savePrayIdxMap"
   )
   public Map<Integer, Integer> prayIdxMap = new HashMap();
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
      comment = "心仪奖励",
      skipMerge = true
   )
   public int fancyRewardId;
   @DBColumnAnno(
      comment = "抽奖活动阶段"
   )
   public int lotteryStage;
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "高级奖励记录",
      loadFun = "loadSeniorRewards",
      saveFun = "saveSeniorRewards"
   )
   public Map<Integer, Integer> seniorRewards = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "本轮抽奖次数",
      loadFun = "loadRoundSmashNum",
      saveFun = "saveRoundSmashNum"
   )
   public Map<Integer, Integer> roundSmashNum = new HashMap();

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

   public void loadCanReceiveLowRewardIds(String data) {
      if (!StringUtils.isBlank(data)) {
         String[] rewardIdsStr = data.split(",");
         if (rewardIdsStr != null && rewardIdsStr.length > 0) {
            Set<Integer> canReceiveRewardIds_ = new HashSet();

            for(String rewardId : rewardIdsStr) {
               canReceiveRewardIds_.add(Integer.parseInt(rewardId));
            }

            this.canReceiveLowRewardIds = canReceiveRewardIds_;
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

   public void loadFloorDraw(String data) {
      this.floorDrawMap = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveFloorDraw() {
      return JsonUtil.beanToJson(this.floorDrawMap);
   }

   public void loadRewardCountMap(String data) {
      this.rewardCountMap = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveRewardCountMap() {
      return JsonUtil.beanToJson(this.rewardCountMap);
   }

   public void loadHadRewards(String data) {
      this.hadRewards = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveHadRewards() {
      return JsonUtil.beanToJson(this.hadRewards);
   }

   public void loadRecords(String data) {
      this.recordList = JsonUtil.jsonToList(data, String.class);
   }

   public String saveRecords() {
      return JsonUtil.beanToJson(this.recordList);
   }

   public void loadPrayIdxMap(String data) {
      this.prayIdxMap = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String savePrayIdxMap() {
      return JsonUtil.beanToJson(this.prayIdxMap);
   }

   public void loadAddUpGotRewards(String data) {
      this.addUpGotRewards = DataUtils.stringToIntSet(data);
   }

   public String saveAddUpGotRewards() {
      return DataUtils.intSetToString(this.addUpGotRewards);
   }
}
