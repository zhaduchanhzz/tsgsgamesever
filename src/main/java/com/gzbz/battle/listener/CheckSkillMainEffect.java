package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import java.util.Objects;

@ListenerCheckAnno(
   type = 14
)
public class CheckSkillMainEffect extends ListenerChecker {
   public static final int EVENT_CHECKER_SKILL_USER_ENEMY = 1;

   boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      Entity target = (Entity)event.getParam(3);
      switch (context.param) {
         case 1:
            if (Objects.nonNull(target) && Objects.nonNull(source)) {
               return source == context.entity && source.getForce() != target.getForce();
            }
         default:
            return false;
      }
   }
}
