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
   condition = 24
)
public class ConditionCheckNation implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      if (target == null) {
         return false;
      } else {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", target.getId());
         if (Objects.isNull(heroModel)) {
            return false;
         } else if (heroModel.getNation() == 10) {
            return conditionModel.getConditionValue() == target.inheritNation;
         } else {
            return conditionModel.getConditionValue() == heroModel.getNation();
         }
      }
   }
}
