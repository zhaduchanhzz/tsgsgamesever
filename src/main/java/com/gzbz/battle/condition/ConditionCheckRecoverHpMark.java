package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.Objects;

@ConditionAnno(
   condition = 53
)
public class ConditionCheckRecoverHpMark implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      Entity entity = (Entity)action.getBlackboard().getSkillParam(1600 + source.getBattlePos());
      return Objects.nonNull(entity) && entity == source;
   }
}
