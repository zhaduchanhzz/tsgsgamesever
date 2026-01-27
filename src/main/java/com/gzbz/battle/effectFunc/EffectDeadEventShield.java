package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@EffectAnno(
   effect = 49
)
public class EffectDeadEventShield extends EffectFunc {
   private static Logger logger = LoggerFactory.getLogger(EffectDeadEventShield.class);
   public static final String BUFF_ID = "buffId";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (event.getType() == 5) {
         if (!model.getFuncParam().containsKey("buffId")) {
            return false;
         }

         Entity caster = (Entity)event.getParam(3);
         if (!caster.isDead()) {
            return false;
         }

         if (caster.getDeadTimes() > 0) {
            return false;
         }

         if (target.getStateManager().checkState((short)21)) {
            return false;
         }

         Integer buffId = (Integer)model.getFuncParam().get("buffId");
         target.getBuffManager().addBuff(action, buffId, caster, event);
      }

      return true;
   }
}
