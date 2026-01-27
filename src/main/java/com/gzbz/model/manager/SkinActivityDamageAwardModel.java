package com.gzbz.model.manager;

import com.gzbz.model.fun.ResourceModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "skinActivityDamageAward"
)
public class SkinActivityDamageAwardModel extends BaseModel {
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
      columnName = "minDamage",
      comment = "伤害下限"
   )
   private long minDamage;
   @ModelColumnAnno(
      columnName = "maxDamage",
      comment = "伤害上限"
   )
   private long maxDamage;
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

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<SkinActivityDamageAwardModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         SkinActivityDamageAwardModel model = (SkinActivityDamageAwardModel)entry.getValue();
         if (tempMap.containsKey(model.getActivityId())) {
            ((List)tempMap.get(model.getActivityId())).add(model);
         } else {
            List<SkinActivityDamageAwardModel> list = new ArrayList();
            list.add(model);
            tempMap.put(model.getActivityId(), list);
         }
      }

      pool.putMap("customSkinActivityDamageAward", tempMap);
   }
}
