package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;

@ListenerCheckAnno(
   type = 20
)
public class CheckSkillBefore extends ListenerChecker {
   public static final int REVIVE_EVENT_TYPE_SELF = 1;

   boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      switch (context.param) {
         case 1:
            return source == context.entity;
         default:
            return false;
      }
   }
}
