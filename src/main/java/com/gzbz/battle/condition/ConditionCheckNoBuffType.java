package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.List;
import java.util.Objects;

@ConditionAnno(
   condition = 17
)
public class ConditionCheckNoBuffType implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      List<String> params = Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam());
      Entity targetEntity = (Entity)action.getBlackboard().getSkillParam(3, null);
      if (Objects.isNull(targetEntity)) {
         return false;
      } else {
         for(String param : params) {
            if (targetEntity.getBuffManager().isExistSubType(Short.parseShort(param))) {
               return false;
            }
         }

         return true;
      }
   }
}
