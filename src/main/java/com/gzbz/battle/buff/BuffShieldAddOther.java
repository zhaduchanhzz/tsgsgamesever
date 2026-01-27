package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;
import misc.RandomUtil;

@BuffSubType(
   subType = 112
)
public class BuffShieldAddOther extends ListenerBuff {
   private int triggerTimes;

   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (buffModel.getUseTimes() == 0 || this.triggerTimes < buffModel.getUseTimes()) {
         BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
         if (buffUseFun != null) {
            Entity target = (Entity)event.getParam(2);
            if (target != null) {
               int rate = buffUseFun.getUseValue();
               if (RandomUtil.randTenThousand() < rate) {
                  target.getBuffManager().addBuff(event.getAction(), buffUseFun.getUseId(), this.source, event);
                  ++this.triggerTimes;
               }

            }
         }
      }
   }

   public void update(Action action) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (buffModel.getUseTimes() != 0) {
         this.triggerTimes = 0;
      }

   }
}
