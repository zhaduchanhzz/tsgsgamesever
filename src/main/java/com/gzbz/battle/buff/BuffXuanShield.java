package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Objects;

@BuffSubType(
   subType = 107
)
public class BuffXuanShield extends ListenerBuff {
   public long hurtValue;

   public void listen(Event event, ListenerContext context) {
      if (this.hurtValue != 0L) {
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
         long damage = this.hurtValue;
         BuffUseFun endUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
         if (Objects.nonNull(endUseFun)) {
            damage = (long)((float)damage * ((float)endUseFun.getUseValue() / 10000.0F));
         }

         int buffId = endUseFun.getUseId();
         Buff buff = this.buffMgr.addBuff(event.getAction(), buffId, this.source, event);
         if (buff != null) {
            BuffModel addBuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buffId);
            damage /= (long)addBuffModel.getRound();
            buff.setValue(1, damage);
         }

      }
   }
}
