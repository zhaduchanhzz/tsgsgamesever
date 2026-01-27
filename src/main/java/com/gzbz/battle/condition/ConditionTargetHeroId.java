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
   condition = 63
)
public class ConditionTargetHeroId implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      if (target == null) {
         return false;
      } else {
         for(String param : Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam())) {
            int id = Integer.parseInt(param);
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", target.getId());
            if (heroModel.getId() == id) {
               return true;
            }
         }

         return false;
      }
   }
}
