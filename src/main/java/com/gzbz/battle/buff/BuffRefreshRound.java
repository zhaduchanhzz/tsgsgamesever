package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.spring.ApplicationContextProvider;

@BuffSubType(
   subType = 74
)
public class BuffRefreshRound extends ListenerBuff {
   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (buffModel != null) {
         this.round = buffModel.getRound();
      }
   }
}
