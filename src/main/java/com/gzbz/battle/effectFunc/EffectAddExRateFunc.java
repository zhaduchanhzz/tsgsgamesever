package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@EffectAnno(
   effect = 55
)
public class EffectAddExRateFunc extends EffectFunc {
   static Logger logger = LoggerFactory.getLogger(EffectAddExRateFunc.class);
   public static final String SKILL_ID = "skilId";
   public static final String SKILL_MAX_LV = "maxLv";
   public static final String EFFECT_INDEX = "effectIndex";
   public static final String WAY = "way";
   public static final String VALUE = "value";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      Map<Integer, KeyValFun> map = (Map)action.getBlackboard().getSkillParam(39, new HashMap());
      int skillId = (Integer)model.getFuncParam().get("skilId");
      int maxLv = (Integer)model.getFuncParam().get("maxLv");
      int effectIndex = (Integer)model.getFuncParam().get("effectIndex");

      for(int i = 0; i < maxLv; ++i) {
         SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPool().getEntity("skill", skillId + i);
         if (skillModel == null) {
            logger.error("无法找到技能id:" + skillId);
            return false;
         }

         int effectId = (Integer)skillModel.getEffects().get(effectIndex);
         map.put(effectId, new KeyValFun((Integer)model.getFuncParam().get("way"), (Integer)model.getFuncParam().get("value")));
         action.getBlackboard().addSkillParam(39, map);
      }

      return true;
   }
}
