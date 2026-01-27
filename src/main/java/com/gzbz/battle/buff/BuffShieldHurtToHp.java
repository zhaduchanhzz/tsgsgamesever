package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@BuffSubType(
   subType = 99
)
public class BuffShieldHurtToHp extends ListenerBuff {
   Logger logger = LoggerFactory.getLogger(BuffShieldHurtToHp.class);
   public long hurtValue;

   public void listen(Event event, ListenerContext context) {
      if (this.hurtValue != 0L && context.entity != null) {
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
         if (buffModel != null) {
            List<Entity> entityList = new ArrayList();
            BattlePKTeam pkTeam = context.entity.getPkTeam();

            for(Entity entity : pkTeam.getEntityMap().values()) {
               if (!entity.isDead()) {
                  entityList.add(entity);
               }
            }

            if (entityList.size() != 0) {
               int percent = 10000;
               BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
               if (buffUseFun != null && buffUseFun.getUseId() > 0 && buffUseFun.getUseFunc() != 10) {
                  percent = buffUseFun.getUseId();
               }

               long addValue = (long)((float)(this.hurtValue * (long)percent) / 10000.0F / (float)entityList.size());
               this.hurtValue = 0L;
               boolean cure = false;
               if (buffUseFun != null && buffUseFun.getExDependentValue() == 1) {
                  cure = true;
               }

               for(Entity entity : entityList) {
                  if (cure) {
                     float totalRate = (float)(10000L + this.source.getBattleProperty(event.getAction(), 18)) / 10000.0F * (float)(10000L + entity.getBattleProperty(event.getAction(), 19)) / 10000.0F;
                     long value = (long)((float)addValue * totalRate);
                     entity.recoverHp(event.getAction(), context.entity, (SkillEffectModel)null, false, value, event, true);
                  } else {
                     entity.recoverHp(event.getAction(), context.entity, (SkillEffectModel)null, false, addValue, event, true);
                  }
               }

            }
         }
      }
   }
}
