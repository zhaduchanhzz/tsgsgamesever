package com.gzbz.db;

import com.gzbz.db.baseDao.AddUpAndConBaseDao;
import com.gzbz.db.bean.ChineseNewYearCityBuildData;
import com.gzbz.db.bean.ChineseNewYearCityChallengeData;
import com.gzbz.db.bean.ChineseNewYearMonopolyCityEventData;
import com.gzbz.model.ChineseNewYearSiteModel;
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

@DBTableAnno(
   name = "tb_activity_chinese_new_year",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ChineseNewYearDao extends AddUpAndConBaseDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
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
      columnName = "signGotRewards",
      comment = "签到已领取奖励id",
      columnType = "TEXT",
      loadFun = "loadSignGotRewards",
      saveFun = "saveSignGotRewards"
   )
   public Set<Integer> signGotRewards = new HashSet();
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
   public Map<Integer, ChineseNewYearCityBuildData> building = new HashMap();
   @DBColumnAnno(
      comment = "城主阁累计积分"
   )
   public int point;
   @DBColumnAnno(
      comment = "城主阁当前事件",
      loadFun = "loadEvent",
      saveFun = "saveEvent"
   )
   public ChineseNewYearMonopolyCityEventData event = new ChineseNewYearMonopolyCityEventData();
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
      columnName = "onHookSecond",
      comment = "累计挂机时间(秒)"
   )
   public long onHookSecond;
   @DBColumnAnno(
      columnName = "lastCalTime",
      comment = "最近一次计算挂机时间(毫秒数)"
   )
   public long lastCalTime;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "城主阁玩家当前挑战建筑",
      loadFun = "loadChallenge",
      saveFun = "saveChallenge"
   )
   public ChineseNewYearCityChallengeData challengeData = null;

   public void loadShopAddUpGotRechargeNum(String data) {
      this.shopAddUpGotRechargeNum = DataUtils.stringToIntSet(data);
   }

   public String saveShopAddUpGotRechargeNum() {
      return DataUtils.intSetToString(this.shopAddUpGotRechargeNum);
   }

   public void loadSignGotRewards(String data) {
      this.signGotRewards = DataUtils.stringToIntSet(data);
   }

   public String saveSignGotRewards() {
      return DataUtils.intSetToString(this.signGotRewards);
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

   public void loadHadRewards(String data) {
      this.hadRewards = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveHadRewards() {
      return JsonUtil.beanToJson(this.hadRewards);
   }

   public void loadBuilding(String data) {
      this.building = JsonUtil.jsonToMap(data, Integer.class, ChineseNewYearCityBuildData.class);
   }

   public String saveBuilding() {
      return JsonUtil.beanToJson(this.building);
   }

   public void loadEvent(String data) {
      this.event = (ChineseNewYearMonopolyCityEventData)JsonUtil.jsonToBean(data, ChineseNewYearMonopolyCityEventData.class);
   }

   public String saveEvent() {
      return JsonUtil.beanToJson(this.event);
   }

   public void addRecordInfo(RecordInfo recordInfo) {
      if (null != recordInfo && null != recordInfo.getResourceModel()) {
         ResourceModel resourceModel = recordInfo.getResourceModel();
         String record = recordInfo.getCreateTime() + ":" + resourceModel.getType() + "_" + resourceModel.getId() + "_" + resourceModel.getValue();
         this.recordList.add(record);
      }
   }

   public ChineseNewYearCityBuildData getBuildData(int buildId) {
      ConcurrentHashMap<Integer, ChineseNewYearSiteModel> siteModelMap = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customFristYearSite", buildId);
      if (null != siteModelMap && !siteModelMap.isEmpty()) {
         ChineseNewYearCityBuildData chineseNewYearCityBuildData = (ChineseNewYearCityBuildData)this.building.get(buildId);
         if (null == chineseNewYearCityBuildData) {
            chineseNewYearCityBuildData = new ChineseNewYearCityBuildData();
            chineseNewYearCityBuildData.buildId = buildId;
            chineseNewYearCityBuildData.lv = 0;
            chineseNewYearCityBuildData.rewardLv.clear();
            chineseNewYearCityBuildData.dailyChallengeNum = 0;
            chineseNewYearCityBuildData.subjectList.clear();
            this.building.put(buildId, chineseNewYearCityBuildData);
            this.updateOp();
         }

         return chineseNewYearCityBuildData;
      } else {
         return null;
      }
   }

   public void loadMakeUpReceiveIds(String data) {
      this.makeUpReceiveIds = DataUtils.stringToIntSet(data);
   }

   public String saveMakeUpReceiveIds() {
      return DataUtils.intSetToString(this.makeUpReceiveIds);
   }

   public void loadChallenge(String data) {
      this.challengeData = (ChineseNewYearCityChallengeData)JsonUtil.jsonToBean(data, ChineseNewYearCityChallengeData.class);
   }

   public String saveChallenge() {
      return this.challengeData == null ? "" : JsonUtil.beanToJson(this.challengeData);
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
