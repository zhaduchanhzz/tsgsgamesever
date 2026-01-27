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
   effect = 88
)
public class MoveAndAddBuffFunc extends EffectFunc {
   public static final String TARGET_TYPE = "targetType";
   public static final String SELECT_TYPE = "selectType";
   public static final String SELECT_NUM = "selectNum";
   public static final String SELECT_PARAM = "selectParam";
   public static final String BUFF_NUM = "buffNum";
   public static final String BUFF_ROUND_RESET = "round";
   public static final String[] BUFF_ID = new String[]{"buffId1", "buffId2", "buffId3"};

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      byte buffType = ((Integer)model.getFuncParam().get("buffType")).byteValue();
      byte forceType = ((Integer)model.getFuncParam().get("targetType")).byteValue();
      short selectType = ((Integer)model.getFuncParam().get("selectType")).shortValue();
      int selectNum = (Integer)model.getFuncParam().get("selectNum");
      int selectParam = (Integer)model.getFuncParam().get("selectParam");
      int buffNum = 0;
      if (model.getFuncParam().containsKey("buffNum")) {
         buffNum = (Integer)model.getFuncParam().get("buffNum");
      }

      boolean resetRound = false;
      if (model.getFuncParam().containsKey("round") && (Integer)model.getFuncParam().get("round") > 0) {
         resetRound = true;
      }

      HashMap<Integer, TreeMap<Integer, Buff>> idMap = (HashMap)target.getBuffManager().getPriorityBuffsMap().get(buffType);
      if (idMap != null && idMap.size() != 0) {
         ArrayList<Integer> delList = new ArrayList();
         List<Entity> selectTargetList = source.getScene().selectTarget(action, source, forceType, selectType, selectNum, String.valueOf(selectParam));
         if (selectTargetList != null && selectTargetList.size() != 0) {
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

               for(String str : BUFF_ID) {
                  Integer buffId = (Integer)model.getFuncParam().get(str);
                  if (buffId != null) {
                     target.getBuffManager().addBuff(action, buffId, target, event);
                  }
               }
            }

            return true;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }
}
