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
   effect = 53
)
public class ApportionHurtHpMaxPercent extends EffectFunc {
   public static final String PROPERTY_ID = "propertyId";
   public static final String RATE = "rate";
   public static final String MAX_DAMAGE_RATE = "maxDamageRate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (!target.isDead() && target.entityType == 0) {
         Entity dependEntity = (Entity)event.getParam(3);
         if (dependEntity == null) {
            return false;
         } else {
            long damage = (long)((float)(dependEntity.getBaseProperty((Integer)model.getFuncParam().get("propertyId")) * (long)(Integer)model.getFuncParam().get("rate")) / 10000.0F);
            float maxDamage = (float)(source.getBaseProperty(2) * (long)(Integer)model.getFuncParam().get("maxDamageRate")) / 10000.0F;
            damage = (long)Math.min((float)damage, maxDamage);
            int rate = 10000;
            if (action.getBlackboard().getSkillParam(29) == source) {
               rate = (Integer)action.getBlackboard().getSkillParam(13, 10000);
            }

            damage = damage / (long)targets.size() * (long)rate / 10000L;
            target.recordHp(source);
            EffectUtil.doShield(action, source, target, damage, model, false, false, event, (byte)0);
            long realValue = target.getReduceValue(source);
            long shieldPreHurt = (Long)action.getBlackboard().getSkillParam(2200 + target.getBattlePos(), 0L);
            if (target.isDead()) {
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectBuilder.setTargetBattlePos(target.getBattlePos());
               effectBuilder.setEffectType(9);
               effectBuilder.setEffectValue(1L);
               effectBuilder.setFinalValue(target.getBaseProperty(99));
               effectBuilder.setEffectSetId(model.getId());
               action.getBlackboard().addBattleEffect(effectBuilder);
               EffectUtil.putDeadEvent(action, source, target, event);
               target.addDeadTimesAndClear(action);
            }

            action.getBlackboard().plusSkillLongParam(400 + source.getBattlePos(), damage);
            action.getBlackboard().plusSkillLongParam(500 + target.getBattlePos(), damage);
            action.getBlackboard().plusSkillLongParam(1100 + source.getBattlePos(), realValue);
            action.getBlackboard().plusSkillLongParam(1200 + target.getBattlePos(), realValue);
            Event hurtEvent = new Event((short)4, action, event);
            hurtEvent.addParam(1, realValue);
            hurtEvent.addParam(2, source);
            hurtEvent.addParam(3, target);
            hurtEvent.addParam(34, shieldPreHurt);
            hurtEvent.addParam(14, targets);
            EntitySkill skill = (EntitySkill)action.getBlackboard().getSkillParam(4, (Object)null);
            if (Objects.isNull(skill)) {
               return false;
            } else {
               hurtEvent.addParam(5, skill);
               source.getScene().getEventListener().pushEvent(hurtEvent);
               return true;
            }
         }
      } else {
         return false;
      }
   }
}
