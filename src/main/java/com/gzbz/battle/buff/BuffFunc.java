package com.gzbz.battle.buff;

import com.gzbz.battle.entity.Entity;
import com.gzbz.model.BuffModel;
import java.io.Serializable;

public abstract class BuffFunc implements Serializable {
   public short type;

   public abstract void process(Entity source, Entity target, BuffModel model);
}
