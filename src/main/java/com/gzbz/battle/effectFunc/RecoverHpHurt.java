package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;

@EffectAnno(
   effect = 34
)
public class RecoverHpHurt extends EffectFunc {
   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.isDead()) {
         return false;
      } else {
         long recoverHp = (Long)action.getBlackboard().getSkillParam(800 + source.getBattlePos(), 0L);
         if (recoverHp == 0L) {
            return false;
         } else {
            int rate = model.getParam("rate");
            long damageValue = (long)((float)(recoverHp * (long)rate) / 10000.0F);
            long maxValue = (long)((float)(source.getBaseProperty(2) * (long)model.getParam("maxDamageRate")) / 10000.0F);
            damageValue = damageValue > maxValue ? maxValue : damageValue;
            DamageFunc.doDamage(action, source, target, targets, model, damageValue, event);
            return true;
         }
      }
   }
}
