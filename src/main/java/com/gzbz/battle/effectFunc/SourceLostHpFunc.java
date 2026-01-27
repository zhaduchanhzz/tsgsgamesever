package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import java.util.List;

@EffectAnno(
   effect = 70
)
public class SourceLostHpFunc extends EffectFunc {
   public static final String LOST_HP_RATE = "lostHpRate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (source.isDead()) {
         return false;
      } else if (!source.getStateManager().checkState((short)22) && !source.getStateManager().checkState((short)25)) {
         long lostValue = (long)((float)(source.getBattleProperty(action, 1) * (long)model.getParam("lostHpRate")) / 10000.0F);
         if (lostValue == 0L) {
            return true;
         } else {
            float rate = (float)(Integer)action.getBlackboard().getSkillParam(13, 10000) / 10000.0F;
            lostValue = (long)((float)lostValue * rate);
            long leftValue = source.getBaseProperty(99) - lostValue;
            if (leftValue < 0L) {
               leftValue = 0L;
            }

            source.setBaseProperty(99, leftValue);
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setTargetBattlePos(source.getBattlePos());
            effectBuilder.setEffectType(6);
            effectBuilder.setEffectId(model.getId());
            effectBuilder.setEffectValue(lostValue);
            effectBuilder.setFinalValue(leftValue);
            action.getBlackboard().addBattleEffect(effectBuilder);
            if (source.isDead()) {
               BattleMsg.S2C_Battle_Effect.Builder builder = BattleMsg.S2C_Battle_Effect.newBuilder();
               builder.setTargetBattlePos(source.getBattlePos());
               builder.setEffectType(9);
               builder.setEffectValue(0L);
               builder.setFinalValue(source.getBaseProperty(99));
               action.getBlackboard().addBattleEffect(builder);
               EffectUtil.putDeadEvent(action, source, source, event);
               source.addDeadTimesAndClear(action);
            }

            return true;
         }
      } else {
         return false;
      }
   }
}
