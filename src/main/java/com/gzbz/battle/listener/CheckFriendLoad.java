package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;

@ListenerCheckAnno(
   type = 23
)
public class CheckFriendLoad extends ListenerChecker {
   public boolean check(Event event, ListenerContext context) {
      Entity source = (Entity)event.getParam(2);
      return context.entity == source;
   }
}
