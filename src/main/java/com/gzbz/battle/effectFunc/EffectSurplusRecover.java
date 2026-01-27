package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.buff.BuffFactory;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;

@EffectAnno(
   effect = 40
)
public class EffectSurplusRecover extends EffectFunc {
   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      Entity eventSource = (Entity)event.getParam(2);
      Entity eventTarget = (Entity)event.getParam(3);
      long value = (Long)event.getParam(10);
      value = (long)((float)value * ((float)model.getParam("rate") / 10000.0F));
      if (model.getFuncParam().containsKey("limitRate")) {
         long limit = target.getBattleProperty(action, 1) * (long)(Integer)model.getFuncParam().get("limitRate") / 10000L;
         value = value > limit ? limit : value;
      }

      int shieldId = (Integer)model.getFuncParam().get("shieldId");
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", shieldId);
      Buff buff = BuffFactory.getBuff(buffModel, target, source, target.getBuffManager());
      if (buff == null) {
         return false;
      } else {
         buff.setValue(1, value);
         target.getBuffManager().addBuff(action, buff, buffModel, event);
         return false;
      }
   }
}
