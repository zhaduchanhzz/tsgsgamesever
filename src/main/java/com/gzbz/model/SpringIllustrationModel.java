package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "springlllustration"
)
public class SpringIllustrationModel extends BaseModel {
   @ModelColumnAnno(
      comment = "任务id",
      columnName = "taskID",
      isPrimaty = true
   )
   private int taskId;
   @ModelColumnAnno(
      comment = "活动id",
      columnName = "activityID"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "插图id",
      columnName = "BiglllustrationId"
   )
   private int bigIllustrationId;
   @ModelColumnAnno(
      comment = "格子数",
      columnName = "SquareNum"
   )
   private int squareNum;
   @ModelColumnAnno(
      comment = "第几天",
      columnName = "time"
   )
   private int time;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "解锁插图奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "兑换道具类型",
      columnName = "exchangeType"
   )
   private int exchangeType;
   @ModelColumnAnno(
      comment = "兑换道具id",
      columnName = "exchangeId"
   )
   private int exchangeId;
   @ModelColumnAnno(
      comment = "兑换道具数量",
      columnName = "exchangeNum"
   )
   private int exchangeNum;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, TreeMap<Integer, SpringIllustrationModel>>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         SpringIllustrationModel model = (SpringIllustrationModel)entry.getValue();
         ((TreeMap)((Map)tempHashMap.computeIfAbsent(model.activityId, (v) -> new ConcurrentHashMap())).computeIfAbsent(model.bigIllustrationId, (v) -> new TreeMap())).put(model.squareNum, model);
      }

      pool.putMap("cuistomSpringlllustration", tempHashMap);
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public int getBigIllustrationId() {
      return this.bigIllustrationId;
   }

   public void setBigIllustrationId(int bigIllustrationId) {
      this.checkModify();
      this.bigIllustrationId = bigIllustrationId;
   }

   public int getSquareNum() {
      return this.squareNum;
   }

   public void setSquareNum(int squareNum) {
      this.checkModify();
      this.squareNum = squareNum;
   }

   public int getTaskId() {
      return this.taskId;
   }

   public void setTaskId(int taskId) {
      this.checkModify();
      this.taskId = taskId;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getExchangeType() {
      return this.exchangeType;
   }

   public void setExchangeType(int exchangeType) {
      this.checkModify();
      this.exchangeType = exchangeType;
   }

   public int getExchangeId() {
      return this.exchangeId;
   }

   public void setExchangeId(int exchangeId) {
      this.checkModify();
      this.exchangeId = exchangeId;
   }

   public int getExchangeNum() {
      return this.exchangeNum;
   }

   public void setExchangeNum(int exchangeNum) {
      this.checkModify();
      this.exchangeNum = exchangeNum;
   }

   public int getTime() {
      return this.time;
   }

   public void setTime(int time) {
      this.checkModify();
      this.time = time;
   }
}
