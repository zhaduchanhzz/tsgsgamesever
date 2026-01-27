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
import java.util.Objects;

@BuffSubType(
   subType = 52
)
public class MemberDamageRecoverHp extends ListenerBuff {
   public void init(Entity source, Entity caster, BuffModel model, BuffManager buffManager) {
      super.init(source, caster, model, buffManager);
      source.getScene().getEventListener().addListener(source, this, (short)4, 0, (String)null, (byte)0, (short)0, 0, model.getIsForce());
   }

   public void listen(Event event, ListenerContext context) {
      Entity targetEntity = (Entity)event.getParam(3);
      if (targetEntity.getForce() != this.source.getForce()) {
         Entity sourceEntity = (Entity)event.getParam(2);
         if (sourceEntity.getForce() == this.source.getForce()) {
            Entity attacker = (Entity)event.getAction().getBlackboard().getSkillParam(1);
            if (!Objects.isNull(attacker) && !attacker.getStateManager().checkState((short)14) && !attacker.isDead()) {
               List<Entity> targetList = (List)event.getParam(14);
               Long damage = (Long)event.getParam(1);
               if (targetList != null && targetList.size() != 0 && damage != 0L) {
                  BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
                  BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
                  float totalRate = (float)(10000L + this.caster.getBattleProperty(event.getAction(), 18)) / 10000.0F * (float)(10000L + this.source.getBattleProperty(event.getAction(), 19)) / 10000.0F;
                  totalRate *= this.source.getBuffManager().getBeCureValue();
                  long reviveValue = (long)((float)(damage * (long)useFun.getUseValue()) / 10000.0F * totalRate);
                  long maxValue = (long)((float)(this.source.getBattleProperty(event.getAction(), 1) * (long)useFun.getDependentValue()) / 10000.0F);
                  if (reviveValue > maxValue) {
                     reviveValue = maxValue;
                  }

                  this.source.recoverHp(event.getAction(), this.caster, (SkillEffectModel)null, false, reviveValue, event, true);
                  Event recoverHPEvent = new Event((short)12, event.getAction(), event);
                  recoverHPEvent.addParam(3, this.source);
                  recoverHPEvent.addParam(2, sourceEntity);
                  recoverHPEvent.addParam(10, reviveValue);
                  this.source.getScene().getEventListener().pushEvent(recoverHPEvent);
               }
            }
         }
      }
   }
}
