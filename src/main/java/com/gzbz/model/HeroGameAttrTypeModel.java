package com.gzbz.model;

import com.gzbz.model.fun.PropertyHeroTypeWeightModel;
import com.gzbz.model.manager.BaseModel;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "heroGameAttrType"
)
public class HeroGameAttrTypeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int type;
   @ModelColumnAnno(
      comment = "基础属性池"
   )
   private int groupBase;
   @ModelColumnAnno(
      comment = "战斗属性池"
   )
   private int groupAttack;
   @ModelColumnAnno(
      comment = "抗性属性池"
   )
   private int groupDefence;
   private List<PropertyHeroTypeWeightModel> addPros;

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.type = type;
   }

   public int getGroupBase() {
      return this.groupBase;
   }

   public void setGroupBase(int groupBase) {
      this.groupBase = groupBase;
   }

   public int getGroupAttack() {
      return this.groupAttack;
   }

   public void setGroupAttack(int groupAttack) {
      this.groupAttack = groupAttack;
   }

   public int getGroupDefence() {
      return this.groupDefence;
   }

   public void setGroupDefence(int groupDefence) {
      this.groupDefence = groupDefence;
   }

   public List<PropertyHeroTypeWeightModel> getAddPros() {
      return this.addPros;
   }

   public void setAddPros(List<PropertyHeroTypeWeightModel> addPros) {
      this.addPros = addPros;
   }
}
