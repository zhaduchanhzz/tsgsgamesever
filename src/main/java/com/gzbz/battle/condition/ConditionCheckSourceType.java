package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.HeroModel;
import com.gzbz.model.fun.ConditionModel;
import com.gzbz.spring.ApplicationContextProvider;

@ConditionAnno(
   condition = 29
)
public class ConditionCheckSourceType implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      for(Entity entity : source.getPkTeam().getEntityMap().values()) {
         if (!entity.isDead()) {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
            if (heroModel.getType() == conditionModel.getConditionValue()) {
               return true;
            }
         }
      }

      return false;
   }
}
