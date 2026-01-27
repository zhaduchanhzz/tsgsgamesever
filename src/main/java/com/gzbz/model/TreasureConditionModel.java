package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "treasureCondition"
)
public class TreasureConditionModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "解锁条件id"
   )
   private int conditionId;
   @ModelColumnAnno(
      comment = "消耗条件"
   )
   private int condition;
   @ModelColumnAnno(
      comment = "目标类型"
   )
   private int targetType;
   @ModelColumnAnno(
      comment = "目标阵营"
   )
   private int targetNation;
   @ModelColumnAnno(
      comment = "目标星级"
   )
   private int targetStar;
   @ModelColumnAnno(
      comment = "目标数量"
   )
   private int targetNum;
   @ModelColumnAnno(
      comment = "描述"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "道具id"
   )
   private int propId;
   @ModelColumnAnno(
      comment = "道具数量"
   )
   private int propNum;

   public int getConditionId() {
      return this.conditionId;
   }

   public void setConditionId(int conditionId) {
      this.checkModify();
      this.conditionId = conditionId;
   }

   public int getTargetType() {
      return this.targetType;
   }

   public void setTargetType(int targetType) {
      this.checkModify();
      this.targetType = targetType;
   }

   public int getTargetNation() {
      return this.targetNation;
   }

   public void setTargetNation(int targetNation) {
      this.checkModify();
      this.targetNation = targetNation;
   }

   public int getTargetStar() {
      return this.targetStar;
   }

   public void setTargetStar(int targetStar) {
      this.checkModify();
      this.targetStar = targetStar;
   }

   public int getTargetNum() {
      return this.targetNum;
   }

   public void setTargetNum(int targetNum) {
      this.checkModify();
      this.targetNum = targetNum;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getCondition() {
      return this.condition;
   }

   public void setCondition(int condition) {
      this.checkModify();
      this.condition = condition;
   }

   public int getPropId() {
      return this.propId;
   }

   public void setPropId(int propId) {
      this.checkModify();
      this.propId = propId;
   }

   public int getPropNum() {
      return this.propNum;
   }

   public void setPropNum(int propNum) {
      this.checkModify();
      this.propNum = propNum;
   }
}
