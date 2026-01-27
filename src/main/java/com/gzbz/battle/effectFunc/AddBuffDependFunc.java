package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.conditionProperty.ConditionProperty;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.Objects;

@EffectAnno(
   effect = 61
)
public class AddBuffDependFunc extends EffectFunc {
   public static final String[] BUFF_ID = new String[]{"buffId1", "buffId2", "buffId3"};
   public static final String RATE = "rate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      int rate = (Integer)model.getFuncParam().get("rate");

      for(ConditionProperty e : source.getConditionPropertyManager().getBaseAddBuffEffectList()) {
         SkillEffectModel baseModel = e.skillEffectModel;
         if (!Objects.isNull(baseModel)) {
            for(String str : BUFF_ID) {
               Integer buffId = (Integer)baseModel.getFuncParam().get(str);
               if (buffId != null) {
                  BuffModel addBuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buffId);
                  if (!Objects.isNull(addBuffModel)) {
                     Buff buff = target.getBuffManager().addBuff(action, buffId, source, event);
                     if (buff != null) {
                        long value = (long)((float)(buff.getValue(1) * (long)rate) / 10000.0F);
                        buff.setValue(1, value);
                     }
                  }
               }
            }
         }
      }

      return true;
   }
}
