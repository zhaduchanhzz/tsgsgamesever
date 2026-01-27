package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import java.util.List;

@EffectAnno(
   effect = 66
)
public class Hurt2SelfTeamRecoverFunc extends RecoverHpFunc {
   public static final String LIMIT_PROPERTY_ID = "limitPropertyId";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.isDead()) {
         return false;
      } else {
         long value = this.getDependValue(action, source, target, model, event);
         if (value == 0L) {
            return false;
         } else if (target.getStateManager().checkState((short)14)) {
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setEffectType(28);
            effectBuilder.setTargetBattlePos(target.getBattlePos());
            action.getBlackboard().addBattleEffect(effectBuilder);
            return true;
         } else {
            if (model.getParam("rate") != 0) {
               value = (long)((float)value * ((float)(Integer)model.getFuncParam().get("rate") / 10000.0F));
            }

            value /= (long)targets.size();
            if (model.getFuncParam().containsKey("limitPropertyId") && model.getFuncParam().containsKey("limitRate")) {
               int propertyId = (Integer)model.getFuncParam().get("limitPropertyId");
               int limitRate = (Integer)model.getFuncParam().get("limitRate");
               long limitValue = source.getBaseProperty(propertyId) * (long)limitRate / 10000L;
               value = value > limitValue ? limitValue : value;
            }

            long newDamage = value;
            boolean isCriti = EffectUtil.isCrit(action, source, model);
            if (isCriti) {
               newDamage = (long)((float)value * ((float)(10000L + source.getBattleProperty(action, 25)) / 10000.0F));
            }

            target.recoverHp(action, source, model, isCriti, newDamage, event, true);
            action.getBlackboard().plusSkillLongParam(800 + source.getBattlePos(), newDamage);
            action.getBlackboard().plusSkillLongParam(700 + target.getBattlePos(), newDamage);
            Event reviveEvent = new Event((short)12, action, event);
            reviveEvent.addParam(12, action);
            reviveEvent.addParam(3, target);
            reviveEvent.addParam(2, source);
            reviveEvent.addParam(10, value);
            target.getScene().getEventListener().pushEvent(reviveEvent);
            return true;
         }
      }
   }
}
