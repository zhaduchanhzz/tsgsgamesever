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
   file = "actHeroCallTask"
)
public class ActHeroCallTaskModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "任务id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "日期组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "日期组末尾"
   )
   private int dateEnd;
   @ModelColumnAnno(
      comment = "阶段起始天数"
   )
   private int stageStart;
   @ModelColumnAnno(
      comment = "阶段结尾天数"
   )
   private int stageEnd;
   @ModelColumnAnno(
      comment = "阶段数"
   )
   private int stage;
   @ModelColumnAnno(
      comment = "充值数额"
   )
   private int rechargeNum;
   @ModelColumnAnno(
      comment = "任务标题"
   )
   private String taskName;
   @ModelColumnAnno(
      comment = "任务描述"
   )
   private String taskDesc;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, ActHeroCallTaskModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ActHeroCallTaskModel model = (ActHeroCallTaskModel)entry.getValue();
         ((TreeMap)tempMap.computeIfAbsent(model.getActivityId(), (v) -> new TreeMap())).put(model.getId(), model);
      }

      pool.putMap("curstomActHeroCallTask", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.activityId = activityId;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public void setDateStart(int dateStart) {
      this.dateStart = dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }

   public void setDateEnd(int dateEnd) {
      this.dateEnd = dateEnd;
   }

   public int getStageStart() {
      return this.stageStart;
   }

   public void setStageStart(int stageStart) {
      this.stageStart = stageStart;
   }

   public int getStageEnd() {
      return this.stageEnd;
   }

   public void setStageEnd(int stageEnd) {
      this.stageEnd = stageEnd;
   }

   public int getStage() {
      return this.stage;
   }

   public void setStage(int stage) {
      this.stage = stage;
   }

   public int getRechargeNum() {
      return this.rechargeNum;
   }

   public void setRechargeNum(int rechargeNum) {
      this.rechargeNum = rechargeNum;
   }

   public String getTaskName() {
      return this.taskName;
   }

   public void setTaskName(String taskName) {
      this.taskName = taskName;
   }

   public String getTaskDesc() {
      return this.taskDesc;
   }

   public void setTaskDesc(String taskDesc) {
      this.taskDesc = taskDesc;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.rewards = rewards;
   }
}
