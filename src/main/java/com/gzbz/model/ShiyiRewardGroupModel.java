package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "shiyiRewardGroup"
)
public class ShiyiRewardGroupModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "奖励组"
   )
   private int rewardGroup;
   @ModelColumnAnno(
      comment = "最早开服时间"
   )
   private int earlyTime;
   @ModelColumnAnno(
      comment = "最晚开服时间"
   )
   private int laterTime;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getRewardGroup() {
      return this.rewardGroup;
   }

   public void setRewardGroup(int rewardGroup) {
      this.checkModify();
      this.rewardGroup = rewardGroup;
   }

   public int getEarlyTime() {
      return this.earlyTime;
   }

   public void setEarlyTime(int earlyTime) {
      this.checkModify();
      this.earlyTime = earlyTime;
   }

   public int getLaterTime() {
      return this.laterTime;
   }

   public void setLaterTime(int laterTime) {
      this.checkModify();
      this.laterTime = laterTime;
   }
}
