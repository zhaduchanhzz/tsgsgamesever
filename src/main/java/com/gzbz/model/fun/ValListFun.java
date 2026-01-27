package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class ValListFun extends BaseModel {
   @ModelColumnAnno(
      columnName = "v0"
   )
   private int v0;
   @ModelColumnAnno(
      columnName = "v1"
   )
   private int v1;
   @ModelColumnAnno(
      columnName = "v2"
   )
   private int v2;

   public int getV0() {
      return this.v0;
   }

   public void setV0(int v0) {
      this.checkModify();
      this.v0 = v0;
   }

   public int getV1() {
      return this.v1;
   }

   public void setV1(int v1) {
      this.checkModify();
      this.v1 = v1;
   }

   public int getV2() {
      return this.v2;
   }

   public void setV2(int v2) {
      this.v2 = v2;
   }
}
