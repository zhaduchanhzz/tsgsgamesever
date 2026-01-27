package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;

@EffectAnno(
   effect = 21
)
public class EffectPangTongHurt extends DamageFunc {
   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      return false;
   }
}
