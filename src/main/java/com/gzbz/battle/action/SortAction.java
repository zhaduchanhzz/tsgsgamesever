package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.protobuf.BattleMsg;
import java.util.List;

@ActionAnno(
   action = 2
)
public class SortAction extends Action {
   public BattleMsg.S2C_Battle_Action.Builder run() {
      List<Entity> speedList = this.scene.getSpeedList();
      speedList.clear();

      for(Entity entity : this.scene.getPosEntity().values()) {
         speedList.add(entity);
      }

      this.scene.sort();
      this.scene.resetSkillOrder();
      return null;
   }
}
