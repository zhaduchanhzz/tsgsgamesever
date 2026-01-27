package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class ThreeFieldModel extends BaseModel {
   @ModelColumnAnno(
      comment = "参数A"
   )
   private int fieldA;
   @ModelColumnAnno(
      comment = "参数B"
   )
   private int fieldB;
   @ModelColumnAnno(
      comment = "参数C"
   )
   private int fieldC;

   public int getFieldA() {
      return this.fieldA;
   }

   public void setFieldA(int fieldA) {
      this.checkModify();
      this.fieldA = fieldA;
   }

   public int getFieldB() {
      return this.fieldB;
   }

   public void setFieldB(int fieldB) {
      this.checkModify();
      this.fieldB = fieldB;
   }

   public int getFieldC() {
      return this.fieldC;
   }

   public void setFieldC(int fieldC) {
      this.checkModify();
      this.fieldC = fieldC;
   }

   public ThreeFieldModel() {
   }

   public ThreeFieldModel(int fieldA, int fieldB, int fieldC) {
      this.fieldA = fieldA;
      this.fieldB = fieldB;
      this.fieldC = fieldC;
   }
}
