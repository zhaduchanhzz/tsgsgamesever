package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.protobuf.BattleMsg;

@ActionAnno(
   action = 50
)
public class KeepAnyAtkAction extends Action {
   public Entity sourceEntity;
   public Integer damageRate;
   private Integer controlRate;
   private Integer recoverRate;
   private int skillSlot;

   public BattleMsg.S2C_Battle_Action.Builder run() {
      if (!this.entity.isDead() && !this.entity.getStateManager().checkState((short)21)) {
         BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
         actionBuilder.setBattlePos(this.entity.getBattlePos());
         EntitySkill entitySkill = this.entity.getSkillManager().getIndexSkill(this.skillSlot);
         actionBuilder.setId(entitySkill.getSkillId());
         this.blackboard.addBattleAction((byte)41, actionBuilder);
         this.blackboard.addSkillParam(1, this.sourceEntity);
         this.blackboard.addSkillParam(4, entitySkill);
         this.blackboard.addSkillParam(13, this.damageRate);
         this.blackboard.addSkillParam(14, this.controlRate);
         this.blackboard.addSkillParam(28, this.recoverRate);
         this.blackboard.addSkillParam(29, this.entity);
         SkillUtil.doSkill(this, (Event)null);
         return this.blackboard.buildActionBuilder();
      } else {
         return null;
      }
   }

   public void setSourceEntity(Entity sourceEntity, Integer skillSlot, Integer damageRate, Integer controlRate, Integer recoverRate) {
      this.skillSlot = skillSlot;
      this.sourceEntity = sourceEntity;
      this.controlRate = controlRate;
      this.damageRate = damageRate;
      this.recoverRate = recoverRate;
   }

   public void destroy() {
      super.destroy();
      this.sourceEntity = null;
   }
}
