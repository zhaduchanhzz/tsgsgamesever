package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import jodd.util.StringUtil;

@ListenerCheckAnno(
   type = 48
)
public class CheckPassiveEffectEnd extends ListenerChecker {
   public static final int EVENT_CHECKER_SELF_EFFECT = 1;

   boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      Integer effectId = (Integer)event.getParam(35);
      switch (context.param) {
         case 1:
            if (StringUtil.isEmpty(context.exParams)) {
               return context.entity == source;
            }

            return context.entity == source && effectId == Integer.parseInt(context.exParams);
         default:
            return false;
      }
   }
}
