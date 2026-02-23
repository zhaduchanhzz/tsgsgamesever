package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import java.util.List;
import java.util.Objects;

@EffectAnno(
   effect = 24
)
public class EffectHurtHpPercent extends EffectFunc {
   public static String RATE = "rate";
   public static String MAX_ATTACT = "maxAttact";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.isDead()) {
         return false;
      } else if (target.getBuffManager().checkSubBuff((short)67)) {
         BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
         effectBuilder.setEffectType(13);
         effectBuilder.setTargetBattlePos(target.getBattlePos());
         action.getBlackboard().addBattleEffect(effectBuilder);
         return false;
      } else {
         long damage = target.getBaseProperty(1) * (long)(Integer)model.getFuncParam().get(RATE) / 10000L;
         long maxDamage = source.getBaseProperty(2) * (long)(Integer)model.getFuncParam().get(MAX_ATTACT) / 10000L;
         damage = Math.min(damage, maxDamage);
         target.recordHp(source);
         EffectUtil.doShield(action, source, target, damage, model, false, false, event, (byte)0);
         long realValue = target.getReduceValue(source);
         long shieldPreHurt = (Long)action.getBlackboard().getSkillParam(2200 + target.getBattlePos(), 0L);
         if (target.isDead()) {
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setTargetBattlePos(target.getBattlePos());
            effectBuilder.setEffectType(9);
            action.getBlackboard().addBattleEffect(effectBuilder);
            EffectUtil.putDeadEvent(action, source, target, event);
            target.addDeadTimesAndClear(action);
         }

         Event hurtEvent = new Event((short)4, action, event);
         hurtEvent.addParam(1, realValue);
         hurtEvent.addParam(2, source);
         hurtEvent.addParam(3, target);
         hurtEvent.addParam(34, shieldPreHurt);
         hurtEvent.addParam(14, targets);
         EntitySkill skill = (EntitySkill)action.getBlackboard().getSkillParam(4, null);
         if (Objects.isNull(skill)) {
            return false;
         } else {
            hurtEvent.addParam(5, skill);
            source.getScene().getEventListener().pushEvent(hurtEvent);
            DamageFunc.recordDamageEntity(action, source, target);
            action.getBlackboard().plusSkillLongParam(400 + source.getBattlePos(), damage);
            action.getBlackboard().plusSkillLongParam(500 + target.getBattlePos(), damage);
            action.getBlackboard().plusSkillLongParam(1100 + source.getBattlePos(), realValue);
            action.getBlackboard().plusSkillLongParam(1200 + target.getBattlePos(), realValue);
            return true;
         }
      }
   }
}
