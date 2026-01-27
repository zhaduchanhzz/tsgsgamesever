package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.protobuf.BattleMsg;
import java.util.Objects;

@ActionAnno(
   action = 60
)
public class UseSkillAction extends Action {
   private int skillIndex = -1;
   private byte actionType = 4;

   public BattleMsg.S2C_Battle_Action.Builder run() {
      EntitySkill entitySkill = this.entity.getSkillManager().getIndexSkill(this.skillIndex);
      if (Objects.isNull(entitySkill)) {
         return null;
      } else {
         BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
         actionBuilder.setBattlePos(this.entity.getBattlePos());
         int skillId = entitySkill.getSkillId();
         actionBuilder.setId(skillId);
         this.blackboard.addSkillParam(1, this.entity);
         this.blackboard.addSkillParam(4, entitySkill);
         this.blackboard.addBattleAction(this.actionType, actionBuilder);
         SkillUtil.doSkill(this, (Event)null);
         Event event = new Event((short)19, this, (Event)null);
         event.addParam(2, this.entity);
         this.scene.getEventListener().pushEvent(event);
         return this.blackboard.buildActionBuilder();
      }
   }

   public void setSkillIndex(int skillIndex) {
      this.skillIndex = skillIndex;
   }

   public void setActionType(byte actionType) {
      this.actionType = actionType;
   }

   public int getSkillIndex() {
      return this.skillIndex;
   }

   public byte getActionType() {
      return this.actionType;
   }
}
