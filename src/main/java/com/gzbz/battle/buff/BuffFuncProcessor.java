package com.gzbz.battle.buff;

import com.gzbz.battle.entity.Entity;
import com.gzbz.model.BuffModel;
import java.io.Serializable;
import java.util.HashMap;

public class BuffFuncProcessor implements Serializable {
   public static HashMap<Short, BuffFunc> funcMap = new HashMap();

   public static int doFunc(Entity source, Entity target, BuffModel model, byte func) {
      return 0;
   }
}
