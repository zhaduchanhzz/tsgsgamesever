package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.List;
import java.util.Objects;

@EffectAnno(
   effect = 80
)
public class AddBuffTargetNumFunc extends EffectFunc {
   public static final String BUFF_SUB_TYPE = "buffSubType";
   public static final String BUFF_ID = "buffId";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      int num = 0;
      byte force = BattleMisc.oppositionForce(source.getForce());
      short subType = ((Integer)model.getFuncParam().get("buffSubType")).shortValue();

      for(Entity e : source.getScene().getPKTeam(force).getEntityMap().values()) {
         if (!e.isDead() && e.getBuffManager().checkSubBuff(subType)) {
            ++num;
         }
      }

      Integer buffId = (Integer)model.getFuncParam().get("buffId");
      if (Objects.isNull(buffId)) {
         return false;
      } else {
         for(int i = 0; i < num; ++i) {
            source.getBuffManager().addBuff(action, buffId, source, event);
         }

         return true;
      }
   }
}
