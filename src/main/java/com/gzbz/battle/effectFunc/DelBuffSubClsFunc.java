package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.TreeSet;

@EffectAnno(
   effect = 46
)
public class DelBuffSubClsFunc extends EffectFunc {
   public static final String BUFF_SUBCLS = "buffSubCls";
   public static final String NODISPEL = "noDispel";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      short buffSubcls = ((Integer)model.getFuncParam().get("buffSubCls")).shortValue();
      if (model.getFuncParam().containsKey("noDispel")) {
         Integer value = (Integer)model.getFuncParam().get("noDispel");
         if (value > 0) {
            TreeSet<Integer> subCode = target.getBuffManager().getSubBuff(buffSubcls);
            if (subCode != null && subCode.size() != 0) {
               Integer[] arrays = (Integer[])subCode.toArray(new Integer[subCode.size()]);
               Integer[] var11 = arrays;
               int var12 = arrays.length;

               for(int var13 = 0; var13 < var12; ++var13) {
                  int code = var11[var13];
                  Buff buff = target.getBuffManager().getBuff(code);
                  BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buff.id);
                  if (buffModel.getNoDispel() == 0) {
                     target.getBuffManager().deleteBuffByCode(action, code, false);
                  }
               }

               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         target.getBuffManager().delSubClsBuff(action, buffSubcls);
         return true;
      }
   }
}
