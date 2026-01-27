package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DragonVeinPosition"
)
public class DragonVeinPositionModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "部位类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "解锁所需龙脉等级"
   )
   private int needLevel;
   @ModelColumnAnno(
      comment = "获得部位权重"
   )
   private int weight;
   @ModelColumnAnno(
      comment = "属性"
   )
   private String attrGroup;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getNeedLevel() {
      return this.needLevel;
   }

   public void setNeedLevel(int needLevel) {
      this.checkModify();
      this.needLevel = needLevel;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public String getAttrGroup() {
      return this.attrGroup;
   }

   public void setAttrGroup(String attrGroup) {
      this.checkModify();
      this.attrGroup = attrGroup;
   }
}
