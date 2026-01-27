package com.gzbz.model;

import com.gzbz.model.fun.ProbabilityReward;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import misc.RandomUtil;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "duelReward"
)
public class DuelRewardModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "condition",
      isPrimaty = true,
      comment = "条件"
   )
   private int condition;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ProbabilityReward.class,
      count = 4,
      comment = "奖励"
   )
   private List<ProbabilityReward> rewards = new ArrayList();

   public ProbabilityReward getProbabilityReward() {
      int totalProb = 0;

      for(ProbabilityReward reward : this.rewards) {
         totalProb += reward.getPermillage();
      }

      int r = RandomUtil.randInt(totalProb);
      int tempProb = 0;

      for(int i = 0; i < this.rewards.size(); ++i) {
         tempProb += ((ProbabilityReward)this.rewards.get(i)).getPermillage();
         if (tempProb > r) {
            return (ProbabilityReward)this.rewards.get(i);
         }
      }

      return null;
   }

   public int getCondition() {
      return this.condition;
   }

   public void setCondition(int condition) {
      this.checkModify();
      this.condition = condition;
   }

   public List<ProbabilityReward> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ProbabilityReward> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
