package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.effectFunc.EffectFuncProcessor;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;

@BuffSubType(
   subType = 62
)
public class BuffSkillEffect extends ListenerBuff {
   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (buffModel != null) {
         BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
         if (buffUseFun != null) {
            SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", buffUseFun.getUseId());
            if (skillEffectModel != null) {
               List<Entity> targets = new ArrayList();
               if (skillEffectModel.getSelectType() == 34) {
                  Entity entity = (Entity)event.getParam(3);
                  if (entity.getType() == BattleMsg.EntityType.EntityType_Hero || entity.getType() == BattleMsg.EntityType.EntityType_Friend || entity.getType() == BattleMsg.EntityType.EntityType_Monster) {
                     targets.add(entity);
                  }
               } else {
                  targets = this.source.getScene().selectTarget(event.getAction(), this.source, skillEffectModel.getTargetType(), skillEffectModel.getSelectType(), skillEffectModel.getSelectNum(), skillEffectModel.getSelectParam());
               }

               for(Entity target : targets) {
                  EffectFuncProcessor.doFunc(event.getAction(), this.source, target, targets, skillEffectModel, event);
               }

            }
         }
      }
   }
}
