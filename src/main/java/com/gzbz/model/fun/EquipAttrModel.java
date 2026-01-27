package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class EquipAttrModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "type",
      comment = "基础属性"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "heroType",
      comment = "职业类型"
   )
   private int heroType;
   @ModelColumnAnno(
      columnName = "way",
      comment = "计算方式"
   )
   private int way;
   @ModelColumnAnno(
      columnName = "num",
      comment = "基础属性值"
   )
   private int num;
   @ModelColumnAnno(
      columnName = "factor",
      comment = "基础属性值系数"
   )
   private int factor;
   @ModelColumnAnno(
      columnName = "down",
      comment = "波动范围下限"
   )
   private int down;
   @ModelColumnAnno(
      columnName = "up",
      comment = "波动范围上限"
   )
   private int up;

   public EquipAttrModel() {
   }

   public EquipAttrModel(int type, int heroType, int way, int num, int factor, int down, int up) {
      this.type = type;
      this.heroType = heroType;
      this.way = way;
      this.num = num;
      this.factor = factor;
      this.down = down;
      this.up = up;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.type = type;
   }

   public int getHeroType() {
      return this.heroType;
   }

   public void setHeroType(int heroType) {
      this.heroType = heroType;
   }

   public int getWay() {
      return this.way;
   }

   public void setWay(int way) {
      this.way = way;
   }

   public int getNum() {
      return this.num;
   }

   public void setNum(int num) {
      this.num = num;
   }

   public int getFactor() {
      return this.factor;
   }

   public void setFactor(int factor) {
      this.factor = factor;
   }

   public int getDown() {
      return this.down;
   }

   public void setDown(int down) {
      this.down = down;
   }

   public int getUp() {
      return this.up;
   }

   public void setUp(int up) {
      this.up = up;
   }
}
