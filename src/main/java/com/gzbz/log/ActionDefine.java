package com.gzbz.log;

public enum ActionDefine {
   ACTION_LEVEL_UP(1),
   ACTION_FINISH_TASK(2),
   ACTION_BATTLE_COPY(3);

   public final int Id;

   private ActionDefine(int id) {
      this.Id = id;
   }
}
