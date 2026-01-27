package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "fengmoShenShou"
)
public class FengmoShenShouModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "印记效果1"
   )
   private int effect1;
   @ModelColumnAnno(
      comment = "印记效果2"
   )
   private int effect2;
   @ModelColumnAnno(
      comment = "印记效果3"
   )
   private int effect3;
   @ModelColumnAnno(
      comment = "印记效果4"
   )
   private int effect4;
   @ModelColumnAnno(
      comment = "印记效果5"
   )
   private int effect5;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
      this.checkModify();
   }

   public int getEffect1() {
      return this.effect1;
   }

   public void setEffect1(int effect1) {
      this.effect1 = effect1;
      this.checkModify();
   }

   public int getEffect2() {
      return this.effect2;
   }

   public void setEffect2(int effect2) {
      this.effect2 = effect2;
      this.checkModify();
   }

   public int getEffect3() {
      return this.effect3;
   }

   public void setEffect3(int effect3) {
      this.effect3 = effect3;
      this.checkModify();
   }

   public int getEffect4() {
      return this.effect4;
   }

   public void setEffect4(int effect4) {
      this.effect4 = effect4;
      this.checkModify();
   }

   public int getEffect5() {
      return this.effect5;
   }

   public void setEffect5(int effect5) {
      this.effect5 = effect5;
      this.checkModify();
   }
}
