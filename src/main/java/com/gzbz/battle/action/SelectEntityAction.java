package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.protobuf.BattleMsg;

@ActionAnno(
   action = 3
)
public class SelectEntityAction extends Action {
   public BattleMsg.S2C_Battle_Action.Builder run() {
      return null;
   }
}
