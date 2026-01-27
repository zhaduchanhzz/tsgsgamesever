package com.gzbz.battle.condition;

import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.io.Serializable;

@FunctionalInterface
public interface ConditionFunc extends Serializable {
   boolean check(Action action, Entity source, Entity target, ConditionModel conditionModel, Event event);
}
