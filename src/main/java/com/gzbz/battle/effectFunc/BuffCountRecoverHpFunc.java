package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

@EffectAnno(
   effect = 93
)
public class BuffCountRecoverHpFunc extends RecoverHpFunc {
   public static final String BUFF_ID_LOWER = "buffId_lower";
   public static final String BUFF_ID_UPPER = "buffId_upper";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      Integer lower = (Integer)model.getFuncParam().get("buffId_lower");
      Integer upper = (Integer)model.getFuncParam().get("buffId_upper");
      int num = 0;

      for(int i = lower; i <= upper; i += 10) {
         TreeMap<Integer, Buff> codeMap = target.getBuffManager().getBuffsById(i);
         if (Objects.nonNull(codeMap) && codeMap.size() > 0) {
            num = codeMap.size();
            break;
         }
      }

      action.getBlackboard().addSkillParam(42, num);
      super.process(action, source, target, targets, model, event);
      action.getBlackboard().removeSkillParam(42);
      return true;
   }
}
