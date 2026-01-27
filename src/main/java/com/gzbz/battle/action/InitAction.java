package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.passive.PassiveSkillEffect;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.model.BattleHeroTrainingBuffModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SupportHeroModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

@ActionAnno(
   action = 0
)
public class InitAction extends Action {
   public BattleMsg.S2C_Battle_Action.Builder run() {
      BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
      this.blackboard.addBattleAction(this.type, actionBuilder);
      BattleMsg.S2C_Battle_Effects.Builder effectsBuilder = BattleMsg.S2C_Battle_Effects.newBuilder();
      this.blackboard.addBattleEffects(-1, effectsBuilder);
      if (this.scene.getType() == 1250) {
         BattlePKTeam battlePKTeam = this.scene.getPKTeam((byte)0);
         if (this.scene.getWave() == 1) {
            BattleHeroTrainingBuffModel battleHeroTrainingBuffModel = (BattleHeroTrainingBuffModel)ApplicationContextProvider.getModelPoolEntity("battleHeroTrainingBuff", battlePKTeam.getBuffId());
            if (battleHeroTrainingBuffModel != null && battleHeroTrainingBuffModel.getBuffType() == 2) {
               for(Entity entity : battlePKTeam.getEntityMap().values()) {
                  entity.getBuffManager().addBuff(this, battleHeroTrainingBuffModel.getId(), entity, (Event)null);
               }
            }
         }

         for(Entity entity : battlePKTeam.getEntityMap().values()) {
            if (entity.getBuffManager().isExistSubType((short)4219)) {
               entity.getBuffManager().delSubClsBuff(this, (short)4219);
               HashMap<Integer, PassiveSkillEffect> passiveSkillMap = entity.getPassiveSkillMgr().getPassiveSkillMap();

               for(PassiveSkillEffect effect : passiveSkillMap.values()) {
                  SkillEffectModel model = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", effect.effectId);
                  if (model != null && model.getFunc() == 50 && model.getFuncParam().containsKey("pos") && model.getFuncParam().containsKey("skillId")) {
                     Integer pos = (Integer)model.getFuncParam().get("pos");
                     Integer skillId = (Integer)model.getFuncParam().get("skillId");
                     EntitySkill entitySkill = entity.getSkillManager().getIndexSkill(pos);
                     if (entitySkill != null && entitySkill.id == skillId && entitySkill.id != entitySkill.oldId) {
                        entitySkill.id = entitySkill.oldId;
                        entitySkill.restoreAttachEffect();
                     }
                  }
               }
            }
         }
      }

      boolean findFiledEntity = false;

      for(BattlePKTeam battlePKTeam : this.scene.getPkTeams()) {
         for(Entity teamer : battlePKTeam.getEntityMap().values()) {
            if (teamer.getAideBuff() > 0) {
               teamer.addPassiveEffect((byte)16, Collections.singletonList(teamer.getAideBuff()));
            }

            if (teamer.getAideBuff2() > 0) {
               teamer.addPassiveEffect((byte)16, Collections.singletonList(teamer.getAideBuff2()));
            }

            if (teamer.getAideTrammelsSkillId() > 0) {
               teamer.addPassiveEffect((byte)16, Collections.singletonList(teamer.getAideTrammelsSkillId()));
            }

            teamer.setMaxHpMax(teamer.getBaseProperty(1));
            if (this.scene.getFiledSkillEntity() != null && teamer == this.scene.getFiledSkillEntity()) {
               findFiledEntity = true;
            }
         }

         Entity friend = battlePKTeam.getFriendEntity();
         if (!Objects.isNull(friend)) {
            friend.setMaxHpMax(friend.getBaseProperty(1));
            if (this.scene.getFiledSkillEntity() != null && friend == this.scene.getFiledSkillEntity()) {
               findFiledEntity = true;
            }

            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", friend.getId());
            if (!Objects.isNull(heroModel)) {
               HashMap<Integer, SupportHeroModel> supportHeroModelHashMap = (HashMap)ApplicationContextProvider.getModelPoolEntity("supportHeroMap", heroModel.getType());
               if (!Objects.isNull(supportHeroModelHashMap)) {
                  SupportHeroModel supportHeroModel = (SupportHeroModel)supportHeroModelHashMap.get(friend.getStar());
                  if (!Objects.isNull(supportHeroModel) && supportHeroModel.getBuff() != 0) {
                     for(Entity teamer : battlePKTeam.getEntityMap().values()) {
                        teamer.getBuffManager().addBuff(this, supportHeroModel.getBuff(), teamer, (Event)null);
                     }
                  }
               }
            }
         }
      }

      if (this.scene.getFiledSkillEntity() != null && !findFiledEntity) {
         BattleMsg.S2C_Battle_Effect.Builder s2C_battle_effect = BattleMsg.S2C_Battle_Effect.newBuilder();
         s2C_battle_effect.setEffectType(33);
         s2C_battle_effect.setEffectId(this.scene.getFiledSkillEntity().getFieldSkillShowEffectId());
         s2C_battle_effect.setTargetBattlePos(this.scene.getFiledSkillEntity().getForce());
         this.getBlackboard().addBattleEffect(s2C_battle_effect);
      }

      Event beginEvent = new Event((short)44, this, (Event)null);
      beginEvent.addParam(12, this);
      this.scene.getEventListener().pushEvent(beginEvent);
      Event firstEvent = new Event((short)21, this, (Event)null);
      firstEvent.addParam(12, this);
      this.scene.getEventListener().pushEvent(firstEvent);
      Event event = new Event((short)1, this, (Event)null);
      event.addParam(12, this);
      this.scene.getEventListener().pushEvent(event);
      return this.blackboard.buildActionBuilder();
   }
}
