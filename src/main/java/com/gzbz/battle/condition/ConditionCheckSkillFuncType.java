package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 16
)
public class ConditionCheckSkillFuncType implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      EntitySkill skill = (EntitySkill)event.getParam(5);

      for(String param : Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam())) {
         if (skill.funcTypes.contains(Integer.parseInt(param))) {
            return true;
         }
      }

      return false;
   }
}
