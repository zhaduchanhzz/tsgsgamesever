package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import org.apache.commons.collections4.MapUtils;

@EffectAnno(
   effect = 9
)
public class ComDelBuffFunc extends EffectFunc {
   public static final String BUFF_TYPE = "buffType";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.isDead()) {
         return false;
      } else {
         HashMap<Byte, HashMap<Integer, TreeMap<Integer, Buff>>> priorityBuffsMap = target.getBuffManager().getPriorityBuffsMap();
         if (priorityBuffsMap == null) {
            return false;
         } else {
            HashMap<Integer, TreeMap<Integer, Buff>> typeBuffsMap = (HashMap)priorityBuffsMap.get(((Integer)model.getFuncParam().get("buffType")).byteValue());
            if (MapUtils.isEmpty(typeBuffsMap)) {
               return false;
            } else {
               for(int id : new ArrayList(typeBuffsMap.keySet())) {
                  target.getBuffManager().deleteBuffById(action, id);
               }

               return true;
            }
         }
      }
   }
}
