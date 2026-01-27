package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.protobuf.BattleMsg;
import java.util.ArrayList;
import java.util.Objects;

@ActionAnno(
   action = 6
)
public class UpdateAction extends Action {
   public BattleMsg.S2C_Battle_Action.Builder run() {
      BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
      this.blackboard.addBattleAction(this.type, actionBuilder);
      BattleMsg.S2C_Battle_Effects.Builder effectsBuilder = BattleMsg.S2C_Battle_Effects.newBuilder();
      this.blackboard.addBattleEffects(-1, effectsBuilder);
      this.getScene().getPKTeam((byte)0).resetDirty();
      this.getScene().getPKTeam((byte)1).resetDirty();
      new ArrayList();

      for(Entity entity : this.scene.getPosEntity().values()) {
         BattleMsg.S2C_Battle_Effects.Builder builder = BattleMsg.S2C_Battle_Effects.newBuilder();
         builder.setSlot(entity.getBattlePos());
         builder.addBattlePos(entity.getBattlePos());
         this.getBlackboard().addBattleEffects(entity.getBattlePos(), builder);
         if (entity.isAlive()) {
            entity.getBuffManager().update(this);
            entity.getSkillManager().update();
            entity.getPassiveSkillMgr().update();
         }

         entity.resetAttacked();
         if (entity.getFieldSkillShowRound() > 0) {
            entity.decrFieldSkillShowRound();
         }
      }

      for(byte force = 0; force < 2; ++force) {
         BattlePKTeam pkTeam = this.scene.getPKTeam(force);
         Entity friendEntity = pkTeam.getFriendEntity();
         if (Objects.nonNull(friendEntity) && friendEntity.isDead() && friendEntity.getFieldSkillShowRound() > 0) {
            friendEntity.decrFieldSkillShowRound();
         }
      }

      for(byte force = 0; force < 2; ++force) {
         BattlePKTeam pkTeam = this.scene.getPKTeam(force);
         Entity friendEntity = pkTeam.getFriendEntity();
         if (!Objects.isNull(friendEntity) && !friendEntity.isDead()) {
            friendEntity.getPassiveSkillMgr().friendEntityUpdate();
         }
      }

      EffectUtil.putLiveAndDieApportionEvent(this, (Event)null);
      this.getScene().getPKTeam((byte)0).sendStatistics(this);
      this.getScene().getPKTeam((byte)1).sendStatistics(this);
      BattleMsg.S2C_Battle_Action.Builder actionBuilder1 = this.blackboard.buildActionBuilder();
      return actionBuilder1;
   }
}
