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
   file = "eventHeroBossRewardNew"
)
public class EventHeroBossRewardNewModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "mainId",
      comment = "活动id"
   )
   private int mainId;
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
      count = 3,
      comment = "目标奖励"
   )
   private List<ResourceModel> reward = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<EventHeroBossRewardNewModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         EventHeroBossRewardNewModel model = (EventHeroBossRewardNewModel)entry.getValue();
         ((List)tempMap.computeIfAbsent(model.getMainId(), (k) -> new ArrayList())).add(model);
      }

      pool.putMap("customEventHeroBossRewardNew", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getMainId() {
      return this.mainId;
   }

   public void setMainId(int mainId) {
      this.checkModify();
      this.mainId = mainId;
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
