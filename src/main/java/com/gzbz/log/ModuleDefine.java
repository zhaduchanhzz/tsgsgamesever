package com.gzbz.log;

public enum ModuleDefine {
   MODULE_BAG(1),
   MODULE_HERO(2),
   MODULE_ACTIVITY(3);

   public final int Id;

   private ModuleDefine(int id) {
      this.Id = id;
   }
}
