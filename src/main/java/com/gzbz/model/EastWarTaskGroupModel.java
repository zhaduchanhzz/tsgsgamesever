package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "eastWarTaskGroup"
)
public class EastWarTaskGroupModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "ID"
   )
   private int id;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      columnName = "taskGroup",
      comment = "任务组id"
   )
   private int taskGroup;
   @ModelColumnAnno(
      columnName = "includeTaskId",
      comment = "包含的任务id"
   )
   private int includeTaskId;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
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

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, List<EastWarTaskGroupModel>>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         EastWarTaskGroupModel model = (EastWarTaskGroupModel)entry.getValue();
         ((List)((Map)tempMap.computeIfAbsent(model.getActivityId(), (v) -> new HashMap())).computeIfAbsent(model.getTaskGroup(), (v) -> new ArrayList())).add(model);
      }

      pool.putMap("customEastWarTaskGroup", tempMap);
   }
}
