package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "skinActivityTaskGroup"
)
public class SkinActivityTaskGroupModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "activityId",
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
      this.id = id;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.activityId = activityId;
   }

   public int getTaskGroup() {
      return this.taskGroup;
   }

   public void setTaskGroup(int taskGroup) {
      this.taskGroup = taskGroup;
   }

   public int getIncludeTaskId() {
      return this.includeTaskId;
   }

   public void setIncludeTaskId(int includeTaskId) {
      this.includeTaskId = includeTaskId;
   }

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<SkinActivityTaskGroupModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         SkinActivityTaskGroupModel model = (SkinActivityTaskGroupModel)entry.getValue();
         if (tempMap.containsKey(model.getActivityId())) {
            ((List)tempMap.get(model.getActivityId())).add(model);
         } else {
            List<SkinActivityTaskGroupModel> list = new ArrayList();
            list.add(model);
            tempMap.put(model.getActivityId(), list);
         }
      }

      pool.putMap("customSkinActivityTaskGroup", tempMap);
   }
}
