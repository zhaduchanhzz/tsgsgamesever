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

@BuffSubType(
   subType = 60
)
public class BuffSiLie extends ListenerBuff {
   public void listen(Event event, ListenerContext context) {
      Entity entity = (Entity)event.getParam(2);
      if (entity == this.source) {
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
         long hpMax = this.source.getBattleProperty(event.getAction(), 1);
         BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
         if (buffUseFun != null) {
            long value = (long)((float)(hpMax * (long)buffUseFun.getUseValue()) / 10000.0F);
            long maxValue = (long)((float)(this.caster.getBattleProperty(event.getAction(), 2) * (long)buffUseFun.getDependentValue()) / 10000.0F);
            if (value > maxValue) {
               value = maxValue;
            }

            EffectUtil.doShield(event.getAction(), this.caster, this.source, value, (SkillEffectModel)null, false, false, event, (byte)0);
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setEffectType(4);
            effectBuilder.setEffectId(this.id);
            effectBuilder.setTargetBattlePos(entity.getBattlePos());
            effectBuilder.setEffectCode(this.code);
            effectBuilder.setEffectValue(value);
            effectBuilder.setFinalValue(entity.getBaseProperty(99));
            event.getAction().getBlackboard().addBattleEffect(effectBuilder);
         }
      }
   }
}
