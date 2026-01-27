package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.entity.PetEntity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.protobuf.BattleMsg;
import java.util.HashMap;

@ActionAnno(
   action = 23
)
public class PetAction extends Action {
   public BattlePKTeam pkTeam;

   public BattleMsg.S2C_Battle_Action.Builder run() {
      HashMap<Integer, PetEntity> skillPetMap = this.pkTeam.getSkillPetMap();
      if (skillPetMap == null) {
         return null;
      } else {
         int curIndex = this.scene.getRound() % 4 + 1;
         PetEntity petEntity = (PetEntity)skillPetMap.get(curIndex);
         if (petEntity == null) {
            return null;
         } else {
            this.entity = petEntity;
            EntitySkill entitySkill = petEntity.getSkillManager().getIndexSkill(1);
            if (entitySkill == null) {
               return null;
            } else {
               BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
               actionBuilder.setBattlePos(petEntity.getBattlePos());
               int skillId = entitySkill.getSkillId();
               actionBuilder.setId(skillId);
               this.blackboard.addSkillParam(1, this.entity);
               this.blackboard.addSkillParam(4, entitySkill);
               this.blackboard.addBattleAction(this.type, actionBuilder);
               SkillUtil.doSkill(this, (Event)null);
               return this.blackboard.buildActionBuilder();
            }
         }
      }
   }
}
