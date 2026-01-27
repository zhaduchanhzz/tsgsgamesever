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
import java.util.List;

@BuffSubType(
   subType = 33
)
public class BuffCallCasterSkillEffect extends ListenerBuff {
   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (buffModel != null) {
         BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
         if (buffUseFun != null) {
            SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", buffUseFun.getUseId());
            if (skillEffectModel != null) {
               for(Entity target : this.caster.getScene().selectTarget(event.getAction(), this.caster, skillEffectModel.getTargetType(), skillEffectModel.getSelectType(), skillEffectModel.getSelectNum(), skillEffectModel.getSelectParam())) {
                  EffectFuncProcessor.doFunc(event.getAction(), super.caster, target, (List)null, skillEffectModel, event);
               }

            }
         }
      }
   }
}
