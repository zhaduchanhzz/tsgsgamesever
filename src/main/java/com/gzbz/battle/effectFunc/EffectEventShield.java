package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.buff.BuffFactory;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

@EffectAnno(
   effect = 30
)
public class EffectEventShield extends EffectFunc {
   public static final String BUFF_ID = "buffId";
   public static final String DEPENDENT = "dependent";
   public static final String RATE = "rate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      int buffId = (Integer)model.getFuncParam().getOrDefault("buffId", 0);
      if (buffId == 0) {
         return false;
      } else {
         int dependent = (Integer)model.getFuncParam().getOrDefault("dependent", 23);
         long value = (long)((float)((Long)event.getParamDefault(dependent, 0L) * (long)(Integer)model.getFuncParam().getOrDefault("rate", 0)) / 10000.0F);
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buffId);
         if (value != 0L && !Objects.isNull(buffModel)) {
            Map<Integer, TreeMap<Integer, Buff>> idMap = target.getBuffManager().getDispelEx((byte)buffModel.getSubCls());
            if (Objects.isNull(idMap)) {
               Buff buff = BuffFactory.getBuff(buffModel, target, source, target.getBuffManager());
               if (buff == null) {
                  return false;
               }

               buff.setValue(1, (long)((int)value));
               target.getBuffManager().addBuff(action, buff, (BuffModel)buffModel, (Event)null);
            } else {
               int deleteCode = 0;

               for(Map.Entry<Integer, TreeMap<Integer, Buff>> entry : idMap.entrySet()) {
                  int id = (Integer)entry.getKey();
                  if (id == buffId) {
                     TreeMap<Integer, Buff> buffs = (TreeMap)entry.getValue();
                     if (buffs.size() > 1) {
                        logger.info("该buff必须为不叠加！！！");
                        return false;
                     }

                     if (buffs.size() == 1) {
                        Buff delBuff = (Buff)((Map.Entry)buffs.entrySet().iterator().next()).getValue();
                        if (delBuff.getValue(1) > value) {
                           return false;
                        }

                        deleteCode = delBuff.code;
                     }

                     target.getBuffManager().deleteBuffByCode(action, deleteCode, false);
                     Buff buff = BuffFactory.getBuff(buffModel, target, source, target.getBuffManager());
                     if (buff != null) {
                        buff.setValue(1, (long)((int)value));
                        target.getBuffManager().addBuff(action, buff, (BuffModel)buffModel, (Event)null);
                     }
                  }
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }
}
