package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.Objects;
import java.util.Set;

@ConditionAnno(
   condition = 83
)
public class ConditionSelfCasterBuffType implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      for(String param : Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam())) {
         for(Entity member : source.getPkTeam().getEntityMap().values()) {
            if (member != source) {
               Set<Integer> codeSet = member.getBuffManager().getSubBuff(Short.parseShort(param));
               if (Objects.nonNull(codeSet) && codeSet.size() > 0) {
                  for(int code : codeSet) {
                     Buff buff = member.getBuffManager().getBuff(code);
                     if (buff.caster == source) {
                        return true;
                     }
                  }
               }
            }
         }
      }

      return false;
   }
}
