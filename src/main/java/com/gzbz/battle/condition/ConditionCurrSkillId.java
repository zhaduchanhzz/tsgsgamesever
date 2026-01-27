package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillModel;
import com.gzbz.model.fun.ConditionModel;
import java.util.List;
import java.util.Objects;

@ConditionAnno(
   condition = 79
)
public class ConditionCurrSkillId implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      SkillModel skillModel = (SkillModel)action.getBlackboard().getSkillParam(17);
      List<String> params = Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam());
      return Objects.nonNull(skillModel) && params.contains(String.valueOf(skillModel.getId()));
   }
}
