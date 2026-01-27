package com.gzbz.battle.listener;

import battle.ListenerCheckAnno;
import com.gzbz.battle.entity.Entity;

@ListenerCheckAnno(
   type = 24
)
public class CheckPreMainSkill extends ListenerChecker {
   boolean check(Event event, ListenerContext context) {
      Entity attack = (Entity)event.getParam(2);
      return attack == context.entity;
   }
}
