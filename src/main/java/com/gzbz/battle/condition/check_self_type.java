package com.gzbz.battle.condition;

import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.HeroModel;
import com.gzbz.model.fun.ConditionModel;
import com.gzbz.spring.ApplicationContextProvider;

class check_self_type implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      target = (Entity)action.getBlackboard().getSkillParam(1, (Object)null);
      if (target == null) {
         return false;
      } else {
         HeroModel targetModel = (HeroModel)ApplicationContextProvider.getModelPool().getEntity("hero", target.getId());
         if (targetModel == null) {
            return false;
         } else {
            return targetModel.getType() == conditionModel.getConditionValue();
         }
      }
   }
}
