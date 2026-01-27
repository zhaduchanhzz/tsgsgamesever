package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.model.SkillEffectModel;
import java.util.List;

@EffectAnno(
   effect = 73
)
public class PropertyBalanceAssignTeamFunc extends EffectFunc {
   public static final String[] BUFF_1 = new String[]{"buff1_1", "buff1_2"};
   public static final String[] BUFF_2 = new String[]{"buff2_1", "buff2_2"};
   public static final String[] BUFF_LIMIT_2 = new String[]{"buff2_limit_1", "buff2_limit_2"};
   public static final String[] PROPERTY = new String[]{"property1", "property2"};
   public static final String SELECTTYPE = "selectType";
   public static final String SELECTNUM = "selectNum";
   public static final String SELECTPARAM = "selectParam";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      short selectType = ((Integer)model.getFuncParam().get("selectType")).shortValue();
      int selectNum = (Integer)model.getFuncParam().get("selectNum");
      int selectParam = (Integer)model.getFuncParam().get("selectParam");
      BattleScene scene = source.getScene();

      for(int i = 0; i < BUFF_1.length; ++i) {
         int balanceBuffDel = (Integer)model.getFuncParam().get(BUFF_1[i]);
         int balanceBuffAdd = (Integer)model.getFuncParam().get(BUFF_2[i]);
         Buff buff1 = target.getBuffManager().addBuff(action, balanceBuffDel, source, event);
         if (buff1 != null) {
            long value = Math.abs(buff1.getValue(1));
            buff1.setValue(1, (long)((int)(-value)));
            if (model.getFuncParam().containsKey(BUFF_LIMIT_2[i]) && model.getFuncParam().containsKey(PROPERTY[i])) {
               int propertyId = (Integer)model.getFuncParam().get(PROPERTY[i]);
               int limit = (Integer)model.getFuncParam().get(BUFF_LIMIT_2[i]);
               long limitValue = (long)((float)(source.getBaseProperty(propertyId) * (long)limit) / 10000.0F);
               value = value > limitValue ? limitValue : value;
            }

            List<Entity> allFriendTargets = scene.selectTarget(action, source, (byte)1, selectType, selectNum, String.valueOf(selectParam));
            value /= (long)allFriendTargets.size();

            for(Entity friend : allFriendTargets) {
               Buff buff2 = friend.getBuffManager().addBuff(action, balanceBuffAdd, source, event);
               buff2.setValue(1, (long)((int)value));
            }
         }
      }

      return false;
   }
}
