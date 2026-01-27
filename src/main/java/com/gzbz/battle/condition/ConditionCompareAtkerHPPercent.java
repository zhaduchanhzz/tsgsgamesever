package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.Objects;

@ConditionAnno(
   condition = 93
)
public class ConditionCompareAtkerHPPercent implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
      if (Objects.isNull(attacker)) {
         return false;
      } else {
         int sourcePercent = (int)((float)source.getBaseProperty(99) * 1.0F / (float)source.getBaseProperty(1) * 10000.0F);
         int attackerPercent = (int)((float)attacker.getBaseProperty(99) * 1.0F / (float)attacker.getBaseProperty(1) * 10000.0F);
         if (conditionModel.getConditionValue() == 1) {
            return sourcePercent > attackerPercent;
         } else {
            return sourcePercent <= attackerPercent;
         }
      }
   }
}
