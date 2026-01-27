package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;
import java.util.Objects;

@EffectAnno(
   effect = 81
)
public class AddBuffLostHpFunc extends EffectFunc {
   public static final String PROPERTY_ID = "propertyId";
   public static final String RATE = "rate";
   public static final String[] BUFF_ID = new String[]{"buffId1", "buffId2", "buffId3"};

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (event.getType() != 37) {
         return false;
      } else {
         Long lastHp = (Long)event.getParam(16);
         Long curHp = (Long)event.getParam(17);
         if (Objects.nonNull(lastHp) && Objects.nonNull(curHp)) {
            long chValue = lastHp - curHp;
            target.addStageHpValue(chValue);
         }

         int propertyId = (Integer)model.getFuncParam().get("propertyId");
         int rate = (Integer)model.getFuncParam().get("rate");
         long tempValue = (long)((float)(source.getBaseProperty(propertyId) * (long)rate) / 10000.0F);
         if (target.getStageHpValue() < tempValue) {
            return false;
         } else {
            int count = (int)(target.getStageHpValue() / tempValue);
            long remainValue = target.getStageHpValue() % tempValue;

            for(String str : BUFF_ID) {
               Integer buffId = (Integer)model.getFuncParam().get(str);
               if (buffId != null) {
                  for(int i = 0; i < count; ++i) {
                     target.getBuffManager().addBuff(action, buffId, source, event);
                  }

                  action.getBlackboard().addSkillParam(3200 + target.getBattlePos(), count);
               }
            }

            target.setStageHpValue(remainValue);
            return true;
         }
      }
   }
}
