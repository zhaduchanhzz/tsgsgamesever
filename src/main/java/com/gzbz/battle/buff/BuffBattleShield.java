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
   subType = 109
)
public class BuffBattleShield extends ListenerBuff {
   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (!Objects.isNull(buffModel)) {
         BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
         if (!Objects.isNull(buffUseFun)) {
            if (event.getType() == 4) {
               Entity targetEntity = (Entity)event.getParam(3);
               if (targetEntity == this.source) {
                  long value = 0L;
                  Entity sourceEntity = (Entity)event.getParam(2);
                  if (!sourceEntity.isDead()) {
                     boolean ignoreShield = sourceEntity.getConditionPropertyManager().ignoreShieldEffect(event.getAction());
                     if (!ignoreShield) {
                        long hurt = (Long)event.getParam(34);
                        value = (long)((float)(hurt * (long)buffUseFun.getExDependentValue()) / 10000.0F);

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

                        EffectUtil.doShield(event.getAction(), this.source, sourceEntity, value, (SkillEffectModel)null, false, false, event, (byte)0);
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
   }
}
