package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Objects;
import java.util.Set;

@BuffSubType(
   subType = 39
)
public class BuffChain extends ListenerBuff {
   public void listen(Event event, ListenerContext context) {
      Entity target = (Entity)event.getParam(3);
      if (!Objects.isNull(target)) {
         Set<Integer> subSet = target.getBuffManager().getSubBuff((short)39);
         if (!Objects.isNull(subSet) && subSet.size() != 0) {
            if (target.getForce() == super.source.getForce()) {
               Long damage = (Long)event.getParam(1);
               if (!Objects.isNull(damage) && damage != 0L) {
                  if (target != super.source) {
                     BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", super.id);
                     damage = (long)(damage.doubleValue() * (double)((BuffUseFun)buffModel.getFuncs().get(1)).getUseValue() / (double)10000.0F);
                     EffectUtil.doShield(event.getAction(), (Entity)event.getParam(2), super.source, damage, (SkillEffectModel)null, false, false, event, (byte)30);
                     if (super.source.isDead()) {
                        BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                        effectBuilder.setTargetBattlePos(super.source.getBattlePos());
                        effectBuilder.setEffectType(9);
                        event.getAction().getBlackboard().addBattleEffect(effectBuilder);
                        EffectUtil.putDeadEvent(event.getAction(), this.source, super.source, event);
                        super.source.addDeadTimesAndClear(event.getAction());
                     }

                  }
               }
            }
         }
      }
   }
}
