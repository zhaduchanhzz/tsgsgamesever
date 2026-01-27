package com.gzbz.battle.buff;

import battle.BuffAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.model.BuffModel;
import com.gzbz.model.fun.BuffUseFun;

@BuffAnno(
   type = 2
)
public class BuffMagicFunc extends BuffFunc {
   public void process(Entity source, Entity target, BuffModel model) {
      BuffUseFun fun = (BuffUseFun)model.getFuncs().get(1);
   }
}
