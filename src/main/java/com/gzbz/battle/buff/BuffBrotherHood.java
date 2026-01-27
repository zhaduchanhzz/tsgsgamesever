package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.condition.ConditionProcessor;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.Objects;

@BuffSubType(
   subType = 97
)
public class BuffBrotherHood extends ListenerBuff {
   public long value;

   public void init(Entity source, Entity caster, BuffModel model, BuffManager buffManager) {
      super.init(source, caster, model, buffManager);
   }

   public void listen(Event event, ListenerContext context) {
      Entity target = (Entity)event.getParam(3);
      if (!Objects.isNull(target)) {
         if (this.source.isDead()) {
            boolean buffLiveAndDie = (Boolean)event.getAction().getBlackboard().getSkillParam(44, false);
            if (target != this.source && !buffLiveAndDie) {
               return;
            }
         }

         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
         if (!Objects.isNull(buffModel)) {
            if (ConditionProcessor.checkCondition(event.getAction(), buffModel.getConditionType(), buffModel.getConditions(), this.source, target, event)) {
               Long lastHp = (Long)event.getParam(16);
               Long curHp = (Long)event.getParam(17);
               if (Objects.nonNull(lastHp) && Objects.nonNull(curHp)) {
                  long chValue = lastHp - curHp;
                  this.value += chValue;
               }
            }

            BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
            if (!Objects.isNull(useFun)) {
               int propertyId = useFun.getUseId();
               long tempValue = (long)((float)(this.source.getBaseProperty(propertyId) * (long)useFun.getUseValue()) / 10000.0F);
               if (this.value >= tempValue) {
                  long damage = (long)((float)(this.value * (long)useFun.getExDependentValue()) / 10000.0F);
                  useFun = (BuffUseFun)buffModel.getFuncs().get(2);
                  if (Objects.isNull(useFun)) {
                     return;
                  }

                  int property = useFun.getUseId();
                  long limitValue = (long)((float)(this.source.getBaseProperty(property) * (long)useFun.getUseValue()) / 10000.0F);
                  damage = damage > limitValue ? limitValue : damage;
                  byte oppositionForce = BattleMisc.oppositionForce(this.source.getForce());
                  BattlePKTeam oppositionPKTeam = this.source.getScene().getPKTeam(oppositionForce);
                  List<Entity> targets = oppositionPKTeam.getTargetSelector().getTargets(event.getAction(), this.source, (short)10, useFun.getExDependentValue(), "99");
                  if (targets == null || targets.size() == 0) {
                     return;
                  }

                  this.value = 0L;

                  for(Entity e : targets) {
                     EffectUtil.doShield(event.getAction(), this.source, e, damage, (SkillEffectModel)null, false, false, event, (byte)31);
                  }
               }

            }
         }
      }
   }
}
