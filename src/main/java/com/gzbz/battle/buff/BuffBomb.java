package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.model.BuffModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import misc.RandomUtil;

@BuffSubType(
   subType = 47
)
public class BuffBomb extends ListenerBuff {
   public void init(Entity source, Entity caster, BuffModel buffModel, BuffManager buffManager) {
      super.init(source, caster, buffModel, buffManager);
   }

   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (!Objects.isNull(buffModel)) {
         Entity sourceEntity = (Entity)event.getParam(2);
         if (sourceEntity == context.entity && (buffModel.getIsForce() != 0 || !sourceEntity.getStateManager().checkState((short)17))) {
            Entity targetEntity = (Entity)event.getParam(3);
            if (!Objects.isNull(targetEntity)) {
               if (buffModel.getFuncs().containsKey(2)) {
                  BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
                  short buffType = (short)buffUseFun.getUseId();
                  if (targetEntity.getBuffManager().checkSubBuff(buffType)) {
                     int rate = buffUseFun.getUseValue();
                     if (rate == 0) {
                        rate = 10000;
                     }

                     if (RandomUtil.randTenThousand() < rate) {
                        Set<Integer> codeSet = targetEntity.getBuffManager().getSubBuff(buffType);
                        HashSet<Buff> delSet = new HashSet();
                        long value = 0L;
                        long shieldValue = 0L;

                        for(int code : codeSet) {
                           Buff buff = targetEntity.getBuffManager().getBuff(code);
                           BuffModel codeBuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                           BuffUseFun fun = (BuffUseFun)codeBuffModel.getFuncs().get(1);
                           if (!Objects.isNull(fun) && (fun.getUseFunc() == 4 || fun.getUseFunc() == 2 || fun.getUseFunc() == 1)) {
                              value += -(buff.getValue(1) * (long)buff.round);
                              if (buffType == 105) {
                                 BuffUseFun endUseFun = (BuffUseFun)codeBuffModel.getFuncs().get(2);
                                 if (Objects.nonNull(endUseFun)) {
                                    long tempValue = (long)((float)(targetEntity.getBuffManager().getShieldValue() * (long)endUseFun.getUseValue()) / 10000.0F * (float)buff.round);
                                    shieldValue += tempValue;
                                    if (endUseFun.getExDependentValue() > 0) {
                                       value += tempValue;
                                    }
                                 }
                              }

                              delSet.add(buff);
                           }
                        }

                        byte oppositionForce = BattleMisc.oppositionForce(targetEntity.getForce());
                        BattlePKTeam oppositionPKTeam = targetEntity.getScene().getPKTeam(oppositionForce);
                        int offsetRate = 0;

                        for(Entity teammate : oppositionPKTeam.getEntityMap().values()) {
                           if (!teammate.isDead()) {
                              offsetRate += teammate.getConditionPropertyManager().getValue142(event.getAction(), teammate, targetEntity, buffType);
                           }
                        }

                        value = (long)((float)value + (float)(value * (long)offsetRate) / 10000.0F);
                        offsetRate = 0;

                        for(Entity teammate : targetEntity.getPkTeam().getEntityMap().values()) {
                           if (!teammate.isDead()) {
                              offsetRate += teammate.getConditionPropertyManager().getValue142(event.getAction(), teammate, targetEntity, buffType);
                           }
                        }

                        value = (long)((float)value + (float)(value * (long)offsetRate) / 10000.0F);
                        if (delSet.size() > 0 && value != 0L) {
                           if (buffType == 105) {
                              HashSet<Buff> set = new HashSet();
                              targetEntity.getBuffManager().modifyBaseProperty(event.getAction(), -shieldValue, set);

                              for(Buff delBuff : set) {
                                 targetEntity.getBuffManager().deleteBuffByCode(event.getAction(), delBuff.code, true, false, 0, true);
                              }
                           }

                           this.doHurt(event.getAction(), this, this.caster, targetEntity, value, event);
                        }

                        for(Buff delBuff : delSet) {
                           targetEntity.getBuffManager().deleteBuffByCode(event.getAction(), delBuff.code, false);
                        }

                        if (targetEntity.isDead()) {
                           targetEntity.clear(event.getAction());
                           BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                           effectBuilder.setTargetBattlePos(targetEntity.getBattlePos());
                           effectBuilder.setEffectType(9);
                           effectBuilder.setEffectValue(1L);
                           effectBuilder.setFinalValue(targetEntity.getBaseProperty(99));
                           event.getAction().getBlackboard().addBattleEffect(effectBuilder);
                           EffectUtil.putDeadEvent(event.getAction(), sourceEntity, targetEntity, event);
                        }

                     }
                  }
               }
            }
         }
      }
   }

   private void doHurt(Action action, Buff buff, Entity source, Entity target, long value, Event event) {
      if (!target.getStateManager().checkState((short)25)) {
         long tempValue = EffectUtil.linkBuffPositive(action, event, source, target, value);
         tempValue = EffectUtil.liveAndDieBuf(source, target, tempValue);
         value = -tempValue;
         HashSet<Buff> delSet = new HashSet();
         long newValue = target.getBuffManager().modifyBaseProperty(action, value, delSet);

         for(Buff buffCode : delSet) {
            target.getBuffManager().deleteBuffByCode(action, buffCode.code, true, false, 0, true);
         }

         if (newValue == 0L) {
            BattleMsg.S2C_Battle_Effect.Builder effectAbsorbBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectAbsorbBuilder.setTargetBattlePos(target.getBattlePos());
            effectAbsorbBuilder.setEffectType(2);
            effectAbsorbBuilder.setEffectId(buff.id);
            effectAbsorbBuilder.setEffectValue(Math.abs(value));
            action.getBlackboard().addBattleEffect(effectAbsorbBuilder);
         } else if (newValue != value) {
            target.modifyHp(action, newValue, event, source);
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setTargetBattlePos(target.getBattlePos());
            effectBuilder.setEffectType(20);
            effectBuilder.setEffectValue(Math.abs(newValue));
            effectBuilder.setFinalValue(target.getBaseProperty(99));
            action.getBlackboard().addBattleEffect(effectBuilder);
            BattleMsg.S2C_Battle_Effect.Builder effectAbsorbBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectAbsorbBuilder.setEffectType(2);
            effectAbsorbBuilder.setEffectValue(Math.abs(value - newValue));
            effectAbsorbBuilder.setTargetBattlePos(target.getBattlePos());
            effectAbsorbBuilder.setEffectId(buff.id);
            action.getBlackboard().addBattleEffect(effectAbsorbBuilder);
         } else {
            target.modifyHp(action, newValue, event, source);
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setTargetBattlePos(target.getBattlePos());
            effectBuilder.setEffectType(20);
            effectBuilder.setEffectValue(Math.abs(newValue));
            effectBuilder.setFinalValue(target.getBaseProperty(99));
            action.getBlackboard().addBattleEffect(effectBuilder);
         }

         source.addAttackValue(action, Math.abs(value), event);
         target.addDamageValue(Math.abs(value));
      }
   }
}
