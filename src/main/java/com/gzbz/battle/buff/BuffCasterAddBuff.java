package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;

@BuffSubType(
   subType = 75
)
public class BuffCasterAddBuff extends ListenerBuff {
   public void init(Entity source, Entity caster, BuffModel model, BuffManager buffManager) {
      super.init(source, caster, model, buffManager);
   }

   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (buffModel != null) {
         BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
         this.caster.getBuffManager().addBuff(event.getAction(), buffUseFun.getExDependentValue(), this.source, event);
      }
   }
}
