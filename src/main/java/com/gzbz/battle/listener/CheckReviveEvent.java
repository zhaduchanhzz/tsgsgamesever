package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;

@ListenerCheckAnno(
   type = 11
)
public class CheckReviveEvent extends ListenerChecker {
   public static final int REVIVE_EVENT_TYPE_ENEMY = 1;
   public static final int REVIVE_EVENT_TYPE_FRIEND = 2;
   public static final int REVIVE_EVENT_TYPE_SELF = 3;
   public static final int REVIVE_EVENT_TYPE_SELF_OR_FRIEND = 4;

   boolean check(Event event, ListenerContext context) {
      Entity target = (Entity)event.getParam(3);
      switch (context.param) {
         case 1:
            return target.getForce() != context.entity.getForce();
         case 2:
            return target.getForce() == context.entity.getForce();
         case 3:
            return target == context.entity;
         case 4:
            return target == context.entity || target.getForce() == context.entity.getForce();
         default:
            return false;
      }
   }
}
