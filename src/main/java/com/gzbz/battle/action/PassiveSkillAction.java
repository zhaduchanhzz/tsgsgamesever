package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.protobuf.BattleMsg;

@ActionAnno(
   action = 44
)
public class PassiveSkillAction extends Action {
   private int skillId;
   private int rate;
   private boolean bForce = false;
   private Event event;

   public BattleMsg.S2C_Battle_Action.Builder run() {
      if (this.entity.getStateManager().checkState((short)21)) {
         return null;
      } else if (this.entity.isDead() && !this.bForce) {
         return null;
      } else {
         BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
         actionBuilder.setActionType(4);
         actionBuilder.setBattlePos(this.entity.getBattlePos());
         actionBuilder.setId(this.skillId);
         this.blackboard.addBattleAction((byte)4, actionBuilder);
         this.getBlackboard().addSkillParam(1, this.entity);
         this.getBlackboard().addSkillParam(13, this.rate);
         SkillUtil.doSkill(this, this.skillId, (Event)null);
         return this.blackboard.buildActionBuilder();
      }
   }

   public int getSkillId() {
      return this.skillId;
   }

   public void setAction(Entity entity, int skillId, int rate, Event event) {
      this.entity = entity;
      this.skillId = skillId;
      this.rate = rate;
      this.event = event;
   }
}
