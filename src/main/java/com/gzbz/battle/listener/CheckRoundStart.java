package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;

@ListenerCheckAnno(
   type = 2
)
public class CheckRoundStart extends ListenerChecker {
   public boolean check(Event event, ListenerContext context) {
      return true;
   }
}
