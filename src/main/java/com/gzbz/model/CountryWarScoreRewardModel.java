package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "countryWarScoreReward"
)
public class CountryWarScoreRewardModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "lv",
      isPrimaty = true,
      comment = "奖励id"
   )
   private int lv;
   @ModelColumnAnno(
      columnName = "integral",
      comment = "累计积分"
   )
   private int integral;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "普通奖励"
   )
   private ArrayList<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "lockRewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "高级奖励"
   )
   private ArrayList<ResourceModel> lockRewards = new ArrayList();

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getIntegral() {
      return this.integral;
   }

   public void setIntegral(int integral) {
      this.checkModify();
      this.integral = integral;
   }

   public ArrayList<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(ArrayList<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public ArrayList<ResourceModel> getLockRewards() {
      return this.lockRewards;
   }

   public void setLockRewards(ArrayList<ResourceModel> lockRewards) {
      this.checkModify();
      this.lockRewards = lockRewards;
   }
}
