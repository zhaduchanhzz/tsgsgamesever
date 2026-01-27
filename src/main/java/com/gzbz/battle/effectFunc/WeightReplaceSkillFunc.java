package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.KeyValFun;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import misc.RandomUtil;

@EffectAnno(
   effect = 83
)
public class WeightReplaceSkillFunc extends EffectFunc {
   public static final String[] SKILL_ID = new String[]{"skillId1", "skillId2", "skillId3"};
   public static final String[] WEIGHT = new String[]{"weight1", "weight2", "weight3"};

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (model.getFuncParam().containsKey("pos")) {
         Integer pos = (Integer)model.getFuncParam().get("pos");
         List<KeyValFun> keyValFunList = new ArrayList();

         for(int i = 0; i < SKILL_ID.length; ++i) {
            Integer skillId = (Integer)model.getFuncParam().get(SKILL_ID[i]);
            if (skillId != null) {
               Integer weight = (Integer)model.getFuncParam().getOrDefault(WEIGHT[i], 0);
               keyValFunList.add(new KeyValFun(skillId, weight));
            }
         }

         KeyValFun fun = this.countRate(keyValFunList);
         if (Objects.isNull(fun)) {
            return false;
         } else {
            Integer skillId = fun.getKey();
            EntitySkill entitySkill = target.getSkillManager().getIndexSkill(pos);
            if (entitySkill == null) {
               return false;
            } else {
               if (entitySkill.id != skillId) {
                  entitySkill.id = skillId;
                  entitySkill.setOldAttachEffect();
               }

               return true;
            }
         }
      } else {
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
