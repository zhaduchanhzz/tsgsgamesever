package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.passive.PassiveSkillEffect;
import com.gzbz.model.fun.ConditionModel;
import java.util.HashMap;

@ConditionAnno(
   condition = 57
)
public class ConditionCheckPassiveSkillEffect implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      int effectId = Integer.parseInt(conditionModel.getConditionParam());

      for(Entity entity : source.getPkTeam().getEntityMap().values()) {
         if (!entity.isDead()) {
            HashMap<Integer, PassiveSkillEffect> passiveSkillEffectMap = entity.getPassiveSkillMgr().getPassiveSkillMap();
            if (passiveSkillEffectMap != null && passiveSkillEffectMap.size() != 0) {
               for(PassiveSkillEffect effect : passiveSkillEffectMap.values()) {
                  if (effect.effectId == effectId) {
                     return false;
                  }
               }
            }
         }
      }

      return true;
   }
}
