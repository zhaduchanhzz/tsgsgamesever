package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;

@ListenerCheckAnno(
   type = 22
)
public class CheckPassiveSKill extends ListenerChecker {
   private int triggerTimes = 0;

   public boolean check(Event event, ListenerContext context) {
      int skillId = (Integer)event.getParam(22);
      return context.param == skillId;
   }
}
