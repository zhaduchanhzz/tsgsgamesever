package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;
import java.util.Objects;

@ListenerCheckAnno(
   type = 43
)
public class CheckBuffDispelEnd extends ListenerChecker {
   public static final int EVENT_CHECKER_BUFF_DISPEL_SELF = 1;
   public static final int EVENT_CHECKER_BUFF_DISPEL_NUM_GRE = 2;
   public static final int EVENT_CHECKER_BUFF_DISPEL_NUM_LES = 3;

   boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      Integer num = (Integer)event.getParam(32);
      switch (context.param) {
         case 1:
            return source == context.entity;
         case 2:
            if (Objects.isNull(context.exParams)) {
               return source == context.entity;
            }

            return source == context.entity && Objects.nonNull(num) && num >= Integer.parseInt(context.exParams);
         case 3:
            if (Objects.isNull(context.exParams)) {
               return source == context.entity;
            }

            return source == context.entity && Objects.nonNull(num) && num < Integer.parseInt(context.exParams);
         default:
            return false;
      }
   }
}
