package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.entity.WeaponEntity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.protobuf.BattleMsg;

@ActionAnno(
   action = 21
)
public class WeaponAction extends Action {
   public BattlePKTeam pkTeam;
   public static final byte WEAPON_HP_MAX = 3;

   public BattleMsg.S2C_Battle_Action.Builder run() {
      WeaponEntity weaponEntity = this.pkTeam.getWeaponEntity();
      if (weaponEntity == null) {
         return null;
      } else {
         EntitySkill entitySkill = weaponEntity.getSkillManager().getSkill();
         if (entitySkill == null) {
            return null;
         } else if (this.scene.checkOver()) {
            return null;
         } else {
            BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
            actionBuilder.setBattlePos(this.entity.getBattlePos());
            this.getBlackboard().addBattleAction(this.type, actionBuilder);
            this.getBlackboard().addSkillParam(1, weaponEntity);
            weaponEntity.addCurMp();
            if (weaponEntity.getCurMp() < 3) {
               BattleMsg.S2C_Battle_Effects.Builder battleEffects = BattleMsg.S2C_Battle_Effects.newBuilder();
               this.blackboard.addBattleEffects(0, battleEffects);
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectBuilder.setEffectType(10);
               effectBuilder.setTargetBattlePos(weaponEntity.getBattlePos());
               effectBuilder.setEffectValue((long)weaponEntity.getCurMp());
               this.blackboard.addBattleEffect(effectBuilder);
            } else {
               weaponEntity.setCurMp((byte)0);
               this.getBlackboard().addSkillParam(1, this.entity);
               this.getBlackboard().addSkillParam(4, entitySkill);
               int skillId = entitySkill.getSkillId();
               actionBuilder.setId(skillId);
               SkillUtil.doSkill(this, (Event)null);
               if (this.blackboard.getEffectsCount() == 0) {
                  BattleMsg.S2C_Battle_Effects.Builder battleEffects = BattleMsg.S2C_Battle_Effects.newBuilder();
                  this.blackboard.addBattleEffects(0, battleEffects);
               }

               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectBuilder.setEffectType(10);
               effectBuilder.setTargetBattlePos(weaponEntity.getBattlePos());
               effectBuilder.setEffectValue((long)weaponEntity.getCurMp());
               this.blackboard.addBattleEffect(effectBuilder);
            }

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
