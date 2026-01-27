package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_activity_come_back",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ActivityComeBackDao extends DBDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnName = "firstChargeReceiveIds",
      comment = "已领取的首充奖励id",
      columnType = "TEXT",
      loadFun = "loadFirstChargeReceiveIds",
      saveFun = "saveFirstChargeReceiveIds"
   )
   public Set<Integer> firstChargeReceiveIds = new HashSet();
   @DBColumnAnno(
      columnName = "chargeReturnReceiveIds",
      comment = "已领取充值返利奖励id",
      columnType = "TEXT",
      loadFun = "loadChargeReturnReceiveIds",
      saveFun = "saveChargeReturnReceiveIds"
   )
   public Set<Integer> chargeReturnReceiveIds = new HashSet();
   @DBColumnAnno(
      columnName = "signReceiveIds",
      comment = "已领取签到奖励id",
      columnType = "TEXT",
      loadFun = "loadSignReceiveIds",
      saveFun = "saveSignReceiveIds"
   )
   public Set<Integer> signReceiveIds = new HashSet();
   @DBColumnAnno(
      columnName = "power",
      comment = "活跃值"
   )
   public int power;
   @DBColumnAnno(
      columnName = "powerReceiveIds",
      comment = "已领取活跃值宝箱id",
      columnType = "TEXT",
      loadFun = "loadPowerReceiveIds",
      saveFun = "savePowerReceiveIds"
   )
   public Set<Integer> powerReceiveIds = new HashSet();
   @DBColumnAnno(
      columnName = "lastCalTime",
      comment = "最近一次计算登录时长的时间"
   )
   public long lastCalTime;
   @DBColumnAnno(
      columnName = "loginState",
      comment = "登录状态 1:已完成登录 0:未完成登录"
   )
   public int loginState;
   @DBColumnAnno(
      columnName = "actTotalOnlineTime",
      comment = "活动内累计在线时长(秒)"
   )
   public long actTotalOnlineTime;
   @DBColumnAnno(
      columnName = "tenDrawUseIds",
      comment = "已使用的十连抽id",
      columnType = "TEXT",
      loadFun = "loadTenDrawUseIds",
      saveFun = "saveTenDrawUseIds"
   )
   public Set<Integer> tenDrawUseIds = new HashSet();
   @DBColumnAnno(
      columnName = "returnDrawTimes",
      comment = "当前返利抽奖次数"
   )
   public int returnDrawTimes;
   @DBColumnAnno(
      columnName = "returnGoldRecord",
      comment = "活动期间获得的元宝记录 key:第n次 val:对应获得的元宝数量",
      columnType = "TEXT",
      loadFun = "loadReturnGoldRecord",
      saveFun = "saveReturnGoldRecord"
   )
   public Map<Integer, Integer> returnGoldRecord = new HashMap();

   public void loadFirstChargeReceiveIds(String data) {
      this.firstChargeReceiveIds = DataUtils.stringToIntSet(data);
   }

   public String saveFirstChargeReceiveIds() {
      return DataUtils.intSetToString(this.firstChargeReceiveIds);
   }

   public void loadChargeReturnReceiveIds(String data) {
      this.chargeReturnReceiveIds = DataUtils.stringToIntSet(data);
   }

   public String saveChargeReturnReceiveIds() {
      return DataUtils.intSetToString(this.chargeReturnReceiveIds);
   }

   public void loadSignReceiveIds(String data) {
      this.signReceiveIds = DataUtils.stringToIntSet(data);
   }

   public String saveSignReceiveIds() {
      return DataUtils.intSetToString(this.signReceiveIds);
   }

   public void loadPowerReceiveIds(String data) {
      this.powerReceiveIds = DataUtils.stringToIntSet(data);
   }

   public String savePowerReceiveIds() {
      return DataUtils.intSetToString(this.powerReceiveIds);
   }

   public void loadTenDrawUseIds(String data) {
      this.tenDrawUseIds = DataUtils.stringToIntSet(data);
   }

   public String saveTenDrawUseIds() {
      return DataUtils.intSetToString(this.tenDrawUseIds);
   }

   public void loadReturnGoldRecord(String str) {
      this.returnGoldRecord = DataUtils.stringToInt_intMap(str);
   }

   public String saveReturnGoldRecord() {
      return DataUtils.int_intMapToString(this.returnGoldRecord);
   }
}
