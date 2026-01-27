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
   subType = 100
)
public class BuffRecoverCasterEx extends ListenerBuff {
   public void listen(Event event, ListenerContext context) {
      Entity targetEntity = (Entity)event.getParam(3);
      if (targetEntity == this.source) {
         Entity attacker = (Entity)event.getAction().getBlackboard().getSkillParam(1);
         if (!Objects.isNull(attacker) && !attacker.getStateManager().checkState((short)14) && !attacker.isDead()) {
            List<Entity> targetList = (List)event.getParam(14);
            if (targetList != null && targetList.size() != 0) {
               BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
               BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(2);
               float totalRate = (float)(10000L + attacker.getBattleProperty(event.getAction(), 19)) / 10000.0F;
               totalRate *= attacker.getBuffManager().getBeCureValue();
               Long damage = (Long)event.getParam(1);
               int reviveValue = (int)((float)(damage * (long)useFun.getUseValue()) / 10000.0F * totalRate);
               attacker.recoverHp(event.getAction(), this.caster, (SkillEffectModel)null, false, (long)reviveValue, event, true);
            }
         }
      }
   }
}
