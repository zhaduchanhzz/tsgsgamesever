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
   condition = 35
)
public class ConditionTeamPos implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      List<String> params = Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam());
      if (Objects.isNull(source)) {
         return false;
      } else {
         int num = 0;

         for(String param : params) {
            byte battlePos = target.getBattlePos();
            if (Byte.parseByte(param) == battlePos) {
               return true;
            }
         }

         return false;
      }
   }
}
