package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;

@EffectAnno(
   effect = 37
)
public class ApportionMagicAttackFunc extends DamageFunc {
   public static final String RATE = "rate";
   public static final String LIMIT_RATE = "limitRate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.isDead()) {
         return false;
      } else {
         int totalRate = model.getParam("rate");
         int limitRate = model.getParam("limitRate");
         long attack = source.getBattleProperty(action, 2);
         long damage = getMagicAttack(action, attack, source, target, (float)totalRate / 10000.0F / (float)targets.size());
         long limitValue = (long)((float)limitRate / 10000.0F * (float)attack);
         action.getBlackboard().addSkillParam(34, limitValue);
         int index = (Integer)action.getBlackboard().getSkillParam(20, 0);
         int rate = 10000;
         if (model.getFuncParam().containsKey("damageRate")) {
            rate = (Integer)model.getFuncParam().get("damageRate");
         } else if (model.getFuncParam().containsKey("damageRate" + (index + 1))) {
            rate = (Integer)model.getFuncParam().get("damageRate" + (index + 1));
         }

         damage = (long)((float)damage * ((float)rate / 10000.0F));
         damage = (long)((float)damage * getNationDamage(target));
         if (damage == 0L) {
            return false;
         } else {
            doDamage(action, source, target, targets, model, damage, event);
            action.getBlackboard().removeSkillParam(34);
            return true;
         }
      }
   }
}
