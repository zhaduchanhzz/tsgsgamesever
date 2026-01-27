package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.condition.ConditionProcessor;
import com.gzbz.battle.conditionProperty.ConditionProperty;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.Listener;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Objects;
import java.util.Set;

@BuffSubType(
   subType = 113
)
public class BuffDelAntiHurt extends Buff implements Listener {
   public static int ANTI_DAMAGE = 0;
   public static int ANTI_CASTER = 1;

   public void init(Entity source, Entity caster, BuffModel model, BuffManager buffManager) {
      super.init(source, caster, model, buffManager);

      for(KeyValFun keyValFun : model.getEventType().values()) {
         source.getScene().getEventListener().addListener(source, this, (short)keyValFun.getKey(), keyValFun.getVal(), keyValFun.getExParams(), model.getCheckDead(), model.getSubCls(), 10000, model.getIsForce());
      }

   }

   public void listen(Event event, ListenerContext context) {
      Entity targetEntity = (Entity)event.getParam(3);
      if (targetEntity == this.source) {
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
         if (!Objects.isNull(buffModel)) {
            BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
            if (!Objects.isNull(useFun)) {
               Set<Integer> codeSet = this.source.getBuffManager().getSubBuff(buffModel.getSubCls());
               if (!Objects.isNull(codeSet) && codeSet.size() >= useFun.getExDependentValue() && useFun.getExDependentValue() > 0) {
                  long value = 0L;
                  Entity sourceEntity = (Entity)event.getParam(2);
                  if (!sourceEntity.isDead()) {
                     if (useFun.getDependentType() == ANTI_DAMAGE) {
                        value = (Long)event.getAction().getBlackboard().getSkillParam(1200 + this.source.getBattlePos(), 0L);
                     } else if (useFun.getDependentType() == ANTI_CASTER) {
                        value = this.caster.getBattleProperty(event.getAction(), useFun.getDependentId());
                     }

                     value = (long)((float)value * ((float)useFun.getUseValue() / 10000.0F));

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
                     Integer[] arrays = (Integer[])codeSet.toArray(new Integer[codeSet.size()]);

                     for(int i = 0; i < useFun.getExDependentValue(); ++i) {
                        this.source.getBuffManager().deleteBuffByCode(event.getAction(), arrays[i], true);
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
}
