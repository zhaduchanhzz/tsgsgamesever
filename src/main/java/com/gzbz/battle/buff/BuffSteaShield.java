package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.HashSet;
import java.util.Objects;

@BuffSubType(
   subType = 118
)
public class BuffSteaShield extends ListenerBuff {
   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (!Objects.isNull(buffModel)) {
         BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(2);
         if (!Objects.isNull(buffUseFun)) {
            Entity target = (Entity)event.getParam(3);
            if (!Objects.isNull(target) && this.source.getForce() != target.getForce()) {
               long shieldValue = target.getBuffManager().getShieldValue();
               if (shieldValue != 0L) {
                  int rate = buffUseFun.getUseValue();
                  int limitPropertyId = buffUseFun.getDependentId();
                  int limitRate = buffUseFun.getDependentValue();
                  long value = (long)((float)rate / 10000.0F * (float)shieldValue);
                  long limitValue = (long)((float)(super.caster.getBattleProperty(event.getAction(), limitPropertyId) * (long)limitRate) / 10000.0F);
                  value = value > limitValue ? limitValue : value;
                  HashSet<Buff> delSet = new HashSet();
                  this.modifyShieldValue(event.getAction(), target, value, delSet);

                  for(Buff buffCode : delSet) {
                     target.getBuffManager().deleteBuffByCode(event.getAction(), buffCode.code, true, false, 0, true);
                  }

                  int addBuffId = buffUseFun.getExDependentValue();
                  BuffModel addBuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", addBuffId);
                  if (!Objects.isNull(addBuffModel)) {
                     Buff buff = BuffFactory.getBuff(addBuffModel, this.source, this.source, this.source.getBuffManager());
                     if (!Objects.isNull(buff)) {
                        buff.setValue(1, (long)((int)value));
                        this.source.getBuffManager().addBuff(event.getAction(), buff, addBuffModel, event);
                     }
                  }
               }
            }
         }
      }
   }

   private void modifyShieldValue(Action action, Entity target, long value, HashSet<Buff> delSet) {
      for(int code : target.getBuffManager().getShieldBuff()) {
         Buff buff = target.getBuffManager().getBuff(code);
         if (!Objects.isNull(buff)) {
            if (value == buff.getValue(1)) {
               delSet.add(buff);
            } else if (value > buff.getValue(1)) {
               delSet.add(buff);
               value -= buff.getValue(1);
            } else {
               buff.addValue(1, -value);
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectBuilder.setTargetBattlePos(target.getBattlePos());
               effectBuilder.setEffectType(4);
               effectBuilder.setEffectId(buff.id);
               effectBuilder.setEffectCode(buff.code);
               effectBuilder.setEffectValue(buff.getValue(1));
               effectBuilder.setCrit(buff.round);
               action.getBlackboard().addBattleEffect(effectBuilder);
            }
         }
      }

   }
}
