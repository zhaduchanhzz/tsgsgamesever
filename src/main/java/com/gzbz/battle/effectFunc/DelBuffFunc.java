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
   effect = 4
)
public class DelBuffFunc extends EffectFunc {
   public static final String BUFF_TYPE = "buffType";
   public static final String NUM = "num";
   public static final String DISPEL = "dispel";
   public static final String CONTROL_TYPE = "controlType";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      HashMap<Byte, HashMap<Integer, TreeMap<Integer, Buff>>> priorityBuffsMap = target.getBuffManager().getPriorityBuffsMap();
      if (priorityBuffsMap != null && !target.isDead()) {
         HashMap<Integer, TreeMap<Integer, Buff>> typeBuffsMap = (HashMap)priorityBuffsMap.get(((Integer)model.getFuncParam().get("buffType")).byteValue());
         Integer delNum = (Integer)model.getFuncParam().get("num");
         if (!MapUtils.isEmpty(typeBuffsMap) && delNum != 0) {
            byte buffType = ((Integer)model.getFuncParam().get("buffType")).byteValue();
            Buff bombBuff = null;
            BuffModel bombBuffModel = null;
            byte oppositionForce = BattleMisc.oppositionForce(target.getForce());
            List<Integer> randList;
            if (model.getFuncParam().containsKey("controlType")) {
               int controlType = model.getParam("controlType");
               randList = target.getBuffManager().getDispel(buffType, controlType);
            } else {
               randList = target.getBuffManager().getDispel(buffType);
            }

            if (delNum > 0 && randList.size() > delNum) {
               Collections.shuffle(randList);
               randList = randList.subList(0, delNum);
            }

            for(int id : this.processCleanBuffProtect(target, randList, model)) {
               BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", id);
               int rate = 0;

               for(Entity invalidEntity : target.getScene().getPKTeam(oppositionForce).getEntityMap().values()) {
                  if (!invalidEntity.isDead() && (model.getIsForce() != 0 || !invalidEntity.getStateManager().checkState((short)17)) && invalidEntity.getConditionPropertyManager().cleanBuffInvalid.containsKey(Integer.valueOf(buffModel.getSubCls()))) {
                     for(ConditionProperty conditionProperty : invalidEntity.getConditionPropertyManager().cleanBuffInvalid.get(Integer.valueOf(buffModel.getSubCls()))) {
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
                  if (model.getParam("dispel") == 1) {
                     Event dispelEvent = new Event((short)43, action, event);
                     dispelEvent.addParam(2, source);
                     dispelEvent.addParam(3, target);
                     dispelEvent.addParam(19, id);
                     action.getScene().getEventListener().pushEvent(dispelEvent);
                  }
               } else if (RandomUtil.randInt(10000) < rate) {
                  BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                  effectBuilder.setEffectType(19);
                  effectBuilder.setTargetBattlePos(target.getBattlePos());
                  action.getBlackboard().addBattleEffect(effectBuilder);
               } else {
                  target.getBuffManager().deleteBuffById(action, id);
                  if (model.getParam("dispel") == 1) {
                     Event dispelEvent = new Event((short)43, action, event);
                     dispelEvent.addParam(2, source);
                     dispelEvent.addParam(3, target);
                     dispelEvent.addParam(19, id);
                     action.getScene().getEventListener().pushEvent(dispelEvent);
                  }
               }
            }

            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setEffectType(17);
            effectBuilder.setTargetBattlePos(target.getBattlePos());
            effectBuilder.setEffectId(model.getId());
            effectBuilder.setEffectValue((long)buffType);
            action.getBlackboard().addBattleEffect(effectBuilder);
            return true;
         } else {
            return true;
         }
      } else {
         return false;
      }
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
