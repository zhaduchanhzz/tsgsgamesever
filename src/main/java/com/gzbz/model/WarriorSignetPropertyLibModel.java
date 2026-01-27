package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warriorSignetPropertyLib"
)
public class WarriorSignetPropertyLibModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "组id"
   )
   private int groupId;
   @ModelColumnAnno(
      comment = "属性表id"
   )
   private int propertyId;
   @ModelColumnAnno(
      comment = "权重占比"
   )
   private int weight;
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

   public int getGroupId() {
      return this.groupId;
   }

   public void setGroupId(int groupId) {
      this.checkModify();
      this.groupId = groupId;
   }

   public int getPropertyId() {
      return this.propertyId;
   }

   public void setPropertyId(int propertyId) {
      this.checkModify();
      this.propertyId = propertyId;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
