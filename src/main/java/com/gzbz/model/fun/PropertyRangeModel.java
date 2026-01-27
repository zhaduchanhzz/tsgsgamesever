package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class PropertyRangeModel extends BaseModel {
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
      columnName = "min",
      comment = "最小值"
   )
   private long min;
   @ModelColumnAnno(
      columnName = "max",
      comment = "最大值"
   )
   private long max;

   public PropertyRangeModel() {
   }

   public PropertyRangeModel(int type, int way, long min, long max) {
      this.type = type;
      this.way = way;
      this.min = min;
      this.max = max;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.type = type;
   }

   public int getWay() {
      return this.way;
   }

   public void setWay(int way) {
      this.way = way;
   }

   public long getMin() {
      return this.min;
   }

   public void setMin(long min) {
      this.min = min;
   }

   public long getMax() {
      return this.max;
   }

   public void setMax(long max) {
      this.max = max;
   }
}
