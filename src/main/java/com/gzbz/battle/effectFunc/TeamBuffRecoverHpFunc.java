package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

@EffectAnno(
   effect = 74
)
public class TeamBuffRecoverHpFunc extends RecoverHpFunc {
   public static final String BUFF_ID = "buffId";
   public static final String NUM = "num";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      int buffId = model.getParam("buffId");
      int delNum = model.getParam("num");
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buffId);
      if (Objects.isNull(buffModel)) {
         return false;
      } else {
         Integer count = (Integer)action.getBlackboard().getSkillParam(48);
         if (count == null) {
            count = 0;

            for(Entity e : source.getPkTeam().getEntityMap().values()) {
               if (!e.isDead()) {
                  HashMap<Byte, HashMap<Integer, TreeMap<Integer, Buff>>> buffMap = e.getBuffManager().getPriorityBuffsMap();
                  if (!Objects.isNull(buffMap) && !buffMap.isEmpty()) {
                     HashMap<Integer, TreeMap<Integer, Buff>> typeMap = (HashMap)buffMap.get(buffModel.getType());
                     if (!Objects.isNull(typeMap) && !typeMap.isEmpty()) {
                        TreeMap<Integer, Buff> codeMap = (TreeMap)typeMap.get(buffId);
                        if (!Objects.isNull(codeMap) && !codeMap.isEmpty()) {
                           count = count + codeMap.size();
                        }
                     }
                  }
               }
            }

            action.getBlackboard().addSkillParam(48, count);
         }

         if (count == 0) {
            return false;
         } else {
            HashMap<Integer, TreeMap<Integer, Buff>> idMaps = (HashMap)target.getBuffManager().getPriorityBuffsMap().get(buffModel.getType());
            if (Objects.nonNull(idMaps)) {
               TreeMap<Integer, Buff> codeMap = (TreeMap)idMaps.remove(buffModel.getId());
               if (Objects.nonNull(codeMap)) {
                  for(Map.Entry<Integer, Buff> entry : codeMap.entrySet()) {
                     target.getBuffManager().deleteBuffByCode(action, (Integer)entry.getKey(), false);
                  }
               }
            }

            action.getBlackboard().addSkillParam(42, count);
            super.process(action, source, target, targets, model, event);
            action.getBlackboard().removeSkillParam(42);
            List<Integer> randList = target.getBuffManager().getDispel((byte)2);
            if (delNum == -1 || delNum > randList.size()) {
               delNum = randList.size();
            }

            Collections.shuffle(randList);

            for(int i = 0; i < delNum; ++i) {
               target.getBuffManager().deleteBuffById(action, (Integer)randList.get(i));
            }

            return true;
         }
      }
   }
}
