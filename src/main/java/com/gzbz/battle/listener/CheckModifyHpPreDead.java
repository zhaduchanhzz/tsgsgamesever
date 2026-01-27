package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;

@ListenerCheckAnno(
   type = 34
)
public class CheckModifyHpPreDead extends ListenerChecker {
   boolean check(Event event, ListenerContext context) {
      return true;
   }
}
