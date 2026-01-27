package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Objects;
import misc.RandomUtil;

@BuffSubType(
   subType = 119
)
public class BuffHurtToShield extends ListenerBuff {
   public static int ATTACK_VALUE = 0;
   public static int DAMAGE_VALUE = 1;
   private int triggerTimes;

   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (buffModel.getUseTimes() == 0 || this.triggerTimes < buffModel.getUseTimes()) {
         BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(2);
         if (useFun != null) {
            int rate = useFun.getUseValue();
            if (RandomUtil.randTenThousand() < rate) {
               long value = 0L;
               if (useFun.getDependentType() == ATTACK_VALUE) {
                  value = (Long)event.getAction().getBlackboard().getSkillParam(1100 + this.source.getBattlePos(), 0L);
               } else if (useFun.getDependentType() == DAMAGE_VALUE) {
                  value = (Long)event.getAction().getBlackboard().getSkillParam(1200 + this.source.getBattlePos(), 0L);
               }

               value = (long)((float)value * ((float)useFun.getExDependentValue() / 10000.0F));
               int addBuffId = useFun.getUseId();
               BuffModel addBuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", addBuffId);
               if (Objects.isNull(addBuffModel)) {
                  return;
               }

               Buff buff = BuffFactory.getBuff(addBuffModel, this.source, this.source, this.source.getBuffManager());
               if (Objects.isNull(buff)) {
                  return;
               }

               buff.setValue(1, (long)((int)value));
               this.source.getBuffManager().addBuff(event.getAction(), buff, addBuffModel, event);
               ++this.triggerTimes;
            }

         }
      }
   }

   public void update(Action action) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (buffModel.getUseTimes() != 0) {
         this.triggerTimes = 0;
      }

   }
}
