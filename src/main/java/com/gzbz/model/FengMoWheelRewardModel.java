package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "fengmoWheelReward"
)
public class FengMoWheelRewardModel extends BaseModel {
   @ModelColumnAnno(
      comment = "id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "抽取次数"
   )
   private int drawTime;
   @ModelColumnAnno(
      comment = "次数上限"
   )
   private int maxTime;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "宝箱奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2
   )
   private List<ResourceModel> boxreward = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, FengMoWheelRewardModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         FengMoWheelRewardModel model = (FengMoWheelRewardModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.getActivityId(), (v) -> new HashMap())).put(model.getDrawTime(), model);
      }

      pool.putMap("customFengmoWheelReward", tempHashMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getDrawTime() {
      return this.drawTime;
   }

   public void setDrawTime(int drawTime) {
      this.checkModify();
      this.drawTime = drawTime;
   }

   public int getMaxTime() {
      return this.maxTime;
   }

   public void setMaxTime(int maxTime) {
      this.checkModify();
      this.maxTime = maxTime;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public List<ResourceModel> getBoxreward() {
      return this.boxreward;
   }

   public void setBoxreward(List<ResourceModel> boxreward) {
      this.checkModify();
      this.boxreward = boxreward;
   }
}
