package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.HeroModel;
import com.gzbz.model.fun.ConditionModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Objects;

@ConditionAnno(
   condition = 82
)
public class ConditionTargetNationRestrain implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
      if (Objects.isNull(attacker)) {
         return false;
      } else {
         HeroModel atkerModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", attacker.getId());
         if (Objects.isNull(atkerModel)) {
            return false;
         } else {
            Entity targetEntity = (Entity)action.getBlackboard().getSkillParam(3, (Object)null);
            if (Objects.isNull(targetEntity)) {
               return false;
            } else {
               HeroModel targetModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", targetEntity.getId());
               if (Objects.isNull(targetModel)) {
                  return false;
               } else {
                  int atkerNation = atkerModel.getNation();
                  if (atkerModel.getNation() == 10) {
                     atkerNation = attacker.inheritNation;
                  }

                  int targetNation = targetModel.getNation();
                  if (targetModel.getNation() == 10) {
                     targetNation = targetEntity.inheritNation;
                  }

                  switch (targetNation) {
                     case 1:
                        return atkerNation == 2;
                     case 2:
                        return atkerNation == 3;
                     case 3:
                        return atkerNation == 1;
                     case 4:
                        return atkerNation == 5;
                     case 5:
                        return atkerNation == 4;
                     default:
                        return false;
                  }
               }
            }
         }
      }
   }
}
