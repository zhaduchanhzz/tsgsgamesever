package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.conditionProperty.ConditionProperty;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.HashMap;

@ConditionAnno(
   condition = 96
)
public class ConditionCheckAddTargetsEffect implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      HashMap<Integer, ConditionProperty> addTargets = source.getConditionPropertyManager().addTargets;

      for(String param : Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam())) {
         int effectId = Integer.parseInt(param);
         if (addTargets.containsKey(effectId)) {
            return true;
         }
      }

      return false;
   }
}
