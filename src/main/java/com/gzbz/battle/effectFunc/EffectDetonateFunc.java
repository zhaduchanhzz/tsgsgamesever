package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@EffectAnno(
   effect = 20
)
public class EffectDetonateFunc extends PhysicalFunc {
   public static final String BUFF_SUB_TYPE = "buffSubType";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      int subType = (Integer)model.getFuncParam().get("buffSubType");
      Set<Integer> buffSet = target.getBuffManager().getSubBuff((short)subType);
      if (!target.isDead() && !Objects.isNull(buffSet)) {
         for(int code : buffSet) {
            target.getBuffManager().deleteBuffByCode(action, code, true);
         }

         return true;
      } else {
         return false;
      }
   }
}
