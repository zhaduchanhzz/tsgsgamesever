package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import java.util.List;

@EffectAnno(
   effect = 86
)
public class AddBackGroundFunc extends EffectFunc {
   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.getFieldSkillShowRound() > 0) {
         target.setFieldSkillShowEffectId(model.getId());
         BattleMsg.S2C_Battle_Effect.Builder s2C_battle_effect = BattleMsg.S2C_Battle_Effect.newBuilder();
         s2C_battle_effect.setEffectType(32);
         s2C_battle_effect.setEffectId(model.getId());
         s2C_battle_effect.setTargetBattlePos(target.getForce());
         action.getBlackboard().addBattleEffect(s2C_battle_effect);
         return true;
      } else {
         return false;
      }
   }
}
