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
import java.util.Set;

@BuffSubType(
   subType = 12
)
public class BuffRevive extends ListenerBuff {
   public void listen(Event event, ListenerContext context) {
      Entity targetEntity = (Entity)event.getParam(3);
      if (targetEntity == this.source && targetEntity.getDeadTimes() <= 0) {
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
         if (!Objects.isNull(buffModel)) {
            if (targetEntity.getStateManager().checkState((short)21)) {
               Set<Integer> serverStar = targetEntity.getBuffManager().getSubBuff((short)46);
               if (Objects.nonNull(serverStar) && serverStar.size() > 0) {
                  for(int code : serverStar) {
                     targetEntity.getBuffManager().deleteBuffByCode(event.getAction(), code, false);
                  }
               }
            } else if (targetEntity.getStateManager().checkState((short)9)) {
               return;
            }

            BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
            SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", buffUseFun.getUseId());
            if (skillEffectModel != null) {
               List<Entity> targetList = new ArrayList();
               targetList.add(targetEntity);
               EffectFuncProcessor.doFunc(event.getAction(), targetEntity, targetEntity, targetList, skillEffectModel, event);
            }
         }
      }
   }
}
