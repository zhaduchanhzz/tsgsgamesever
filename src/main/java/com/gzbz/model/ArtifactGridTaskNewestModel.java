package com.gzbz.model;

import com.gzbz.model.manager.ActivityOpenServerTimeBaseModel;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "ArtifactGridTaskNewest"
)
public class ArtifactGridTaskNewestModel extends ActivityOpenServerTimeBaseModel {
   @ModelColumnAnno(
      comment = "格子数"
   )
   private int gridNum;
   @ModelColumnAnno(
      comment = "天数"
   )
   private int day;
   @ModelColumnAnno(
      comment = "任务id",
      columnName = "taskID"
   )
   private int taskId;

   @ModelCustomMethod
   public static void loadCustom1(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<String, TreeMap<Integer, TreeMap<Integer, ArtifactGridTaskNewestModel>>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         ArtifactGridTaskNewestModel model = (ArtifactGridTaskNewestModel)entry.getValue();
         ((TreeMap)((TreeMap)tempMap.computeIfAbsent(model.formatStartEnd(), (v) -> new TreeMap())).computeIfAbsent(model.day, (v) -> new TreeMap())).put(model.gridNum, model);
      }

      pool.putMap("customArtifactGridTaskNewest", tempMap);
   }

   public String getCustomExcelName() {
      return null;
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
}
