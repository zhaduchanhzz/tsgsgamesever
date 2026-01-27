package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@EffectAnno(
   effect = 29
)
public class EffectChainFunc extends DamageFunc {
   public static final String EX_DAMAGE_RATE = "exDamageRate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.isDead()) {
         return false;
      } else {
         long damage = getMagicAttack(action, source.getBattleProperty(action, 2), source, target);
         List<Entity> exTargetList = null;

         for(Entity entity : targets) {
            if (entity.getBuffManager().checkSubBuff((short)39)) {
               exTargetList = new ArrayList();

               for(Entity exTarget : entity.getPkTeam().getEntityMap().values()) {
                  if (exTarget != entity) {
                     exTargetList.add(exTarget);
                  }
               }
               break;
            }
         }

         if (Objects.nonNull(exTargetList) && source.getBuffManager().checkSubBuff((short)40)) {
            Set<Integer> subSet = source.getBuffManager().getSubBuff((short)40);
            Buff buff = source.getBuffManager().getBuff((Integer)subSet.iterator().next());
            BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buff.id);
            damage = (long)((float)damage * (1.0F + (float)(((BuffUseFun)buffModel.getFuncs().get(1)).getUseValue() * exTargetList.size()) / 10000.0F));
         }

         doDamage(action, source, target, targets, model, (long)((float)damage * DamageFunc.getNationDamage(target)), event);
         if (Objects.isNull(exTargetList)) {
            return false;
         } else {
            int exDamageRate = model.getParam("exDamageRate");
            damage = (long)((float)damage * ((float)exDamageRate / 10000.0F));

            for(Entity exTarget : exTargetList) {
               doDamage(action, source, exTarget, exTargetList, model, damage, event);
            }

            return true;
         }
      }
   }
}
