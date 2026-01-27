package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import java.util.List;
import java.util.Map;

@EffectAnno(
   effect = 67
)
public class DrawHpFunc extends EffectFunc {
   public static final String PROPERTY_ID = "propertyId";
   public static final String RATE = "rate";
   public static final String DEPEDDENT = "dependent";
   public static final String MAX_DAMAGE_RATE = "maxDamageRate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel skillEffectModel, Event event) {
      if (!source.getStateManager().checkState((short)22) && !source.getStateManager().checkState((short)25)) {
         Map<String, Integer> funcParam = skillEffectModel.getFuncParam();
         long propertyValue = source.getBattleProperty(action, (Integer)funcParam.get("propertyId"));
         long lostValue = (long)((float)(propertyValue * (long)(Integer)funcParam.get("rate")) / 10000.0F);
         long limitValue = 0L;
         if (funcParam.containsKey("dependent") && funcParam.containsKey("maxDamageRate")) {
            limitValue = target.getBattleProperty(action, (Integer)funcParam.get("dependent")) * (long)(Integer)funcParam.get("maxDamageRate") / 10000L;
            lostValue = lostValue > limitValue ? limitValue : lostValue;
         }

         lostValue = EffectUtil.linkBuffPositive(action, event, target, source, lostValue);
         lostValue = EffectUtil.liveAndDieBuf(target, source, lostValue);
         long leftValue = Math.max(0L, source.getBaseProperty(99) - lostValue);
         source.setBaseProperty(99, leftValue);
         BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
         effectBuilder.setTargetBattlePos(source.getBattlePos());
         effectBuilder.setEffectId(skillEffectModel.getId());
         effectBuilder.setEffectType(31);
         effectBuilder.setEffectValue(lostValue);
         effectBuilder.setFinalValue(leftValue);
         action.getBlackboard().addBattleEffect(effectBuilder);
         EffectUtil.putLiveAndDieApportionEvent(action, event);
         if (target.isDead()) {
            return true;
         } else {
            long resumeHp = lostValue;
            boolean isCriti = EffectUtil.isCrit(action, target, skillEffectModel);
            if (isCriti) {
               resumeHp = (long)((float)lostValue * ((float)(10000L + target.getBattleProperty(action, 25)) / 10000.0F));
            }

            float cureRate = (float)(10000L + target.getBattleProperty(action, 18)) / 10000.0F * (float)(10000L + target.getBattleProperty(action, 19)) / 10000.0F;
            resumeHp = (long)((float)resumeHp * cureRate);
            if (limitValue > 0L && resumeHp > limitValue) {
               resumeHp = limitValue;
            }

            target.recoverHp(action, target, (SkillEffectModel)null, isCriti, resumeHp, event, true);
            return true;
         }
      } else {
         return false;
      }
   }
}
