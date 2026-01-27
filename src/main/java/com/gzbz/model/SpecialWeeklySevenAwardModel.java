package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "SpecialsWeeklySevenAward"
)
public class SpecialWeeklySevenAwardModel extends BaseModel {
   @ModelColumnAnno(
      comment = "序号",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "开始天数"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "结束天数"
   )
   private int dateEnd;
   @ModelColumnAnno(
      comment = "开启等级"
   )
   private int openLevel;
   @ModelColumnAnno(
      comment = "奖励类型"
   )
   private int rewardType;
   @ModelColumnAnno(
      comment = "奖励ID"
   )
   private int rewardId;
   @ModelColumnAnno(
      comment = "奖励数量"
   )
   private int rewardValue;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public void setDateStart(int dateStart) {
      this.checkModify();
      this.dateStart = dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }

   public void setDateEnd(int dateEnd) {
      this.checkModify();
      this.dateEnd = dateEnd;
   }

   public int getRewardType() {
      return this.rewardType;
   }

   public void setRewardType(int rewardType) {
      this.checkModify();
      this.rewardType = rewardType;
   }

   public int getRewardId() {
      return this.rewardId;
   }

   public void setRewardId(int rewardId) {
      this.checkModify();
      this.rewardId = rewardId;
   }

   public int getRewardValue() {
      return this.rewardValue;
   }

   public void setRewardValue(int rewardValue) {
      this.checkModify();
      this.rewardValue = rewardValue;
   }

   public int getOpenLevel() {
      return this.openLevel;
   }

   public void setOpenLevel(int openLevel) {
      this.checkModify();
      this.openLevel = openLevel;
   }
}
