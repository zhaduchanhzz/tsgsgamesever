package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.action.ActionFactory;
import com.gzbz.battle.action.PassiveUseSkillAction;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;

@BuffSubType(
   subType = 51
)
public class PassiveSkillActionBuff extends ListenerBuff {
   private int triggerTimes;

   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
      if (buffUseFun.getUseValue() == 0 || buffUseFun.getUseValue() > this.triggerTimes) {
         Integer skillId = buffUseFun.getUseId();
         PassiveUseSkillAction action = (PassiveUseSkillAction)ActionFactory.getAction(event.getAction().getScene(), (byte)45);
         SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", skillId);
         action.setAction(this.source, skillModel, event);
         action.setPriority((byte)1);
         this.source.getScene().getActionManager().addAction(action);
         ++this.triggerTimes;
         if (buffModel.getUseTimes() == this.triggerTimes) {
            this.buffMgr.deleteBuffByCode(action, this.code, true);
         }

      }
   }
}
