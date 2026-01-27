package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;

@EffectAnno(
   effect = 48
)
public class HurtOverflowMoveFunc extends DamageFunc {
   public static final String OVERFLOW_DAMAGE_RATE = "overFlowDamageRate";
   public static final String PROPERTY_ID = "propertyId";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      List<Entity> hurtTargets = (List)event.getParam(14);
      if (hurtTargets == null) {
         return false;
      } else {
         int rate = 10000;
         if (model.getFuncParam().containsKey("overFlowDamageRate")) {
            rate = (Integer)model.getFuncParam().get("overFlowDamageRate");
         }

         double maxAttack = (double)0.0F;
         if (model.getFuncParam().containsKey("damageRate") && model.getFuncParam().containsKey("propertyId")) {
            int propertyId = (Integer)model.getFuncParam().get("propertyId");
            maxAttack = (double)((float)source.getBattleProperty(action, propertyId) / 10000.0F * (float)(Integer)model.getFuncParam().get("damageRate"));
         }

         boolean isUse = false;

         for(Entity t : hurtTargets) {
            if (t.isDead()) {
               long damage = (Long)action.getBlackboard().getSkillParam(1500 + t.getBattlePos(), 0L);
               long realDamage = (Long)action.getBlackboard().getSkillParam(1200 + t.getBattlePos(), 0L);
               long overFlowDamage = damage - realDamage;
               if (overFlowDamage > 0L) {
                  overFlowDamage = (long)((float)overFlowDamage * ((float)rate / 10000.0F));
                  if (maxAttack > (double)0.0F && (double)overFlowDamage > maxAttack) {
                     overFlowDamage = (long)maxAttack;
                  }

                  doDamage(action, t, target, targets, model, overFlowDamage, event);
                  isUse = true;
               }
            }
         }

         return isUse;
      }
   }
}
