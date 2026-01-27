package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.util.List;
import java.util.Objects;
import org.slf4j.LoggerFactory;

@ConditionAnno(
   condition = 14
)
public class ConditionBuffTypeChangeCheck implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      if (event == null) {
         LoggerFactory.getLogger(this.getClass()).error("效果条件判断配置有误！此条件需要触发事件配合 ！condition:{}", conditionModel.getCondition());
         return false;
      } else {
         short buffType = (Short)event.getParam(7);
         List<String> params = Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam());
         Entity targetEntity = (Entity)action.getBlackboard().getSkillParam(3, (Object)null);
         if (Objects.isNull(targetEntity)) {
            return false;
         } else {
            for(String param : params) {
               if (Short.parseShort(param) == buffType) {
                  return true;
               }
            }

            return false;
         }
      }
   }
}
