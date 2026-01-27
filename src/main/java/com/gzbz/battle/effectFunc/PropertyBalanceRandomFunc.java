package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.buff.BuffFactory;
import com.gzbz.battle.buff.BuffManager;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import misc.RandomUtil;

@EffectAnno(
   effect = 14
)
public class PropertyBalanceRandomFunc extends EffectFunc {
   public static final String[] BUFF_1 = new String[]{"buff1_1", "buff1_2", "buff1_3"};
   public static final String[] BUFF_2 = new String[]{"buff2_1", "buff2_2", "buff2_3"};
   public static final String[] BUFF_LIMIT_2 = new String[]{"buff2_limit_1", "buff2_limit_2", "buff2_limit_3"};
   public static final String[] _PROPERTY_ = new String[]{"property1", "property2", "property3"};

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      int range = 0;

      for(int i = 0; i < 3; ++i) {
         if (model.getFuncParam().containsKey(BUFF_1[i])) {
            ++range;
         }
      }

      int index = RandomUtil.randInt(range);
      int balanceBuffDel = (Integer)model.getFuncParam().get(BUFF_1[index]);
      int balanceBuffAdd = (Integer)model.getFuncParam().get(BUFF_2[index]);
      int propertyId = (Integer)model.getFuncParam().get(_PROPERTY_[index]);
      BattleScene scene = source.getScene();
      List<Entity> enemyTargets = scene.selectTarget(action, source, (byte)2, (short)9, 1, String.valueOf(propertyId));
      if (enemyTargets.size() > 0) {
         double value = (double)0.0F;
         action.getBlackboard().addSkillParam(7, enemyTargets);
         action.getBlackboard().addSkillParam(2, enemyTargets);

         for(Entity enemy : enemyTargets) {
            value = (double)enemy.getBaseProperty(propertyId);
            BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", balanceBuffDel);
            Buff buff = enemy.getBuffManager().addBuff(action, balanceBuffDel, source, event);
            if (buff != null) {
               value *= (double)((float)((BuffUseFun)buffModel.getFuncs().get(1)).getUseValue() / 10000.0F);
               buff.setValue(1, (long)(-value));
            }
         }

         BuffModel var10000 = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", balanceBuffDel);
         List<Entity> allFriendTargets = scene.selectTarget(action, source, (byte)1, (short)4, 5, (String)null);
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", balanceBuffAdd);
         String limitKey = BUFF_LIMIT_2[index];
         int limitNum = model.getParam(limitKey);
         long limitValue = (long)((float)(source.getBaseProperty(propertyId) * (long)limitNum) / 10000.0F);
         value = value > (double)limitValue ? (double)limitValue : value;
         value /= (double)allFriendTargets.size();

         for(Entity friend : allFriendTargets) {
            this.addBalanceBuff(action, source, friend, value, buffModel, model, index);
         }
      }

      return true;
   }

   protected void addBalanceBuff(Action action, Entity source, Entity target, double value, BuffModel buffModel, SkillEffectModel skillEffectModel, int index) {
      BuffManager buffManager = target.getBuffManager();
      Buff buff = BuffFactory.getBuff(buffModel, target, source, buffManager);
      if (buff != null) {
         value *= (double)((float)((BuffUseFun)buffModel.getFuncs().get(1)).getUseValue() / 10000.0F);
         buff.setValue(1, (long)((int)value));
         buffManager.addBuff(action, buff, (BuffModel)buffModel, (Event)null);
      }
   }
}
