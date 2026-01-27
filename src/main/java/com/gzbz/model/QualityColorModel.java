package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "qualityColor"
)
public class QualityColorModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "品质ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "color",
      comment = "颜色"
   )
   private String color;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getColor() {
      return this.color;
   }

   public void setColor(String color) {
      this.checkModify();
      this.color = color;
   }
}
