package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.HeroModel;
import com.gzbz.model.fun.ConditionModel;
import com.gzbz.spring.ApplicationContextProvider;

@ConditionAnno(
   condition = 37
)
public class ConditionCheckSelfNation implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      byte BATTLE_POS_FIRST = 0;
      byte BATTLE_POS_SECOND = 1;
      byte BATTLE_POS_THIRD = 2;
      byte BATTLE_POS_FOURTH = 3;
      byte BATTLE_POS_FIFTH = 4;

      for(Entity entity : source.getPkTeam().getEntityMap().values()) {
         if (!entity.isDead() && entity.getTeamPos() >= 0 && entity.getTeamPos() <= 4) {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
            if (heroModel.getType() == conditionModel.getConditionValue()) {
               return true;
            }
         }
      }

      return false;
   }
}
