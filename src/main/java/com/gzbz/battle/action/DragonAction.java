package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.entity.DragonEntity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.protobuf.BattleMsg;
import java.util.Objects;

@ActionAnno(
   action = 20
)
public class DragonAction extends Action {
   public BattlePKTeam pkTeam;

   public BattleMsg.S2C_Battle_Action.Builder run() {
      DragonEntity dragonEntity = this.pkTeam.getDragonEntity();
      if (Objects.isNull(dragonEntity)) {
         return null;
      } else {
         EntitySkill dragonSkill = dragonEntity.getSkillManager().getDragonSkill();
         if (Objects.isNull(dragonSkill)) {
            return null;
         } else {
            BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
            actionBuilder.setBattlePos(dragonEntity.getBattlePos());
            this.blackboard.addBattleAction(this.type, actionBuilder);
            this.getBlackboard().addSkillParam(1, dragonEntity);
            this.getBlackboard().addSkillParam(4, dragonSkill);
            int skillId = dragonSkill.getSkillId();
            actionBuilder.setId(skillId);
            SkillUtil.doSkill(this, (Event)null);
            this.scene.getActionManager().addAction(ActionFactory.getAction(this.scene, (byte)5));
            return this.blackboard.buildActionBuilder();
         }
      }
   }

   public void destroy() {
      super.destroy();
      this.pkTeam = null;
   }
}
