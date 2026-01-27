package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class CleansingTowerBoxRewardItem extends BaseModel {
   @ModelColumnAnno(
      columnName = "star",
      comment = "星数"
   )
   private int star;
   @ModelColumnAnno(
      columnName = "rewards",
      comment = "星数奖励"
   )
   private String rewards;

   public CleansingTowerBoxRewardItem() {
   }

   public CleansingTowerBoxRewardItem(int star, String rewards) {
      this.star = star;
      this.rewards = rewards;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public String getRewards() {
      return this.rewards;
   }

   public void setRewards(String rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
