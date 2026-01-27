package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.protobuf.BattleMsg;
import java.util.ArrayList;
import java.util.Objects;
import misc.RandomUtil;

@ActionAnno(
   action = 7
)
public class RoundEndAction extends Action {
   public BattleMsg.S2C_Battle_Action.Builder run() {
      BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
      this.getBlackboard().addBattleAction(this.type, actionBuilder);
      BattleMsg.S2C_Battle_Effects.Builder effectsBuilder1 = BattleMsg.S2C_Battle_Effects.newBuilder();
      this.getBlackboard().addBattleEffects(-1, effectsBuilder1);
      boolean bLoad = false;

      for(byte force = 0; force < 2; ++force) {
         BattlePKTeam pkTeam = this.scene.getPKTeam(force);
         if (pkTeam.getFriendState() != 1) {
            ArrayList<Entity> deadList = new ArrayList();

            for(Entity entity : pkTeam.getEntityMap().values()) {
               if (entity.isDead()) {
                  deadList.add(entity);
               }
            }

            Entity friendEntity = pkTeam.getFriendEntity();
            if (!Objects.isNull(friendEntity) && !friendEntity.isDead() && !friendEntity.getPkTeam().isFriendOnFormation() && friendEntity.getBattlePos() >= BattleMisc.FORCE_BATTLE_POS_MAX && deadList.size() > 0) {
               Entity deadEntity = (Entity)deadList.get(RandomUtil.randInt(deadList.size()));
               friendEntity.setBattlePos(deadEntity.getBattlePos());
               this.scene.putPosEntity(deadEntity.getBattlePos(), friendEntity);
               friendEntity.setTeamPos(deadEntity.getTeamPos());
               deadEntity.getPkTeam().getEntityMap().put(deadEntity.getTeamPos(), friendEntity);
               friendEntity.getPkTeam().getMaxLevel();
               pkTeam.setFriendEntity(deadEntity);
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectBuilder.setEffectType(12);
               effectBuilder.setEffectValue((long)friendEntity.getForce());
               effectBuilder.setTargetBattlePos(friendEntity.getBattlePos());
               effectBuilder.setFinalValue((long)friendEntity.getOriginalPos());
               this.blackboard.addBattleEffect(effectBuilder);
               bLoad = true;
               friendEntity.getPkTeam().setFriendOnFormation();
               Event friendEvent = new Event((short)23, this, (Event)null);
               friendEvent.addParam(2, friendEntity);
               this.scene.getEventListener().pushEvent(friendEvent);
               Event beginEvent = new Event((short)44, this, (Event)null);
               beginEvent.addParam(12, this);
               beginEvent.addParam(2, friendEntity);
               this.scene.getEventListener().pushEvent(beginEvent);
            }
         }
      }

      if (bLoad) {
         Event initFirstEvent = new Event((short)21, this, (Event)null);
         this.scene.getEventListener().pushEvent(initFirstEvent);
         Event initEvent = new Event((short)1, this, (Event)null);
         this.scene.getEventListener().pushEvent(initEvent);
      }

      for(byte force = 0; force < 2; ++force) {
         BattlePKTeam pkTeam = this.scene.getPKTeam(force);

         for(Entity entity : pkTeam.getEntityMap().values()) {
            this.blackboard.addSkillParam(3100 + entity.getBattlePos(), entity.getBaseProperty(99));
            if (entity.getFieldSkillShowRound() == 0) {
               entity.resetFieldSkillShowRound();
               this.sendDelFildSkillBg(entity);
            }
         }

         Entity friendEntity = pkTeam.getFriendEntity();
         if (Objects.nonNull(friendEntity) && friendEntity.isDead() && friendEntity.getFieldSkillShowRound() == 0) {
            friendEntity.resetFieldSkillShowRound();
            this.sendDelFildSkillBg(friendEntity);
         }
      }

      Event event = new Event((short)3, this, (Event)null);
      event.addParam(8, this.scene.round);
      this.scene.getEventListener().pushEvent(event);
      Event endEvent2 = new Event((short)31, this, (Event)null);
      endEvent2.addParam(8, this.scene.round);
      this.scene.getEventListener().pushEvent(endEvent2);
      if (this.scene.getPKTeam((byte)0).getTotalSpeed() > this.scene.getPKTeam((byte)1).getTotalSpeed()) {
         for(byte force = 0; force < 2; ++force) {
            this.scene.addAction(this.scene.getBeautyAction(force));
         }
      } else {
         for(byte force = 1; force >= 0; --force) {
            this.scene.addAction(this.scene.getBeautyAction(force));
         }
      }

      this.getScene().getPKTeam((byte)0).sendStatistics(this);
      this.getScene().getPKTeam((byte)1).sendStatistics(this);
      this.scene.getEventListener().clearRecord();
      return this.blackboard.buildActionBuilder();
   }

   private void sendDelFildSkillBg(Entity entity) {
      BattleMsg.S2C_Battle_Effect.Builder s2C_battle_effect = BattleMsg.S2C_Battle_Effect.newBuilder();
      s2C_battle_effect.setEffectType(33);
      s2C_battle_effect.setEffectId(entity.getFieldSkillShowEffectId());
      s2C_battle_effect.setTargetBattlePos(entity.getForce());
      this.getBlackboard().addBattleEffect(s2C_battle_effect);
   }
}
