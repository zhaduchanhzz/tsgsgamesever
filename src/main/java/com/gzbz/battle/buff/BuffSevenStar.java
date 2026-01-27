package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Objects;

@BuffSubType(
   subType = 43
)
public class BuffSevenStar extends ListenerBuff {
   public static byte BUFF_SEVEN_STAR_TYPE_ADD = 1;
   public static byte BUFF_SEVEN_STAR_TYPE_DEL = 2;

   public void listen(Event event, ListenerContext context) {
      if (!this.source.isAlive() && !this.source.getStateManager().checkState((short)21)) {
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
         if (!Objects.isNull(buffModel)) {
            long value = (long)((float)(this.source.getBaseProperty(1) * (long)((BuffUseFun)buffModel.getFuncs().get(1)).getUseValue()) / 10000.0F);
            this.source.setBaseProperty(99, value);
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setEffectType(18);
            effectBuilder.setEffectValue((long)BUFF_SEVEN_STAR_TYPE_ADD);
            effectBuilder.setFinalValue(this.source.getBaseProperty(99));
            effectBuilder.setTargetBattlePos(this.source.getBattlePos());
            event.getAction().getBlackboard().addBattleEffect(effectBuilder);
            int severStarBuffId = ((BuffUseFun)buffModel.getFuncs().get(1)).getUseId();
            BuffModel severStarBuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", severStarBuffId);
            Buff buff = BuffFactory.getBuff(severStarBuffModel, this.source, this.source, this.source.getBuffManager());
            if (buff != null) {
               this.source.getBuffManager().addBuff(event.getAction(), buff, severStarBuffModel, event);
               this.buffMgr.deleteBuffByCode(event.getAction(), this.code, false);
            }
         }
      }
   }

   public void destroy() {
      this.source.getStateManager().removeState(this.attachedCode);
      this.source.getScene().getEventListener().removeListener(this);
   }
}
