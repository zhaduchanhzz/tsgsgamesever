package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import java.util.Objects;

@ListenerCheckAnno(
   type = 28
)
public class CheckBeforeModifyHp extends ListenerChecker {
   boolean check(Event event, ListenerContext context) {
      Entity target = (Entity)event.getParam(3);
      if (context.entity != target) {
         return false;
      } else if (context.param == 0) {
         return true;
      } else {
         Long skillDamageValue = (Long)event.getParam(26);
         Long value = (Long)event.getParam(27);
         long skillDamageLimit = (long)((float)(Long)target.getBaseProperties().get(1) * ((float)context.param / 10000.0F));
         if (Objects.nonNull(skillDamageValue) && Objects.nonNull(value)) {
            return skillDamageValue - value > skillDamageLimit;
         } else {
            return false;
         }
      }
   }
}
