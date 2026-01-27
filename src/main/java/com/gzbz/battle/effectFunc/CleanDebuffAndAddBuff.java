package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

@EffectAnno(
   effect = 71
)
public class CleanDebuffAndAddBuff extends EffectFunc {
   public static final String DEL_BUFF_ID = "delBuffId";
   public static final String DEL_BUFF_NUM = "delBuffNum";
   public static final String DEL_DEBUFF_NUM = "debuffNum";
   public static final String[] BUFF_ID = new String[]{"buffId1", "buffId2", "buffId3"};

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      int delBuffId = model.getParam("delBuffId");
      int delBuffNum = model.getParam("delBuffNum");
      if (delBuffNum == 0) {
         return false;
      } else {
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", delBuffId);
         if (Objects.isNull(buffModel)) {
            return false;
         } else {
            HashMap<Byte, HashMap<Integer, TreeMap<Integer, Buff>>> buffMap = target.getBuffManager().getPriorityBuffsMap();
            if (!Objects.isNull(buffMap) && !buffMap.isEmpty()) {
               HashMap<Integer, TreeMap<Integer, Buff>> typeMap = (HashMap)buffMap.get(buffModel.getType());
               if (!Objects.isNull(typeMap) && !typeMap.isEmpty()) {
                  TreeMap<Integer, Buff> codeMap = (TreeMap)typeMap.get(delBuffId);
                  if (!Objects.isNull(codeMap) && !codeMap.isEmpty()) {
                     ArrayList<Integer> codeList = new ArrayList(codeMap.keySet());
                     if (delBuffNum == -1 || delBuffNum > codeList.size()) {
                        delBuffNum = codeList.size();
                     }

                     for(int i = 0; i < delBuffNum; ++i) {
                        target.getBuffManager().deleteBuffByCode(action, (Integer)codeList.get(i), false);
                     }

                     if (model.getFuncParam().containsKey("debuffNum")) {
                        int delDebuffNum = model.getParam("debuffNum");
                        List<Integer> randList = target.getBuffManager().getDispel((byte)2);
                        if (delDebuffNum == -1 || delDebuffNum > randList.size()) {
                           delDebuffNum = randList.size();
                        }

                        Collections.shuffle(randList);

                        for(int i = 0; i < delDebuffNum; ++i) {
                           target.getBuffManager().deleteBuffById(action, (Integer)randList.get(i));
                        }
                     }

                     for(String str : BUFF_ID) {
                        Integer buffId = (Integer)model.getFuncParam().get(str);
                        if (buffId != null) {
                           BuffModel addBuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buffId);
                           if (!Objects.isNull(addBuffModel)) {
                              target.getBuffManager().addBuff(action, buffId, source, event);
                           }
                        }
                     }

                     return true;
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      }
   }
}
