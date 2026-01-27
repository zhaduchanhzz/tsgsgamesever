package com.gzbz.battle.entity;

import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.protobuf.BattleMsg;

public class WeaponEntity extends Entity {
   public WeaponEntity(BattleMsg.EntityType type, int modelId, int skillId, int level, int skinId) {
      this.entityType = 1;
      this.type = type;
      this.id = modelId;
      this.level = level;
      this.skinId = skinId;
      this.skillManager.addSkill(1, skillId);
      this.baseProperties.put(99, 0L);
      this.baseProperties.put(1, 3L);
   }

   public void init(BattleScene scene, byte teamPos, byte battlePos, BattlePKTeam pkTeam, byte force) {
      this.scene = scene;
      this.teamPos = teamPos;
      this.battlePos = battlePos;
      this.pkTeam = pkTeam;
      this.force = force;
      this.conditionPropertyManager.init(scene, this);
   }

   public byte getCurMp() {
      return ((Long)this.baseProperties.get(99)).byteValue();
   }

   public void setCurMp(byte curMp) {
      this.baseProperties.put(99, (long)curMp);
   }

   public void addCurMp() {
      int curMap = this.getCurMp() + 1;
      this.setCurMp((byte)curMap);
   }

   public boolean isAlive() {
      return true;
   }

   public boolean isDead() {
      return false;
   }
}
