package com.gzbz.model.fun;

import com.gzbz.model.manager.BaseModel;
import model.ModelColumnAnno;
import model.ModelCombinationAnno;

@ModelCombinationAnno
public class PassiveEffectFunc extends BaseModel {
   @ModelColumnAnno(
      columnName = "target",
      comment = "目标"
   )
   private byte target;
   @ModelColumnAnno(
      columnName = "use",
      comment = "使用类型"
   )
   private byte useFunc;
   @ModelColumnAnno(
      columnName = "id",
      comment = "使用id"
   )
   private int useId;
   @ModelColumnAnno(
      columnName = "value",
      comment = "使用值"
   )
   private int useValue;

   public byte getTarget() {
      return this.target;
   }

   public void setTarget(byte target) {
      this.checkModify();
      this.target = target;
   }

   public byte getUseFunc() {
      return this.useFunc;
   }

   public void setUseFunc(byte useFunc) {
      this.checkModify();
      this.useFunc = useFunc;
   }

   public int getUseId() {
      return this.useId;
   }

   public void setUseId(int useId) {
      this.checkModify();
      this.useId = useId;
   }

   public int getUseValue() {
      return this.useValue;
   }

   public void setUseValue(int useValue) {
      this.checkModify();
      this.useValue = useValue;
   }
}
