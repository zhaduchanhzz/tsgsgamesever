package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "redEnvelopes"
)
public class DuelRedEnvelopesModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int redType;
   @ModelColumnAnno(
      comment = "目标类型"
   )
   private int targetType;
   @ModelColumnAnno(
      comment = "目标id"
   )
   private int targetId;
   @ModelColumnAnno(
      comment = "目标数量"
   )
   private int targetValue;
   @ModelColumnAnno(
      comment = "需求等级"
   )
   private int needLv;
   @ModelColumnAnno(
      comment = "红包数量"
   )
   private int redNumber;
   @ModelColumnAnno(
      comment = "可领取时间"
   )
   private int getTime;
   @ModelColumnAnno(
      comment = "消失时间"
   )
   private int disappearTime;
   @ModelColumnAnno(
      comment = "金额下限"
   )
   private int minLimit;
   @ModelColumnAnno(
      comment = "金额上限"
   )
   private int maxLimit;
   @ModelColumnAnno(
      comment = "轮次"
   )
   private int lunci;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getRedType() {
      return this.redType;
   }

   public void setRedType(int redType) {
      this.checkModify();
      this.redType = redType;
   }

   public int getTargetType() {
      return this.targetType;
   }

   public void setTargetType(int targetType) {
      this.checkModify();
      this.targetType = targetType;
   }

   public int getTargetId() {
      return this.targetId;
   }

   public void setTargetId(int targetId) {
      this.checkModify();
      this.targetId = targetId;
   }

   public int getTargetValue() {
      return this.targetValue;
   }

   public void setTargetValue(int targetValue) {
      this.checkModify();
      this.targetValue = targetValue;
   }

   public int getNeedLv() {
      return this.needLv;
   }

   public void setNeedLv(int needLv) {
      this.checkModify();
      this.needLv = needLv;
   }

   public int getRedNumber() {
      return this.redNumber;
   }

   public void setRedNumber(int redNumber) {
      this.checkModify();
      this.redNumber = redNumber;
   }

   public int getGetTime() {
      return this.getTime;
   }

   public void setGetTime(int getTime) {
      this.checkModify();
      this.getTime = getTime;
   }

   public int getDisappearTime() {
      return this.disappearTime;
   }

   public void setDisappearTime(int disappearTime) {
      this.checkModify();
      this.disappearTime = disappearTime;
   }

   public int getMinLimit() {
      return this.minLimit;
   }

   public void setMinLimit(int minLimit) {
      this.checkModify();
      this.minLimit = minLimit;
   }

   public int getMaxLimit() {
      return this.maxLimit;
   }

   public void setMaxLimit(int maxLimit) {
      this.checkModify();
      this.maxLimit = maxLimit;
   }

   public int getLunci() {
      return this.lunci;
   }

   public void setLunci(int lunci) {
      this.checkModify();
      this.lunci = lunci;
   }
}
