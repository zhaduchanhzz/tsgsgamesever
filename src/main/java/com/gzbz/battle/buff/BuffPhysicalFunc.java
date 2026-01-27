package com.gzbz.battle.buff;

import battle.BuffAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.model.BuffModel;

@BuffAnno(
   type = 1
)
public class BuffPhysicalFunc extends BuffFunc {
   public void process(Entity source, Entity target, BuffModel model) {
   }
}
