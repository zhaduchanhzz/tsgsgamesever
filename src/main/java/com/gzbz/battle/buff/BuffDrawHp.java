package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.effectFunc.EffectFuncProcessor;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;

@BuffSubType(
   subType = 98
)
public class BuffDrawHp extends ListenerBuff {
   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (buffModel != null) {
         BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
         if (buffUseFun != null) {
            SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", buffUseFun.getUseId());
            if (skillEffectModel != null) {
               EffectFuncProcessor.doFunc(event.getAction(), this.source, super.caster, (List)null, skillEffectModel, event);
            }
         }
      }
   }
}
