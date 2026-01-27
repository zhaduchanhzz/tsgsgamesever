package com.gzbz.db;

import com.gzbz.db.bean.MonthlyCardData;
import com.gzbz.db.bean.MonthlyFundData;
import com.gzbz.util.TempUtil;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DataUtils;
import misc.DateUtil;
import misc.JsonUtil;
import misc.MiscUtil;

@DBTableAnno(
   name = "tb_player_recharge",
   resultType = 0,
   selectKey = {"playerId"}
)
public class PlayerRechargeDao extends DBDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnName = "monthlyFund",
      columnType = "TEXT",
      comment = "月基金信息",
      loadFun = "loadMonthlyFund",
      saveFun = "saveMonthlyFund"
   )
   public Map<Integer, MonthlyFundData> monthlyFund = new HashMap();
   @DBColumnAnno(
      columnName = "monthlyCard",
      columnType = "TEXT",
      comment = "月卡信息",
      loadFun = "loadMonthlyCard",
      saveFun = "saveMonthlyCard"
   )
   public Map<Integer, MonthlyCardData> monthlyCard = new HashMap();
   @DBColumnAnno(
      columnName = "hasGrowFund",
      comment = "成长基金-98"
   )
   public boolean hasGrowFund = false;
   @DBColumnAnno(
      columnName = "firstRechargeReward",
      comment = "已领首充奖励,类型id->最后领取天数+达标时间",
      loadFun = "loadFirstRechargeReward",
      saveFun = "saveFirstRechargeReward"
   )
   public Map<Integer, Long> firstRechargeReward = new HashMap();
   @DBColumnAnno(
      columnName = "firstRechargeClose",
      comment = "首充是否已关闭"
   )
   public boolean firstRechargeClose = false;
   @DBColumnAnno(
      columnName = "valueRechargeReward",
      comment = "超值首充已领取最后天数,value前32位是天数,后32位是激活时间",
      loadFun = "loadValueRechargeReward",
      saveFun = "saveValueRechargeReward"
   )
   public Map<Integer, Long> valueRechargeReward = new HashMap();
   @DBColumnAnno(
      comment = "绝版特惠礼包, list第一位是激活时间，后面是领取的奖励",
      loadFun = "loadKrValueRechargeReward",
      saveFun = "saveKrValueRechargeReward"
   )
   public Map<Integer, List<Integer>> krValueRechargeReward = new HashMap();
   @DBColumnAnno(
      columnName = "dailyRecharge",
      comment = "每日充值金额"
   )
   public int dailyRecharge = 0;
   @DBColumnAnno(
      columnName = "totalRecharge",
      comment = "累计充值金额"
   )
   public int totalRecharge = 0;
   @DBColumnAnno(
      columnName = "totalRechargeDay",
      comment = "累计充值天数,前32位是总天数,后32位是最后增加时间"
   )
   public long totalRechargeDay = 0L;
   @DBColumnAnno(
      columnName = "dailyFirstRechargeReward",
      comment = "每日首充已领奖"
   )
   public int dailyFirstRechargeReward = 0;
   @DBColumnAnno(
      columnName = "firstRechargeTime",
      comment = "首充时间"
   )
   public long firstRechargeTime = 0L;
   @DBColumnAnno(
      columnName = "monthlyRecharge",
      comment = "当月充值金额"
   )
   public int monthlyRecharge = 0;
   @DBColumnAnno(
      columnName = "totalRechargeGold",
      comment = "累计充值获得元宝"
   )
   public long totalRechargeGold = 0L;
   @DBColumnAnno(
      columnName = "hasGrowFund328",
      comment = "成长基金-328"
   )
   public boolean hasGrowFund328 = false;
   @DBColumnAnno(
      columnName = "hasGrowFund648",
      comment = "成长基金-648"
   )
   public boolean hasGrowFund648 = false;
   @DBColumnAnno(
      columnName = "totalCoin",
      comment = "累充三国币"
   )
   public int totalCoin;
   @DBColumnAnno(
      columnName = "coinTotalRecharge",
      comment = "累充三国币(三国币累充福利功能开启后开始算)"
   )
   public int coinTotalRecharge;
   @DBColumnAnno(
      columnName = "coinTotalRewards",
      comment = "已领三国币累充奖励",
      loadFun = "loadCoinTotalRewards",
      saveFun = "saveCoinTotalRewards"
   )
   public Set<Integer> coinTotalRewards = new HashSet();

   public void loadMonthlyFund(String data) {
      this.monthlyFund = JsonUtil.jsonToMap(data, Integer.class, MonthlyFundData.class);
   }

   public String saveMonthlyFund() {
      return JsonUtil.beanToJson(this.monthlyFund);
   }

   public void loadMonthlyCard(String data) {
      this.monthlyCard = JsonUtil.jsonToMap(data, Integer.class, MonthlyCardData.class);
   }

   public String saveMonthlyCard() {
      return JsonUtil.beanToJson(this.monthlyCard);
   }

   public void loadFirstRechargeReward(String columnData) {
      this.firstRechargeReward = JsonUtil.jsonToMap(columnData, Integer.class, Long.class);
   }

   public String saveFirstRechargeReward() {
      return JsonUtil.beanToJson(this.firstRechargeReward);
   }

   public void loadValueRechargeReward(String data) {
      this.valueRechargeReward = JsonUtil.jsonToMap(data, Integer.class, Long.class);
   }

   public String saveValueRechargeReward() {
      return JsonUtil.beanToJson(this.valueRechargeReward);
   }

   public void loadKrValueRechargeReward(String data) {
      this.krValueRechargeReward = TempUtil.strToIntMapList(data);
   }

   public String saveKrValueRechargeReward() {
      return JsonUtil.beanToJson(this.krValueRechargeReward);
   }

   public void addDailyFirstRechargeReward(int id) {
      this.dailyFirstRechargeReward = MiscUtil.setBit(this.dailyFirstRechargeReward, id);
   }

   public boolean isGotDailyFirstRechargeReward(int id) {
      return MiscUtil.existBit((long)this.dailyFirstRechargeReward, id);
   }

   public Set<Integer> getGotDailyFirstRechargeReward() {
      return MiscUtil.getBitPos((long)this.dailyFirstRechargeReward);
   }

   public void addTotalRechargeDay() {
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());
      this.totalRechargeDay = MiscUtil.comboInteger(this.getTotalRechargeDay() + 1, curTime);
   }

   public int getTotalRechargeDay() {
      return MiscUtil.getHiParam(this.totalRechargeDay);
   }

   public int getLastTotalRechargeDayTime() {
      return MiscUtil.getLowParam(this.totalRechargeDay);
   }

   public void loadCoinTotalRewards(String data) {
      this.coinTotalRewards = DataUtils.stringToIntSet(data);
   }

   public String saveCoinTotalRewards() {
      return DataUtils.intSetToString(this.coinTotalRewards);
   }
}
