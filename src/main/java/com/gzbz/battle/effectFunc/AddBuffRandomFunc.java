package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@EffectAnno(
   effect = 18
)
public class AddBuffRandomFunc extends EffectFunc {
   public static final String[] BUFF_ID = new String[]{"buffId1", "buffId2", "buffId3", "buffId4", "buffId5"};
   public static final String NUM = "num";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      List<Integer> buffIds = new ArrayList();

      for(String str : BUFF_ID) {
         Integer buffId = (Integer)model.getFuncParam().get(str);
         if (buffId != null) {
            buffIds.add(buffId);
         }
      }

      Integer num = (Integer)model.getFuncParam().getOrDefault("num", 1);
      if (buffIds.size() != 0 && buffIds.size() >= num) {
         Collections.shuffle(buffIds);

         for(int i = 0; i < num; ++i) {
            target.getBuffManager().addBuff(action, (Integer)buffIds.get(i), source, event);
         }

         return true;
      } else {
         logger.error("buff列表配置buff数量不足  effect:{}", model.getId());
         return false;
      }
   }
}
