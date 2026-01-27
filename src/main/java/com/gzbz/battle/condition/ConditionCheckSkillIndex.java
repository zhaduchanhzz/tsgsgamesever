package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.Objects;

@ConditionAnno(
   condition = 25
)
public class ConditionCheckSkillIndex implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
      if (source != attacker) {
         return false;
      } else {
         EntitySkill entitySkill = (EntitySkill)action.getBlackboard().getSkillParam(4);
         if (Objects.isNull(entitySkill)) {
            return false;
         } else {
            return conditionModel.getConditionValue() == entitySkill.index;
         }
      }
   }
}
