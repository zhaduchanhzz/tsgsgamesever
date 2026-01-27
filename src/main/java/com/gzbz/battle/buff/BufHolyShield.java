package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.entity.DragonEntity;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;

@BuffSubType(
   subType = 85
)
public class BufHolyShield extends ListenerBuff {
   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      Entity sourceEntity = (Entity)event.getParam(2);
      Entity target = (Entity)event.getParam(3);
      DragonEntity dragonEntity = target.getPkTeam().getDragonEntity();
      if (dragonEntity != null) {
         BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
         int reviveValue = (int)((float)(dragonEntity.getBaseProperty(1) * (long)useFun.getUseValue()) / 10000.0F);
         target.recoverHp(event.getAction(), this.source, (SkillEffectModel)null, false, (long)reviveValue, event, true);
      }

      BuffUseFun endUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
      int buffId = endUseFun.getUseValue();
      Buff buff = target.getBuffManager().addBuff(event.getAction(), buffId, sourceEntity, event);
      if (buff != null) {
         long damage = (Long)event.getParam(27);
         BuffModel addBuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buffId);
         damage /= (long)addBuffModel.getRound();
         buff.setValue(1, damage);
      }

      ++this.curUseTime;
   }
}
