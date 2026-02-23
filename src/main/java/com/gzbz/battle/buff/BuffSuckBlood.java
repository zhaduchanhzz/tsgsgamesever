package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.Listener;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.TreeMap;

@BuffSubType(
   subType = 83
)
public class BuffSuckBlood extends Buff implements Listener {
   public void init(Entity source, Entity caster, BuffModel model, BuffManager buffManager) {
      super.init(source, caster, model, buffManager);

      for(KeyValFun keyValFun : model.getEventType().values()) {
         source.getScene().getEventListener().addListener(source, this, (short)keyValFun.getKey(), keyValFun.getVal(), keyValFun.getExParams(), model.getCheckDead(), (short)1, 10000, model.getIsForce());
      }

   }

   public void listen(Event event, ListenerContext context) {
      Entity sourceEntity = (Entity)event.getParam(2);
      if (sourceEntity == this.source) {
         long damage = 0L;

         for(Entity target : (ArrayList<Entity>)event.getParam(14)) {
            damage += (Long)event.getAction().getBlackboard().getSkillParam(1200 + target.getBattlePos(), 0L);
         }

         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
         float totalRate = (float)(10000L + this.source.getBattleProperty(event.getAction(), 19)) / 10000.0F;
         totalRate *= this.source.getBuffManager().getBeCureValue();
         int reviveValue = 0;
         HashMap<Integer, TreeMap<Integer, Buff>> idMaps = (HashMap)this.source.getBuffManager().getPriorityBuffsMap().get(buffModel.getType());
         if (!Objects.isNull(idMaps)) {
            TreeMap<Integer, Buff> codeMap = (TreeMap)idMaps.get(this.id);
            if (!Objects.isNull(codeMap)) {
               for(Buff buff : codeMap.values()) {
                  buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                  BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
                  reviveValue += (int)((float)(damage * (long)useFun.getUseValue()) / 10000.0F * totalRate);
               }

               BuffUseFun leaveFun = (BuffUseFun)buffModel.getFuncs().get(2);
               int shieldId = 0;
               if (Objects.nonNull(leaveFun)) {
                  BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
                  int limitValue;
                  if (useFun.getExDependentValue() == 1) {
                     limitValue = (int)(this.caster.getBaseProperty(1) * (long)leaveFun.getUseValue() / 10000L);
                  } else {
                     limitValue = (int)(this.source.getBaseProperty(1) * (long)leaveFun.getUseValue() / 10000L);
                  }

                  shieldId = leaveFun.getExDependentValue();
                  reviveValue = reviveValue > limitValue ? limitValue : reviveValue;
               }

               long moreValue = (long)reviveValue - (this.source.getBaseProperty(1) - this.source.getBaseProperty(99));
               this.source.recoverHp(event.getAction(), this.source, (SkillEffectModel)null, false, (long)reviveValue, event, true);
               if (moreValue > 0L && shieldId != 0) {
                  BuffModel shieldBuffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", shieldId);
                  if (Objects.nonNull(shieldBuffModel)) {
                     Buff buff = BuffFactory.getBuff(shieldBuffModel, this.source, this.source, this.source.getBuffManager());
                     if (buff != null) {
                        buff.setValue(1, moreValue);
                        this.source.getBuffManager().addBuff(event.getAction(), buff, shieldBuffModel, event);
                     }
                  }
               }

            }
         }
      }
   }

   public void destroy() {
      this.source.getScene().getEventListener().removeListener(this);
   }
}
