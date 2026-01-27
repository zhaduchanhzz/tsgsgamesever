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
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@EffectAnno(
   effect = 87
)
public class ConvertBuffToFunc extends EffectFunc {
   public static final String BUFF_TYPE = "buffType";
   public static final String BUFF_ID = "buffId";
   public static final String NUM = "num";
   public static final String TARGET_TYPE = "targetType";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      byte buffType = ((Integer)model.getFuncParam().get("buffType")).byteValue();
      Map<Integer, TreeMap<Integer, Buff>> dispelEx = target.getBuffManager().getDispelEx(buffType);
      if (dispelEx != null && dispelEx.size() != 0) {
         int buffId = (Integer)model.getFuncParam().get("buffId");
         Set<Map.Entry<Integer, TreeMap<Integer, Buff>>> entrySet = dispelEx.entrySet();
         List<Integer> addList = new ArrayList();

         for(Map.Entry<Integer, TreeMap<Integer, Buff>> entry : entrySet) {
            TreeMap<Integer, Buff> map = (TreeMap)entry.getValue();

            for(Buff buff : map.values()) {
               BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
               if (buffModel != null && buffModel.getNoDispel() != 1) {
                  addList.add(buff.code);
               }
            }
         }

         int num = model.getParam("num");
         if (num > 0 && addList.size() > num) {
            Collections.shuffle(addList);
            addList = addList.subList(0, num);
         }

         Entity addBuffTarget = source;
         int targetType = model.getParam("targetType");
         if (targetType == 1) {
            addBuffTarget = target;
         }

         for(int buffCode : addList) {
            target.getBuffManager().deleteBuffByCode(action, buffCode, false);
            addBuffTarget.getBuffManager().addBuff(action, buffId, source, event);
         }

         return true;
      } else {
         return false;
      }
   }
}
