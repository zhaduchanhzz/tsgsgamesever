package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 62
)
public class ConditionCheckCompareHPPercent implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      int sourcePercent = (int)((float)source.getBaseProperty(99) * 1.0F / (float)source.getBaseProperty(1) * 10000.0F);
      int targetPercent = (int)((float)target.getBaseProperty(99) * 1.0F / (float)target.getBaseProperty(1) * 10000.0F);
      if (conditionModel.getConditionValue() == 1) {
         return sourcePercent > targetPercent;
      } else {
         return sourcePercent <= targetPercent;
      }
   }
}
