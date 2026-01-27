package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.listener.Event;
import com.gzbz.protobuf.BattleMsg;

@ActionAnno(
   action = 1
)
public class StartAction extends Action {
   public BattleMsg.S2C_Battle_Action.Builder run() {
      BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
      actionBuilder.setActionType(this.type);
      BattleMsg.S2C_Battle_Effects.Builder effectsBuilder = BattleMsg.S2C_Battle_Effects.newBuilder();
      this.blackboard.addBattleEffects(-1, effectsBuilder);
      Event event = new Event((short)2, this, (Event)null);
      event.addParam(12, this);
      event.addParam(8, this.scene.round);
      this.scene.getEventListener().pushEvent(event);
      if (this.scene.getPKTeam((byte)0).getTotalSpeed() > this.scene.getPKTeam((byte)1).getTotalSpeed()) {
         for(byte force = 0; force < 2; ++force) {
            this.scene.addAction(this.scene.getDragonAction(force));
            this.scene.addAction(this.scene.getWeaponAction(force));
            this.scene.addAction(this.scene.getPetAction(force));
         }
      } else {
         for(byte force = 1; force >= 0; --force) {
            this.scene.addAction(this.scene.getDragonAction(force));
            this.scene.addAction(this.scene.getWeaponAction(force));
            this.scene.addAction(this.scene.getPetAction(force));
         }
      }

      this.getScene().getPKTeam((byte)0).sendStatistics(this);
      this.getScene().getPKTeam((byte)1).sendStatistics(this);
      if (effectsBuilder.getEffectsCount() > 0 || effectsBuilder.getEventEffectsCount() > 0) {
         actionBuilder.addEffectes(effectsBuilder.build());
      }

      return actionBuilder;
   }
}
