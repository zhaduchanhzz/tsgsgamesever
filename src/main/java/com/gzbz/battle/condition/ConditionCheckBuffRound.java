package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.passive.PassiveSkillEffect;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.ConditionModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.HashMap;

@ConditionAnno(
   condition = 44
)
public class ConditionCheckBuffRound implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      SkillEffectModel effectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", conditionModel.getConditionValue());
      HashMap<Integer, PassiveSkillEffect> passiveSkillEffectHashMap = target.getPassiveSkillMgr().getPassiveSkillMap();
      if (passiveSkillEffectHashMap != null && passiveSkillEffectHashMap.size() != 0) {
         int times = Integer.parseInt(conditionModel.getConditionParam());

         for(PassiveSkillEffect passiveSkillEffect : passiveSkillEffectHashMap.values()) {
            if (passiveSkillEffect.effectId == effectModel.getId() && effectModel.getTriggerTime() - passiveSkillEffect.triggerTime >= times) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }
}
