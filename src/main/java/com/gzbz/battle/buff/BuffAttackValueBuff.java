package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;

@BuffSubType(
   subType = 54
)
public class BuffAttackValueBuff extends ListenerBuff {
   public void init(Entity source, Entity caster, BuffModel buffModel, BuffManager buffManager) {
      super.init(source, caster, buffModel, buffManager);
      source.getScene().getEventListener().addListener(source, this, (short)18, 0, (String)null, (byte)0, (short)0, 0, buffModel.getIsForce());
   }

   public void listen(Event event, ListenerContext context) {
      Entity sourceEntity = (Entity)event.getParam(2);
      if (sourceEntity != null) {
         if (sourceEntity.getForce() == this.source.getForce()) {
            long damage = (Long)event.getParamDefault(1, 0L);
            if (damage != 0L) {
               BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
               BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
               List<Entity> targetList = this.source.getPkTeam().getTargetSelector().getTargets(event.getAction(), sourceEntity, (short)10, useFun.getDependentValue(), "99");
               if (targetList != null && targetList.size() != 0) {
                  for(Entity target : targetList) {
                     float totalRate = (float)(10000L + this.caster.getBattleProperty(event.getAction(), 18)) / 10000.0F * (float)(10000L + target.getBattleProperty(event.getAction(), 19)) / 10000.0F;
                     totalRate *= target.getBuffManager().getBeCureValue();
                     long reviveValue = (long)((float)(damage * (long)useFun.getUseValue()) / 10000.0F * totalRate);
                     target.recoverHp(event.getAction(), this.caster, (SkillEffectModel)null, false, reviveValue, event, true);
                     event.getAction().getBlackboard().plusSkillLongParam(700 + target.getBattlePos(), reviveValue);
                     Event recoverHPEvent = new Event((short)12, event.getAction(), event);
                     recoverHPEvent.addParam(3, target);
                     recoverHPEvent.addParam(2, this.caster);
                     recoverHPEvent.addParam(10, reviveValue);
                     target.getScene().getEventListener().pushEvent(recoverHPEvent);
                  }

               }
            }
         }
      }
   }
}
