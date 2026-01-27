package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.HeroModel;
import com.gzbz.model.fun.ConditionModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Objects;

@ConditionAnno(
   condition = 71
)
public class ConditionCheckAttackerNation implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      Entity entity = (Entity)action.getBlackboard().getSkillParam(1);
      if (Objects.isNull(entity)) {
         return false;
      } else {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
         if (Objects.isNull(heroModel)) {
            return false;
         } else {
            return conditionModel.getConditionValue() == heroModel.getNation();
         }
      }
   }
}
