package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;

@EffectAnno(
   effect = 50
)
public class EffectFuncReplaceSkill extends EffectFunc {
   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (model.getFuncParam().containsKey("pos") && model.getFuncParam().containsKey("skillId")) {
         Integer pos = (Integer)model.getFuncParam().get("pos");
         Integer skillId = (Integer)model.getFuncParam().get("skillId");
         EntitySkill entitySkill = target.getSkillManager().getIndexSkill(pos);
         if (entitySkill != null && entitySkill.id != skillId) {
            entitySkill.id = skillId;
            entitySkill.setOldAttachEffect();
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
