package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;

@EffectAnno(
   effect = 2
)
public class MagicFunc extends DamageFunc {
   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      long damage = getMagicAttack(action, source.getBattleProperty(action, 2), source, target);
      int index = (Integer)action.getBlackboard().getSkillParam(20, 0);
      int rate = 10000;
      if (model.getFuncParam().containsKey("damageRate")) {
         rate = (Integer)model.getFuncParam().get("damageRate");
      } else if (model.getFuncParam().containsKey("damageRate" + (index + 1))) {
         rate = (Integer)model.getFuncParam().get("damageRate" + (index + 1));
      } else if (model.getFuncParam().containsKey("exDamageRate" + (index + 1))) {
         EntitySkill entitySkill = (EntitySkill)action.getBlackboard().getSkillParam(4, (Object)null);
         if (entitySkill == null) {
            return false;
         }

         SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", entitySkill.getSkillId());
         Integer mainEffectId = (Integer)skillModel.getEffects().get(skillModel.getMainEffect());
         if (mainEffectId == null) {
            return false;
         }

         SkillEffectModel mainSkillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", mainEffectId);
         if (mainEffectId == null) {
            return false;
         }

         if (mainSkillEffectModel.getFuncParam().containsKey("damageRate")) {
            rate = (int)((float)(Integer)model.getFuncParam().get("exDamageRate" + (index + 1)) / 10000.0F * (float)(Integer)mainSkillEffectModel.getFuncParam().get("damageRate"));
         }
      }

      rate += getNationRate(source, model);
      damage = (long)((float)damage * ((float)rate / 10000.0F));
      damage = (long)((float)damage * DamageFunc.getNationDamage(target));
      doDamage(action, source, target, targets, model, damage, event);

      for(int i = 1; i < 4; ++i) {
         int exEffectId = model.getParam("exEffect" + i);
         if (exEffectId == 0) {
            break;
         }

         SkillEffectModel exSkillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", exEffectId);
         EffectFuncProcessor.doFunc(action, source, target, targets, exSkillEffectModel, event);
      }

      if (model.getParam("lastTarget") > 0) {
         action.getBlackboard().addSkillParam(30, target);
      }

      return true;
   }
}
