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
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

@EffectAnno(
   effect = 38
)
public class ForceDelBuffIdFunc extends EffectFunc {
   public static final String[] BUFF_ID = new String[]{"buffId", "buffId2"};
   public static final String[] BUFF_NUM = new String[]{"buffNum", "buffNum2"};

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      for(int index = 0; index < BUFF_ID.length && index < BUFF_NUM.length; ++index) {
         int buffId = model.getParam(BUFF_ID[index]);
         int buffNum = model.getParam(BUFF_NUM[index]);
         if (buffId > 0 && buffNum != 0) {
            BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buffId);
            if (buffModel != null) {
               HashMap<Byte, HashMap<Integer, TreeMap<Integer, Buff>>> buffMap = target.getBuffManager().getPriorityBuffsMap();
               if (buffMap != null && buffMap.size() != 0) {
                  HashMap<Integer, TreeMap<Integer, Buff>> typeMap = (HashMap)buffMap.get(buffModel.getType());
                  if (typeMap != null && typeMap.size() != 0) {
                     TreeMap<Integer, Buff> codeMap = (TreeMap)typeMap.get(buffId);
                     if (codeMap != null && codeMap.size() != 0) {
                        ArrayList<Integer> codeList = new ArrayList(codeMap.keySet());
                        if (buffNum == -1) {
                           buffNum = codeList.size();
                        }

                        for(int i = 0; i < buffNum && i < codeList.size(); ++i) {
                           target.getBuffManager().deleteBuffByCode(action, (Integer)codeList.get(i), false);
                        }
                     }
                  }
               }
            }
         }
      }

      return true;
   }
}
