package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;
import misc.RandomUtil;

@EffectAnno(
   effect = 42
)
public class TwoChooseOneBuff extends EffectFunc {
   public static final String BUFF_RATE = "buffRate";
   public static final String[] BUFF_ID = new String[]{"buffId1", "buffId2"};

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      int buffId0 = model.getParam(BUFF_ID[0]);
      int buffId1 = model.getParam(BUFF_ID[1]);
      int buffRate0 = model.getParam("buffRate");
      if (RandomUtil.randInt(10000) < buffRate0) {
         target.getBuffManager().addBuff(action, buffId0, source, event);
      } else {
         target.getBuffManager().addBuff(action, buffId1, source, event);
      }

      return false;
   }
}
