package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;

@ListenerCheckAnno(
   type = 46
)
public class CheckPreSkill extends ListenerChecker {
   public static final int EVENT_SKILL_SELF = 1;

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
