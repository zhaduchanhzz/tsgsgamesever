package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.protobuf.BattleMsg;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

@ActionAnno(
   action = 46
)
public class KeepKillAction extends Action {
   public Integer damageRate;
   private Integer controlRate;
   private Integer recoverRate;
   private String exParam;
   private ArrayList<Entity> targets = new ArrayList();

   public BattleMsg.S2C_Battle_Action.Builder run() {
      if (!this.entity.isDead() && !this.entity.getStateManager().checkState((short)21) && !this.entity.getStateManager().checkState((short)23)) {
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

         BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
         actionBuilder.setBattlePos(this.entity.getBattlePos());
         EntitySkill entitySkill = this.entity.getSkillManager().getCommonSkill();
         actionBuilder.setId(entitySkill.getSkillId());
         this.blackboard.addBattleAction((byte)41, actionBuilder);
         this.blackboard.addSkillParam(1, this.entity);
         this.blackboard.addSkillParam(4, entitySkill);
         this.blackboard.addSkillParam(31, this.targets);
         this.blackboard.addSkillParam(32, this.exParam);
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

   public void setSourceEntity(Entity sourceEntity, ArrayList targets, Integer damageRate, Integer controlRate, Integer recoverRate, String exParam) {
      this.entity = sourceEntity;
      this.controlRate = controlRate;
      this.damageRate = damageRate;
      this.recoverRate = recoverRate;
      this.targets.addAll(targets);
      this.exParam = exParam;
   }

   public void destroy() {
      super.destroy();
      this.entity = null;
   }
}
