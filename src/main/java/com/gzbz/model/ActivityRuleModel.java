package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "activityRule"
)
public class ActivityRuleModel extends BaseModel {
   public static final int ROTATION_TYPE_PLAYER = 1;
   public static final int ROTATION_TYPE_SERVER = 2;
   public static final int OPEN_TYPE_SERVER_TIME = 1;
   public static final int OPEN_TYPE_WEEK = 2;
   public static final int OPEN_TYPE_CONFIRM = 3;
   public static final int OPEN_TYPE_MONTH = 4;
   public static final int OPEN_TYPE_BY_END_ACT = 5;
   public static final int OPEN_TYPE_BY_SEVER_TIME_SCOPE = 6;
   public static final int OPEN_TYPE_BY_MERGE_SERVER_TIME = 7;
   public static final int OPEN_TIME_TYPE_SERVER_TIME = 1;
   public static final int OPEN_TIME_TYPE_TODAY_TIME = 2;
   public static final int ROTATE_TYPE_CYCLE = 1;
   public static final int ROTATE_TYPE_LAST = 2;
   public static final int ROTATE_TYPE_STOP = 3;
   @ModelColumnAnno(
      columnName = "activityType",
      isPrimaty = true,
      comment = "活动类型"
   )
   private int activityType;
   @ModelColumnAnno(
      columnName = "name",
      comment = "活动名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "openTime",
      comment = "活动开始开服时间"
   )
   private int openTime;
   @ModelColumnAnno(
      columnName = "specificTime",
      comment = "具体时间 "
   )
   private String specificTime;
   @ModelColumnAnno(
      columnName = "dropTime",
      comment = "活动掉落时间"
   )
   private int dropTime;
   @ModelColumnAnno(
      columnName = "duration",
      comment = "活动持续时间"
   )
   private int duration;
   @ModelColumnAnno(
      columnName = "nextTime",
      comment = "活动轮换间隔时间"
   )
   private int nextTime;
   @ModelColumnAnno(
      columnName = "rotationRule",
      comment = "轮换规则"
   )
   private int rotationRule;
   @ModelColumnAnno(
      columnName = "openType",
      comment = "开启类型"
   )
   private int openType;
   @ModelColumnAnno(
      columnName = "rotateType",
      comment = "轮换类型"
   )
   private int rotateType;
   @ModelColumnAnno(
      columnName = "openTimeType",
      comment = "全服开启时间类型"
   )
   private int openTimeType;
   @ModelColumnAnno(
      columnName = "relationType",
      comment = "关联类型"
   )
   private int relationType;
   @ModelColumnAnno(
      columnName = "limitTime",
      comment = "开服时间满足指定时间条件"
   )
   private String limitTime;
   @ModelColumnAnno(
      comment = "是否开启条件限制"
   )
   private int dateStartLimit;
   @ModelColumnAnno(
      comment = "服务器判断限制开启时间"
   )
   private String sysLimitTime;

   public int getActivityType() {
      return this.activityType;
   }

   public void setActivityType(int activityType) {
      this.checkModify();
      this.activityType = activityType;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getOpenTime() {
      return this.openTime;
   }

   public void setOpenTime(int openTime) {
      this.checkModify();
      this.openTime = openTime;
   }

   public String getSpecificTime() {
      return this.specificTime;
   }

   public void setSpecificTime(String specificTime) {
      this.checkModify();
      this.specificTime = specificTime;
   }

   public int getDropTime() {
      return this.dropTime;
   }

   public void setDropTime(int dropTime) {
      this.checkModify();
      this.dropTime = dropTime;
   }

   public int getDuration() {
      return this.duration;
   }

   public void setDuration(int duration) {
      this.checkModify();
      this.duration = duration;
   }

   public int getNextTime() {
      return this.nextTime;
   }

   public void setNextTime(int nextTime) {
      this.checkModify();
      this.nextTime = nextTime;
   }

   public int getRotationRule() {
      return this.rotationRule;
   }

   public void setRotationRule(int rotationRule) {
      this.checkModify();
      this.rotationRule = rotationRule;
   }

   public int getOpenType() {
      return this.openType;
   }

   public void setOpenType(int openType) {
      this.checkModify();
      this.openType = openType;
   }

   public int getRotateType() {
      return this.rotateType;
   }

   public void setRotateType(int rotateType) {
      this.checkModify();
      this.rotateType = rotateType;
   }

   public int getOpenTimeType() {
      return this.openTimeType;
   }

   public void setOpenTimeType(int openTimeType) {
      this.checkModify();
      this.openTimeType = openTimeType;
   }

   public int getRelationType() {
      return this.relationType;
   }

   public void setRelationType(int relationType) {
      this.checkModify();
      this.relationType = relationType;
   }

   public String getLimitTime() {
      return this.limitTime;
   }

   public void setLimitTime(String limitTime) {
      this.checkModify();
      this.limitTime = limitTime;
   }

   public int getDateStartLimit() {
      return this.dateStartLimit;
   }

   public void setDateStartLimit(int dateStartLimit) {
      this.checkModify();
      this.dateStartLimit = dateStartLimit;
   }

   public String getSysLimitTime() {
      return this.sysLimitTime;
   }

   public void setSysLimitTime(String sysLimitTime) {
      this.checkModify();
      this.sysLimitTime = sysLimitTime;
   }
}
