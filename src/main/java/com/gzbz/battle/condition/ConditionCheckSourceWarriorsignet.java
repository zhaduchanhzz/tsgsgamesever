package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.Set;

@ConditionAnno(
   condition = 27
)
public class ConditionCheckSourceWarriorsignet implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      Entity skillSource = (Entity)action.getBlackboard().getSkillParam(1, null);
      Entity skillTarget = (Entity)action.getBlackboard().getSkillParam(3, null);
      if (skillTarget == source && skillSource != null) {
         Set<Integer> baseSkills = skillSource.getWarriorAndWarcraftBaseSkillIds();
         if (baseSkills != null && !baseSkills.isEmpty()) {
            String[] parmas = conditionModel.getConditionParam().split("\\|");

            for(String param : parmas) {
               if (baseSkills.contains(Integer.valueOf(param))) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
