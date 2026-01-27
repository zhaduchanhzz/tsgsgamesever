package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "battleProGrowing"
)
public class BattleProGrowingModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "属性id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "num",
      comment = "每级累加值"
   )
   private String num;
   @ModelColumnAnno(
      columnName = "name",
      comment = "属性名称"
   )
   private String name;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getNum() {
      return this.num;
   }

   public void setNum(String num) {
      this.checkModify();
      this.num = num;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }
}
