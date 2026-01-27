package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class KeyValFun extends BaseModel {
   @ModelColumnAnno(
      columnName = "key",
      comment = "KEY"
   )
   private int key;
   @ModelColumnAnno(
      columnName = "val",
      comment = "VAL"
   )
   private int val;
   private String exParams;

   public KeyValFun() {
   }

   public KeyValFun(int key, int val) {
      this.key = key;
      this.val = val;
   }

   public int getKey() {
      return this.key;
   }

   public void setKey(int key) {
      this.checkModify();
      this.key = key;
   }

   public int getVal() {
      return this.val;
   }

   public void setVal(int val) {
      this.checkModify();
      this.val = val;
   }

   public void setExParams(String params) {
      this.exParams = params;
   }

   public String getExParams() {
      return this.exParams;
   }
}
