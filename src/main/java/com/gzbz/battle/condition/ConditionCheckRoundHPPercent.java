package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 68
)
public class ConditionCheckRoundHPPercent implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      if (target == null) {
         return false;
      } else {
         long curHp = (Long)action.getBlackboard().getSkillParam(3100 + target.getBattlePos(), 0L);
         int percent = (int)((float)curHp * 1.0F / (float)target.getBaseProperty(1) * 10000.0F);
         if (conditionModel.getConditionValue() == 1) {
            return percent >= Integer.parseInt(conditionModel.getConditionParam());
         } else {
            return percent < Integer.parseInt(conditionModel.getConditionParam());
         }
      }
   }
}
