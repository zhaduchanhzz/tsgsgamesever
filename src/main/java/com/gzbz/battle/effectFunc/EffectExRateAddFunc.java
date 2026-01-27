package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.KeyValFun;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.MapUtil;

@EffectAnno(
   effect = 15
)
public class EffectExRateAddFunc extends EffectFunc {
   public static final String EFFECT_ID = "effectId";
   public static final String WAY = "way";
   public static final String VALUE = "value";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      Map<Integer, Map<Byte, KeyValFun>> map = (Map)action.getBlackboard().getSkillParam(12, new HashMap());
      Map<Byte, KeyValFun> valFunMap = (Map)MapUtil.computeIfAbsent(map, model.getFuncParam().get("effectId"), HashMap.class);
      valFunMap.put(target.getBattlePos(), new KeyValFun((Integer)model.getFuncParam().get("way"), (Integer)model.getFuncParam().get("value")));
      action.getBlackboard().addSkillParam(12, map);
      return true;
   }
}
