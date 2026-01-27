package com.gzbz.battle.passive;

import com.gzbz.battle.effectFunc.EffectFuncProcessor;
import com.gzbz.battle.entity.BeautyEntity;
import com.gzbz.battle.entity.DragonEntity;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.WeaponEntity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.Objects;

public class PassiveAddBuff extends PassiveSkillEffect {
   public void listen(Event event, ListenerContext context) {
      Entity target = (Entity)event.getParam(3);
      Entity source = (Entity)event.getParam(2);
      if (this.entity.getPkTeam().checkPassiveSkill(this.effectId, this.entity)) {
         SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", this.effectId);
         if (this.coolDown <= 0) {
            if (skillEffectModel.getTriggerTime() == 0 || this.triggerTime < skillEffectModel.getTriggerTime()) {
               if (!Objects.isNull(target) && !(target instanceof WeaponEntity) && !(target instanceof BeautyEntity) && !(target instanceof DragonEntity)) {
                  EffectFuncProcessor.doFunc(event.getAction(), source, target, (List)null, skillEffectModel, event);
                  if (skillEffectModel.getCoolDown() > 0) {
                     this.coolDown += skillEffectModel.getCoolDown();
                  }

                  if (skillEffectModel.getTriggerTime() > 0) {
                     ++this.triggerTime;
                  }

               }
            }
         }
      }
   }
}
