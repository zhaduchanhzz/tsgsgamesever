package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class RefineSpCostModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "quality",
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      columnName = "type",
      comment = "消耗类型"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "id",
      comment = "消耗道具id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "value",
      comment = "消耗道具数量"
   )
   private int value;

   public RefineSpCostModel() {
   }

   public RefineSpCostModel(int quality, int type, int id, int value) {
      this.quality = quality;
      this.type = type;
      this.id = id;
      this.value = value;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getValue() {
      return this.value;
   }

   public void setValue(int value) {
      this.checkModify();
      this.value = value;
   }
}
