package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class PropertyExtModel extends BaseModel {
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
   private int value;
   @ModelColumnAnno(
      columnName = "name",
      comment = "名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "describe",
      comment = "描述"
   )
   private String describe;

   public int cal(int curValue) {
      if (this.way == 0) {
         return this.value;
      } else {
         return this.way == 1 ? (int)((float)curValue * ((float)this.value / 10000.0F)) : curValue;
      }
   }

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

   public int getValue() {
      return this.value;
   }

   public void setValue(int value) {
      this.checkModify();
      this.value = value;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public String getDescribe() {
      return this.describe;
   }

   public void setDescribe(String describe) {
      this.checkModify();
      this.describe = describe;
   }
}
