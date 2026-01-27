package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;
import java.util.Objects;

@EffectAnno(
   effect = 63
)
public class DelBufAndRecoverHpFunc extends RecoverHpFunc {
   public static final String BUFF_TYPE = "buffType";
   public static final String NUM = "num";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      List<Integer> list = target.getBuffManager().getDispel(((Integer)model.getFuncParam().get("buffType")).byteValue());
      Integer num = (Integer)model.getFuncParam().get("num");
      if (!list.isEmpty() && !Objects.isNull(num)) {
         if (num < 0 || list.size() < num) {
            num = list.size();
         }

         for(int i = 0; i < num; ++i) {
            target.getBuffManager().deleteBuffById(action, (Integer)list.get(i));
         }

         action.getBlackboard().addSkillParam(42, num);
         super.process(action, source, target, targets, model, event);
         action.getBlackboard().removeSkillParam(42);
         return true;
      } else {
         return true;
      }
   }
}
