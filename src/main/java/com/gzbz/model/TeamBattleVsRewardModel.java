package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "teamBattleVsReward"
)
public class TeamBattleVsRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "次数"
   )
   private int challengeTime;
   @ModelColumnAnno(
      columnName = "reward",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "次数奖励"
   )
   private List<ResourceModel> reward = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getChallengeTime() {
      return this.challengeTime;
   }

   public void setChallengeTime(int challengeTime) {
      this.checkModify();
      this.challengeTime = challengeTime;
   }

   public List<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(List<ResourceModel> reward) {
      this.checkModify();
      this.reward = reward;
   }
}
