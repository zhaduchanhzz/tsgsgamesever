package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.protobuf.BattleMsg;
import java.util.Map;
import java.util.Objects;

@ActionAnno(
   action = 43
)
public class ContinueAtkAction extends Action {
   private EntitySkill skill;
   public Integer damageRate;
   public Integer controlRate;
   public Integer recoverRate;
   public Integer effectRate;
   private byte force;

   public BattleMsg.S2C_Battle_Action.Builder run() {
      if (!this.entity.isDead() && !this.entity.getStateManager().checkState((short)21) && !this.entity.getStateManager().checkState((short)23)) {
         BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
         actionBuilder.setBattlePos(this.entity.getBattlePos());
         this.blackboard.addBattleAction(this.type, actionBuilder);
         if (this.force == 0 && (this.entity.getStateManager().checkState((short)12) || this.entity.getStateManager().checkState((short)16))) {
            this.skill = this.entity.getSkillManager().getCommonSkill();
         }

         Map<String, Integer> rateMap = this.entity.getConditionPropertyManager().changeRate(this);
         if (rateMap.size() > 0) {
            if (Objects.nonNull(this.damageRate)) {
               this.damageRate = this.damageRate + (Integer)rateMap.get("damageRate");
            }

            if (Objects.nonNull(this.controlRate)) {
               this.controlRate = this.controlRate + (Integer)rateMap.get("controlRate");
            }

            if (Objects.nonNull(this.recoverRate)) {
               this.recoverRate = this.recoverRate + (Integer)rateMap.get("recoverRate");
            }
         }

         actionBuilder.setId(this.skill.getSkillId());
         this.blackboard.addSkillParam(1, this.entity);
         this.blackboard.addSkillParam(4, this.skill);
         this.blackboard.addSkillParam(13, this.damageRate);
         this.blackboard.addSkillParam(14, this.controlRate);
         this.blackboard.addSkillParam(28, this.recoverRate);
         this.blackboard.addSkillParam(36, this.effectRate);
         this.blackboard.addSkillParam(29, this.entity);
         SkillUtil.doSkill(this, (Event)null);
         return this.blackboard.buildActionBuilder();
      } else {
         return null;
      }
   }

   public EntitySkill getSkill() {
      return this.skill;
   }

   public void setSkill(EntitySkill skill, Integer damageRate, Integer controlRate, Integer recoverRate, Integer effectRate) {
      this.skill = skill;
      this.damageRate = damageRate;
      this.controlRate = controlRate;
      this.recoverRate = recoverRate;
      this.effectRate = effectRate;
   }

   public byte getForce() {
      return this.force;
   }

   public void setForce(byte force) {
      this.force = force;
   }
}
