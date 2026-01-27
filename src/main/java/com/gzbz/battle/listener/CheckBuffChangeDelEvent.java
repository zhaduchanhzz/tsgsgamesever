package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import jodd.util.StringUtil;

@ListenerCheckAnno(
   type = 33
)
public class CheckBuffChangeDelEvent extends ListenerChecker {
   public static final int EVENT_CHECKER_BUFF_DEL_ENEMY = 1;
   public static final int EVENT_CHECKER_BUFFID_DEL_SELF = 2;
   public static final int EVENT_CHECKER_BUFF_SUBCLS_DEL_SELF = 3;
   public static final int EVENT_CHECKER_BUFF_SUBCLS_DEL_SELF_TEAM = 4;
   public static final int EVENT_CHECKER_BUFFID_DEL_CASTER = 5;

   boolean check(Event event, ListenerContext context) {
      Entity target = (Entity)event.getParam(3);
      Entity source = (Entity)event.getParam(2);
      switch (context.param) {
         case 1:
            Short subClass = (Short)event.getParam(7);
            if (subClass == null) {
               return false;
            }

            return target.getForce() != context.entity.getForce() && Short.parseShort(context.exParams) == subClass;
         case 2:
            if (StringUtil.isEmpty(context.exParams)) {
               return false;
            } else {
               Integer buffIdValue = (Integer)event.getParam(19);
               if (buffIdValue == null) {
                  return false;
               }

               return target == context.entity && buffIdValue == Integer.parseInt(context.exParams);
            }
         case 3:
            if (StringUtil.isEmpty(context.exParams)) {
               return false;
            } else if (target != context.entity) {
               return false;
            } else {
               Short buffTypeValue = (Short)event.getParam(7);
               if (buffTypeValue == null) {
                  return false;
               }

               return buffTypeValue == Integer.parseInt(context.exParams);
            }
         case 4:
            boolean leaveFun = (Boolean)event.getParam(30);
            if (!target.isDead() && !leaveFun) {
               if (StringUtil.isEmpty(context.exParams)) {
                  return false;
               }

               if (target.getForce() != context.entity.getForce()) {
                  return false;
               }

               Short subType = (Short)event.getParam(7);
               if (subType == null) {
                  return false;
               }

               return subType == Integer.parseInt(context.exParams);
            }

            return false;
         case 5:
            if (StringUtil.isEmpty(context.exParams)) {
               return false;
            } else {
               Integer buffId = (Integer)event.getParam(19);
               if (buffId == null) {
                  return false;
               }

               return source == context.entity && buffId == Integer.parseInt(context.exParams);
            }
         default:
            return false;
      }
   }
}
