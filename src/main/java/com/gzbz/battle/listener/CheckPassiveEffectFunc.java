package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import java.util.Objects;

@ListenerCheckAnno(
   type = 30
)
public class CheckPassiveEffectFunc extends ListenerChecker {
   boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      Short func = (Short)event.getParam(28);
      if (Objects.isNull(func)) {
         return false;
      } else {
         return context.entity == source && context.param == func.intValue();
      }
   }
}
