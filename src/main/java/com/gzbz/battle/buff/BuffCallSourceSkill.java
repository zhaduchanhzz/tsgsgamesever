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
   subType = 86
)
public class BuffCallSourceSkill extends ListenerBuff {
   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (buffModel != null) {
         BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
         if (buffUseFun != null) {
            SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", buffUseFun.getUseId());
            if (skillModel != null) {
               event.addParam(29, this.caster);
               PassiveUseSkillAction passiveUseSkillAction = (PassiveUseSkillAction)ActionFactory.getAction(this.source.getScene(), (byte)45);
               passiveUseSkillAction.setAction(this.source, skillModel, event);
               passiveUseSkillAction.setPriority((byte)1);
               this.source.getScene().getActionManager().addAction(passiveUseSkillAction);
               this.buffMgr.deleteBuffByCode(event.getAction(), this.code, false);
            }
         }
      }
   }
}
