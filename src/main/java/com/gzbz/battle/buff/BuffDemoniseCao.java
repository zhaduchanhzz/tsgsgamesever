package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import java.util.ArrayList;

@BuffSubType(
   subType = 92
)
public class BuffDemoniseCao extends ListenerBuff {
   public long recoverHp;

   public void listen(Event event, ListenerContext context) {
      if (this.recoverHp != 0L) {
         ArrayList<Entity> targetList = new ArrayList();

         for(Entity target : this.source.getPkTeam().getEntityMap().values()) {
            if (target.entityType == 0 && target.isAlive() && target != this.source) {
               targetList.add(target);
            }
         }

         if (!targetList.isEmpty()) {
            long value = this.recoverHp / (long)targetList.size();

            for(Entity target : targetList) {
               EffectUtil.doShield(event.getAction(), this.source, target, value, (SkillEffectModel)null, false, false, event, (byte)0);
               if (target.isDead()) {
                  BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                  effectBuilder.setTargetBattlePos(target.getBattlePos());
                  effectBuilder.setEffectType(9);
                  event.getAction().getBlackboard().addBattleEffect(effectBuilder);
                  EffectUtil.putDeadEvent(event.getAction(), this.source, target, event);
                  target.addDeadTimesAndClear(event.getAction());
               }
            }

         }
      }
   }
}
