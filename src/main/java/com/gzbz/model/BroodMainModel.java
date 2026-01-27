package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "broodMain"
)
public class BroodMainModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "奖池类型"
   )
   private int rewardType;
   @ModelColumnAnno(
      comment = "日期组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "日期组末尾"
   )
   private int dateEnd;
   @ModelColumnAnno(
      comment = "解锁奖池积分"
   )
   private int unlockRewardScore;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getRewardType() {
      return this.rewardType;
   }

   public void setRewardType(int rewardType) {
      this.rewardType = rewardType;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public void setDateStart(int dateStart) {
      this.dateStart = dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }

   public void setDateEnd(int dateEnd) {
      this.dateEnd = dateEnd;
   }

   public int getUnlockRewardScore() {
      return this.unlockRewardScore;
   }

   public void setUnlockRewardScore(int unlockRewardScore) {
      this.unlockRewardScore = unlockRewardScore;
   }
}
