package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.List;

@ConditionAnno(
   condition = 39
)
public class ConditionCheckMainOnly implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      List<Entity> lastSlotTargets = (List)action.getBlackboard().getSkillParam(10);
      if (lastSlotTargets != null && lastSlotTargets.size() != 0) {
         Entity mainEntity = (Entity)lastSlotTargets.get(0);
         Byte[] linePos = null;
         if (mainEntity.getTeamPos() < 2) {
            linePos = BattleMisc.BATTLE_LINE[0];
         } else {
            linePos = BattleMisc.BATTLE_LINE[1];
         }

         boolean isFind = true;
         Byte[] var10 = linePos;
         int var11 = linePos.length;

         for(int var12 = 0; var12 < var11; ++var12) {
            byte teamPos = var10[var12];
            Entity tempEntity = (Entity)mainEntity.getPkTeam().getEntityMap().get(teamPos);
            if (tempEntity != null && !tempEntity.isDead() && mainEntity != tempEntity) {
               isFind = false;
               break;
            }
         }

         return isFind;
      } else {
         return false;
      }
   }
}
