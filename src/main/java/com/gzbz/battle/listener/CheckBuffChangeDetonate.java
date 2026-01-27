package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;

@ListenerCheckAnno(
   type = 9
)
public class CheckBuffChangeDetonate extends ListenerChecker {
   public static final int EVENT_CHECKER_BUFF_DETONATE_ENEMY_ANY = 1;
   public static final int EVENT_CHECKER_BUFF_DETONATE_ENEMY_ME = 2;
   public static final int EVENT_CHECKER_BUFF_DETONATE_BROKEN_ME = 3;

   boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      Entity target = (Entity)event.getParam(3);
      switch (context.param) {
         case 1:
            return target.getForce() != context.entity.getForce();
         case 2:
            return target.getForce() != context.entity.getForce() && source == context.entity;
         case 3:
            return target.getForce() != context.entity.getForce() && event.getParam(18) != null;
         default:
            return false;
      }
   }
}
