package com.gzbz.model;

import com.gzbz.model.fun.ProbabilityReward;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import misc.RandomUtil;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "JiuZhouChallengeReward"
)
public class SupremePvpChallengeRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "条件(1胜利,2失败)"
   )
   private int condition;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ProbabilityReward.class,
      comment = "奖励"
   )
   private List<ProbabilityReward> rewards = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "固定奖励"
   )
   private List<ResourceModel> mustRewards = new ArrayList();

   public int getCondition() {
      return this.condition;
   }

   public List<ProbabilityReward> getRewards() {
      return this.rewards;
   }

   public List<ResourceModel> getMustRewards() {
      return this.mustRewards;
   }

   public ProbabilityReward getProbabilityReward() {
      int totalProb = 0;

      for(ProbabilityReward reward : this.rewards) {
         totalProb += reward.getPermillage();
      }

      int r = RandomUtil.randInt(totalProb);
      int tempProb = 0;

      for(ProbabilityReward reward : this.rewards) {
         tempProb += reward.getPermillage();
         if (tempProb > r) {
            return reward;
         }
      }

      return null;
   }
}
