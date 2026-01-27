package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import java.util.Objects;

@ListenerCheckAnno(
   type = 13
)
public class CheckModifyHp extends ListenerChecker {
   boolean check(Event event, ListenerContext context) {
      Entity target = (Entity)event.getParam(3);
      if (context.entity != target) {
         return false;
      } else if (context.param == 0) {
         return true;
      } else {
         Long lastHp = (Long)event.getParam(16);
         Long curHp = (Long)event.getParam(17);
         if (Objects.nonNull(lastHp) && Objects.nonNull(curHp)) {
            double lastRate = (double)lastHp / (double)target.getBaseProperty(1);
            double curRate = (double)curHp / (double)target.getBaseProperty(1);
            return (double)context.param > curRate * (double)10000.0F;
         } else {
            Integer resistId = (Integer)event.getParam(15);
            return !Objects.isNull(resistId);
         }
      }
   }
}
