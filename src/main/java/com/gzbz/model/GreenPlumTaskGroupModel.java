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
   file = "greenPlumTaskGroup"
)
public class GreenPlumTaskGroupModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "ID"
   )
   private int id;
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
      ConcurrentHashMap<Integer, List<GreenPlumTaskGroupModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         GreenPlumTaskGroupModel model = (GreenPlumTaskGroupModel)entry.getValue();
         if (tempMap.containsKey(model.getTaskGroup())) {
            ((List)tempMap.get(model.getTaskGroup())).add(model);
         } else {
            List<GreenPlumTaskGroupModel> list = new ArrayList();
            list.add(model);
            tempMap.put(model.getTaskGroup(), list);
         }
      }

      pool.putMap("customGreenPlumTaskGroup", tempMap);
   }
}
