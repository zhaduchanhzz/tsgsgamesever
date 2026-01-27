package com.gzbz.db;

import com.gzbz.db.bean.SplendidCityBuildData;
import com.gzbz.db.bean.SplendidCityEventData;
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

@DBTableAnno(
   name = "tb_splendid_city"
)
public class ActivitySplendidCityDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      comment = "阶段"
   )
   public int state;
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
      columnType = "TEXT",
      comment = "建筑信息",
      loadFun = "loadBuilding",
      saveFun = "saveBuilding"
   )
   public Map<Integer, SplendidCityBuildData> building = new HashMap();
   @DBColumnAnno(
      comment = "城主阁累计积分"
   )
   public int point;
   @DBColumnAnno(
      comment = "城主阁当前事件",
      loadFun = "loadEvent",
      saveFun = "saveEvent"
   )
   public SplendidCityEventData event = new SplendidCityEventData();
   @DBColumnAnno(
      comment = "阶段"
   )
   public int activityState;
   @DBColumnAnno(
      comment = "心仪奖励",
      skipMerge = true
   )
   public int fancyRewardId;
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "金蛋",
      loadFun = "loadEggs",
      saveFun = "saveEggs"
   )
   public Map<Integer, Integer> eggs = new HashMap();
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
      columnName = "signGotRewards",
      comment = "签到已领取奖励id",
      columnType = "TEXT",
      loadFun = "loadSignGotRewards",
      saveFun = "saveSignGotRewards"
   )
   public Set<Integer> signGotRewards = new HashSet();
   @DBColumnAnno(
      columnName = "shopAddUpGotRewards",
      comment = "直购商城累充已领取奖励id",
      columnType = "TEXT",
      loadFun = "loadShopAddUpGotRewards",
      saveFun = "saveShopAddUpGotRewards"
   )
   public Set<Integer> shopAddUpGotRewards = new HashSet();
   @DBColumnAnno(
      comment = "每日充值金额"
   )
   public int dailyRecharge;
   @DBColumnAnno(
      comment = "抽奖记录",
      columnType = "LONGTEXT",
      loadFun = "loadRecords",
      saveFun = "saveRecords"
   )
   public List<String> recordList = new ArrayList();

   public void loadBuilding(String data) {
      this.building = JsonUtil.jsonToMap(data, Integer.class, SplendidCityBuildData.class);
   }

   public String saveBuilding() {
      return JsonUtil.beanToJson(this.building);
   }

   public void loadAddUpGotRewards(String data) {
      this.addUpGotRewards = DataUtils.stringToIntSet(data);
   }

   public String saveAddUpGotRewards() {
      return DataUtils.intSetToString(this.addUpGotRewards);
   }

   public void loadSignGotRewards(String data) {
      this.signGotRewards = DataUtils.stringToIntSet(data);
   }

   public String saveSignGotRewards() {
      return DataUtils.intSetToString(this.signGotRewards);
   }

   public void loadShopAddUpGotRewards(String data) {
      this.shopAddUpGotRewards = DataUtils.stringToIntSet(data);
   }

   public String saveShopAddUpGotRewards() {
      return DataUtils.intSetToString(this.shopAddUpGotRewards);
   }

   public void loadEggs(String data) {
      this.eggs = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveEggs() {
      return JsonUtil.beanToJson(this.eggs);
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

   public void loadEvent(String data) {
      this.event = (SplendidCityEventData)JsonUtil.jsonToBean(data, SplendidCityEventData.class);
   }

   public String saveEvent() {
      return JsonUtil.beanToJson(this.event);
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
