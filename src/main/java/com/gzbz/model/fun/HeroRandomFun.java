package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class HeroRandomFun extends BaseModel {
   @ModelColumnAnno(
      columnName = "lv",
      comment = "等级"
   )
   private int lv;
   @ModelColumnAnno(
      columnName = "id",
      comment = "指定ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "star",
      comment = "星级"
   )
   private int star;
   @ModelColumnAnno(
      columnName = "nation",
      comment = "阵营"
   )
   private int nation;
   @ModelColumnAnno(
      columnName = "type",
      comment = "职业"
   )
   private int type;
   @ModelColumnAnno(
      columnName = "wearId",
      comment = "穿戴ID"
   )
   private int wearId;

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public int getNation() {
      return this.nation;
   }

   public void setNation(int nation) {
      this.checkModify();
      this.nation = nation;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getWearId() {
      return this.wearId;
   }

   public void setWearId(int wearId) {
      this.checkModify();
      this.wearId = wearId;
   }
}
