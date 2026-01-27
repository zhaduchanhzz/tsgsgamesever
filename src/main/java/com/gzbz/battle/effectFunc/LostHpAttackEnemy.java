package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import java.util.List;

@EffectAnno(
   effect = 43
)
public class LostHpAttackEnemy extends EffectFunc {
   public static final String LOST_HP_RATE = "lostHpRate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (source.isDead()) {
         return false;
      } else if (!source.getStateManager().checkState((short)22) && !source.getStateManager().checkState((short)25)) {
         long lostValue = (long)((float)(source.getBattleProperty(action, 1) * (long)model.getParam("lostHpRate")) / 10000.0F);
         if (source.getBaseProperty(99) < lostValue) {
            lostValue = source.getBaseProperty(99) - 1L;
         }

         if (lostValue == 0L) {
            return true;
         } else {
            float rate = (float)(Integer)action.getBlackboard().getSkillParam(13, 10000) / 10000.0F;
            lostValue = (long)((float)lostValue * rate);
            long leftValue = source.getBaseProperty(99) - lostValue;
            source.setBaseProperty(99, leftValue);
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setTargetBattlePos(source.getBattlePos());
            effectBuilder.setEffectType(6);
            effectBuilder.setEffectId(model.getId());
            effectBuilder.setEffectValue(lostValue);
            effectBuilder.setFinalValue(leftValue);
            action.getBlackboard().addBattleEffect(effectBuilder);
            return false;
         }
      } else {
         return false;
      }
   }
}
