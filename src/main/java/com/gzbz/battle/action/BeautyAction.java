package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.entity.BeautyEntity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillModel;
import com.gzbz.model.TongQueSkillModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;

@ActionAnno(
   action = 22
)
public class BeautyAction extends Action {
   public static final byte BEAUTY_HP_MAX = 4;
   public BattlePKTeam pkTeam;

   public BattleMsg.S2C_Battle_Action.Builder run() {
      BeautyEntity beautyEntity = this.pkTeam.getBeautyEntity();
      if (beautyEntity == null) {
         return null;
      } else {
         EntitySkill entitySkill = beautyEntity.getSkillManager().getSkill();
         if (entitySkill == null) {
            return null;
         } else {
            BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
            actionBuilder.setBattlePos(this.entity.getBattlePos());
            this.blackboard.addBattleAction(this.type, actionBuilder);
            this.blackboard.addSkillParam(1, beautyEntity);
            beautyEntity.addCurMp();
            if (beautyEntity.getCurMp() < 4) {
               BattleMsg.S2C_Battle_Effects.Builder battleEffects = BattleMsg.S2C_Battle_Effects.newBuilder();
               this.blackboard.addBattleEffects(0, battleEffects);
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectBuilder.setEffectType(10);
               effectBuilder.setTargetBattlePos(beautyEntity.getBattlePos());
               effectBuilder.setEffectValue((long)beautyEntity.getCurMp());
               this.blackboard.addBattleEffect(effectBuilder);
            } else {
               beautyEntity.setCurMp((byte)0);
               this.getBlackboard().addSkillParam(1, this.entity);
               this.getBlackboard().addSkillParam(4, entitySkill);
               SkillUtil.doSkill(this, (Event)null);
               ArrayList<Integer> beautyEntityIdList = new ArrayList();
               beautyEntityIdList.add(beautyEntity.getId());
               int actionSkillId = entitySkill.getSkillId();
               if (this.getBlackboard().getCurEffects() == null) {
                  actionSkillId = 0;
                  beautyEntityIdList.remove(beautyEntity.getId());
               }

               if (actionSkillId != 0) {
                  this.getBlackboard().addSkillParam(16, -2);
               }

               for(int i = 1; i < this.pkTeam.getCooperateBeautySkill().size(); ++i) {
                  int cooperateSkill = (Integer)this.pkTeam.getCooperateBeautySkill().get(i);
                  if (cooperateSkill != 0) {
                     SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", cooperateSkill);
                     if (skillModel != null) {
                        for(int skillEffect : skillModel.getEffects().values()) {
                           SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", skillEffect);
                           if (skillEffectModel != null) {
                              boolean newBuilder = this.getBlackboard().getCurEffects() == null;
                              SkillUtil.doEffect(this, skillEffectModel, newBuilder, (Event)null, true);
                              if (0 == actionSkillId && this.getBlackboard().getCurEffects() != null) {
                                 this.getBlackboard().addBattleEffects(-2, BattleMsg.S2C_Battle_Effects.newBuilder());
                                 actionSkillId = cooperateSkill;
                              }
                           }
                        }

                        if (this.getBlackboard().getCurEffects() != null) {
                           TongQueSkillModel tongQueSkillModel = (TongQueSkillModel)ApplicationContextProvider.getModelPoolEntity("customTongqueAssistSkill", cooperateSkill);
                           if (tongQueSkillModel != null) {
                              beautyEntityIdList.add(tongQueSkillModel.getBeautyId());
                           }
                        }
                     }
                  }
               }

               if (this.blackboard.getEffectsCount() == 0) {
                  BattleMsg.S2C_Battle_Effects.Builder battleEffects = BattleMsg.S2C_Battle_Effects.newBuilder();
                  this.blackboard.addBattleEffects(0, battleEffects);
               } else {
                  actionBuilder.setId(actionSkillId);
               }

               actionBuilder.addAllFlexibleParams(beautyEntityIdList);
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectBuilder.setEffectType(10);
               effectBuilder.setTargetBattlePos(beautyEntity.getBattlePos());
               effectBuilder.setEffectValue((long)beautyEntity.getCurMp());
               this.blackboard.addBattleEffect(effectBuilder);
            }

            this.scene.getActionManager().addAction(ActionFactory.getAction(this.scene, (byte)5));
            return this.blackboard.buildActionBuilder();
         }
      }
   }
}
