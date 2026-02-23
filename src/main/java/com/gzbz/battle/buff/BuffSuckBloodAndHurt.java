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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.TreeMap;

@BuffSubType(
   subType = 110
)
public class BuffSuckBloodAndHurt extends Buff implements Listener {
   public void init(Entity source, Entity caster, BuffModel model, BuffManager buffManager) {
      super.init(source, caster, model, buffManager);

      for(KeyValFun keyValFun : model.getEventType().values()) {
         source.getScene().getEventListener().addListener(source, this, (short)keyValFun.getKey(), keyValFun.getVal(), keyValFun.getExParams(), model.getCheckDead(), (short)1, 10000, model.getIsForce());
      }

      source.getScene().getEventListener().addListener(source, this, (short)4, 5, (String)null, (byte)0, (short)1, 10000, model.getIsForce());
   }

   public void listen(Event event, ListenerContext context) {
      if (event.getType() == 35) {
         this.suckBlood(event, context);
      } else if (event.getType() == 4) {
         this.antiHurt(event, context);
      }

   }

   private void suckBlood(Event event, ListenerContext context) {
      Entity sourceEntity = (Entity)event.getParam(2);
      if (sourceEntity == this.source) {
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
         if (!Objects.isNull(buffModel)) {
            BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
            if (!Objects.isNull(useFun)) {
               long damage = 0L;

               for(Entity target : (ArrayList<Entity>)event.getParam(14)) {
                  damage += (Long)event.getAction().getBlackboard().getSkillParam(1200 + target.getBattlePos(), 0L);
               }

               float totalRate = (float)(10000L + this.source.getBattleProperty(event.getAction(), 19)) / 10000.0F;
               totalRate *= this.source.getBuffManager().getBeCureValue();
               long reviveValue = 0L;
               HashMap<Integer, TreeMap<Integer, Buff>> idMaps = (HashMap)this.source.getBuffManager().getPriorityBuffsMap().get(buffModel.getType());
               if (!Objects.isNull(idMaps)) {
                  TreeMap<Integer, Buff> codeMap = (TreeMap)idMaps.get(this.id);
                  if (!Objects.isNull(codeMap) && !codeMap.isEmpty()) {
                     reviveValue = (long)((float)(damage * (long)useFun.getUseValue()) / 10000.0F * (float)codeMap.size() * totalRate);
                     long limitValue = this.source.getBaseProperty(1) * (long)useFun.getExDependentValue() / 10000L;
                     reviveValue = reviveValue > limitValue ? limitValue : reviveValue;
                     this.source.recoverHp(event.getAction(), this.source, (SkillEffectModel)null, false, reviveValue, event, true);
                  }
               }
            }
         }
      }
   }

   private void antiHurt(Event event, ListenerContext context) {
      Entity targetEntity = (Entity)event.getParam(3);
      if (targetEntity == this.source) {
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
         if (!Objects.isNull(buffModel)) {
            BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(2);
            if (!Objects.isNull(useFun)) {
               long value = 0L;
               Entity sourceEntity = (Entity)event.getParam(2);
               if (!sourceEntity.isDead()) {
                  boolean ignoreShield = sourceEntity.getConditionPropertyManager().ignoreShieldEffect(event.getAction());
                  if (!ignoreShield) {
                     HashMap<Integer, TreeMap<Integer, Buff>> idMaps = (HashMap)this.source.getBuffManager().getPriorityBuffsMap().get(buffModel.getType());
                     if (!Objects.isNull(idMaps)) {
                        TreeMap<Integer, Buff> codeMap = (TreeMap)idMaps.get(this.id);
                        if (!Objects.isNull(codeMap) && !codeMap.isEmpty()) {
                           int currAddCount = (Integer)event.getAction().getBlackboard().getSkillParam(3200 + this.source.getBattlePos(), 0);
                           int count = codeMap.size() - currAddCount;
                           event.getAction().getBlackboard().removeSkillParam(3200 + this.source.getBattlePos());
                           long hurt = (Long)event.getParam(1);
                           value = (long)((float)(hurt * (long)useFun.getUseValue()) / 10000.0F * (float)count);

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
}
