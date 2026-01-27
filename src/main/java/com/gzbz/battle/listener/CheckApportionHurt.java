package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import jodd.util.StringUtil;

@ListenerCheckAnno(
   type = 29
)
public class CheckApportionHurt extends ListenerChecker {
   public static final int EVENT_CHECKER_SELF_SKILL = 1;

   boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      switch (context.param) {
         case 1:
            if (!StringUtil.isEmpty(context.exParams)) {
               EntitySkill entitySkill = (EntitySkill)event.getParam(5);
               return context.entity == source && entitySkill != null && entitySkill.index == Integer.parseInt(context.exParams) && entitySkill.id == entitySkill.oldId;
            }
         default:
            return false;
      }
   }
}
