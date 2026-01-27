package com.gzbz.battle.entity;

import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.arraying.PetMirror;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Map;

public class PetEntity extends Entity {
   private PetMirror petMirror;

   public PetEntity(BattleMsg.EntityType type, PetMirror petMirror) {
      this.type = type;
      this.entityType = 4;
      this.petMirror = petMirror;
   }

   public void init(BattleScene scene, byte teamPos, byte battlePos, BattlePKTeam pkTeam, byte force) {
      this.scene = scene;
      this.pkTeam = pkTeam;
      this.force = force;
      this.teamPos = teamPos;
      this.battlePos = battlePos;
      this.level = this.petMirror.lv;
      this.id = this.petMirror.id;

      for(Map.Entry<Integer, Integer> propertyEntity : this.petMirror.property.entrySet()) {
         this.baseProperties.put(propertyEntity.getKey(), (long)(Integer)propertyEntity.getValue());
      }

      this.skillManager.addSkill(1, this.petMirror.skillId);
      SkillModel exclusiveSkill = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", this.petMirror.exclusiveId);
      if (exclusiveSkill != null) {
         for(int effectId : exclusiveSkill.getEffects().values()) {
            SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", effectId);
            if (skillEffectModel.getIsPassive() == 1) {
               this.skillManager.addPassiveEffect((byte)8, (SkillModel)null, skillEffectModel);
            }
         }
      }

      for(int flySkillId : this.petMirror.flySkills) {
         SkillModel flySkill = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", flySkillId);
         if (flySkill != null) {
            for(int effectId : flySkill.getEffects().values()) {
               SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", effectId);
               if (skillEffectModel.getIsPassive() == 1) {
                  this.skillManager.addPassiveEffect((byte)8, (SkillModel)null, skillEffectModel);
               }
            }
         }
      }

      this.baseProperties.put(8, 9999999L);
   }

   public PetMirror getPetMirror() {
      return this.petMirror;
   }

   public boolean isAlive() {
      return true;
   }

   public boolean isDead() {
      return false;
   }
}
