package com.gzbz.battle.listener;

import java.io.Serializable;

@FunctionalInterface
public interface Listener extends Serializable {
   int LISTENER_COMMON = 0;
   int LISTENER_FORCE = 1;

   void listen(Event event, ListenerContext context);
}
