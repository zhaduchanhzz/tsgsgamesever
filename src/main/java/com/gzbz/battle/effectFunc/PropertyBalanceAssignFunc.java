package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;

@EffectAnno(
   effect = 17
)
public class PropertyBalanceAssignFunc extends PropertyBalanceRandomFunc {
   public static final String PROPERTY_ID = "propertyId";
   public static final String PROPERTY_MAX = "max";
   public static final String BUFF_ID_1 = "buffId1";
   public static final String BUFF_ID_2 = "buffId2";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (!source.isDead() && !target.isDead()) {
         long maxValue = (long)((float)(source.getBaseProperty(model.getParam("propertyId")) * (long)model.getParam("max")) / 10000.0F);
         int buffId1 = (Integer)model.getFuncParam().get("buffId1");
         int buffId2 = (Integer)model.getFuncParam().get("buffId2");
         Buff buff1 = target.getBuffManager().addBuff(action, buffId1, source, event);
         if (buff1 != null) {
            long value = Math.abs(buff1.getValue(1));
            value = value > maxValue ? maxValue : value;
            buff1.setValue(1, (long)((int)(-value)));
            Buff buff2 = source.getBuffManager().addBuff(action, buffId2, source, event);
            buff2.setValue(1, (long)((int)value));
         }

         return true;
      } else {
         return false;
      }
   }
}
