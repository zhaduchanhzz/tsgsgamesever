package com.gzbz.db;

import com.gzbz.db.baseDao.AddUpAndConBaseDao;
import com.gzbz.db.bean.FirstYearCityBuildData;
import com.gzbz.db.bean.FirstYearCityChallengeData;
import com.gzbz.db.bean.FirstYearCityEventData;
import com.gzbz.db.bean.TaskGroupData;
import com.gzbz.model.FirstYearSiteModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.spring.ApplicationContextProvider;
import db.DBColumnAnno;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import misc.DataUtils;
import misc.JsonUtil;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_activity_anniversary_celebration",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ActivityAnniversaryCelebrationDao extends AddUpAndConBaseDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "累计登录天数"
   )
   public int loginDay;
   @DBColumnAnno(
      comment = "可补签次数"
   )
   public int retroactiveNum;
   @DBColumnAnno(
      comment = "今日获得的补签次数"
   )
   public int todayGetRetroactiveNum;
   @DBColumnAnno(
      comment = "已领取的天数奖励",
      loadFun = "loadGotDay",
      saveFun = "saveGotDay",
      columnType = "VARCHAR"
   )
   public Set<Integer> gotDay = new HashSet();
   @DBColumnAnno(
      comment = "2022周年庆签秒杀商品id->已购数量",
      loadFun = "loadShopData",
      saveFun = "saveShopData",
      columnType = "VARCHAR"
   )
   public Map<Integer, Integer> shopData = new HashMap();
   @DBColumnAnno(
      comment = "生命值"
   )
   public int HP;
   @DBColumnAnno(
      comment = "已通关的最大关卡"
   )
   public int maxPass;
   @DBColumnAnno(
      comment = "已赠送的挑战次数HP总和"
   )
   public int totalDonateHP;
   @DBColumnAnno(
      comment = "已购买通关礼包的关卡",
      loadFun = "loadBuySet",
      saveFun = "saveBuySet",
      columnType = "VARCHAR"
   )
   public Set<Integer> buySet = new HashSet();
   @DBColumnAnno(
      comment = "已进行过对话的关卡",
      loadFun = "loadChatSet",
      saveFun = "saveChatSet",
      columnType = "VARCHAR"
   )
   public Set<Integer> chatSet = new HashSet();
   @DBColumnAnno(
      comment = "今日购买的HP次数"
   )
   public int buyHPTime;
   @DBColumnAnno(
      comment = "活动进行的天数（新创的号不经过每日0点不会增加每日免费生命值，要设置个字段去验证推送主页的时候增加生命值）"
   )
   public int actDay;
   @DBColumnAnno(
      columnName = "shopAddUpGotRechargeNum",
      comment = "直购商城累充已领取奖励金额",
      columnType = "TEXT",
      loadFun = "loadShopAddUpGotRechargeNum",
      saveFun = "saveShopAddUpGotRechargeNum"
   )
   public Set<Integer> shopAddUpGotRechargeNum = new HashSet();
   @DBColumnAnno(
      comment = "每日充值金额"
   )
   public int dailyRecharge;
   @DBColumnAnno(
      comment = "祈愿抽奖总次数"
   )
   public int drawTime;
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
      comment = "抽奖记录",
      columnType = "LONGTEXT",
      loadFun = "loadRecords",
      saveFun = "saveRecords"
   )
   public List<String> recordList = new ArrayList();
   @DBColumnAnno(
      comment = "已领取奖励",
      columnType = "TEXT",
      loadFun = "loadHadRewards",
      saveFun = "saveHadRewards"
   )
   public List<Integer> hadRewards = new ArrayList();
   @DBColumnAnno(
      comment = "当前所在格子"
   )
   public int grid;
   @DBColumnAnno(
      comment = "随机骰子次数上限后剩余恢复时间"
   )
   public int diceMaxRecover;
   @DBColumnAnno(
      comment = "随机骰子恢复时间"
   )
   public int diceRecover;
   @DBColumnAnno(
      comment = "已购买黄金骰子次数"
   )
   public int buyGoldDiceNum;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "建筑信息",
      loadFun = "loadBuilding",
      saveFun = "saveBuilding"
   )
   public Map<Integer, FirstYearCityBuildData> building = new HashMap();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "城主阁玩家当前挑战建筑",
      loadFun = "loadChallenge",
      saveFun = "saveChallenge"
   )
   public FirstYearCityChallengeData challengeData = null;
   @DBColumnAnno(
      comment = "城主阁累计积分"
   )
   public int point;
   @DBColumnAnno(
      comment = "城主阁当前事件",
      loadFun = "loadEvent",
      saveFun = "saveEvent"
   )
   public FirstYearCityEventData event = new FirstYearCityEventData();
   @DBColumnAnno(
      columnName = "makeUpReceiveIds",
      comment = "组合宝物已领取奖励",
      columnType = "TEXT",
      loadFun = "loadMakeUpReceiveIds",
      saveFun = "saveMakeUpReceiveIds"
   )
   public Set<Integer> makeUpReceiveIds = new HashSet();
   @DBColumnAnno(
      comment = "繁荣度等级"
   )
   public int pointLv;
   @DBColumnAnno(
      columnName = "lastCalTime",
      comment = "最近一次计算挂机时间(毫秒数)"
   )
   public long lastCalTime;
   @DBColumnAnno(
      columnName = "loginState",
      comment = "登录状态 1:已完成登录 0:未完成登录"
   )
   public int loginState;
   @DBColumnAnno(
      columnName = "onHookSecond",
      comment = "累计挂机时间(秒)"
   )
   public long onHookSecond;
   @DBColumnAnno(
      columnName = "cumulativeSpend",
      comment = "累计消费元宝"
   )
   public int cumulativeSpend;
   @DBColumnAnno(
      columnName = "cumulativeStage",
      comment = "子活动阶段数"
   )
   public int cumulativeStage;
   @DBColumnAnno(
      columnName = "hadGotRewards",
      comment = "已领取奖励id",
      columnType = "TEXT",
      loadFun = "loadHadGotRewards",
      saveFun = "saveHadGotRewards"
   )
   public Set<Integer> hadGotRewards = new HashSet();
   @DBColumnAnno(
      comment = "琉璃宝鉴等级"
   )
   public int treasureLv;
   @DBColumnAnno(
      comment = "通行证任务数据",
      columnType = "LONGTEXT",
      loadFun = "loadTreasureTaskGroup",
      saveFun = "saveTreasureTaskGroup"
   )
   public Map<Integer, TaskGroupData> treasureTaskGroup = new HashMap();

   public void loadHadGotRewards(String data) {
      this.hadGotRewards = DataUtils.stringToIntSet(data);
   }

   public String saveHadGotRewards() {
      return DataUtils.intSetToString(this.hadGotRewards);
   }

   public FirstYearCityBuildData getBuildData(int buildId) {
      ConcurrentHashMap<Integer, FirstYearSiteModel> siteModelMap = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customFristYearSite", buildId);
      if (null != siteModelMap && !siteModelMap.isEmpty()) {
         FirstYearCityBuildData firstYearCityBuildData = (FirstYearCityBuildData)this.building.get(buildId);
         if (null == firstYearCityBuildData) {
            firstYearCityBuildData = new FirstYearCityBuildData();
            firstYearCityBuildData.buildId = buildId;
            firstYearCityBuildData.lv = 0;
            firstYearCityBuildData.rewardLv.clear();
            firstYearCityBuildData.dailyChallengeNum = 0;
            firstYearCityBuildData.subjectList.clear();
            this.building.put(buildId, firstYearCityBuildData);
            this.updateOp();
         }

         return firstYearCityBuildData;
      } else {
         return null;
      }
   }

   public void loadGotDay(String data) {
      this.gotDay = DataUtils.stringToIntSet(data);
   }

   public String saveGotDay() {
      return DataUtils.intSetToString(this.gotDay);
   }

   public void loadShopData(String data) {
      this.shopData = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveShopData() {
      return JsonUtil.beanToJson(this.shopData);
   }

   public void loadBuySet(String data) {
      this.buySet = DataUtils.stringToIntSet(data);
   }

   public String saveBuySet() {
      return DataUtils.intSetToString(this.buySet);
   }

   public void loadChatSet(String data) {
      this.chatSet = DataUtils.stringToIntSet(data);
   }

   public String saveChatSet() {
      return DataUtils.intSetToString(this.chatSet);
   }

   public void loadShopAddUpGotRechargeNum(String data) {
      this.shopAddUpGotRechargeNum = DataUtils.stringToIntSet(data);
   }

   public String saveShopAddUpGotRechargeNum() {
      return DataUtils.intSetToString(this.shopAddUpGotRechargeNum);
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
      this.recordList = JsonUtil.jsonToList(data, String.class);
   }

   public String saveRecords() {
      return JsonUtil.beanToJson(this.recordList);
   }

   public void loadHadRewards(String data) {
      this.hadRewards = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveHadRewards() {
      return JsonUtil.beanToJson(this.hadRewards);
   }

   public void addRecordInfo(RecordInfo recordInfo) {
      if (null != recordInfo && null != recordInfo.getResourceModel()) {
         ResourceModel resourceModel = recordInfo.getResourceModel();
         String record = recordInfo.getCreateTime() + ":" + resourceModel.getType() + "_" + resourceModel.getId() + "_" + resourceModel.getValue();
         this.recordList.add(record);
      }
   }

   public void loadBuilding(String data) {
      this.building = JsonUtil.jsonToMap(data, Integer.class, FirstYearCityBuildData.class);
   }

   public String saveBuilding() {
      return JsonUtil.beanToJson(this.building);
   }

   public void loadChallenge(String data) {
      this.challengeData = (FirstYearCityChallengeData)JsonUtil.jsonToBean(data, FirstYearCityChallengeData.class);
   }

   public String saveChallenge() {
      return this.challengeData == null ? "" : JsonUtil.beanToJson(this.challengeData);
   }

   public void loadEvent(String data) {
      this.event = (FirstYearCityEventData)JsonUtil.jsonToBean(data, FirstYearCityEventData.class);
   }

   public String saveEvent() {
      return JsonUtil.beanToJson(this.event);
   }

   public void loadMakeUpReceiveIds(String data) {
      this.makeUpReceiveIds = DataUtils.stringToIntSet(data);
   }

   public String saveMakeUpReceiveIds() {
      return DataUtils.intSetToString(this.makeUpReceiveIds);
   }

   public void loadTreasureTaskGroup(String data) {
      this.treasureTaskGroup = new HashMap();
      if (!StringUtils.isEmpty(data)) {
         String[] split = data.split("\\|");

         for(String str : split) {
            String[] arr = str.split("_");
            TaskGroupData taskGroupData = new TaskGroupData(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
            this.treasureTaskGroup.put(taskGroupData.group, taskGroupData);
         }
      }

   }

   public String saveTreasureTaskGroup() {
      StringBuilder stringBuilder = new StringBuilder();

      for(TaskGroupData taskGroupData : this.treasureTaskGroup.values()) {
         stringBuilder.append(taskGroupData.group).append("_").append(taskGroupData.end).append("|");
      }

      if (stringBuilder.length() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
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
