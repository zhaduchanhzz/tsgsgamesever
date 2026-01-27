package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.action.ActionFactory;
import com.gzbz.battle.action.AntiAtkAction;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;

@BuffSubType(
   subType = 78
)
public class BuffSkillAntiAtk extends ListenerBuff {
   private int triggerTime;

   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (buffModel != null) {
         BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
         if (buffUseFun != null) {
            int effectId = buffUseFun.getUseId();
            SkillEffectModel model = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", effectId);
            if (model != null) {
               if (model.getTriggerTime() == 0 || this.triggerTime < model.getTriggerTime()) {
                  Entity target = (Entity)event.getParam(2);
                  if (target != null && !target.isDead() && target.getPkTeam() != null && this.source != null && !this.source.isDead() && target.entityType == 0) {
                     if (!this.source.getStateManager().checkState((short)21) && !this.source.getStateManager().checkState((short)23)) {
                        if (!this.source.getStateManager().checkState((short)11) && !this.source.getStateManager().checkState((short)1)) {
                           Integer actionDamageRate = (Integer)model.getFuncParam().get("damageRate");
                           Integer actionControlRate = (Integer)model.getFuncParam().get("controlRate");
                           Integer actionRecoverRate = (Integer)model.getFuncParam().get("recoverRate");
                           Integer skillId = (Integer)model.getFuncParam().get("skillCfgId");
                           AntiAtkAction antiAtkAction = (AntiAtkAction)ActionFactory.getAction(this.source.getScene(), (byte)42);
                           antiAtkAction.setEntity(this.source);
                           antiAtkAction.setTargetEntity(target, actionDamageRate, actionControlRate, actionRecoverRate, true, skillId != null ? skillId : -1);
                           antiAtkAction.setPriority((byte)3);
                           this.source.getScene().getActionManager().addAction(antiAtkAction);
                           ++this.triggerTime;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void update(Action action) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (buffModel != null) {
         BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
         if (buffUseFun != null) {
            int effectId = buffUseFun.getUseId();
            SkillEffectModel model = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", effectId);
            if (model != null) {
               if (model.getTriggerTimeType() == SkillEffectModel.TRIGGER_TYPE_ROUND) {
                  this.triggerTime = 0;
               }

            }
         }
      }
   }
}
