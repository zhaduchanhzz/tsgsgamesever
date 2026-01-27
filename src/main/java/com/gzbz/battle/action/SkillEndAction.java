package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.protobuf.BattleMsg;

@ActionAnno(
   action = 5
)
public class SkillEndAction extends Action {
   public BattleMsg.S2C_Battle_Action.Builder run() {
      BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
      this.blackboard.addBattleAction(this.type, actionBuilder);
      BattleMsg.S2C_Battle_Effects.Builder effectsBuilder = BattleMsg.S2C_Battle_Effects.newBuilder();
      this.blackboard.addBattleEffects(-1, effectsBuilder);
      if (this.scene.getActionManager().isEmpty() && this.scene.checkOver()) {
         this.scene.setNextAction((byte)7);
         return this.blackboard.buildActionBuilder();
      } else {
         if (this.scene.getSpeedList().size() > 0) {
            this.scene.setNextAction((byte)3);
         }

         return this.blackboard.buildActionBuilder();
      }
   }
}
