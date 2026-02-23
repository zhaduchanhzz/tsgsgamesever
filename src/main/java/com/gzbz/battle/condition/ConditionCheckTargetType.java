package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.HeroModel;
import com.gzbz.model.fun.ConditionModel;
import com.gzbz.spring.ApplicationContextProvider;

@ConditionAnno(
   condition = 86
)
public class ConditionCheckTargetType implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      if (target == null) {
         target = (Entity)action.getBlackboard().getSkillParam(3, null);
      }

      if (target == null) {
         return false;
      } else {
         HeroModel targetModel = (HeroModel)ApplicationContextProvider.getModelPool().getEntity("hero", target.getId());
         if (targetModel == null) {
            return false;
         } else {
            for(String param : Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam())) {
               if (targetModel.getType() == Integer.parseInt(param)) {
                  return true;
               }
            }

            return false;
         }
      }
   }
}
