package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "TongQueActivityTaskGroup"
)
public class TongQueActivityTaskGroupModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "任务组id"
   )
   private int taskGroup;
   @ModelColumnAnno(
      comment = "包含的任务id"
   )
   private int includeTaskId;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, Set<Integer>>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         TongQueActivityTaskGroupModel tongQueActivityTaskGroupModel = (TongQueActivityTaskGroupModel)entry.getValue();
         ((Set)((TreeMap)tempHashMap.computeIfAbsent(tongQueActivityTaskGroupModel.getActivityId(), (v) -> new TreeMap())).computeIfAbsent(tongQueActivityTaskGroupModel.getTaskGroup(), (v) -> new HashSet())).add(tongQueActivityTaskGroupModel.includeTaskId);
      }

      pool.putMap("customTongQueActivityTaskGroup", tempHashMap);
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public int getTaskGroup() {
      return this.taskGroup;
   }

   public void setTaskGroup(int taskGroup) {
      this.checkModify();
      this.taskGroup = taskGroup;
   }

   public int getIncludeTaskId() {
      return this.includeTaskId;
   }

   public void setIncludeTaskId(int includeTaskId) {
      this.checkModify();
      this.includeTaskId = includeTaskId;
   }
}
