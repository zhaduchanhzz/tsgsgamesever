package com.gzbz.battle.condition;

import battle.ConditionAnno;
import com.google.common.base.Splitter;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.ConditionModel;
import java.util.List;
import java.util.Objects;

@ConditionAnno(
   condition = 84
)
public class ConditionCurrRecoverHpPlus implements ConditionFunc {
   public boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event) {
      SkillEffectModel model = (SkillEffectModel)action.getBlackboard().getSkillParam(55);
      List<String> params = Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam());
      return Objects.nonNull(model) && params.contains(String.valueOf(model.getId()));
   }
}
