package com.gzbz.battle.condition;

import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.fun.ConditionModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConditionProcessor implements Serializable {
   public static HashMap<Short, ConditionFunc> conditionMap = new HashMap();
   static Logger logger = LoggerFactory.getLogger(ConditionProcessor.class);

   public static boolean checkCondition(Action action, byte conditionsType, ArrayList<ConditionModel> conditionList, Entity source, Entity target, Event event) {
      if (0 == conditionsType) {
         return true;
      } else {
         boolean success = true;

         for(ConditionModel conditionModel : conditionList) {
            success = checkCondition(action, conditionModel, source, target, event);
            if (conditionsType == 1 && !success || conditionsType == 2 && success) {
               break;
            }
         }

         return success;
      }
   }

   private static boolean checkCondition(Action action, ConditionModel conditionModel, Entity source, Entity target, Event event) {
      if (!conditionMap.containsKey(conditionModel.getCondition())) {
         logger.error("无法找到对应的检测类型" + conditionModel.getCondition());
         return false;
      } else {
         try {
            return ((ConditionFunc)conditionMap.get(conditionModel.getCondition())).check(action, source, target, conditionModel, event);
         } catch (Exception e) {
            e.printStackTrace();
            return false;
         }
      }
   }

   static {
      conditionMap.put(Short.valueOf((short)3), new check_target_type());
      conditionMap.put(Short.valueOf((short)32), new check_target_non_type());
      conditionMap.put(Short.valueOf((short)38), new check_self_type());
      conditionMap.put(Short.valueOf((short)41), new check_self_nation());
   }
}
