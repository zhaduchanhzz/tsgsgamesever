package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import jodd.util.StringUtil;

@ListenerCheckAnno(
   type = 47
)
public class CheckSkillAttack extends ListenerChecker {
   public static final int EVENT_CHECKER_SELF_FORCE_INI_SKILL = 1;
   public static final int EVENT_CHECKER_SELF_SKILL = 2;

   boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      switch (context.param) {
         case 1:
            return source.getForce() == context.entity.getForce() && event.getAction().getType() == 4;
         case 2:
            if (StringUtil.isEmpty(context.exParams)) {
               return context.entity == source;
            }

            EntitySkill entitySkill = (EntitySkill)event.getParam(5);
            return context.entity == source && entitySkill != null && entitySkill.index == Integer.parseInt(context.exParams);
         default:
            return false;
      }
   }
}
