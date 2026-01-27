package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.action.KeepAtkAction;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 70
)
public class ConditionCheckKeepAtk implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
      if (attacker == source && action.getType() == 41) {
         KeepAtkAction keepAtkAction = (KeepAtkAction)action;

         for(String param : Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam())) {
            if (Byte.parseByte(param) == keepAtkAction.getTriggerType()) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }
}
