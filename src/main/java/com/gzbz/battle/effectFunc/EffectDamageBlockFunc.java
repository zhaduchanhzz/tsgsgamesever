package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;
import misc.RandomUtil;

@EffectAnno(
   effect = 47
)
public class EffectDamageBlockFunc extends EffectFunc {
   public static final String RATE = "rate";
   public static final String MAX_DAMAGE_RATE = "maxDamageRate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      long skillDamageValueLimit = target.getSkillDamageValueLimit();
      if (skillDamageValueLimit >= 0L) {
         return false;
      } else {
         int r = RandomUtil.randTenThousand();
         if (r < model.getParam("rate")) {
            long skillDamageLimit = (long)Math.ceil((double)((float)(Long)target.getBaseProperties().get(1) * ((float)model.getParam("maxDamageRate") / 10000.0F)));
            target.setSkillDamageValueLimit(skillDamageLimit);
         } else {
            target.setSkillDamageValueLimit(0L);
         }

         return true;
      }
   }
}
