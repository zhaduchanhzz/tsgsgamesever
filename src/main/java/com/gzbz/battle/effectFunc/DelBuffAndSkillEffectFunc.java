package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

@EffectAnno(
   effect = 56
)
public class DelBuffAndSkillEffectFunc extends EffectFunc {
   public static final String BUFF_ID = "buffId";
   public static final String NUM = "num";
   public static final String[] EFFECTIDS = new String[]{"effectId1", "effectId2"};

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      int buffId = (Integer)model.getFuncParam().get("buffId");
      int num = (Integer)model.getFuncParam().get("num");
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buffId);
      HashMap<Integer, TreeMap<Integer, Buff>> idMaps = (HashMap)source.getBuffManager().getPriorityBuffsMap().get(buffModel.getType());
      if (Objects.isNull(idMaps)) {
         return false;
      } else {
         TreeMap<Integer, Buff> codeMap = (TreeMap)idMaps.get(buffId);
         if (Objects.isNull(codeMap)) {
            return false;
         } else {
            Integer[] arrays = (Integer[])codeMap.keySet().toArray(new Integer[codeMap.keySet().size()]);
            int value = arrays.length / num;
            int delNum = value * num;

            for(int i = 0; i < delNum; ++i) {
               source.getBuffManager().deleteBuffByCode(action, arrays[i], false);
            }

            for(int i = 0; i < value; ++i) {
               int effectId = (Integer)model.getFuncParam().get(EFFECTIDS[i]);
               SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", effectId);
               if (skillEffectModel != null) {
                  List<Entity> entityList = source.getScene().selectTarget(action, source, skillEffectModel.getTargetType(), skillEffectModel.getSelectType(), skillEffectModel.getSelectNum(), skillEffectModel.getSelectParam());

                  for(Entity entity : entityList) {
                     action.getBlackboard().addSkillParam(3, entity);
                     EffectFuncProcessor.doFunc(action, source, entity, entityList, skillEffectModel, event);
                  }

                  if (skillEffectModel.getRate() == -1) {
                     Map<Integer, KeyValFun> map = (Map)action.getBlackboard().getSkillParam(39, new HashMap());
                     map.put(effectId, new KeyValFun(1, 10001));
                     action.getBlackboard().addSkillParam(39, map);
                  }
               }
            }

            return true;
         }
      }
   }
}
