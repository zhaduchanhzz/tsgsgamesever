package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.protobuf.BattleMsg;

@ActionAnno(
   action = 4
)
public class SkillAction extends Action {
   public void doPreSkill(Entity skillEntity) {
      BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
      actionBuilder.setBattlePos(skillEntity.getBattlePos());
      this.blackboard.addBattleAction((byte)49, actionBuilder);
      EntitySkill entitySkill = skillEntity.getSkillManager().getSkill(true);
      this.blackboard.addSkillParam(1, skillEntity);
      this.blackboard.addSkillParam(4, entitySkill);
      Event beforeEvent = new Event((short)20, this, (Event)null);
      beforeEvent.addParam(2, skillEntity);
      this.getScene().getEventListener().pushEvent(beforeEvent);
      entitySkill = skillEntity.getSkillManager().getSkill();
      this.blackboard.addSkillParam(4, entitySkill);
      Event preEvent = new Event((short)46, this, (Event)null);
      preEvent.addParam(2, skillEntity);
      this.getScene().getEventListener().pushEvent(preEvent);
      actionBuilder = this.blackboard.buildActionBuilder();
      if (actionBuilder != null) {
         this.msgList.add(actionBuilder);
      }

      this.getBlackboard().clear();
   }

   public BattleMsg.S2C_Battle_Action.Builder run() {
      Entity entity = null;
      this.scene.sort();

      while(this.scene.getSpeedList().size() > 0) {
         entity = (Entity)this.scene.getSpeedList().remove(0);
         if (!entity.isDead() && !entity.getStateManager().checkState((short)21)) {
            break;
         }

         entity.getPkTeam().setSkillOrder(entity);
      }

      if (entity == null) {
         return null;
      } else {
         this.doPreSkill(entity);
         EntitySkill entitySkill = entity.getSkillManager().getSkill();
         if (entitySkill == null) {
            return null;
         } else {
            BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
            actionBuilder.setBattlePos(entity.getBattlePos());
            int skillId = entitySkill.getSkillId();
            actionBuilder.setId(skillId);
            this.blackboard.addSkillParam(1, entity);
            this.blackboard.addSkillParam(4, entitySkill);
            this.blackboard.addBattleAction(this.type, actionBuilder);
            entity.getPkTeam().setSkillOrder(entity);
            SkillUtil.doSkill(this, (Event)null);
            Event event = new Event((short)19, this, (Event)null);
            event.addParam(2, entity);
            this.scene.getEventListener().pushEvent(event);
            return this.blackboard.buildActionBuilder();
         }
      }
   }
}
