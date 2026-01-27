package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 91
)
public class ConditionComPareTeamHPPercent implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      if (source == null) {
         return false;
      } else {
         long selfTeamCurHp = 0L;
         long selfTeamHpMax = 0L;

         for(Entity entity : source.getPkTeam().getEntityMap().values()) {
            selfTeamCurHp += (Long)action.getBlackboard().getSkillParam(3100 + entity.getBattlePos(), 0L);
            selfTeamHpMax += entity.getBaseProperty(1);
         }

         double sourcePercent = (double)selfTeamCurHp / (double)selfTeamHpMax;
         long enemyTeamCurHp = 0L;
         long enemyTeamHpMax = 0L;
         byte force = BattleMisc.oppositionForce(source.getForce());
         BattlePKTeam enemyTeam = source.getScene().getPKTeam(force);

         for(Entity entity : enemyTeam.getEntityMap().values()) {
            enemyTeamCurHp += (Long)action.getBlackboard().getSkillParam(3100 + entity.getBattlePos(), 0L);
            enemyTeamHpMax += entity.getBaseProperty(1);
         }

         double enemyPercent = (double)enemyTeamCurHp / (double)enemyTeamHpMax;
         if (conditionModel.getConditionValue() == 1) {
            if (sourcePercent >= enemyPercent) {
               return true;
            }
         } else if (sourcePercent < enemyPercent) {
            return true;
         }

         return false;
      }
   }
}
