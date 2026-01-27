package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@EffectAnno(
   effect = 10
)
public class DelBuffPhysicalFunc extends PhysicalFunc {
   public static final String BUFF_SUB_TYPE = "buffSubType";
   public static final String RATE = "rate";
   public static final String MAX_COUNT = "maxCount";
   public static final String DAMAGE_RATE = "damageRate";
   public static final String COST_NUM = "costNum";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      Set<Integer> buffs = source.getBuffManager().getSubBuff(((Integer)model.getFuncParam().get("buffSubType")).shortValue());
      if (!target.isDead() && !Objects.isNull(buffs)) {
         ArrayList<Integer> codeList = new ArrayList(buffs);
         int times = buffs.size() / (Integer)model.getFuncParam().get("rate");
         if (times == 0) {
            return false;
         } else {
            int cost = -1 == (Integer)model.getFuncParam().getOrDefault("costNum", -1) ? buffs.size() : times * (Integer)model.getFuncParam().get("rate");
            times = Math.min(times, (Integer)model.getFuncParam().get("maxCount"));
            long baseDamage = getPhyAttack(action, source.getBattleProperty(action, 2), source, target);
            List<Entity> otherTargets = source.getScene().selectTarget(action, source, BattleMisc.oppositionForce(source.getForce()), (short)27, times, (String)null);

            for(int i = 0; i < cost; ++i) {
               source.getBuffManager().deleteBuffByCode(action, (Integer)codeList.get(i), false);
            }

            for(Entity entity : targets) {
               this.process2(action, baseDamage, source, entity, otherTargets, model, event);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private void process2(Action action, long baseDamage, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (!target.isDead()) {
         float damage = (float)(baseDamage * (long)(Integer)model.getFuncParam().get("damageRate")) / 10000.0F;
         damage *= DamageFunc.getNationDamage(target);
         doDamage(action, source, target, targets, model, (long)damage, event);
      }
   }
}
