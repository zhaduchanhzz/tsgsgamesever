package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.action.Action;
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
   subType = 116
)
public class BuffSourceCallSkillEffect extends ListenerBuff {
   private int triggerTimes;

   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (buffModel != null) {
         if (buffModel.getUseTimes() == 0 || this.triggerTimes < buffModel.getUseTimes()) {
            BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
            if (buffUseFun != null) {
               SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", buffUseFun.getUseId());
               if (skillEffectModel != null) {
                  List<Entity> entityList = this.source.getScene().selectTarget(event.getAction(), this.source, skillEffectModel.getTargetType(), skillEffectModel.getSelectType(), skillEffectModel.getSelectNum(), skillEffectModel.getSelectParam());
                  boolean isUse = false;

                  for(Entity target : entityList) {
                     isUse = EffectFuncProcessor.doFunc(event.getAction(), super.caster, target, (List)null, skillEffectModel, event);
                  }

                  if (isUse) {
                     ++this.triggerTimes;
                  }

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
