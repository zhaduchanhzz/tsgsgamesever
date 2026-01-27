package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.KeyValFun;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import misc.RandomUtil;

@EffectAnno(
   effect = 52
)
public class AddBuffWeightRandomFunc extends EffectFunc {
   public static final String[] BUFF_ID = new String[]{"buffId1", "buffId2", "buffId3", "buffId4", "buffId5"};
   public static final String[] WEIGHT = new String[]{"weight1", "weight2", "weight3", "weight4", "weight5"};
   public static final String NUM = "num";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      List<KeyValFun> keyValFunList = new ArrayList();

      for(int i = 0; i < BUFF_ID.length; ++i) {
         Integer buffId = (Integer)model.getFuncParam().get(BUFF_ID[i]);
         if (buffId != null) {
            Integer weight = (Integer)model.getFuncParam().getOrDefault(WEIGHT[i], 0);
            keyValFunList.add(new KeyValFun(buffId, weight));
         }
      }

      Integer num = (Integer)model.getFuncParam().getOrDefault("num", 1);
      if (keyValFunList.size() != 0 && keyValFunList.size() >= num) {
         for(int i = 0; i < num; ++i) {
            KeyValFun fun = this.countRate(keyValFunList);
            if (Objects.nonNull(fun)) {
               target.getBuffManager().addBuff(action, fun.getKey(), source, event);
               keyValFunList.remove(fun);
            }
         }

         return true;
      } else {
         logger.error("buff列表配置buff数量不足  effect:{}", model.getId());
         return false;
      }
   }

   private KeyValFun countRate(List<KeyValFun> list) {
      if (list != null && !list.isEmpty()) {
         int maxRate = 0;

         for(KeyValFun fun : list) {
            if (fun.getVal() > 0) {
               maxRate += fun.getVal();
            }
         }

         if (maxRate == 0) {
            return null;
         } else {
            int randInt = RandomUtil.randInt(maxRate);

            for(KeyValFun fun : list) {
               if (fun.getVal() > 0) {
                  if (randInt < fun.getVal()) {
                     return fun;
                  }

                  randInt -= fun.getVal();
               }
            }

            return (KeyValFun)list.get(0);
         }
      } else {
         return null;
      }
   }
}
