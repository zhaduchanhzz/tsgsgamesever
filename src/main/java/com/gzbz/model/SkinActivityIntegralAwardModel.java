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
   file = "skinActivityIntegralAward"
)
public class SkinActivityIntegralAwardModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "activityId",
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      columnName = "bonus",
      comment = "积分统计"
   )
   private int bonus;
   @ModelColumnAnno(
      columnName = "reward",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "目标奖励"
   )
   private List<ResourceModel> reward = new ArrayList();

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

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<SkinActivityIntegralAwardModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         SkinActivityIntegralAwardModel model = (SkinActivityIntegralAwardModel)entry.getValue();
         if (tempMap.containsKey(model.getActivityId())) {
            ((List)tempMap.get(model.getActivityId())).add(model);
         } else {
            List<SkinActivityIntegralAwardModel> list = new ArrayList();
            list.add(model);
            tempMap.put(model.getActivityId(), list);
         }
      }

      pool.putMap("customSkinActivityIntegralAward", tempMap);
   }
}
