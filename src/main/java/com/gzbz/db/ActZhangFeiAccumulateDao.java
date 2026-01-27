package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

@DBTableAnno(
   name = "tb_activity_zhang_fei_accumulate",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ActZhangFeiAccumulateDao extends DBDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnName = "nowRechargeMoney",
      comment = "当前充值金额,当充值解锁高挡位时需要重置,每日刷新也会重置"
   )
   public int nowRechargeMoney;
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
      columnName = "resetTime",
      comment = "每日重置时间"
   )
   public long resetTime;

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
}
