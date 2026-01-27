package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "bagtype"
)
public class BagTypeModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "背包类型"
   )
   private int id;
   @ModelColumnAnno(
      comment = "背包名"
   )
   private String name;
   @ModelColumnAnno(
      comment = "背包图片"
   )
   private String iconString;
   @ModelColumnAnno(
      comment = "开启等级"
   )
   private int openlv;
   @ModelColumnAnno(
      comment = "至少显示格子"
   )
   private int mincount;
   @ModelColumnAnno(
      comment = "背包容量"
   )
   private int maxcount;
   @ModelColumnAnno(
      comment = "背包显示"
   )
   private int uistyle;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getIconString() {
      return this.iconString;
   }

   public void setIconString(String iconString) {
      this.iconString = iconString;
   }

   public int getOpenlv() {
      return this.openlv;
   }

   public void setOpenlv(int openlv) {
      this.openlv = openlv;
   }

   public int getMincount() {
      return this.mincount;
   }

   public void setMincount(int mincount) {
      this.mincount = mincount;
   }

   public int getMaxcount() {
      return this.maxcount;
   }

   public void setMaxcount(int maxcount) {
      this.maxcount = maxcount;
   }

   public int getUistyle() {
      return this.uistyle;
   }

   public void setUistyle(int uistyle) {
      this.uistyle = uistyle;
   }
}
