package com.gzbz.model;

import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.model.manager.BaseTaskModel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "NewWeekTask"
)
public class NewWeekTaskModel extends BaseTaskModel {
   @ModelColumnAnno
   private int type;
   @ModelColumnAnno(
      comment = "随机任务出现的最低等级"
   )
   private int lowLevel;
   @ModelColumnAnno(
      comment = "随机任务出现的最高等级"
   )
   private int maxLevel;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, NewWeekTaskModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         NewWeekTaskModel model = (NewWeekTaskModel)entry.getValue();
         ((Map)tempHashMap.computeIfAbsent(model.type, (v) -> new HashMap())).put(model.getTaskId(), model);
      }

      pool.putMap("cNewWeekTask", tempHashMap);
   }

   public TaskDefine.TaskModule module() {
      return TaskDefine.TaskModule.MODULE_NEW_WEEK;
   }

   public int getLowLevel() {
      return this.lowLevel;
   }

   public int getMaxLevel() {
      return this.maxLevel;
   }
}
