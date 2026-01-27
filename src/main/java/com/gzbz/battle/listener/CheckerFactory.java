package com.gzbz.battle.listener;

import java.io.Serializable;
import java.util.HashMap;

public class CheckerFactory implements Serializable {
   public static HashMap<Short, ListenerChecker> checkerMap = new HashMap();

   public static ListenerChecker getChecker(short type) {
      return (ListenerChecker)checkerMap.get(type);
   }
}
