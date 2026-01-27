package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.ConditionModel;
import java.util.List;

@EffectAnno(
   effect = 45
)
public class LostHp2RecoverFunc extends RecoverHpFunc {
   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (!target.isDead() && !source.isDead()) {
         long value = this.getDependValue(action, source, target, model, event);
         if (value == 0L) {
            return false;
         } else if (model.getConditions().size() == 0) {
            return false;
         } else {
            ConditionModel conditionModel = (ConditionModel)model.getConditions().get(0);
            float conParam = Float.parseFloat(conditionModel.getConditionParam()) / 10000.0F;
            double rate = (double)conParam - (double)source.getBaseProperty(99) / (double)source.getBaseProperty(1);
            if (rate < (double)0.0F) {
               return false;
            } else {
               rate = rate * (double)model.getParam("rate") / (double)10000.0F * (double)100.0F;
               value = (long)((double)value * rate);
               if (model.getFuncParam().containsKey("limitRate")) {
                  int limitValue = (int)(target.getBaseProperty(1) * (long)(Integer)model.getFuncParam().get("limitRate") / 10000L);
                  value = value > (long)limitValue ? (long)limitValue : value;
               }

               target.recoverHp(action, source, model, false, value, event, true);
               Event reviveEvent = new Event((short)12, action, event);
               reviveEvent.addParam(12, action);
               reviveEvent.addParam(3, source);
               reviveEvent.addParam(2, source);
               reviveEvent.addParam(10, value);
               source.getScene().getEventListener().pushEvent(reviveEvent);
               return false;
            }
         }
      } else {
         return false;
      }
   }
}
