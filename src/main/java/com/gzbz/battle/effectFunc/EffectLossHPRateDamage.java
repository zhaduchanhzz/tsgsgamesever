package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;

@EffectAnno(
   effect = 16
)
public class EffectLossHPRateDamage extends DamageFunc {
   public static final String HP_RATE_1 = "hpRate1";
   public static final String HP_RATE_2 = "hpRate2";
   public static final String DAMAGE_TYPE = "damageType";
   public static final String DAMAGE_RATE = "damageRate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.isDead()) {
         return false;
      } else {
         long curHP = target.getBaseProperty(99);
         long maxHP = target.getBaseProperty(1);
         double lossHP = (double)(maxHP - curHP);
         long attack = (long)(lossHP / (double)10000.0F * (double)(Integer)model.getFuncParam().get("hpRate1"));
         Integer type = (Integer)model.getFuncParam().get("damageType");
         long damage;
         if (type == 1) {
            damage = getPhyAttack(action, attack, source, target);
         } else {
            damage = getMagicAttack(action, attack, source, target);
         }

         damage = (long)((float)damage * DamageFunc.getNationDamage(target));
         double maxAttack = (double)((float)source.getBattleProperty(action, 2) / 10000.0F * (float)(Integer)model.getFuncParam().get("damageRate"));
         if ((double)damage > maxAttack) {
            damage = (long)maxAttack;
         }

         damage = damage <= 0L ? 1L : damage;
         doDamage(action, source, target, targets, model, damage, event);
         return true;
      }
   }
}
