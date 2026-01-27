package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import java.util.List;
import java.util.Objects;

@EffectAnno(
   effect = 35
)
public class YuRecoverHp extends RecoverHpFunc {
   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (!Objects.isNull(target) && !target.getStateManager().checkState((short)14) && !target.isDead()) {
         long value = (Long)action.getBlackboard().getSkillParam(26);
         long minValue = (long)((float)(source.getBaseProperty(98) * (long)model.getParam("rate")) / 10000.0F);
         long maxValue = (long)((float)(source.getBaseProperty(98) * (long)model.getParam("limitRate")) / 10000.0F);
         float totalRate = (float)(10000L + source.getBattleProperty(action, 18)) / 10000.0F * (float)(10000L + target.getBattleProperty(action, 19)) / 10000.0F;
         totalRate *= target.getBuffManager().getBeCureValue();
         value = (long)((float)value * totalRate);
         if (value < minValue) {
            value = minValue;
         } else if (value > maxValue) {
            value = maxValue;
         }

         target.recoverHp(action, source, model, false, value, event, true);
         Event reviveEvent = new Event((short)12, action, event);
         reviveEvent.addParam(12, action);
         reviveEvent.addParam(2, source);
         reviveEvent.addParam(3, target);
         reviveEvent.addParam(10, value);
         target.getScene().getEventListener().pushEvent(reviveEvent);
         return true;
      } else {
         BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
         effectBuilder.setEffectType(28);
         effectBuilder.setTargetBattlePos(target.getBattlePos());
         action.getBlackboard().addBattleEffect(effectBuilder);
         return true;
      }
   }
}
