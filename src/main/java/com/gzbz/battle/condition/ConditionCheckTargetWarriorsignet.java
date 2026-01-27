package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.Set;

@ConditionAnno(
   condition = 18
)
public class ConditionCheckTargetWarriorsignet implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      Entity skillSource = (Entity)action.getBlackboard().getSkillParam(1, (Object)null);
      Entity skillTarget = (Entity)action.getBlackboard().getSkillParam(3, (Object)null);
      if (skillSource != source && target == skillTarget) {
         return false;
      } else {
         Set<Integer> baseSkills = skillTarget.getWarriorAndWarcraftBaseSkillIds();
         if (baseSkills.isEmpty()) {
            return false;
         } else {
            String[] parmas = conditionModel.getConditionParam().split("\\|");

            for(String param : parmas) {
               if (baseSkills.contains(Integer.valueOf(param))) {
                  return true;
               }
            }

            return false;
         }
      }
   }
}
