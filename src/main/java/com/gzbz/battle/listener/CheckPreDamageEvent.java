package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.model.SkillEffectModel;
import jodd.util.StringUtil;

@ListenerCheckAnno(
   type = 42
)
public class CheckPreDamageEvent extends ListenerChecker {
   public static final int EVENT_CHECKER_SELF_SKILL = 1;
   public static final int EVENT_CHECKER_BE_ATTACK = 2;

   boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      Entity target = (Entity)event.getParam(3);
      switch (context.param) {
         case 1:
            if (StringUtil.isEmpty(context.exParams)) {
               return context.entity == source;
            }

            EntitySkill entitySkill = (EntitySkill)event.getAction().getBlackboard().getSkillParam(4);
            return context.entity == source && entitySkill != null && entitySkill.index == Integer.parseInt(context.exParams);
         case 2:
            SkillEffectModel model = (SkillEffectModel)event.getParam(31);
            return target == context.entity && model != null && event.getAction().getType() == 4;
         default:
            return false;
      }
   }
}
