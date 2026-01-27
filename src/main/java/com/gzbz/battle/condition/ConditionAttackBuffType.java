package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.Objects;

@ConditionAnno(
   condition = 92
)
public class ConditionAttackBuffType implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      Entity entity = (Entity)action.getBlackboard().getSkillParam(1);
      if (Objects.isNull(entity)) {
         return false;
      } else {
         for(String param : Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam())) {
            if (entity.getBuffManager().isExistSubType(Short.parseShort(param))) {
               return true;
            }
         }

         return false;
      }
   }
}
