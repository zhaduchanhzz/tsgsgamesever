package com.gzbz.battle.listener;

import com.gzbz.battle.entity.Entity;

public class CheckSurplusRecover extends ListenerChecker {
   boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      return source == context.entity;
   }
}
