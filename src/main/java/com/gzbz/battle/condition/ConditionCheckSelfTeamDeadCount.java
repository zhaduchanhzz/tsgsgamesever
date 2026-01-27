package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;

@ConditionAnno(
   condition = 50
)
public class ConditionCheckSelfTeamDeadCount implements ConditionFunc {
   public static final byte GREATER_EQUAL = 1;
   public static final byte LESS_EQUAL = 2;

   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      int num = 0;
      if (source != null && source.getPkTeam() != null && source.getPkTeam().getEntityMap() != null) {
         for(Entity entity : source.getPkTeam().getEntityMap().values()) {
            if (entity.entityType == 0) {
               if (entity.isDead()) {
                  ++num;
               } else if (entity.getDeadTimes() > 0) {
                  ++num;
               }
            }
         }

         Entity friendEntity = source.getPkTeam().getFriendEntity();
         if (friendEntity != null) {
            if (friendEntity.isDead()) {
               ++num;
            } else if (friendEntity.getDeadTimes() > 0) {
               ++num;
            }
         }

         byte type = Byte.parseByte(conditionModel.getConditionParam());
         if (type == 1) {
            if (num >= conditionModel.getConditionValue()) {
               return true;
            }
         } else if (type == 2 && num <= conditionModel.getConditionValue()) {
            return true;
         }

         return false;
      } else {
         return false;
      }
   }
}
