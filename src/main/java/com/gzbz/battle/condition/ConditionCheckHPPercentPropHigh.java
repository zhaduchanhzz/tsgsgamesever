package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.model.fun.ConditionModel;
import java.util.List;

@ConditionAnno(
   condition = 90
)
public class ConditionCheckHPPercentPropHigh implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      int sourcePercent = (int)((float)source.getBaseProperty(99) * 1.0F / (float)source.getBaseProperty(1) * 10000.0F);
      byte force = BattleMisc.oppositionForce(source.getForce());
      BattlePKTeam battlePKTeam = source.getScene().getPKTeam(force);

      for(String param : Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam())) {
         List<Entity> list = battlePKTeam.getTargetSelector().getTargets(action, source, (short)9, 1, param);
         if (list.size() > 0) {
            Entity entity = (Entity)list.get(0);
            int targetPercent = (int)((float)entity.getBaseProperty(99) * 1.0F / (float)entity.getBaseProperty(1) * 10000.0F);
            if (conditionModel.getConditionValue() == 1) {
               if (sourcePercent > targetPercent) {
                  return true;
               }
            } else if (sourcePercent <= targetPercent) {
               return true;
            }
         }
      }

      return false;
   }
}
