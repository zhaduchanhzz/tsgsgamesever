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
   subType = 70
)
public class BuffExHurt extends ListenerBuff {
   public void init(Entity source, Entity caster, BuffModel model, BuffManager buffManager) {
      source.getScene().getEventListener().addListener(source, this, (short)15, 9, "", (byte)0, (short)0, 0, model.getIsForce());
   }

   public void listen(Event event, ListenerContext context) {
      Entity attacker = (Entity)event.getParam(2);
      if (this.source != null) {
         long value = (Long)event.getAction().getBlackboard().getSkillParam(1200 + context.entity.getBattlePos(), 0L);
         if (value != 0L) {
            BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
            if (buffModel != null) {
               BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
               value = (long)((float)value * ((float)buffUseFun.getUseValue() / 10000.0F));
               EffectUtil.doShield(event.getAction(), attacker, this.source, value, (SkillEffectModel)null, false, false, event, (byte)0);
               if (super.source.isDead()) {
                  BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                  effectBuilder.setTargetBattlePos(super.source.getBattlePos());
                  effectBuilder.setEffectType(9);
                  event.getAction().getBlackboard().addBattleEffect(effectBuilder);
                  EffectUtil.putDeadEvent(event.getAction(), this.source, super.source, event);
                  super.source.addDeadTimesAndClear(event.getAction());
               }

               ++this.curUseTime;
               if (this.curUseTime > buffModel.getUseTimes()) {
                  this.buffMgr.deleteBuffByCode(event.getAction(), this.code, false);
               }

            }
         }
      }
   }
}
