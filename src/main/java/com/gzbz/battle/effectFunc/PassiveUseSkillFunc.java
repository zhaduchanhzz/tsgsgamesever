package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.action.ActionFactory;
import com.gzbz.battle.action.PassiveUseSkillAction;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;

@EffectAnno(
   effect = 12
)
public class PassiveUseSkillFunc extends EffectFunc {
   public static final String SKILL_ID = "skillId";
   public static final String PRIORITY = "priority";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      PassiveUseSkillAction passiveUseSkillAction = (PassiveUseSkillAction)ActionFactory.getAction(source.getScene(), (byte)45);
      Integer skillId = (Integer)model.getFuncParam().get("skillId");
      SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", skillId);
      if (skillModel == null) {
         return false;
      } else {
         passiveUseSkillAction.setAction(source, skillModel, event);
         passiveUseSkillAction.setPriority((byte)1);
         if (model.getFuncParam().containsKey("priority")) {
            int priority = (Integer)model.getFuncParam().get("priority");
            passiveUseSkillAction.setPriority((byte)priority);
         }

         source.getScene().getActionManager().addAction(passiveUseSkillAction);
         return true;
      }
   }
}
