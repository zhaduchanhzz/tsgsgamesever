package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;

@ListenerCheckAnno(
   type = 41
)
public class CheckDeadBuffClear extends ListenerChecker {
   public static final int EVENT_CHECKER_SELF_FORCE_DEAD = 1;

   boolean check(Event event, ListenerContext context) {
      Entity target = (Entity)event.getParam(3);
      switch (context.param) {
         case 1:
            return target.getForce() == context.entity.getForce();
         default:
            return false;
      }
   }
}
