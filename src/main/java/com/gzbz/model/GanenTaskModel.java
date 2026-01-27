package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "Ganenlllustration"
)
public class GanenTaskModel extends BaseModel {
   @ModelColumnAnno(
      comment = "任务id",
      columnName = "taskID",
      isPrimaty = true
   )
   private int taskId;
   @ModelColumnAnno(
      comment = "活动id",
      columnName = "activityID"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "插图id",
      columnName = "BiglllustrationId"
   )
   private int bigIllustrationId;
   @ModelColumnAnno(
      comment = "格子数",
      columnName = "SquareNum"
   )
   private int squareNum;
   @ModelColumnAnno(
      comment = "第几天",
      columnName = "time"
   )
   private int time;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, TreeMap<Integer, GanenTaskModel>>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         GanenTaskModel model = (GanenTaskModel)entry.getValue();
         ((TreeMap)((Map)tempHashMap.computeIfAbsent(model.activityId, (v) -> new ConcurrentHashMap())).computeIfAbsent(model.bigIllustrationId, (v) -> new TreeMap())).put(model.squareNum, model);
      }

      pool.putMap("customGanenlllustration", tempHashMap);
   }

   public int getTaskId() {
      return this.taskId;
   }

   public void setTaskId(int taskId) {
      this.checkModify();
      this.taskId = taskId;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public int getBigIllustrationId() {
      return this.bigIllustrationId;
   }

   public void setBigIllustrationId(int bigIllustrationId) {
      this.checkModify();
      this.bigIllustrationId = bigIllustrationId;
   }

   public int getSquareNum() {
      return this.squareNum;
   }

   public void setSquareNum(int squareNum) {
      this.checkModify();
      this.squareNum = squareNum;
   }

   public int getTime() {
      return this.time;
   }

   public void setTime(int time) {
      this.checkModify();
      this.time = time;
   }
}
