package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.model.fun.ConditionModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

@EffectAnno(
   effect = 68
)
public class UrgeBombFunc extends EffectFunc {
   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target != null && !target.isDead()) {
         ArrayList<ConditionModel> conditions = model.getConditions();
         if (conditions.size() == 0) {
            return false;
         } else {
            ConditionModel conditionModel = (ConditionModel)model.getConditions().get(0);
            short subCls = Short.parseShort(conditionModel.getConditionParam());
            TreeSet<Integer> codeSet = target.getBuffManager().getSubBuff(subCls);
            if (codeSet != null && codeSet.size() != 0) {
               HashSet<Buff> delSet = new HashSet();
               long value = 0L;

               for(int code : codeSet) {
                  Buff buff = target.getBuffManager().getBuff(code);
                  if (buff != null) {
                     BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                     if (buffModel != null) {
                        BuffUseFun fun = (BuffUseFun)buffModel.getFuncs().get(1);
                        if (!Objects.isNull(fun) && (fun.getUseFunc() == 4 || fun.getUseFunc() == 2 || fun.getUseFunc() == 1)) {
                           value += target.getBuffManager().buffModifyHp(event.getAction(), buff, buffModel, delSet, (byte)31, event);
                        }
                     }
                  }
               }

               if (target.isDead()) {
                  target.clear(event.getAction());
                  BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                  effectBuilder.setTargetBattlePos(target.getBattlePos());
                  effectBuilder.setEffectType(9);
                  effectBuilder.setEffectValue(1L);
                  effectBuilder.setFinalValue(target.getBaseProperty(99));
                  event.getAction().getBlackboard().addBattleEffect(effectBuilder);
                  EffectUtil.putDeadEvent(event.getAction(), source, target, event);
               }

               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }
}
