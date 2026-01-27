package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "StampBasicProperty"
)
public class StampBasicPropertyModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int stampType;
   @ModelColumnAnno(
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "星级"
   )
   private int star;
   @ModelColumnAnno(
      comment = "基础属性id"
   )
   private int basicPropertyId;
   @ModelColumnAnno(
      comment = "基础属性加成方式"
   )
   private int basicPropertyWay;
   @ModelColumnAnno(
      comment = "属性值"
   )
   private int propertyValue;
   @ModelColumnAnno(
      comment = "下一星级属性"
   )
   private int nextLvValue;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getStampType() {
      return this.stampType;
   }

   public void setStampType(int stampType) {
      this.checkModify();
      this.stampType = stampType;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public int getBasicPropertyId() {
      return this.basicPropertyId;
   }

   public void setBasicPropertyId(int basicPropertyId) {
      this.checkModify();
      this.basicPropertyId = basicPropertyId;
   }

   public int getBasicPropertyWay() {
      return this.basicPropertyWay;
   }

   public void setBasicPropertyWay(int basicPropertyWay) {
      this.checkModify();
      this.basicPropertyWay = basicPropertyWay;
   }

   public int getPropertyValue() {
      return this.propertyValue;
   }

   public void setPropertyValue(int propertyValue) {
      this.checkModify();
      this.propertyValue = propertyValue;
   }

   public int getNextLvValue() {
      return this.nextLvValue;
   }

   public void setNextLvValue(int nextLvValue) {
      this.checkModify();
      this.nextLvValue = nextLvValue;
   }
}
