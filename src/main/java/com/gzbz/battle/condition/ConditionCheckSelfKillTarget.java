package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.Objects;

@ConditionAnno(
   condition = 54
)
public class ConditionCheckSelfKillTarget implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      if (target.isDead() || target.getStateManager().checkState((short)21)) {
         Entity entity = (Entity)action.getBlackboard().getSkillParam(1700 + target.getBattlePos());
         if (Objects.nonNull(entity) && entity == source) {
            return true;
         }
      }

      return false;
   }
}
