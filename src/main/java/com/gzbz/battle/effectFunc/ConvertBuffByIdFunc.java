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
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

@EffectAnno(
   effect = 90
)
public class ConvertBuffByIdFunc extends EffectFunc {
   public static final String DEL_BUFF_ID = "buffId1";
   public static final String ADD_BUFF_ID = "buffId2";
   public static final String NUM = "num";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      int buffId1 = model.getParam("buffId1");
      int buffId2 = model.getParam("buffId2");
      BuffModel buffModel1 = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buffId1);
      BuffModel buffModel2 = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buffId2);
      if (!Objects.isNull(buffModel1) && !Objects.isNull(buffModel2)) {
         TreeMap<Integer, Buff> codeMap = target.getBuffManager().getBuffsById(buffId1);
         if (!Objects.isNull(codeMap) && !codeMap.isEmpty()) {
            ArrayList<Integer> codeList = new ArrayList(codeMap.keySet());
            int num = model.getParam("num");
            if (num == -1 || num > codeList.size()) {
               num = codeList.size();
            }

            for(int i = 0; i < num; ++i) {
               int code = (Integer)codeList.get(i);
               target.getBuffManager().deleteBuffByCode(action, code, false);
               target.getBuffManager().addBuff(action, buffId2, target, event);
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
