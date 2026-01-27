package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class PropertyOffsetModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "type",
      comment = "基础属性"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "way",
      comment = "初始计算方式"
   )
   private int way;
   @ModelColumnAnno(
      columnName = "value",
      comment = "初始值"
   )
   private long value;

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getWay() {
      return this.way;
   }

   public void setWay(int way) {
      this.checkModify();
      this.way = way;
   }

   public long getValue() {
      return this.value;
   }

   public void setValue(long value) {
      this.checkModify();
      this.value = value;
   }
}
