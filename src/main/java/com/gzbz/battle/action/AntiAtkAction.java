package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.conditionProperty.ConditionProperty;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.protobuf.BattleMsg;
import java.util.Collection;
import java.util.Objects;

@ActionAnno(
   action = 42
)
public class AntiAtkAction extends Action {
   private Entity targetEntity;
   private Integer damageRate;
   private Integer controlRate;
   private Integer recoverRate;
   private int skillIndex = -1;
   private Integer effectId;
   private int skillId = -1;
   private boolean useSkillId;
   private boolean useNewSkill;

   public BattleMsg.S2C_Battle_Action.Builder run() {
      if (this.targetEntity != null && !this.targetEntity.isDead() && this.targetEntity.getPkTeam() != null && this.entity != null && !this.entity.isDead() && this.targetEntity.entityType == 0) {
         if (!this.entity.getStateManager().checkState((short)21) && !this.entity.getStateManager().checkState((short)23)) {
            if (!this.entity.getStateManager().checkState((short)11) && !this.entity.getStateManager().checkState((short)1)) {
               EntitySkill entitySkill = null;
               if (this.skillIndex != -1) {
                  entitySkill = this.entity.getSkillManager().getIndexSkill(this.skillIndex);
               }

               if (Objects.isNull(entitySkill)) {
                  entitySkill = this.entity.getSkillManager().getCommonSkill();
               }

               BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
               actionBuilder.setBattlePos(this.entity.getBattlePos());
               if (this.useNewSkill) {
                  actionBuilder.setId(entitySkill.id);
               } else {
                  actionBuilder.setId(entitySkill.oldId);
               }

               this.blackboard.addBattleAction(this.type, actionBuilder);
               this.blackboard.addSkillParam(1, this.entity);
               this.blackboard.addSkillParam(4, entitySkill);
               this.blackboard.addSkillParam(9, this.targetEntity);
               this.blackboard.addSkillParam(13, this.damageRate);
               this.blackboard.addSkillParam(14, this.controlRate);
               this.blackboard.addSkillParam(28, this.recoverRate);
               this.blackboard.addSkillParam(29, this.entity);
               if (this.useNewSkill) {
                  this.blackboard.addSkillParam(9, null);
               }

               Collection<ConditionProperty> mustHitEffects = this.entity.getConditionPropertyManager().getMustHitEffectEffectList();
               if (mustHitEffects.size() > 0) {
                  this.blackboard.addSkillParam(2100 + this.entity.getBattlePos(), true);
               }

               if (this.useSkillId && this.skillId != -1) {
                  actionBuilder.setId(this.skillId);
                  SkillUtil.doSkill(this, this.skillId, (Event)null);
               } else {
                  SkillUtil.doSkill(this, (Event)null);
               }

               Event event = new Event((short)19, this, (Event)null);
               event.addParam(2, this.entity);
               this.scene.getEventListener().pushEvent(event);
               return this.blackboard.buildActionBuilder();
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public Integer getEffectId() {
      return this.effectId;
   }

   public void setTargetEntity(Entity targetEntity, Integer damageRate, Integer controlRate, Integer recoverRate, int skillIndex) {
      this.targetEntity = targetEntity;
      this.damageRate = damageRate;
      this.controlRate = controlRate;
      this.recoverRate = recoverRate;
      this.skillIndex = skillIndex;
   }

   public void setTargetEntity(Entity targetEntity, Integer damageRate, Integer controlRate, Integer recoverRate, boolean useSkillId, int skillId) {
      this.targetEntity = targetEntity;
      this.damageRate = damageRate;
      this.controlRate = controlRate;
      this.recoverRate = recoverRate;
      this.useSkillId = useSkillId;
      this.skillId = skillId;
   }

   public void setTargetEntity(Entity targetEntity, Integer damageRate, Integer controlRate, Integer recoverRate, int skillIndex, int effectId) {
      this.targetEntity = targetEntity;
      this.damageRate = damageRate;
      this.controlRate = controlRate;
      this.recoverRate = recoverRate;
      this.skillIndex = skillIndex;
      this.effectId = effectId;
   }

   public void setUseNewSkill(boolean useNewSkill) {
      this.useNewSkill = useNewSkill;
   }
}
