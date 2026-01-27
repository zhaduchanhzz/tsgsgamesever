package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntityState;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@EffectAnno(
   effect = 28
)
public class EffectResistFunc extends EffectFunc {
   public static final String BUFF_ID1 = "buffId1";
   public static final String BUFF_ID2 = "buffId2";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (Objects.isNull(event)) {
         return false;
      } else {
         Entity entity = (Entity)event.getParam(3);
         if (Objects.isNull(entity)) {
            return false;
         } else {
            HashMap<Integer, EntityState> stateHashMap = entity.getStateManager().getStatesMap();
            ArrayList<Integer> delStatBuff = new ArrayList();

            for(EntityState entityState : stateHashMap.values()) {
               if (entityState.state == 1 || entityState.state == 2 || entityState.state == 7 || entityState.state == 11 || entityState.state == 12 || entityState.state == 16 || entityState.state == 18) {
                  delStatBuff.add(entityState.parentCode);
               }
            }

            for(int buffCode : delStatBuff) {
               entity.getBuffManager().deleteBuffByCode(action, buffCode, false);
            }

            if (model.getFuncParam().containsKey("buffId1")) {
               int buffId1 = (Integer)model.getFuncParam().get("buffId1");
               entity.getBuffManager().addBuff(action, buffId1, target, event);
            }

            if (model.getFuncParam().containsKey("buffId2")) {
               int buffId2 = (Integer)model.getFuncParam().get("buffId2");
               entity.getBuffManager().addBuff(action, buffId2, target, event);
            }

            return true;
         }
      }
   }
}
