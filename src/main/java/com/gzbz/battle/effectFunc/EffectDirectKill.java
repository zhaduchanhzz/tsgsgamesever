package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import java.util.List;

@EffectAnno(
   effect = 32
)
public class EffectDirectKill extends EffectFunc {
   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      Entity sourceEntity = (Entity)event.getParam(2);
      if (sourceEntity != source) {
         return false;
      } else if (target.getBaseProperty(99) * 10000L / target.getBaseProperty(1) > (long)model.getParam("rate")) {
         return false;
      } else {
         long limitMax = (long)((float)(source.getBaseProperty(2) * (long)model.getParam("limitRate")) / 10000.0F);
         long value = target.getBaseProperty(99);
         value = value > limitMax ? limitMax : value;
         target.recordHp(source);
         EffectUtil.doShield(action, source, target, value, model, false, false, event, (byte)29);
         long realValue = target.getReduceValue(source);
         action.getBlackboard().plusSkillLongParam(1100 + source.getBattlePos(), realValue);
         action.getBlackboard().plusSkillLongParam(1200 + target.getBattlePos(), realValue);
         if (target.isDead()) {
            BattleMsg.S2C_Battle_Effect.Builder deadEffectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            deadEffectBuilder.setTargetBattlePos(target.getBattlePos());
            deadEffectBuilder.setEffectType(9);
            action.getBlackboard().addBattleEffect(deadEffectBuilder);
            EffectUtil.putDeadEvent(action, source, target, event);
            target.addDeadTimesAndClear(action);
         }

         return true;
      }
   }
}
