package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.conditionProperty.ConditionProperty;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

@EffectAnno(
   effect = 69
)
public class BaseBuffMagicAttackFunc extends DamageFunc {
   public static final String BUFF_SUBCLS = "buffSubCls";
   public static final String BUFF_RATE = "buffRate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      long damage = getMagicAttack(action, source.getBattleProperty(action, 2), source, target);
      int rate = 10000;
      if (model.getFuncParam().containsKey("damageRate")) {
         rate = (Integer)model.getFuncParam().get("damageRate");
      }

      int count = 0;
      short buffSubcls = ((Integer)model.getFuncParam().get("buffSubCls")).shortValue();
      TreeSet<Integer> set = source.getBuffManager().getSubBuff(buffSubcls);
      if (Objects.nonNull(set)) {
         count = set.size();
      }

      int buffRate = 10000;
      if (model.getFuncParam().containsKey("buffRate")) {
         buffRate = (Integer)model.getFuncParam().get("buffRate");
      }

      rate += count * buffRate;
      damage = (long)((float)damage * ((float)rate / 10000.0F));
      damage = (long)((float)damage * DamageFunc.getNationDamage(target));
      long newDamage = doDamage(action, source, target, targets, model, damage, event);
      if (Objects.nonNull(set)) {
         Integer[] arrays = (Integer[])set.toArray(new Integer[set.size()]);
         Integer[] exEffect = arrays;
         int var18 = arrays.length;

         for(int e = 0; e < var18; ++e) {
            int code = exEffect[e];
            source.getBuffManager().deleteBuffByCode(action, code, false);
         }

         if (action.getBlackboard().getSkillParam(52) == null) {
            action.getBlackboard().addSkillParam(52, count);
         }
      }

      Integer num = (Integer)action.getBlackboard().getSkillParam(52);
      if (Objects.isNull(num)) {
         return true;
      } else {
         for(ConditionProperty e : source.getConditionPropertyManager().getBuffMagiAtkEx()) {
            SkillEffectModel exModel = e.skillEffectModel;
            if (!Objects.isNull(exModel)) {
               int exRate = exModel.getParam("rate");
               long exDamage = (long)((float)(newDamage * (long)exRate) / 10000.0F);
               List<Entity> entityList = (List)action.getBlackboard().getSkillParam(53);
               if (Objects.isNull(entityList)) {
                  entityList = new ArrayList();

                  for(int i = 0; i < num; ++i) {
                     List<Entity> list = source.getScene().selectTarget(action, source, exModel.getTargetType(), exModel.getSelectType(), exModel.getSelectNum(), exModel.getSelectParam());
                     entityList.addAll(list);
                  }

                  action.getBlackboard().addSkillParam(53, entityList);
               }

               for(Entity entity : entityList) {
                  EffectUtil.doShield(action, source, entity, exDamage, model, false, false, event, (byte)0);
               }
            }
         }

         return true;
      }
   }
}
