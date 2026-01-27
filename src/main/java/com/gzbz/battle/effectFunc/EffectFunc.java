package com.gzbz.battle.effectFunc;

import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.io.Serializable;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class EffectFunc implements Serializable {
   public static Logger logger = LoggerFactory.getLogger(EffectFunc.class);

   public int getRate(Action action, Entity source, Entity target, SkillEffectModel skillEffectModel) {
      return EffectFuncProcessor.getRate(action, source, target, skillEffectModel);
   }

   public abstract boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event);
}
