package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "broodLimit"
)
public class BroodLimitModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "奖励池类型"
   )
   private int rewardSlot;
   @ModelColumnAnno(
      comment = "日期组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "日期组末尾"
   )
   private int dateEnd;
   @ModelColumnAnno(
      comment = "阶段起始天数"
   )
   private int stageStart;
   @ModelColumnAnno(
      comment = "阶段结尾天数"
   )
   private int stageEnd;
   @ModelColumnAnno(
      comment = "后端用阶段数"
   )
   private int stage;
   @ModelColumnAnno(
      comment = "消耗的道具id"
   )
   private int broodCostItem;
   @ModelColumnAnno(
      comment = "孵化一次可获得积分"
   )
   private int broodScore;
   @ModelColumnAnno(
      comment = "该类型蛋最大孵化次数"
   )
   private int maxBroodTimes;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getRewardSlot() {
      return this.rewardSlot;
   }

   public void setRewardSlot(int rewardSlot) {
      this.rewardSlot = rewardSlot;
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

   public int getStageStart() {
      return this.stageStart;
   }

   public void setStageStart(int stageStart) {
      this.stageStart = stageStart;
   }

   public int getStageEnd() {
      return this.stageEnd;
   }

   public void setStageEnd(int stageEnd) {
      this.stageEnd = stageEnd;
   }

   public int getStage() {
      return this.stage;
   }

   public void setStage(int stage) {
      this.stage = stage;
   }

   public int getBroodCostItem() {
      return this.broodCostItem;
   }

   public void setBroodCostItem(int broodCostItem) {
      this.broodCostItem = broodCostItem;
   }

   public int getBroodScore() {
      return this.broodScore;
   }

   public void setBroodScore(int broodScore) {
      this.broodScore = broodScore;
   }

   public int getMaxBroodTimes() {
      return this.maxBroodTimes;
   }

   public void setMaxBroodTimes(int maxBroodTimes) {
      this.maxBroodTimes = maxBroodTimes;
   }
}
