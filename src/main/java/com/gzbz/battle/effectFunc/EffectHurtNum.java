package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;

@EffectAnno(
   effect = 19
)
public class EffectHurtNum extends EffectFunc {
   public static final String VALUE = "value";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      boolean isAlive = target.isAlive();
      int times = model.getFuncTimes();
      long totalValue = 0L;
      target.recordHp(source);
      long critiRealValue = 0L;
      long curCritiValue = 0L;
      long newDamage = (long)(Integer)model.getFuncParam().get("value");
      boolean isCrit = EffectUtil.isCrit(action, source, target, model);
      if (isCrit) {
         long finalCritiDamage = (long)((float)source.getBattleProperty(action, 6) - (float)target.getBattleProperty(action, 20) * 2.0F);
         int baseCritiDamage = ApplicationContextProvider.getConfigInt("baseCritiDamage", 10000);
         finalCritiDamage = finalCritiDamage > (long)baseCritiDamage ? finalCritiDamage : (long)baseCritiDamage;
         newDamage = (long)((float)newDamage * ((float)finalCritiDamage / 10000.0F));
      }

      if (isCrit) {
         curCritiValue = target.getBaseProperty(99);
      }

      EffectUtil.doApportion(action, source, target, newDamage, model, isCrit, event, 0);
      if (isCrit) {
         critiRealValue += curCritiValue - target.getBaseProperty(99);
      }

      action.getBlackboard().plusSkillLongParam(1300 + target.getBattlePos(), critiRealValue);
      action.getBlackboard().plusSkillLongParam(400 + source.getBattlePos(), newDamage);
      action.getBlackboard().plusSkillLongParam(500 + target.getBattlePos(), newDamage);
      totalValue += newDamage;
      long realValue = target.getReduceValue(source);
      action.getBlackboard().plusSkillLongParam(1100 + source.getBattlePos(), realValue);
      action.getBlackboard().plusSkillLongParam(1200 + target.getBattlePos(), realValue);
      source.addAttackValue(action, totalValue, event);
      target.addDamageValue(totalValue);
      if (isAlive && target.isDead()) {
         BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
         effectBuilder.setTargetBattlePos(target.getBattlePos());
         effectBuilder.setEffectType(9);
         effectBuilder.setEffectValue(1L);
         effectBuilder.setFinalValue(target.getBaseProperty(99));
         action.getBlackboard().addBattleEffect(effectBuilder);
         EffectUtil.putDeadEvent(action, source, target, event);
         target.addDeadTimesAndClear(action);
      }

      return true;
   }
}
