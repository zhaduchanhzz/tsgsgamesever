package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "SpringplantingTreesChange"
)
public class SpringPlantingModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id",
      columnName = "activityId"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "挑战类型",
      columnName = "changeType"
   )
   private int changeType;
   @ModelColumnAnno(
      comment = "轮数",
      columnName = "rounds"
   )
   private int rounds;
   @ModelColumnAnno(
      columnName = "roundsrewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "轮次奖励"
   )
   private List<ResourceModel> roundsRewards = new ArrayList();
   @ModelColumnAnno(
      comment = "需求数量",
      columnName = "needNum"
   )
   private int needNum;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, Map<Integer, TreeMap<Integer, SpringPlantingModel>>>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         SpringPlantingModel model = (SpringPlantingModel)entry.getValue();
         ((TreeMap)((Map)((Map)tempHashMap.computeIfAbsent(model.activityId, (v) -> new HashMap())).computeIfAbsent(model.changeType, (v) -> new HashMap())).computeIfAbsent(model.rounds, (v) -> new TreeMap())).put(model.id, model);
      }

      pool.putMap("customSpringplantingTreesChange", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public int getChangeType() {
      return this.changeType;
   }

   public void setChangeType(int changeType) {
      this.checkModify();
      this.changeType = changeType;
   }

   public int getRounds() {
      return this.rounds;
   }

   public void setRounds(int rounds) {
      this.checkModify();
      this.rounds = rounds;
   }

   public int getNeedNum() {
      return this.needNum;
   }

   public void setNeedNum(int needNum) {
      this.checkModify();
      this.needNum = needNum;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public List<ResourceModel> getRoundsRewards() {
      return this.roundsRewards;
   }

   public void setRoundsRewards(List<ResourceModel> roundsRewards) {
      this.checkModify();
      this.roundsRewards = roundsRewards;
   }
}
