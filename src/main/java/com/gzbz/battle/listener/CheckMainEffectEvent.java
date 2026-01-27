package com.gzbz.battle.listener;

import com.gzbz.battle.entity.Entity;
import java.util.ArrayList;
import java.util.Objects;

public class CheckMainEffectEvent extends ListenerChecker {
   public static final int SKILL_MAIN_EFFECT_SOURCE = 1;
   public static final int SKILL_MAIN_EFFECT_TARGET = 2;

   boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      ArrayList<Entity> targetList = (ArrayList)event.getParam(14);
      switch (context.param) {
         case 1:
            return source == context.entity;
         case 2:
            return Objects.nonNull(targetList) && targetList.contains(context.entity);
         default:
            return false;
      }
   }
}
