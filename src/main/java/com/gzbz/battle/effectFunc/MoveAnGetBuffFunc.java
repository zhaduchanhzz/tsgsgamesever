package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.buff.BuffFactory;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@EffectAnno(
   effect = 89
)
public class MoveAnGetBuffFunc extends EffectFunc {
   public static final String GET_BUFF_TYPE = "getBuffType";
   public static final String GET_BUFF_NUM = "getBuffNum";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      byte buffType = ((Integer)model.getFuncParam().get("buffType")).byteValue();
      byte forceType = ((Integer)model.getFuncParam().get("targetType")).byteValue();
      short selectType = ((Integer)model.getFuncParam().get("selectType")).shortValue();
      int selectNum = (Integer)model.getFuncParam().get("selectNum");
      int selectParam = (Integer)model.getFuncParam().get("selectParam");
      int buffNum = -1;
      if (model.getFuncParam().containsKey("buffNum")) {
         buffNum = (Integer)model.getFuncParam().get("buffNum");
      }

      boolean resetRound = false;
      if (model.getFuncParam().containsKey("round") && (Integer)model.getFuncParam().get("round") > 0) {
         resetRound = true;
      }

      List<Entity> selectTargetList = source.getScene().selectTarget(action, source, forceType, selectType, selectNum, String.valueOf(selectParam));
      if (selectTargetList != null && selectTargetList.size() != 0) {
         this.move(action, target, selectTargetList, buffType, buffNum, resetRound, event);
         byte getBuffType = ((Integer)model.getFuncParam().get("getBuffType")).byteValue();
         int getBuffNum = -1;
         if (model.getFuncParam().containsKey("getBuffNum")) {
            getBuffNum = (Integer)model.getFuncParam().get("getBuffNum");
         }

         List<Entity> targetList = new ArrayList();
         targetList.add(target);

         for(Entity entity : selectTargetList) {
            this.move(action, entity, targetList, getBuffType, getBuffNum, resetRound, event);
         }

         return true;
      } else {
         return true;
      }
   }

   private void move(Action action, Entity target, List<Entity> selectTargetList, byte buffType, int buffNum, boolean resetRound, Event event) {
      HashMap<Integer, TreeMap<Integer, Buff>> idMap = (HashMap)target.getBuffManager().getPriorityBuffsMap().get(buffType);
      if (idMap != null && idMap.size() != 0) {
         ArrayList<Integer> delList = new ArrayList();

         for(Map.Entry<Integer, TreeMap<Integer, Buff>> idEntry : idMap.entrySet()) {
            int id = (Integer)idEntry.getKey();
            BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", id);
            if (buffModel != null && buffModel.getNoDispel() <= 0) {
               TreeMap<Integer, Buff> codeMap = (TreeMap)idEntry.getValue();

               for(Buff oldBuff : codeMap.values()) {
                  if (oldBuff.attachedCode == 0) {
                     if (buffNum > 0 && delList.size() >= buffNum) {
                        break;
                     }

                     for(Entity selectEntity : selectTargetList) {
                        Buff buff = BuffFactory.getBuff(buffModel, selectEntity, selectEntity, selectEntity.getBuffManager());
                        if (buff != null) {
                           if (!resetRound) {
                              buff.round = oldBuff.round;
                           }

                           buff.count = oldBuff.count;
                           buff.curUseTime = oldBuff.curUseTime;
                           long value = oldBuff.getValue(1);
                           if (value != 0L) {
                              buff.setValue(1, value);
                           }

                           value = oldBuff.getValue(2);
                           if (value != 0L) {
                              buff.setValue(2, oldBuff.getValue(2));
                           }

                           selectEntity.getBuffManager().addBuff(action, buff, buffModel, event);
                        }
                     }

                     delList.add(oldBuff.code);
                  }
               }

               if (buffNum > 0 && delList.size() >= buffNum) {
                  break;
               }
            }
         }

         for(int delCode : delList) {
            target.getBuffManager().deleteBuffByCode(action, delCode, false);
         }

      }
   }
}
