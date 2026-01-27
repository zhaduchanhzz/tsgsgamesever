package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class PropertyHeroTypeWeightModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "type",
      comment = "加成类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "heroType",
      comment = "属性生效的武将职业"
   )
   private int heroType;
   @ModelColumnAnno(
      columnName = "way",
      comment = "加成方式"
   )
   private int way;
   @ModelColumnAnno(
      columnName = "weight",
      comment = "权重"
   )
   private int weight;

   public PropertyHeroTypeWeightModel() {
   }

   public PropertyHeroTypeWeightModel(int type, int heroType, int way, int weight) {
      this.type = type;
      this.heroType = heroType;
      this.way = way;
      this.weight = weight;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getHeroType() {
      return this.heroType;
   }

   public void setHeroType(int heroType) {
      this.checkModify();
      this.heroType = heroType;
   }

   public int getWay() {
      return this.way;
   }

   public void setWay(int way) {
      this.checkModify();
      this.way = way;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }
}
