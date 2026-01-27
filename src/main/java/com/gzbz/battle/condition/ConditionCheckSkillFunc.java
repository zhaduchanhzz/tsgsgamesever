package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 2
)
public class ConditionCheckSkillFunc implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      BattleScene scene = source.getScene();
      EntitySkill entitySkill = (EntitySkill)action.getBlackboard().getSkillParam(4, (Object)null);
      if (entitySkill != null) {
         for(String param : Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam())) {
            if (entitySkill.funcTypes.contains(Integer.parseInt(param))) {
               return true;
            }
         }
      }

      return false;
   }
}
