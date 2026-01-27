package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

@EffectAnno(
   effect = 84
)
public class HurtBuffAndProperty extends EffectFunc {
   public static final String BUFF_ID = "buffId";
   public static final String NUM = "num";
   public static final String DEPENDENT = "dependent";
   public static final String PROPERTY_ID = "propertyId";
   public static final String RATE = "rate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.isDead()) {
         return false;
      } else {
         int num = model.getParam("num");
         if (num == 0) {
            return false;
         } else {
            int buffId = model.getParam("buffId");
            BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buffId);
            if (Objects.isNull(buffModel)) {
               return false;
            } else {
               HashMap<Integer, TreeMap<Integer, Buff>> priorityBuff = (HashMap)target.getBuffManager().getPriorityBuffsMap().get(buffModel.getType());
               if (!Objects.isNull(priorityBuff) && priorityBuff.containsKey(buffId) && ((TreeMap)priorityBuff.get(buffId)).size() != 0) {
                  if (((TreeMap)priorityBuff.get(buffId)).size() < num || num < 0) {
                     num = ((TreeMap)priorityBuff.get(buffId)).size();
                  }

                  Entity dependTarget = model.getParam("dependent") == 0 ? target : source;
                  long lostValue = (long)((float)(dependTarget.getBaseProperty((Integer)model.getFuncParam().get("propertyId")) * (long)(Integer)model.getFuncParam().get("rate")) / 10000.0F * (float)num);
                  if (lostValue == 0L) {
                     return true;
                  } else {
                     long leftValue = target.getBaseProperty(99) - lostValue;
                     if (leftValue < 0L) {
                        leftValue = 0L;
                     }

                     target.setBaseProperty(99, leftValue);
                     BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                     effectBuilder.setTargetBattlePos(target.getBattlePos());
                     effectBuilder.setEffectType(6);
                     effectBuilder.setEffectId(model.getId());
                     effectBuilder.setEffectValue(lostValue);
                     effectBuilder.setFinalValue(leftValue);
                     action.getBlackboard().addBattleEffect(effectBuilder);
                     if (target.isDead()) {
                        BattleMsg.S2C_Battle_Effect.Builder builder = BattleMsg.S2C_Battle_Effect.newBuilder();
                        builder.setTargetBattlePos(target.getBattlePos());
                        builder.setEffectType(9);
                        builder.setEffectValue(0L);
                        builder.setFinalValue(target.getBaseProperty(99));
                        action.getBlackboard().addBattleEffect(builder);
                        EffectUtil.putDeadEvent(action, source, target, event);
                        source.addDeadTimesAndClear(action);
                     }

                     return true;
                  }
               } else {
                  return false;
               }
            }
         }
      }
   }
}
