package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Objects;
import misc.RandomUtil;

@BuffSubType(
   subType = 35
)
public class BuffExhurtFunc extends ListenerBuff {
   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (!Objects.isNull(buffModel)) {
         int propertyId = ((BuffUseFun)buffModel.getFuncs().get(1)).getUseId();
         long value;
         if (propertyId != 0) {
            value = (long)((float)(this.caster.getBaseProperty(propertyId) * (long)((BuffUseFun)buffModel.getFuncs().get(1)).getUseValue()) / 10000.0F);
         } else {
            value = (long)((float)(this.caster.getBaseProperty(2) * (long)((BuffUseFun)buffModel.getFuncs().get(1)).getUseValue()) / 10000.0F);
         }

         BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(2);
         if (Objects.nonNull(useFun)) {
            int rate = useFun.getExDependentValue();
            if (rate == 0) {
               rate = 10000;
            }

            if (RandomUtil.randTenThousand() >= rate) {
               return;
            }

            int property = useFun.getUseId();
            if (property != 0) {
               long limitValue = (long)((float)(this.caster.getBaseProperty(property) * (long)useFun.getUseValue()) / 10000.0F);
               value = value > limitValue ? limitValue : value;
            }
         }

         EffectUtil.doShield(event.getAction(), this.caster, this.source, value, (SkillEffectModel)null, false, false, event, (byte)31);
         if (this.source.isDead()) {
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setTargetBattlePos(this.source.getBattlePos());
            effectBuilder.setEffectType(9);
            event.getAction().getBlackboard().addBattleEffect(effectBuilder);
            EffectUtil.putDeadEvent(event.getAction(), this.source, this.source, event);
            this.source.addDeadTimesAndClear(event.getAction());
         }

      }
   }
}
