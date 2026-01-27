package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import java.util.List;

@EffectAnno(
   effect = 76
)
public class StealTargetHpFunc extends EffectFunc {
   public static final String PROPERTY = "propertyId";
   public static final String RATE = "rate";
   public static final String LIMIT_RATE = "limitRate";
   public static final String LIMIT_PROPERTY_ID = "limitPropertyId";
   public static final String DEPENDENT = "dependent";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (!target.getStateManager().checkState((short)22) && !target.getStateManager().checkState((short)25)) {
         long lostValue = (long)((float)model.getParam("rate") / 10000.0F * (float)target.getBaseProperty(model.getParam("propertyId")));
         if (lostValue == 0L) {
            return false;
         } else {
            if (model.getFuncParam().containsKey("limitRate") && model.getFuncParam().containsKey("limitPropertyId")) {
               long limitValue = (long)((float)(source.getBaseProperty(model.getParam("limitPropertyId")) * (long)model.getParam("limitRate")) / 10000.0F);
               lostValue = lostValue > limitValue ? limitValue : lostValue;
            }

            lostValue = EffectUtil.linkBuffPositive(action, event, source, target, lostValue);
            lostValue = EffectUtil.liveAndDieBuf(source, target, lostValue);
            long leftValue = Math.max(0L, target.getBaseProperty(99) - lostValue);
            target.setBaseProperty(99, leftValue);
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setTargetBattlePos(target.getBattlePos());
            effectBuilder.setEffectType(6);
            effectBuilder.setEffectId(model.getId());
            effectBuilder.setEffectValue(lostValue);
            effectBuilder.setFinalValue(leftValue);
            action.getBlackboard().addBattleEffect(effectBuilder);
            EffectUtil.putLiveAndDieApportionEvent(action, event);
            long resumeHp = lostValue;
            if (model.getFuncParam().containsKey("dependent") && (Integer)model.getFuncParam().get("dependent") == 1) {
               float cureRate = (float)(10000L + source.getBattleProperty(action, 18)) / 10000.0F * (float)(10000L + source.getBattleProperty(action, 19)) / 10000.0F;
               resumeHp = (long)((float)lostValue * cureRate);
            }

            boolean isCriti = EffectUtil.isCrit(action, source, model);
            if (isCriti) {
               resumeHp = (long)((float)resumeHp * ((float)(10000L + source.getBattleProperty(action, 25)) / 10000.0F));
            }

            source.recoverHp(action, source, model, false, resumeHp, event, true);
            return true;
         }
      } else {
         return false;
      }
   }
}
