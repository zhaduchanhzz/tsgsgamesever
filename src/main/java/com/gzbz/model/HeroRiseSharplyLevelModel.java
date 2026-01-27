package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroRiseSharplyLevel"
)
public class HeroRiseSharplyLevelModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "等级"
   )
   private int lv;
   @ModelColumnAnno(
      comment = "升到下一级需要积分"
   )
   private int integral;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "lockRewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "高级奖励"
   )
   private List<ResourceModel> lockRewards = new ArrayList();

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

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public List<ResourceModel> getLockRewards() {
      return this.lockRewards;
   }

   public void setLockRewards(List<ResourceModel> lockRewards) {
      this.checkModify();
      this.lockRewards = lockRewards;
   }
}
