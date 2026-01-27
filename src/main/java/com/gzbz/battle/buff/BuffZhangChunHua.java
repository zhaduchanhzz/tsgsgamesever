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
   subType = 37
)
public class BuffZhangChunHua extends ListenerBuff {
   private long totalHurt;

   public void init(Entity source, Entity caster, BuffModel buffModel, BuffManager buffManager) {
      super.init(source, caster, buffModel, buffManager);
      source.getScene().getEventListener().addListener(source, this, (short)4, 5, (String)null, (byte)0, (short)0, 0, buffModel.getIsForce());
      source.getScene().getEventListener().addListener(source, this, (short)5, 2, (String)null, (byte)1, (short)0, 0, buffModel.getIsForce());
   }

   public void listen(Event event, ListenerContext context) {
      Entity targetEntity = (Entity)event.getParam(3);
      if (targetEntity == this.source) {
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
         if (event.getType() == 5 || event.getType() == 4 && (this.totalHurt += (Long)event.getParam(1)) > this.source.getBaseProperty(1)) {
            BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
            SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", buffUseFun.getUseId());

            List<Entity> targetList;
            try {
               targetList = this.caster.getPkTeam().getTargetSelector().getTargets(event.getAction(), this.caster, skillEffectModel.getSelectType(), skillEffectModel.getSelectNum(), skillEffectModel.getSelectParam());
            } catch (Exception var11) {
               return;
            }

            if (targetList != null && targetList.size() > 0) {
               for(Entity target : targetList) {
                  EffectFuncProcessor.doFunc(event.getAction(), this.caster, target, targetList, skillEffectModel, event);
               }
            } else {
               buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
               if (buffUseFun == null) {
                  return;
               }

               skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", buffUseFun.getUseId());
               if (skillEffectModel == null) {
                  return;
               }

               try {
                  targetList = this.caster.getPkTeam().getTargetSelector().getTargets(event.getAction(), this.caster, skillEffectModel.getSelectType(), skillEffectModel.getSelectNum(), skillEffectModel.getSelectParam());
               } catch (Exception var10) {
                  return;
               }

               if (targetList != null) {
                  for(Entity target : targetList) {
                     EffectFuncProcessor.doFunc(event.getAction(), this.caster, target, targetList, skillEffectModel, event);
                  }
               }
            }

            this.buffMgr.deleteBuffByCode(event.getAction(), this.code, false);
         }

      }
   }

   public void destroy() {
      this.source.getScene().getEventListener().removeListener(this);
   }
}
