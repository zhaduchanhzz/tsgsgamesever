package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;

@BuffSubType(
   subType = 55
)
public class BuffAddOther extends ListenerBuff {
   private int triggerTimes;

   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (this.triggerTimes < buffModel.getUseTimes()) {
         if (!this.caster.isDead()) {
            BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
            if (buffUseFun != null) {
               this.source.getBuffManager().addBuff(event.getAction(), buffUseFun.getUseId(), this.caster, event);
               ++this.triggerTimes;
            }
         }
      }
   }

   public void update(Action action) {
      this.triggerTimes = 0;
   }
}
