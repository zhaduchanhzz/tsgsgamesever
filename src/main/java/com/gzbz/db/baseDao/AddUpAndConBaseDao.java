package com.gzbz.db.baseDao;

import db.DBColumnAnno;
import db.DBDao;
import java.util.HashSet;
import java.util.Set;
import misc.DataUtils;

public class AddUpAndConBaseDao extends DBDao {
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

   public void loadAddUpGotRewards(String data) {
      this.addUpGotRewards = DataUtils.stringToIntSet(data);
   }

   public String saveAddUpGotRewards() {
      return DataUtils.intSetToString(this.addUpGotRewards);
   }

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
}
