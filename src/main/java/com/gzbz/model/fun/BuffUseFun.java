package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class BuffUseFun extends BaseModel {
   @ModelColumnAnno(
      columnName = "use",
      comment = "使用类型"
   )
   private byte useFunc;
   @ModelColumnAnno(
      columnName = "id",
      comment = "使用id"
   )
   private int useId;
   @ModelColumnAnno(
      columnName = "value",
      comment = "使用值"
   )
   private int useValue;
   @ModelColumnAnno(
      columnName = "calcFun",
      comment = "计算方式 0直接加  1百分比"
   )
   private int calcFun;
   @ModelColumnAnno(
      columnName = "dependentTarget",
      comment = "依赖目标"
   )
   private byte dependentTarget;
   @ModelColumnAnno(
      columnName = "dependentType",
      comment = "依赖类型"
   )
   private int dependentType;
   @ModelColumnAnno(
      columnName = "dependentId",
      comment = "依赖id"
   )
   private int dependentId;
   @ModelColumnAnno(
      columnName = "dependentCalcType",
      comment = "依赖计算方式"
   )
   private int dependentCalcType;
   @ModelColumnAnno(
      columnName = "dependentValue",
      comment = "依赖值"
   )
   private int dependentValue;
   @ModelColumnAnno(
      columnName = "exDependentValue",
      comment = "额外依赖值"
   )
   private int exDependentValue;

   public byte getUseFunc() {
      return this.useFunc;
   }

   public void setUseFunc(byte useFunc) {
      this.checkModify();
      this.useFunc = useFunc;
   }

   public int getUseId() {
      return this.useId;
   }

   public void setUseId(int useId) {
      this.checkModify();
      this.useId = useId;
   }

   public int getUseValue() {
      return this.useValue;
   }

   public void setUseValue(int useValue) {
      this.checkModify();
      this.useValue = useValue;
   }

   public int getCalcFun() {
      return this.calcFun;
   }

   public void setCalcFun(int calcFun) {
      this.checkModify();
      this.calcFun = calcFun;
   }

   public byte getDependentTarget() {
      return this.dependentTarget;
   }

   public void setDependentTarget(byte dependentTarget) {
      this.checkModify();
      this.dependentTarget = dependentTarget;
   }

   public int getDependentType() {
      return this.dependentType;
   }

   public void setDependentType(int dependentType) {
      this.checkModify();
      this.dependentType = dependentType;
   }

   public int getDependentId() {
      return this.dependentId;
   }

   public void setDependentId(int dependentId) {
      this.checkModify();
      this.dependentId = dependentId;
   }

   public int getDependentCalcType() {
      return this.dependentCalcType;
   }

   public void setDependentCalcType(int dependentCalcType) {
      this.checkModify();
      this.dependentCalcType = dependentCalcType;
   }

   public int getDependentValue() {
      return this.dependentValue;
   }

   public void setDependentValue(int dependentValue) {
      this.checkModify();
      this.dependentValue = dependentValue;
   }

   public int getExDependentValue() {
      return this.exDependentValue;
   }

   public void setExDependentValue(int exDependentValue) {
      this.checkModify();
      this.exDependentValue = exDependentValue;
   }
}
