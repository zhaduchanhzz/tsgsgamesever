package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.HeroModel;
import com.gzbz.model.fun.ConditionModel;
import com.gzbz.spring.ApplicationContextProvider;

@ConditionAnno(
   condition = 43
)
public class ConditionTargetId implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
      target = (Entity)action.getBlackboard().getSkillParam(3);
      if (attacker != null && target != null) {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", target.getId());
         return heroModel.getChipId() == conditionModel.getConditionValue();
      } else {
         return false;
      }
   }
}
