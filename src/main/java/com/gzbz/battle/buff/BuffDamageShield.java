package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.model.BuffModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;

@BuffSubType(
   subType = 72
)
public class BuffDamageShield extends ListenerBuff {
   private Action addAction;

   public void init(Entity source, Entity caster, BuffModel model, BuffManager buffManager) {
      super.init(source, caster, model, buffManager);
      this.addAction = source.getScene().getActionManager().getCurAction();
      ListenerContext context = source.getScene().getEventListener().addListener(source, this, (short)15, 9, "", model.getCheckDead(), (short)0, 0, model.getIsForce());
      context.force = 1;
   }

   public void listen(Event event, ListenerContext context) {
      if (event.getAction() != this.addAction) {
         this.addAction = null;
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
         BuffUseFun updateFun = (BuffUseFun)buffModel.getFuncs().get(1);
         BuffUseFun leaveFun = (BuffUseFun)buffModel.getFuncs().get(2);
         byte oppositionForce = BattleMisc.oppositionForce(this.source.getForce());
         BattlePKTeam oppositionPKTeam = this.source.getScene().getPKTeam(oppositionForce);
         List<Entity> targets = oppositionPKTeam.getTargetSelector().getTargets(event.getAction(), this.source, (short)51, updateFun.getExDependentValue(), (String)null);
         if (targets != null && targets.size() != 0) {
            long shieldValue = (long)((float)(this.source.getSkillShowValue() * (long)updateFun.getUseValue()) / 10000.0F);
            BuffModel shieldBuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", updateFun.getDependentValue());

            for(Entity target : targets) {
               if (!target.isDead()) {
                  if (shieldValue > 0L) {
                     Buff buff = BuffFactory.getBuff(shieldBuffModel, target, this.source, target.getBuffManager());
                     buff.setValue(1, shieldValue);
                     target.getBuffManager().addBuff(event.getAction(), buff, shieldBuffModel, event);
                     buff.setValue(1, shieldValue);
                     target.getBuffManager().weakenShield(shieldBuffModel, buff);
                  }

                  if (updateFun != null && updateFun.getDependentId() != 0) {
                     target.getBuffManager().addBuff(event.getAction(), updateFun.getDependentId(), this.source, event);
                  }

                  if (leaveFun != null && leaveFun.getDependentId() != 0) {
                     target.getBuffManager().addBuff(event.getAction(), leaveFun.getDependentId(), this.source, event);
                  }
               }
            }

            ++this.curUseTime;
            if (this.curUseTime >= buffModel.getUseTimes()) {
               this.source.getBuffManager().deleteBuffByCode(event.getAction(), this.code, false);
            }

         }
      }
   }
}
