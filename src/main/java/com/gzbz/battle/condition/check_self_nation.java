package com.gzbz.battle.condition;

import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.HeroModel;
import com.gzbz.model.fun.ConditionModel;
import com.gzbz.spring.ApplicationContextProvider;

class check_self_nation implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      target = (Entity)action.getBlackboard().getSkillParam(1, null);
      if (target == null) {
         return false;
      } else {
         HeroModel targetModel = (HeroModel)ApplicationContextProvider.getModelPool().getEntity("hero", target.getId());
         if (targetModel == null) {
            return false;
         } else if (targetModel.getNation() == 10) {
            return target.inheritNation == conditionModel.getConditionValue();
         } else {
            return targetModel.getNation() == conditionModel.getConditionValue();
         }
      }
   }
}
