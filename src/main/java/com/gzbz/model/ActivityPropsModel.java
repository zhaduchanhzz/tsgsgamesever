package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "activityProps"
)
public class ActivityPropsModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "积分类型"
   )
   private int pointType;
   @ModelColumnAnno(
      comment = "积分id"
   )
   private int pointId;
   @ModelColumnAnno(
      comment = "积分数量"
   )
   private int pointNum;
   @ModelColumnAnno(
      comment = "任务上限"
   )
   private int taskMax;
   @ModelColumnAnno(
      comment = "积分上限"
   )
   private int pointMax;

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public int getPointType() {
      return this.pointType;
   }

   public void setPointType(int pointType) {
      this.checkModify();
      this.pointType = pointType;
   }

   public int getPointId() {
      return this.pointId;
   }

   public void setPointId(int pointId) {
      this.checkModify();
      this.pointId = pointId;
   }

   public int getPointNum() {
      return this.pointNum;
   }

   public void setPointNum(int pointNum) {
      this.checkModify();
      this.pointNum = pointNum;
   }

   public int getTaskMax() {
      return this.taskMax;
   }

   public void setTaskMax(int taskMax) {
      this.checkModify();
      this.taskMax = taskMax;
   }

   public int getPointMax() {
      return this.pointMax;
   }

   public void setPointMax(int pointMax) {
      this.checkModify();
      this.pointMax = pointMax;
   }
}
