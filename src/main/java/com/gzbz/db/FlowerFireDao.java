package com.gzbz.db;

import com.gzbz.model.fun.ResourceModel;
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
   name = "tb_flower_fire",
   resultType = 0,
   selectKey = {"playerId"}
)
public class FlowerFireDao extends DBDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "活动开始时的玩家等级"
   )
   public int activityStartLv;
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
      comment = "每日连充已领取奖励id",
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
      comment = "今日已祈福次数"
   )
   public int prayNum;
   @DBColumnAnno(
      comment = "抽奖记录",
      columnType = "LONGTEXT",
      loadFun = "loadRecords",
      saveFun = "saveRecords"
   )
   public List<String> recordList = new ArrayList();
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
   @DBColumnAnno(
      comment = "直购商城物品购买次数(id:times)",
      columnType = "TEXT",
      loadFun = "loadItemBuyTimes",
      saveFun = "saveItemBuyTimes"
   )
   public Map<Integer, Integer> itemBuyTimes = new HashMap();
   @DBColumnAnno(
      comment = "已经挑战次数"
   )
   public int alreadyBattleTimes;
   @DBColumnAnno(
      comment = "已购买挑战次数"
   )
   public int battleBuyTimes;
   @DBColumnAnno(
      comment = "最高伤害"
   )
   public long maxDamage;

   public void loadCanReceiveLowRewardIds(String data) {
      this.canReceiveLowRewardIds = DataUtils.stringToIntSet(data);
   }

   public String saveCanReceiveLowRewardIds() {
      return DataUtils.intSetToString(this.canReceiveLowRewardIds);
   }

   public void loadCanReceiveHighRewardIds(String data) {
      this.canReceiveHighRewardIds = DataUtils.stringToIntSet(data);
   }

   public String saveCanReceiveHighRewardIds() {
      return DataUtils.intSetToString(this.canReceiveHighRewardIds);
   }

   public void loadHasReceiveRewardIds(String data) {
      this.hasReceiveRewardIds = DataUtils.stringToIntSet(data);
   }

   public String saveHasReceiveRewardIds() {
      return DataUtils.intSetToString(this.hasReceiveRewardIds);
   }

   public void loadAddUpGotRewards(String data) {
      this.addUpGotRewards = DataUtils.stringToIntSet(data);
   }

   public String saveAddUpGotRewards() {
      return DataUtils.intSetToString(this.addUpGotRewards);
   }

   public void loadFloorDraw(String data) {
      this.floorDrawMap = DataUtils.stringToInt_intMap(data);
   }

   public String saveFloorDraw() {
      return DataUtils.int_intMapToString(this.floorDrawMap);
   }

   public void loadRewardCountMap(String data) {
      this.rewardCountMap = DataUtils.stringToInt_intMap(data);
   }

   public String saveRewardCountMap() {
      return DataUtils.int_intMapToString(this.rewardCountMap);
   }

   public void loadHadRewards(String data) {
      this.hadRewards = DataUtils.stringToIntList(data);
   }

   public String saveHadRewards() {
      return DataUtils.intListToString(this.hadRewards);
   }

   public void loadRecords(String data) {
      List<String> stringList = new ArrayList();
      if (!StringUtils.isBlank(data)) {
         String[] split = data.split(";");
         if (null != split && split.length > 0) {
            for(String s : split) {
               stringList.add(s);
            }

            this.recordList = stringList;
         }
      }
   }

   public String saveRecords() {
      StringBuilder stringBuilder = new StringBuilder();
      if (null != this.recordList && this.recordList.size() > 0) {
         for(String s : this.recordList) {
            stringBuilder.append(s + ";");
         }

         if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         }

         return stringBuilder.toString();
      } else {
         return stringBuilder.toString();
      }
   }

   public void loadItemBuyTimes(String data) {
      this.itemBuyTimes = DataUtils.stringToInt_intMap(data);
   }

   public String saveItemBuyTimes() {
      return DataUtils.int_intMapToString(this.itemBuyTimes);
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

   public void addRecordInfo(RecordInfo recordInfo) {
      if (null != recordInfo && null != recordInfo.getResourceModel()) {
         ResourceModel resourceModel = recordInfo.getResourceModel();
         String record = recordInfo.getCreateTime() + ":" + resourceModel.getType() + "_" + resourceModel.getId() + "_" + resourceModel.getValue();
         this.recordList.add(record);
      }
   }

   public static class RecordInfo {
      private int createTime;
      private ResourceModel resourceModel;

      public RecordInfo(int createTime, ResourceModel resourceModel) {
         this.createTime = createTime;
         this.resourceModel = resourceModel;
      }

      public int getCreateTime() {
         return this.createTime;
      }

      public void setCreateTime(int createTime) {
         this.createTime = createTime;
      }

      public ResourceModel getResourceModel() {
         return this.resourceModel;
      }

      public void setResourceModel(ResourceModel resourceModel) {
         this.resourceModel = resourceModel;
      }
   }
}
