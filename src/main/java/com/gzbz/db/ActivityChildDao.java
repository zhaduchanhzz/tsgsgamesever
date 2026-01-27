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
   name = "tb_act_child",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ActivityChildDao extends AddUpAndConBaseDao {
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
      comment = "游戏开始时间戳"
   )
   public int gameStartTime;
   @DBColumnAnno(
      comment = "当前局积分"
   )
   public int curPoint;
   @DBColumnAnno(
      comment = "累计积分"
   )
   public int point;
   @DBColumnAnno(
      comment = "今日购买粽横券次数"
   )
   public int ticketBuyTimes;
   @DBColumnAnno(
      columnName = "giveTicketDays",
      comment = "已赠送粽横券道具的天数",
      columnType = "TEXT",
      loadFun = "loadGiveArrowDays",
      saveFun = "saveGiveArrowDays"
   )
   public Set<Integer> giveTicketDays = new HashSet();
   @DBColumnAnno(
      columnName = "gameObjectUniqueIds",
      comment = "点粽子游戏生成的掉落物列表",
      columnType = "TEXT",
      loadFun = "loadGameObjectUniqueIds",
      saveFun = "saveGameObjectUniqueIds"
   )
   public Map<Integer, Integer> gameObjectUniqueIds = new HashMap();
   @DBColumnAnno(
      columnName = "gameRoundResult",
      comment = "点粽子当前局游戏结算",
      columnType = "TEXT",
      loadFun = "loadGameRoundResult",
      saveFun = "saveGameRoundResult"
   )
   public Map<Integer, Integer> gameRoundResult = new HashMap();
   @DBColumnAnno(
      comment = "阶段"
   )
   public int lotteryStage;
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
      comment = "抽奖记录",
      columnType = "LONGTEXT",
      loadFun = "loadRecords",
      saveFun = "saveRecords"
   )
   public List<String> recordList = new ArrayList();

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

   public void loadGiveArrowDays(String data) {
      this.giveTicketDays = DataUtils.stringToIntSet(data);
   }

   public String saveGiveArrowDays() {
      return DataUtils.intSetToString(this.giveTicketDays);
   }

   public void loadGameObjectUniqueIds(String data) {
      this.gameObjectUniqueIds = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveGameObjectUniqueIds() {
      return JsonUtil.beanToJson(this.gameObjectUniqueIds);
   }

   public void loadGameRoundResult(String data) {
      this.gameRoundResult = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveGameRoundResult() {
      return JsonUtil.beanToJson(this.gameRoundResult);
   }

   public void loadEggs(String data) {
      this.eggs = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveEggs() {
      return JsonUtil.beanToJson(this.eggs);
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

   public void loadTakedLuck(String data) {
      this.takedLuck = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveTakedLuck() {
      return JsonUtil.beanToJson(this.takedLuck);
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
