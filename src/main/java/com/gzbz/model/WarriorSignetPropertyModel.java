package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warriorSignetProperty"
)
public class WarriorSignetPropertyModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "属性id"
   )
   private int propertyId;
   @ModelColumnAnno(
      comment = "属性加成方式"
   )
   private int propertyWay;
   @ModelColumnAnno(
      comment = "属性值"
   )
   private int propertyValue;
   @ModelColumnAnno(
      comment = "下级id"
   )
   private int nextId;
   @ModelColumnAnno(
      comment = "属性评分"
   )
   private int score1;
   @ModelColumnAnno(
      comment = "描述"
   )
   private String desc;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getPropertyId() {
      return this.propertyId;
   }

   public void setPropertyId(int propertyId) {
      this.checkModify();
      this.propertyId = propertyId;
   }

   public int getPropertyWay() {
      return this.propertyWay;
   }

   public void setPropertyWay(int propertyWay) {
      this.checkModify();
      this.propertyWay = propertyWay;
   }

   public int getPropertyValue() {
      return this.propertyValue;
   }

   public void setPropertyValue(int propertyValue) {
      this.checkModify();
      this.propertyValue = propertyValue;
   }

   public int getNextId() {
      return this.nextId;
   }

   public void setNextId(int nextId) {
      this.checkModify();
      this.nextId = nextId;
   }

   public int getScore1() {
      return this.score1;
   }

   public void setScore1(int score1) {
      this.checkModify();
      this.score1 = score1;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
