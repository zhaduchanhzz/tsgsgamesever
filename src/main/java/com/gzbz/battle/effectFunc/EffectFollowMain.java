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
import org.springframework.beans.BeanUtils;

@EffectAnno(
   effect = 11
)
public class EffectFollowMain extends EffectFunc {
   public static final String RATE = "rate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.isDead()) {
         return false;
      } else {
         EntitySkill entitySkill = (EntitySkill)action.getBlackboard().getSkillParam(4, (Object)null);
         if (entitySkill == null) {
            return false;
         } else {
            SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", entitySkill.getSkillId());
            if (skillModel == null) {
               return false;
            } else {
               Integer mainEffectId = (Integer)skillModel.getEffects().get(skillModel.getMainEffect());
               if (mainEffectId == null) {
                  return false;
               } else {
                  SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", mainEffectId);
                  if (skillEffectModel != null && skillEffectModel.getFunc() != 11) {
                     SkillEffectModel useModel = new SkillEffectModel();
                     BeanUtils.copyProperties(model, useModel);
                     useModel.setFunc(skillEffectModel.getFunc());
                     useModel.setFuncTimes(skillEffectModel.getFuncTimes());
                     useModel.getFuncParam().putAll(skillEffectModel.getFuncParam());
                     useModel.getFuncParam().put("damageRate", (int)((float)(Integer)skillEffectModel.getFuncParam().get("damageRate") * ((float)(Integer)model.getFuncParam().get("rate") / 10000.0F)));
                     EffectFuncProcessor.doFunc(action, source, target, targets, useModel, (Event)null);
                     return true;
                  } else {
                     return false;
                  }
               }
            }
         }
      }
   }
}
