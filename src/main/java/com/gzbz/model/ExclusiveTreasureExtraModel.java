package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "exclusiveTreasureExtra"
)
public class ExclusiveTreasureExtraModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "加成类型"
   )
   private int addType;
   @ModelColumnAnno(
      comment = "阵营类型"
   )
   private int nation;
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
      comment = "被动技能id"
   )
   private int skillId;
   @ModelColumnAnno(
      comment = "权重概率"
   )
   private int rate;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getAddType() {
      return this.addType;
   }

   public void setAddType(int addType) {
      this.checkModify();
      this.addType = addType;
   }

   public int getNation() {
      return this.nation;
   }

   public void setNation(int nation) {
      this.checkModify();
      this.nation = nation;
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

   public int getSkillId() {
      return this.skillId;
   }

   public void setSkillId(int skillId) {
      this.checkModify();
      this.skillId = skillId;
   }

   public int getRate() {
      return this.rate;
   }

   public void setRate(int rate) {
      this.checkModify();
      this.rate = rate;
   }
}
