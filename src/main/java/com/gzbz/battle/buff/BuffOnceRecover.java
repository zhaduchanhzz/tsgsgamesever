package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.effectFunc.EffectFuncProcessor;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@BuffSubType(
   subType = 68
)
public class BuffOnceRecover extends ListenerBuff {
   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (!Objects.isNull(buffModel)) {
         BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
         SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", buffUseFun.getUseId());
         if (skillEffectModel != null) {
            List<Entity> targetList = new ArrayList();
            targetList.add(this.source);
            EffectFuncProcessor.doFunc(event.getAction(), this.caster, this.source, targetList, skillEffectModel, event);
            ++this.curUseTime;
            if (this.curUseTime >= buffModel.getUseTimes()) {
               this.buffMgr.deleteBuffByCode(event.getAction(), this.code, false);
            }

         }
      }
   }
}
