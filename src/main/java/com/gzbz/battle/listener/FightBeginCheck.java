package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;

@ListenerCheckAnno(
   type = 44
)
public class FightBeginCheck extends ListenerChecker {
   boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      return source == null || context.entity == source;
   }
}
