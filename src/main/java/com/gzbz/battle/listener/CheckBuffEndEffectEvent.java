package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import jodd.util.StringUtil;

@ListenerCheckAnno(
   type = 45
)
public class CheckBuffEndEffectEvent extends ListenerChecker {
   public static final int EVENT_CHECKER_EFFECT = 1;

   boolean check(Event event, ListenerContext context) {
      Entity target = (Entity)event.getParam(3);
      Integer effectId = (Integer)event.getParam(33);
      switch (context.param) {
         case 1:
            if (StringUtil.isEmpty(context.exParams)) {
               return false;
            }

            return target == context.entity && effectId == Integer.parseInt(context.exParams);
         default:
            return false;
      }
   }
}
