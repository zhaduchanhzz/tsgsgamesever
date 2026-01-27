package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "eventHeroBonusReward"
)
public class EventHeroBonusRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id",
      columnName = "activityID"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "积分"
   )
   private int bonus;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "，目标奖励"
   )
   private List<ResourceModel> reward = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<EventHeroBonusRewardModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         EventHeroBonusRewardModel model = (EventHeroBonusRewardModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.getActivityId(), (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customEventHeroBonusReward", tempHashMap);
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

   public int getBonus() {
      return this.bonus;
   }

   public void setBonus(int bonus) {
      this.checkModify();
      this.bonus = bonus;
   }

   public List<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(List<ResourceModel> reward) {
      this.checkModify();
      this.reward = reward;
   }
}
