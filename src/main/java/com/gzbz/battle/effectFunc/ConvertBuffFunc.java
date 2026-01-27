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
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@EffectAnno(
   effect = 25
)
public class ConvertBuffFunc extends EffectFunc {
   public static final String BUFF_TYPE = "buffType";
   public static final String BUFF_ID = "buffId";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      byte buffType = ((Integer)model.getFuncParam().get("buffType")).byteValue();
      Map<Integer, TreeMap<Integer, Buff>> dispelEx = target.getBuffManager().getDispelEx(buffType);
      if (dispelEx != null && dispelEx.size() != 0) {
         int buffId = (Integer)model.getFuncParam().get("buffId");
         Set<Map.Entry<Integer, TreeMap<Integer, Buff>>> entrySet = dispelEx.entrySet();
         ArrayList<Integer> addList = new ArrayList();

         for(Map.Entry<Integer, TreeMap<Integer, Buff>> entry : entrySet) {
            TreeMap<Integer, Buff> map = (TreeMap)entry.getValue();

            for(Buff buff : map.values()) {
               BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
               if (buffModel != null && buffModel.getNoDispel() != 1) {
                  addList.add(buff.code);
               }
            }
         }

         for(int buffCode : addList) {
            target.getBuffManager().deleteBuffByCode(action, buffCode, false);
            target.getBuffManager().addBuff(action, buffId, source, event);
         }

         return true;
      } else {
         return false;
      }
   }
}
