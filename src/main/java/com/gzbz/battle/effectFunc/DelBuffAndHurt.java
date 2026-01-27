package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import misc.RandomUtil;
import org.apache.commons.collections4.MapUtils;

@EffectAnno(
   effect = 5
)
public class DelBuffAndHurt extends EffectFunc {
   public static final String BUFF_TYPE = "buffType";
   public static final String NUM = "num";
   public static final String HP_RATE = "hpRate";
   public static final String MAX_DAMAGE_RATE = "maxDamageRate";
   public static final String DISPEL = "dispel";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      HashMap<Byte, HashMap<Integer, TreeMap<Integer, Buff>>> priorityBuffsMap = target.getBuffManager().getPriorityBuffsMap();
      if (priorityBuffsMap != null && !target.isDead()) {
         HashMap<Integer, TreeMap<Integer, Buff>> typeBuffsMap = (HashMap)priorityBuffsMap.get(((Integer)model.getFuncParam().get("buffType")).byteValue());
         if (MapUtils.isEmpty(typeBuffsMap)) {
            return false;
         } else {
            LinkedList<Integer> randList = new LinkedList();

            for(int buffId : typeBuffsMap.keySet()) {
               BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buffId);
               if (buffModel.getNoDispel() == 0) {
                  randList.add(buffId);
               }
            }

            if (randList.size() == 0) {
               return false;
            } else {
               Integer delNum = (Integer)model.getFuncParam().get("num");
               if (delNum >= 0 && randList.size() >= delNum) {
                  Collections.shuffle(randList);
                  List<Integer> selectList = randList.subList(0, delNum);
                  selectList = this.processCleanBuffProtect(target, selectList, model);
                  delNum = selectList.size();

                  for(int id : selectList) {
                     target.getBuffManager().deleteBuffById(action, id);
                     if (model.getParam("dispel") == 1) {
                        Event dispelEvent = new Event((short)43, action, event);
                        dispelEvent.addParam(2, source);
                        dispelEvent.addParam(3, target);
                        dispelEvent.addParam(19, id);
                        action.getScene().getEventListener().pushEvent(dispelEvent);
                     }
                  }
               } else {
                  List<Integer> selectList = this.processCleanBuffProtect(target, randList, model);
                  delNum = selectList.size();

                  for(int id : selectList) {
                     target.getBuffManager().deleteBuffById(action, id);
                     if (model.getParam("dispel") == 1) {
                        Event dispelEvent = new Event((short)43, action, event);
                        dispelEvent.addParam(2, source);
                        dispelEvent.addParam(3, target);
                        dispelEvent.addParam(19, id);
                        action.getScene().getEventListener().pushEvent(dispelEvent);
                     }
                  }
               }

               int percentValue = delNum * (Integer)model.getFuncParam().get("hpRate");
               long hurtValue = (long)((float)percentValue / 10000.0F * (float)target.getBaseProperty(1));
               long hurtMaxValue = (long)((float)(Integer)model.getFuncParam().get("maxDamageRate") / 10000.0F * (float)source.getBaseProperty(2)) * (long)delNum;
               long longHurtValue = Math.min(hurtValue, hurtMaxValue);
               action.getBlackboard().plusSkillLongParam(400 + source.getBattlePos(), longHurtValue);
               action.getBlackboard().plusSkillLongParam(500 + target.getBattlePos(), longHurtValue);
               source.addAttackValue(action, longHurtValue, event);
               target.addDamageValue(longHurtValue);
               target.recordHp(source);
               DamageFunc.doDamage(action, source, target, targets, model, longHurtValue, event);
               long realValue = target.getReduceValue(source);
               action.getBlackboard().plusSkillLongParam(1100 + source.getBattlePos(), realValue);
               action.getBlackboard().plusSkillLongParam(1200 + target.getBattlePos(), realValue);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   private List<Integer> processCleanBuffProtect(Entity target, List<Integer> randList, SkillEffectModel model) {
      if (((Integer)model.getFuncParam().get("buffType")).byteValue() != 1) {
         return randList;
      } else {
         if (target.getBuffManager().isExistSubType((short)79)) {
            TreeSet<Integer> subMap = target.getBuffManager().getSubBuff((short)79);
            int code = (Integer)subMap.last();
            Buff buff = target.getBuffManager().getBuff(code);
            if (buff != null) {
               BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", buff.id);
               if (buffModel != null) {
                  BuffUseFun useFun = (BuffUseFun)buffModel.getFuncs().get(1);
                  if (useFun != null) {
                     if (randList.size() <= useFun.getUseId()) {
                        return randList;
                     }

                     if (RandomUtil.randInt(10000) < useFun.getUseValue()) {
                        return randList.subList(0, useFun.getUseId());
                     }
                  }
               }
            }
         }

         return randList;
      }
   }
}
