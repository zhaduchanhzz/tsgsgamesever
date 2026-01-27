package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.listener.Event;
import com.gzbz.protobuf.BattleMsg;

/** @deprecated */
@Deprecated
@ActionAnno(
   action = 47
)
public class ActionEndCheck extends Action {
   public BattleMsg.S2C_Battle_Action.Builder run() {
      BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
      this.getBlackboard().addBattleAction((byte)45, actionBuilder);
      BattleMsg.S2C_Battle_Effects.Builder effectsBuilder = BattleMsg.S2C_Battle_Effects.newBuilder();
      this.getBlackboard().addBattleEffects(-1, effectsBuilder);
      Event event = new Event((short)16, this, (Event)null);
      this.getScene().getEventListener().pushEvent(event);
      this.getScene().getEventListener().clearRecord();
      return this.blackboard.buildActionBuilder();
   }

   public void destroy() {
      super.destroy();
   }
}
