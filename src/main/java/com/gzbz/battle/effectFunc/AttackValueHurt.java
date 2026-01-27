package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.condition.ConditionProcessor;
import com.gzbz.battle.conditionProperty.ConditionProperty;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import java.util.List;

@EffectAnno(
   effect = 22
)
public class AttackValueHurt extends EffectFunc {
   public static final String RATE = "rate";
   public static final String HURT_TYPE = "hurtType";
   public static final int HURT_TYPE_DAMAGE = 1;
   public static final int HURT_TYPE_DAMAGE_PER = 2;
   public static final int HURT_TYPE_REAL_DAMAGE = 3;

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.isDead()) {
         return false;
      } else {
         int type = model.getParam("hurtType");
         if (source.getStateManager().checkState((short)21)) {
            return false;
         } else {
            long damage = 0L;
            if (type == 1) {
               long value = (Long)action.getBlackboard().getSkillParam(500 + source.getBattlePos(), 0L);
               damage = (long)model.getParam("rate") * value / 10000L;
            } else if (type == 2) {
               damage = source.getBaseProperty(1) * (long)model.getParam("rate") / 10000L;
            } else if (type == 3) {
               long value = (Long)action.getBlackboard().getSkillParam(1200 + source.getBattlePos(), 0L);
               damage = (long)model.getParam("rate") * value / 10000L;
            }

            if (damage == 0L) {
               return false;
            } else {
               for(Entity entity : source.getPkTeam().getEntityMap().values()) {
                  if (!entity.isDead()) {
                     for(ConditionProperty e : entity.getConditionPropertyManager().getTeamImproveAntiHurtList()) {
                        boolean success = ConditionProcessor.checkCondition(event.getAction(), e.skillEffectModel.getConditionType(), e.skillEffectModel.getConditions(), source, entity, event);
                        if (success) {
                           damage = (long)((float)damage * ((float)(Integer)e.skillEffectModel.getFuncParam().get("antiHurtRate") / 10000.0F));
                        }
                     }
                  }
               }

               for(ConditionProperty e : target.getConditionPropertyManager().getReduceAntiHurtList()) {
                  boolean success = ConditionProcessor.checkCondition(action, e.skillEffectModel.getConditionType(), e.skillEffectModel.getConditions(), source, target, event);
                  if (success) {
                     damage = (long)((float)damage * ((float)(Integer)e.skillEffectModel.getFuncParam().get("antiHurtRate") / 10000.0F));
                  }
               }

               for(Entity entity : target.getPkTeam().getEntityMap().values()) {
                  if (!entity.isDead()) {
                     for(ConditionProperty e : entity.getConditionPropertyManager().getTeamReduceAntiHurtList()) {
                        boolean success = ConditionProcessor.checkCondition(event.getAction(), e.skillEffectModel.getConditionType(), e.skillEffectModel.getConditions(), source, entity, event);
                        if (success) {
                           damage = (long)((float)damage * ((float)(Integer)e.skillEffectModel.getFuncParam().get("antiHurtRate") / 10000.0F));
                        }
                     }
                  }
               }

               if (event == null) {
                  event.getAction().getBlackboard().addSkillParam(24, 1);
               }

               target.recordHp(source);
               EffectUtil.doShield(action, source, target, damage, model, false, false, event, (byte)0);
               long realValue = target.getReduceValue(source);
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

               action.getBlackboard().plusSkillLongParam(400 + source.getBattlePos(), damage);
               action.getBlackboard().plusSkillLongParam(500 + target.getBattlePos(), damage);
               action.getBlackboard().plusSkillLongParam(1100 + source.getBattlePos(), realValue);
               action.getBlackboard().plusSkillLongParam(1200 + target.getBattlePos(), realValue);
               return true;
            }
         }
      }
   }
}
