package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class ArtifactSkillPropertyFun extends BaseModel {
   @ModelColumnAnno(
      columnName = "key",
      comment = "被动技能"
   )
   private int key;
   @ModelColumnAnno(
      columnName = "val",
      comment = "需要技能等级"
   )
   private int val;
   @ModelColumnAnno(
      columnName = "property",
      comment = "基础属性"
   )
   private int property;
   @ModelColumnAnno(
      columnName = "way",
      comment = "初始计算方式"
   )
   private int way;
   @ModelColumnAnno(
      columnName = "propertyValue",
      comment = "初始值"
   )
   private long propertyValue;

   public int getKey() {
      return this.key;
   }

   public void setKey(int key) {
      this.checkModify();
      this.key = key;
   }

   public int getVal() {
      return this.val;
   }

   public void setVal(int val) {
      this.checkModify();
      this.val = val;
   }

   public int getProperty() {
      return this.property;
   }

   public void setProperty(int property) {
      this.checkModify();
      this.property = property;
   }

   public int getWay() {
      return this.way;
   }

   public void setWay(int way) {
      this.checkModify();
      this.way = way;
   }

   public long getPropertyValue() {
      return this.propertyValue;
   }

   public void setPropertyValue(long propertyValue) {
      this.checkModify();
      this.propertyValue = propertyValue;
   }
}
