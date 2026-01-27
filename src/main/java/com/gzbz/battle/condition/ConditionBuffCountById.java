package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.fun.ConditionModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

@ConditionAnno(
   condition = 58
)
public class ConditionBuffCountById implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      List<String> params = Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam());
      if (Objects.isNull(source)) {
         return false;
      } else {
         for(String param : params) {
            int buffId = Integer.parseInt(param);
            BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buffId);
            HashMap<Integer, TreeMap<Integer, Buff>> idMaps = (HashMap)source.getBuffManager().getPriorityBuffsMap().get(buffModel.getType());
            if (!Objects.isNull(idMaps)) {
               TreeMap<Integer, Buff> codeMap = (TreeMap)idMaps.get(buffId);
               if (!Objects.isNull(codeMap) && codeMap.size() >= conditionModel.getConditionValue()) {
                  return true;
               }
            }
         }

         return false;
      }
   }
}
