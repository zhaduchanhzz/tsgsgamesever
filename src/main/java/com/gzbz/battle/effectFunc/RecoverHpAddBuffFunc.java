package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;

@EffectAnno(
   effect = 92
)
public class RecoverHpAddBuffFunc extends RecoverHpFunc {
   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.isDead()) {
         return false;
      } else {
         super.process(action, source, target, targets, model, event);

         for(String str : AddBuffFunc.BUFF_ID) {
            Integer buffId = (Integer)model.getFuncParam().get(str);
            if (buffId != null) {
               target.getBuffManager().addBuff(action, buffId, source, event);
            }
         }

         return true;
      }
   }
}
