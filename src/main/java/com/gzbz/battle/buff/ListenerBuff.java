package com.gzbz.battle.buff;

import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Listener;
import com.gzbz.model.BuffModel;
import com.gzbz.model.fun.KeyValFun;

public abstract class ListenerBuff extends Buff implements Listener {
   public void init(Entity source, Entity caster, BuffModel model, BuffManager buffManager) {
      super.init(source, caster, model, buffManager);

      for(KeyValFun keyValFun : model.getEventType().values()) {
         source.getScene().getEventListener().addListener(source, this, (short)keyValFun.getKey(), keyValFun.getVal(), keyValFun.getExParams(), model.getCheckDead(), (short)0, 0, model.getIsForce());
      }

   }

   public void destroy() {
      this.source.getScene().getEventListener().removeListener(this);
   }
}
