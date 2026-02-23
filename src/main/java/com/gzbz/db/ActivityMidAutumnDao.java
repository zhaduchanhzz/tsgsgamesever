package com.gzbz.db;

import com.gzbz.db.baseDao.AddUpAndConBaseDao;
import com.gzbz.model.fun.ResourceModel;
import db.DBColumnAnno;
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
   name = "tb_activity_mid_autumn",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ActivityMidAutumnDao extends AddUpAndConBaseDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "今日已制作月饼次数"
   )
   public int makeCount;
   @DBColumnAnno(
      comment = "总月饼积分"
   )
   public int totalPoint;
   @DBColumnAnno(
      comment = "已展示剧情的地点id",
      loadFun = "loadFinishShow",
      saveFun = "saveFinishShow"
   )
   public Set<Integer> finishShow = new HashSet();
   @DBColumnAnno(
      comment = "已领奖励的地点列表",
      loadFun = "loadGotSite",
      saveFun = "saveGotSite"
   )
   public Set<Integer> gotSite = new HashSet();
   @DBColumnAnno(
      comment = "花灯祈福当前层数"
   )
   public int tier = 1;
   @DBColumnAnno(
      comment = "花灯祈福心仪奖励"
   )
   public int enjoy;
   @DBColumnAnno(
      comment = "祈福次数"
   )
   public int prayNum;
   @DBColumnAnno(
      comment = "当前层普通奖励id随机组",
      loadFun = "loadRewardIds",
      saveFun = "saveRewardIds"
   )
   public Set<Integer> rewardIds = new HashSet();
   @DBColumnAnno(
      comment = "是否首次参加宴会"
   )
   public boolean firstBanquet = true;
   @DBColumnAnno(
      comment = "是否已领取目标数量任务奖励(头像框)"
   )
   public boolean gotWalk = false;
   @DBColumnAnno(
      comment = "pos->rewardId",
      loadFun = "loadPosReward",
      saveFun = "savePosReward"
   )
   public List<Integer> posReward = new ArrayList();
   @DBColumnAnno(
      columnName = "signReceiveIds",
      comment = "已领取签到奖励id",
      columnType = "TEXT",
      loadFun = "loadSignReceiveIds",
      saveFun = "saveSignReceiveIds"
   )
   public Set<Integer> signReceiveIds = new HashSet();
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

   public void loadGotSite(String data) {
      this.gotSite = JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveGotSite() {
      return JsonUtil.beanToJson(this.gotSite);
   }

   public void loadFinishShow(String data) {
      this.finishShow = JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveFinishShow() {
      return JsonUtil.beanToJson(this.finishShow);
   }

   public void loadRewardIds(String data) {
      this.rewardIds = JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveRewardIds() {
      return JsonUtil.beanToJson(this.rewardIds);
   }

   public void loadPosReward(String data) {
      this.posReward = JsonUtil.jsonToList(data, Integer.class);
   }

   public String savePosReward() {
      return JsonUtil.beanToJson(this.posReward);
   }

   public void loadSignReceiveIds(String data) {
      this.signReceiveIds = DataUtils.stringToIntSet(data);
   }

   public String saveSignReceiveIds() {
      return DataUtils.intSetToString(this.signReceiveIds);
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
