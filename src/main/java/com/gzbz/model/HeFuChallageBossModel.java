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
   file = "HefuChallageBoss"
)
public class HeFuChallageBossModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "伤害下限"
   )
   private long minDamage;
   @ModelColumnAnno(
      comment = "伤害上限"
   )
   private long maxDamage;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "奖励"
   )
   private List<ResourceModel> reward = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<HeFuChallageBossModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         HeFuChallageBossModel model = (HeFuChallageBossModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(model.getActivityId(), (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customHefuChallageBoss", tempHashMap);
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

   public long getMinDamage() {
      return this.minDamage;
   }

   public void setMinDamage(long minDamage) {
      this.checkModify();
      this.minDamage = minDamage;
   }

   public long getMaxDamage() {
      return this.maxDamage;
   }

   public void setMaxDamage(long maxDamage) {
      this.checkModify();
      this.maxDamage = maxDamage;
   }

   public List<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(List<ResourceModel> reward) {
      this.checkModify();
      this.reward = reward;
   }
}
