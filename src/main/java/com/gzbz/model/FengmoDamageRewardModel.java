package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "fengmoDamageReward"
)
public class FengmoDamageRewardModel extends BaseModel {
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
      columnName = "reward",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "伤害奖励"
   )
   private ArrayList<ResourceModel> reward = new ArrayList();

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

   public ArrayList<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(ArrayList<ResourceModel> reward) {
      this.checkModify();
      this.reward = reward;
   }
}
