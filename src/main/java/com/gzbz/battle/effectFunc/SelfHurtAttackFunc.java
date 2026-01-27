package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import java.util.List;

@EffectAnno(
   effect = 91
)
public class SelfHurtAttackFunc extends EffectFunc {
   public static final String DEPENDENT = "depend";
   public static final String RATE = "rate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      long damage = 0L;
      int dependent = model.getParam("depend");
      if (dependent == 0) {
         long value = (Long)action.getBlackboard().getSkillParam(500 + source.getBattlePos(), 0L);
         damage = (long)model.getParam("rate") * value / 10000L;
      } else if (dependent == 1) {
         long value = (Long)action.getBlackboard().getSkillParam(1200 + source.getBattlePos(), 0L);
         damage = (long)model.getParam("rate") * value / 10000L;
      }

      if (damage == 0L) {
         return false;
      } else {
         EffectUtil.doShield(action, source, target, damage, model, false, false, event, (byte)0);
         if (target.isDead()) {
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setTargetBattlePos(target.getBattlePos());
            effectBuilder.setEffectType(9);
            effectBuilder.setEffectValue(0L);
            effectBuilder.setFinalValue(target.getBaseProperty(99));
            action.getBlackboard().addBattleEffect(effectBuilder);
            EffectUtil.putDeadEvent(action, source, target, event);
            target.addDeadTimesAndClear(action);
         }

         return true;
      }
   }
}
