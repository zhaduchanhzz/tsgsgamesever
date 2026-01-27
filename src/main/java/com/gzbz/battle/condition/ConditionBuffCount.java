package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@ConditionAnno(
   condition = 12
)
public class ConditionBuffCount implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      List<String> params = Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam());
      if (Objects.isNull(source)) {
         return false;
      } else {
         int num = 0;

         for(String param : params) {
            Set<Integer> buffSets = source.getBuffManager().getSubBuff(Short.parseShort(param));
            if (!Objects.isNull(buffSets) && buffSets.size() != 0) {
               for(int code : buffSets) {
                  Buff buff = source.getBuffManager().getBuff(code);
                  num += buff.count;
               }
            }
         }

         return num >= conditionModel.getConditionValue();
      }
   }
}
