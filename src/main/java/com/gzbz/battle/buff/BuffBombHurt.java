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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

@BuffSubType(
   subType = 95
)
public class BuffBombHurt extends ListenerBuff {
   public void init(Entity source, Entity caster, BuffModel buffModel, BuffManager buffManager) {
      super.init(source, caster, buffModel, buffManager);
   }

   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (!Objects.isNull(buffModel)) {
         Entity sourceEntity = (Entity)event.getParam(2);
         if (sourceEntity == context.entity && (buffModel.getIsForce() != 0 || !sourceEntity.getStateManager().checkState((short)17))) {
            ArrayList<Entity> targetList = (ArrayList)event.getParam(14);
            if (!Objects.isNull(targetList) && !targetList.isEmpty()) {
               if (buffModel.getFuncs().containsKey(2)) {
                  BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
                  short buffType = (short)buffUseFun.getUseId();
                  long value = 0L;
                  HashSet<Buff> delSet = new HashSet();
                  List<Entity> list = new ArrayList();

                  for(Entity target : targetList) {
                     if (target.getBuffManager().checkSubBuff(buffType)) {
                        list.add(target);

                        for(int code : target.getBuffManager().getSubBuff(buffType)) {
                           Buff buff = target.getBuffManager().getBuff(code);
                           BuffModel codeBuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                           BuffUseFun fun = (BuffUseFun)codeBuffModel.getFuncs().get(1);
                           if (!Objects.isNull(fun) && (fun.getUseFunc() == 4 || fun.getUseFunc() == 2 || fun.getUseFunc() == 1)) {
                              value += -(buff.getValue(1) * (long)buff.round);
                              delSet.add(buff);
                           }
                        }

                        byte oppositionForce = BattleMisc.oppositionForce(target.getForce());
                        BattlePKTeam oppositionPKTeam = target.getScene().getPKTeam(oppositionForce);
                        int offsetRate = 0;

                        for(Entity teammate : oppositionPKTeam.getEntityMap().values()) {
                           if (!teammate.isDead()) {
                              offsetRate += teammate.getConditionPropertyManager().getValue142(event.getAction(), teammate, target, buffType);
                           }
                        }

                        value = (long)((float)value + (float)(value * (long)offsetRate) / 10000.0F);
                        offsetRate = 0;

                        for(Entity teammate : target.getPkTeam().getEntityMap().values()) {
                           if (!teammate.isDead()) {
                              offsetRate += teammate.getConditionPropertyManager().getValue142(event.getAction(), teammate, target, buffType);
                           }
                        }

                        value = (long)((float)value + (float)(value * (long)offsetRate) / 10000.0F);
                     }
                  }

                  if (delSet.size() > 0 && value != 0L) {
                     byte oppositionForce = BattleMisc.oppositionForce(sourceEntity.getForce());
                     BattlePKTeam oppositionPKTeam = sourceEntity.getScene().getPKTeam(oppositionForce);
                     List<Entity> targets = oppositionPKTeam.getTargetSelector().getTargets(event.getAction(), sourceEntity, (short)9, buffUseFun.getExDependentValue(), "2");
                     if (targets == null || targets.size() == 0) {
                        return;
                     }

                     value = (long)((float)value * ((float)buffUseFun.getUseValue() / 10000.0F));
                     if (list.size() == 5) {
                        value = (long)((double)value * 0.9);
                     } else if (list.size() == 4) {
                        value = (long)((double)value * 0.95);
                     }

                     value /= (long)targets.size();

                     for(Entity target : targets) {
                        this.doHurt(event.getAction(), this, sourceEntity, target, value, event);
                        if (target.isDead()) {
                           BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                           effectBuilder.setTargetBattlePos(target.getBattlePos());
                           effectBuilder.setEffectType(9);
                           event.getAction().getBlackboard().addBattleEffect(effectBuilder);
                           EffectUtil.putDeadEvent(event.getAction(), sourceEntity, target, event);
                        }
                     }
                  }

                  for(Buff delBuff : delSet) {
                     delBuff.source.getBuffManager().deleteBuffByCode(event.getAction(), delBuff.code, false);
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
