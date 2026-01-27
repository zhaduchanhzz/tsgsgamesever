package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.TreeSet;

@EffectAnno(
   effect = 85
)
public class DelSubBuffAndEffect extends EffectFunc {
   public static final String BUFF_SUBCLS = "buffSubCls";
   public static final String NUM = "num";
   public static final String[] EFFECTIDS = new String[]{"effectId1", "effectId2", "effectId3"};

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      short buffSubcls = ((Integer)model.getFuncParam().get("buffSubCls")).shortValue();
      int num = model.getParam("num");
      if (num == 0) {
         return false;
      } else {
         TreeSet<Integer> subCode = target.getBuffManager().getSubBuff(buffSubcls);
         if (subCode != null && subCode.size() != 0) {
            Integer[] arrays = (Integer[])subCode.toArray(new Integer[subCode.size()]);
            if (num == -1 || num > arrays.length) {
               num = arrays.length;
            }

            for(int i = 0; i < num; ++i) {
               target.getBuffManager().deleteBuffByCode(action, arrays[i], false);
            }

            for(String str : EFFECTIDS) {
               Integer effectId = (Integer)model.getFuncParam().get(str);
               if (effectId != null) {
                  SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", effectId);
                  if (skillEffectModel != null) {
                     List<Entity> entityList = source.getScene().selectTarget(action, source, skillEffectModel.getTargetType(), skillEffectModel.getSelectType(), skillEffectModel.getSelectNum(), skillEffectModel.getSelectParam());

                     for(Entity entity : entityList) {
                        action.getBlackboard().addSkillParam(3, entity);
                        EffectFuncProcessor.doFunc(action, source, entity, entityList, skillEffectModel, event);
                     }
                  }
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }
}
