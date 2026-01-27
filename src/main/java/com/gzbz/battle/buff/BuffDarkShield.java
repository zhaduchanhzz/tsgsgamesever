package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Objects;

@BuffSubType(
   subType = 106
)
public class BuffDarkShield extends ListenerBuff {
   public long hurtValue;

   public void listen(Event event, ListenerContext context) {
      if (this.hurtValue != 0L) {
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
         long damage = this.hurtValue;
         BuffUseFun endUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
         if (Objects.nonNull(endUseFun)) {
            damage = (long)((float)damage * ((float)endUseFun.getUseValue() / 10000.0F));
         }

         ArrayList<Entity> targetList = new ArrayList();
         byte force = BattleMisc.oppositionForce(this.source.getForce());

         for(Entity target : this.source.getScene().getPKTeam(force).getEntityMap().values()) {
            if (target.entityType == 0 && target.isAlive()) {
               targetList.add(target);
            }
         }

         if (!targetList.isEmpty()) {
            damage /= (long)targetList.size();

            for(Entity target : targetList) {
               EffectUtil.doShield(event.getAction(), this.source, target, damage, (SkillEffectModel)null, false, false, event, (byte)0);
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
