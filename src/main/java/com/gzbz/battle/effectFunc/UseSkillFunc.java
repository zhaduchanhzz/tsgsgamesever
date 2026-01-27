package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.action.ActionFactory;
import com.gzbz.battle.action.UseSkillAction;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.model.SkillEffectModel;
import java.util.List;
import java.util.Objects;

@EffectAnno(
   effect = 82
)
public class UseSkillFunc extends EffectFunc {
   public static final String SKILL_INDEX = "skillIndex";
   public static final String ROUND = "round";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      UseSkillAction useSkillAction = (UseSkillAction)ActionFactory.getAction(source.getScene(), (byte)60);
      Integer skillIndex = (Integer)model.getFuncParam().get("skillIndex");
      useSkillAction.setEntity(source);
      useSkillAction.setSkillIndex(skillIndex);
      if (model.getFieldSkill() > 0) {
         boolean fieldSkillShow = this.checkFieldSkillShow(action);
         if (fieldSkillShow) {
            useSkillAction.setActionType((byte)45);
         } else {
            int round = 0;
            if (model.getFuncParam().containsKey("round")) {
               round = (Integer)model.getFuncParam().get("round");
            }

            source.setFieldSkillShowRound(round);
         }
      }

      source.getScene().getActionManager().addAction(useSkillAction);
      return true;
   }

   private boolean checkFieldSkillShow(Action action) {
      for(byte force = 0; force < 2; ++force) {
         BattlePKTeam pkTeam = action.getScene().getPKTeam(force);

         for(Entity entity : pkTeam.getEntityMap().values()) {
            if (entity.getFieldSkillShowRound() > 0) {
               return true;
            }
         }

         Entity friendEntity = pkTeam.getFriendEntity();
         if (Objects.nonNull(friendEntity) && friendEntity.getFieldSkillShowRound() > 0) {
            return true;
         }
      }

      return false;
   }
}
