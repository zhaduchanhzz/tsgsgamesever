package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.condition.ConditionProcessor;
import com.gzbz.battle.conditionProperty.ConditionProperty;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Objects;

@BuffSubType(
   subType = 8
)
public class BuffAntiHurtGuojia extends ListenerBuff {
   public static int ANTI_DAMAGE = 0;
   public static int ANTI_CASTER = 1;

   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (!Objects.isNull(buffModel)) {
         Entity targetEntity = (Entity)event.getParam(3);
         if (targetEntity == this.source) {
            BuffModel buffModel1 = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
            BuffUseFun buffUseFun = (BuffUseFun)buffModel1.getFuncs().get(1);
            long value = 0L;
            Entity sourceEntity = (Entity)event.getParam(2);
            if (!sourceEntity.isDead()) {
               boolean ignoreShield = sourceEntity.getConditionPropertyManager().ignoreShieldEffect(event.getAction());
               if (!ignoreShield) {
                  if (buffUseFun.getDependentType() == 0) {
                     value = (long)((float)((Long)event.getParam(1) * (long)((BuffUseFun)buffModel.getFuncs().get(1)).getUseValue()) / 10000.0F);
                  } else if (buffUseFun.getDependentType() == ANTI_CASTER) {
                     value = this.caster.getBattleProperty(event.getAction(), buffUseFun.getDependentId());
                     value = (long)((float)value * ((float)buffUseFun.getDependentValue() / 10000.0F));
                  }

                  for(Entity entity : this.source.getPkTeam().getEntityMap().values()) {
                     if (!entity.isDead()) {
                        for(ConditionProperty e : entity.getConditionPropertyManager().getTeamImproveAntiHurtList()) {
                           boolean success = ConditionProcessor.checkCondition(event.getAction(), e.skillEffectModel.getConditionType(), e.skillEffectModel.getConditions(), this.source, entity, event);
                           if (success) {
                              value = (long)((float)value * ((float)(Integer)e.skillEffectModel.getFuncParam().get("antiHurtRate") / 10000.0F));
                           }
                        }
                     }
                  }

                  for(ConditionProperty e : sourceEntity.getConditionPropertyManager().getReduceAntiHurtList()) {
                     boolean success = ConditionProcessor.checkCondition(event.getAction(), e.skillEffectModel.getConditionType(), e.skillEffectModel.getConditions(), this.source, sourceEntity, event);
                     if (success) {
                        value = (long)((float)value * ((float)(Integer)e.skillEffectModel.getFuncParam().get("antiHurtRate") / 10000.0F));
                     }
                  }

                  for(Entity entity : sourceEntity.getPkTeam().getEntityMap().values()) {
                     if (!entity.isDead()) {
                        for(ConditionProperty e : entity.getConditionPropertyManager().getTeamReduceAntiHurtList()) {
                           boolean success = ConditionProcessor.checkCondition(event.getAction(), e.skillEffectModel.getConditionType(), e.skillEffectModel.getConditions(), this.source, entity, event);
                           if (success) {
                              value = (long)((float)value * ((float)(Integer)e.skillEffectModel.getFuncParam().get("antiHurtRate") / 10000.0F));
                           }
                        }
                     }
                  }

                  BuffUseFun endUseFun = (BuffUseFun)buffModel1.getFuncs().get(2);
                  if (Objects.nonNull(endUseFun)) {
                     long limit = this.caster.getBattleProperty(event.getAction(), endUseFun.getDependentId());
                     limit = (long)((float)limit * ((float)endUseFun.getDependentValue() / 10000.0F));
                     value = Math.min(value, limit);
                  }

                  EffectUtil.doShield(event.getAction(), this.source, sourceEntity, value, (SkillEffectModel)null, false, false, event, (byte)0);
                  if (buffUseFun.getExDependentValue() == 1) {
                     this.buffMgr.deleteBuffByCode(event.getAction(), this.code, true);
                  }

                  if (sourceEntity.isDead()) {
                     BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                     effectBuilder.setTargetBattlePos(sourceEntity.getBattlePos());
                     effectBuilder.setEffectType(9);
                     event.getAction().getBlackboard().addBattleEffect(effectBuilder);
                     EffectUtil.putDeadEvent(event.getAction(), this.source, sourceEntity, event);
                     sourceEntity.addDeadTimesAndClear(event.getAction());
                  }

               }
            }
         }
      }
   }
}
