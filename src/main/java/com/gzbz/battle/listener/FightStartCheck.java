package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;

@ListenerCheckAnno(
   type = 1
)
public class FightStartCheck extends ListenerChecker {
   public boolean check(Event event, ListenerContext context) {
      return true;
   }
}
