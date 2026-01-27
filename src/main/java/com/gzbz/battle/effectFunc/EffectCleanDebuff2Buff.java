package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

@EffectAnno(
   effect = 27
)
public class EffectCleanDebuff2Buff extends EffectFunc {
   public static String BUFF_ID = "buffId";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      Map<Integer, TreeMap<Integer, Buff>> debuffMap = target.getBuffManager().getDispelEx((byte)2);
      if (Objects.isNull(debuffMap)) {
         return false;
      } else {
         for(TreeMap<Integer, Buff> map : debuffMap.values()) {
            if (map != null && map.size() != 0) {
               Buff buff = (Buff)((Map.Entry)map.entrySet().iterator().next()).getValue();
               if (!Objects.isNull(buff)) {
                  target.getBuffManager().deleteBuffByCode(action, buff.code, false);
                  source.getBuffManager().addBuff(action, (Integer)model.getFuncParam().get(BUFF_ID), source, event);
                  break;
               }
            }
         }

         return true;
      }
   }
}
