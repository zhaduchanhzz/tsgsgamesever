package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "artifactGridTask"
)
public class ArtifactGridTaskModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "格子数"
   )
   private int gridNum;
   @ModelColumnAnno(
      comment = "天数"
   )
   private int day;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "任务id",
      columnName = "taskID"
   )
   private int taskId;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, TreeMap<Integer, ArtifactGridTaskModel>>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ArtifactGridTaskModel model = (ArtifactGridTaskModel)entry.getValue();
         ((TreeMap)((Map)tempMap.computeIfAbsent(model.activityId, (v) -> new HashMap())).computeIfAbsent(model.day, (v) -> new TreeMap())).put(model.gridNum, model);
      }

      pool.putMap("customArtifactGridTask", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getTaskId() {
      return this.taskId;
   }

   public void setTaskId(int taskId) {
      this.checkModify();
      this.taskId = taskId;
   }

   public int getGridNum() {
      return this.gridNum;
   }

   public void setGridNum(int gridNum) {
      this.checkModify();
      this.gridNum = gridNum;
   }

   public int getDay() {
      return this.day;
   }

   public void setDay(int day) {
      this.checkModify();
      this.day = day;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }
}
