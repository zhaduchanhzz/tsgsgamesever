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
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

@EffectAnno(
   effect = 72
)
public class ReviveFuncDelBuff extends ReviveFunc {
   public static final String BUFF_ID = "buffId";
   public static final String BUFF_NUM = "buffNum";
   public static final String ADD_BUFF_ID = "addBuffId";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.getStateManager().checkState((short)9)) {
         return false;
      } else {
         Integer buffId = model.getParam("buffId");
         Integer buffNum = model.getParam("buffNum");
         if (!Objects.isNull(buffId) && !Objects.isNull(buffNum)) {
            BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buffId);
            if (Objects.isNull(buffModel)) {
               return false;
            } else {
               int count = 0;
               HashMap<Entity, ArrayList<Integer>> map = new HashMap();

               for(Entity e : source.getPkTeam().getEntityMap().values()) {
                  HashMap<Byte, HashMap<Integer, TreeMap<Integer, Buff>>> buffMap = e.getBuffManager().getPriorityBuffsMap();
                  if (!Objects.isNull(buffMap) && !buffMap.isEmpty()) {
                     HashMap<Integer, TreeMap<Integer, Buff>> typeMap = (HashMap)buffMap.get(buffModel.getType());
                     if (!Objects.isNull(typeMap) && !typeMap.isEmpty()) {
                        TreeMap<Integer, Buff> codeMap = (TreeMap)typeMap.get(buffId);
                        if (!Objects.isNull(codeMap) && !codeMap.isEmpty()) {
                           count += codeMap.size();
                           ArrayList<Integer> codeList = new ArrayList(codeMap.keySet());
                           map.put(e, codeList);
                        }
                     }
                  }
               }

               if (buffNum > count) {
                  buffNum = count;
               }

               while(buffNum > 0) {
                  for(Map.Entry<Entity, ArrayList<Integer>> e : map.entrySet()) {
                     Entity entity = (Entity)e.getKey();
                     ArrayList<Integer> codeList = (ArrayList)e.getValue();
                     if (codeList.size() > 0) {
                        entity.getBuffManager().deleteBuffByCode(action, (Integer)codeList.remove(0), false);
                        buffNum = buffNum - 1;
                     }

                     if (buffNum <= 0) {
                        break;
                     }
                  }
               }

               super.process(action, source, target, targets, model, event);
               Integer addBuffId = (Integer)model.getFuncParam().get("addBuffId");
               if (addBuffId != null) {
                  BuffModel addBuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", addBuffId);
                  if (Objects.nonNull(addBuffModel)) {
                     target.getBuffManager().addBuff(action, addBuffId, source, event);
                  }
               }

               return true;
            }
         } else {
            return false;
         }
      }
   }
}
