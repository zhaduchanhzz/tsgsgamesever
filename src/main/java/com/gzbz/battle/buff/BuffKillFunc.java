package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;

@BuffSubType(
   subType = 66
)
public class BuffKillFunc extends ListenerBuff {
   private int triggerTimes;

   public void init(Entity source, Entity caster, BuffModel model, BuffManager buffManager) {
      super.init(source, caster, model, buffManager);
      long limit = (long)((BuffUseFun)model.getFuncs().get(1)).getDependentType();
      source.getScene().getEventListener().addListener(source, this, (short)13, 0, (String)null, (byte)0, (short)0, 0, model.getIsForce());
      source.getScene().getEventListener().addListener(source, this, (short)5, (byte)1, 3, (String)null, (byte)1, (short)0, 0, model.getIsForce());
   }

   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (buffModel != null) {
         if (event.getType() == 5) {
            int newBuffId = ((BuffUseFun)buffModel.getFuncs().get(1)).getExDependentValue();
            if (newBuffId != 0 && this.source.isDead()) {
               this.buffMgr.addBuff(event.getAction(), newBuffId, this.caster, event);
            }

            this.buffMgr.deleteBuffByCode(event.getAction(), this.code, false);
         } else {
            long chValue = (Long)event.getParam(25);
            if (chValue <= 0L) {
               Entity target = (Entity)event.getParam(3);
               if (target != null && target == this.source) {
                  long limit = (long)((BuffUseFun)buffModel.getFuncs().get(1)).getDependentType();
                  long max = this.source.getBaseProperty(1);
                  long last = (Long)event.getParam(16);
                  long cur = (Long)event.getParam(17);
                  long curRate = cur * 10000L / max;
                  if (curRate <= limit) {
                     int property = ((BuffUseFun)buffModel.getFuncs().get(1)).getDependentId();
                     long propertyValue = this.caster.getBattleProperty(event.getAction(), property);
                     int scale = ((BuffUseFun)buffModel.getFuncs().get(1)).getDependentValue();
                     propertyValue = (long)((float)propertyValue * ((float)scale / 10000.0F));
                     if (cur > propertyValue) {
                        cur = propertyValue;
                     }

                     EffectUtil.doShield(event.getAction(), this.caster, this.source, cur, (SkillEffectModel)null, false, false, event, (byte)0);
                     int newBuffId = ((BuffUseFun)buffModel.getFuncs().get(1)).getExDependentValue();
                     if (newBuffId != 0 && this.source.isDead()) {
                        this.buffMgr.addBuff(event.getAction(), newBuffId, this.caster, event);
                     }

                     this.buffMgr.deleteBuffByCode(event.getAction(), this.code, false);
                  }

               }
            }
         }
      }
   }
}
