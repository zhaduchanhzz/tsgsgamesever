package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;

@BuffSubType(
   subType = 25
)
public class BuffBrokenType extends ListenerBuff {
   private int time;

   public void init(Entity source, Entity caster, BuffModel buffModel, BuffManager buffManager) {
      super.init(source, caster, buffModel, buffManager);
      source.getScene().getEventListener().addListener(source, this, (short)6, 3, (String)null, buffModel.getCheckDead(), (short)0, 0, buffModel.getIsForce());
   }

   public void listen(Event event, ListenerContext context) {
      Entity targetEntity = (Entity)event.getAction().getBlackboard().getSkillParam(3);
      ++this.time;
      BuffModel model = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      BuffUseFun buffUseFun = (BuffUseFun)model.getFuncs().get(1);
      Event brokenEvent = new Event((short)9, event.getAction(), event);
      brokenEvent.addParam(2, event.getParam(2));
      brokenEvent.addParam(3, targetEntity);
      brokenEvent.addParam(7, model.getSubCls());
      if (this.time >= buffUseFun.getUseValue()) {
         super.buffMgr.deleteBuffByCode(event.getAction(), this.code, false);
         brokenEvent.addParam(18, model.getSubCls());
         if (this.source.isDead()) {
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setTargetBattlePos(this.source.getBattlePos());
            effectBuilder.setEffectType(9);
            effectBuilder.setEffectValue(1L);
            effectBuilder.setFinalValue(this.source.getBaseProperty(99));
            event.getAction().getBlackboard().addBattleEffect(effectBuilder);
            EffectUtil.putDeadEvent(event.getAction(), targetEntity, this.source, event);
            this.source.clear(event.getAction());
         }
      }

      targetEntity.getScene().getEventListener().pushEvent(brokenEvent);
   }
}
