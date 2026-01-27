package com.gzbz.battle.entity;

import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.protobuf.BattleMsg;

public class BeautyEntity extends Entity {
   public BeautyEntity(BattleMsg.EntityType type, int modelId, int skillId) {
      this.entityType = 2;
      this.type = type;
      this.id = modelId;
      this.level = skillId;
      this.skillManager.addSkill(1, skillId);
      this.baseProperties.put(99, 4L);
      this.baseProperties.put(1, 4L);
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
      int curMp = this.getCurMp() + 1;
      this.setCurMp((byte)curMp);
   }

   public boolean isAlive() {
      return true;
   }

   public boolean isDead() {
      return false;
   }
}
