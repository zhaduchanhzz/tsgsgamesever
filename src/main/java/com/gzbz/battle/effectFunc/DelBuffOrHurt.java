package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.conditionProperty.ConditionProperty;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import misc.RandomUtil;
import org.apache.commons.collections4.MapUtils;

@EffectAnno(
   effect = 54
)
public class DelBuffOrHurt extends EffectFunc {
   public static final String BUFF_TYPE = "buffType";
   public static final String NUM = "num";
   public static final String HP_RATE = "hpRate";
   public static final String MAX_DAMAGE_RATE = "maxDamageRate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.isDead()) {
         return false;
      } else {
         HashMap<Byte, HashMap<Integer, TreeMap<Integer, Buff>>> priorityBuffsMap = target.getBuffManager().getPriorityBuffsMap();
         if (priorityBuffsMap == null) {
            this.extraHurt(action, source, target, targets, model, event);
            return true;
         } else {
            HashMap<Integer, TreeMap<Integer, Buff>> typeBuffsMap = (HashMap)priorityBuffsMap.get(((Integer)model.getFuncParam().get("buffType")).byteValue());
            Integer delNum = (Integer)model.getFuncParam().get("num");
            if (!MapUtils.isEmpty(typeBuffsMap) && delNum != 0) {
               byte buffType = ((Integer)model.getFuncParam().get("buffType")).byteValue();
               byte oppositionForce = BattleMisc.oppositionForce(target.getForce());
               List<Integer> randList = target.getBuffManager().getDispel(buffType);
               if (delNum > 0 && randList.size() > delNum) {
                  Collections.shuffle(randList);
                  randList = randList.subList(0, delNum);
               }

               randList = this.processCleanBuffProtect(target, randList, model);
               if (randList.isEmpty()) {
                  this.extraHurt(action, source, target, targets, model, event);
                  return true;
               } else {
                  boolean succ = false;

                  for(int id : randList) {
                     BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", id);
                     int rate = 0;

                     for(Entity invalidEntity : target.getScene().getPKTeam(oppositionForce).getEntityMap().values()) {
                        if (!invalidEntity.isDead() && (model.getIsForce() != 0 || !invalidEntity.getStateManager().checkState((short)17)) && invalidEntity.getConditionPropertyManager().cleanBuffInvalid.containsKey(Integer.valueOf(buffModel.getSubCls()))) {
                           for(ConditionProperty conditionProperty : (ArrayList)invalidEntity.getConditionPropertyManager().cleanBuffInvalid.get(Integer.valueOf(buffModel.getSubCls()))) {
                              rate += conditionProperty.skillEffectModel.getParam("rate");
                           }
                        }
                     }

                     TreeSet<Integer> buffCodeSet = target.getBuffManager().getSubBuff((short)56);
                     if (null != buffCodeSet && buffCodeSet.size() > 0) {
                        for(int buffCode : buffCodeSet) {
                           Buff invalidBuff = target.getBuffManager().getBuff(buffCode);
                           if (invalidBuff != null) {
                              BuffModel invalidDuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", invalidBuff.id);
                              if (invalidDuffModel != null) {
                                 BuffUseFun buffUseFun = (BuffUseFun)invalidDuffModel.getFuncs().get(1);
                                 if (buffUseFun != null && buffUseFun.getUseId() == buffModel.getSubCls()) {
                                    rate += buffUseFun.getUseValue();
                                 }
                              }
                           }
                        }
                     }

                     if (rate == 0) {
                        target.getBuffManager().deleteBuffById(action, id);
                        succ = true;
                     } else if (RandomUtil.randInt(10000) < rate) {
                        BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                        effectBuilder.setEffectType(19);
                        effectBuilder.setTargetBattlePos(target.getBattlePos());
                        action.getBlackboard().addBattleEffect(effectBuilder);
                     } else {
                        target.getBuffManager().deleteBuffById(action, id);
                        succ = true;
                     }
                  }

                  if (succ) {
                     BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                     effectBuilder.setEffectType(17);
                     effectBuilder.setTargetBattlePos(target.getBattlePos());
                     effectBuilder.setEffectId(model.getId());
                     effectBuilder.setEffectValue((long)buffType);
                     action.getBlackboard().addBattleEffect(effectBuilder);
                  } else {
                     this.extraHurt(action, source, target, targets, model, event);
                  }

                  return true;
               }
            } else {
               this.extraHurt(action, source, target, targets, model, event);
               return true;
            }
         }
      }
   }

   private void extraHurt(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      int percentValue = (Integer)model.getFuncParam().get("hpRate");
      long hurtValue = (long)((float)percentValue / 10000.0F * (float)source.getBaseProperty(1));
      long hurtMaxValue = (long)((float)(Integer)model.getFuncParam().get("maxDamageRate") / 10000.0F * (float)source.getBaseProperty(2));
      long longHurtValue = Math.min(hurtValue, hurtMaxValue);
      action.getBlackboard().plusSkillLongParam(400 + source.getBattlePos(), longHurtValue);
      action.getBlackboard().plusSkillLongParam(500 + target.getBattlePos(), longHurtValue);
      source.addAttackValue(action, longHurtValue, event);
      target.addDamageValue(longHurtValue);
      target.recordHp(source);
      DamageFunc.doDamage(action, source, target, targets, model, longHurtValue, event);
      long realValue = target.getReduceValue(source);
      action.getBlackboard().plusSkillLongParam(1100 + source.getBattlePos(), realValue);
      action.getBlackboard().plusSkillLongParam(1200 + target.getBattlePos(), realValue);
   }

   private List<Integer> processCleanBuffProtect(Entity target, List<Integer> randList, SkillEffectModel model) {
      if (((Integer)model.getFuncParam().get("buffType")).byteValue() != 1) {
         return randList;
      } else {
         if (target.getBuffManager().isExistSubType((short)79)) {
            TreeSet<Integer> subMap = target.getBuffManager().getSubBuff((short)79);
            int code = (Integer)subMap.last();
            Buff buff = target.getBuffManager().getBuff(code);
            if (buff != null) {
               BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buff.id);
               if (buffModel != null) {
                  BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
                  if (useFun != null) {
                     if (randList.size() <= useFun.getUseId()) {
                        return randList;
                     }

                     if (RandomUtil.randInt(10000) < useFun.getUseValue()) {
                        return randList.subList(0, useFun.getUseId());
                     }
                  }
               }
            }
         }

         return randList;
      }
   }
}
