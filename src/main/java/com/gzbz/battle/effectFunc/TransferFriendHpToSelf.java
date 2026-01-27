package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import java.util.List;

@EffectAnno(
   effect = 44
)
public class TransferFriendHpToSelf extends EffectFunc {
   public static final String RATE = "rate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (!target.getStateManager().checkState((short)22) && !target.getStateManager().checkState((short)25)) {
         long addHp = (long)((float)model.getParam("rate") / 10000.0F * (float)target.getBaseProperty(99));
         if (addHp == 0L) {
            return false;
         } else {
            long leftValue = target.getBaseProperty(99) - addHp;
            target.setBaseProperty(99, leftValue);
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setTargetBattlePos(target.getBattlePos());
            effectBuilder.setEffectType(6);
            effectBuilder.setEffectId(model.getId());
            effectBuilder.setEffectValue(addHp);
            effectBuilder.setFinalValue(leftValue);
            action.getBlackboard().addBattleEffect(effectBuilder);
            source.recoverHp(action, source, model, false, addHp, (Event)null, true);
            return false;
         }
      } else {
         return false;
      }
   }
}
