package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.Objects;

@ConditionAnno(
   condition = 80
)
public class ConditionTargetApportionHurt implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      Boolean apportion = (Boolean)action.getBlackboard().getSkillParam(3300 + target.getBattlePos());
      return Objects.nonNull(apportion) ? apportion : false;
   }
}
