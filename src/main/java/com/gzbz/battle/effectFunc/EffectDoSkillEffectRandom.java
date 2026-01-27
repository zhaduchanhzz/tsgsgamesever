package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import misc.RandomUtil;

@EffectAnno(
   effect = 57
)
public class EffectDoSkillEffectRandom extends EffectFunc {
   public static final String[] EFFECTIDS = new String[]{"effectId1", "effectId2", "effectId3"};

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      int index = RandomUtil.randInt(EFFECTIDS.length);
      int effectId = (Integer)model.getFuncParam().get(EFFECTIDS[index]);
      SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", effectId);
      if (skillEffectModel == null) {
         return false;
      } else {
         List<Entity> entityList = source.getScene().selectTarget(action, source, skillEffectModel.getTargetType(), skillEffectModel.getSelectType(), skillEffectModel.getSelectNum(), skillEffectModel.getSelectParam());
         action.getBlackboard().addSkillParam(2, entityList);

         for(Entity entity : entityList) {
            action.getBlackboard().addSkillParam(3, entity);
            EffectFuncProcessor.doFunc(action, source, entity, entityList, skillEffectModel, event);
            action.getBlackboard().getCurEffects().addBattlePos(entity.getBattlePos());
         }

         return true;
      }
   }
}
