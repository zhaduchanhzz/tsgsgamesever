package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.passive.PassiveSkillEffect;
import com.gzbz.model.fun.ConditionModel;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@ConditionAnno(
   condition = 66
)
public class ConditionMaxPassiveEffectId implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      PassiveSkillEffect currEffect = (PassiveSkillEffect)action.getBlackboard().getSkillParam(47);
      List<String> params = Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam());
      if (Objects.nonNull(currEffect) && params.contains(String.valueOf(currEffect.effectId))) {
         if (source.getTriggerEffectList().contains(currEffect.effectId)) {
            return true;
         } else {
            for(Entity entity : source.getPkTeam().getEntityMap().values()) {
               if (entity != source) {
                  HashMap<Integer, PassiveSkillEffect> passiveSkillEffectMap = entity.getPassiveSkillMgr().getPassiveSkillMap();

                  for(PassiveSkillEffect effect : passiveSkillEffectMap.values()) {
                     if (params.contains(String.valueOf(effect.effectId))) {
                        if (effect.effectId > currEffect.effectId) {
                           return false;
                        }

                        if (effect.effectId == currEffect.effectId && entity.getTriggerEffectList().contains(currEffect.effectId)) {
                           return false;
                        }
                     }
                  }
               }
            }

            Entity friendEntity = source.getPkTeam().getFriendEntity();
            if (Objects.nonNull(friendEntity)) {
               HashMap<Integer, PassiveSkillEffect> passiveSkillEffectMap = friendEntity.getPassiveSkillMgr().getPassiveSkillMap();

               for(PassiveSkillEffect effect : passiveSkillEffectMap.values()) {
                  if (params.contains(String.valueOf(effect.effectId))) {
                     if (effect.effectId > currEffect.effectId) {
                        return false;
                     }

                     if (effect.effectId == currEffect.effectId && friendEntity.getTriggerEffectList().contains(currEffect.effectId)) {
                        return false;
                     }
                  }
               }
            }

            source.addTriggerEffect(currEffect.effectId);
            if (source.isDead()) {
               return false;
            } else {
               return true;
            }
         }
      } else {
         return true;
      }
   }
}
