package com.gzbz.model;

import cn.hutool.core.collection.ConcurrentHashSet;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.base.GlobalTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "sevenDaysTasks"
)
public class SevenDaysTaskModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "任务id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "任务标题"
   )
   private String taskName;
   @ModelColumnAnno(
      comment = "任务描述"
   )
   private String taskDesc;
   @ModelColumnAnno(
      comment = "任务图示"
   )
   private int icon;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "前往系统id"
   )
   private int toSystemFunId;
   @ModelColumnAnno(
      comment = "最低等级"
   )
   private int lowLevel;
   @ModelColumnAnno(
      comment = "最高等级"
   )
   private int maxLevel;
   @ModelColumnAnno(
      comment = "目标类型"
   )
   private int targetType;
   @ModelColumnAnno(
      comment = "目标ID"
   )
   private int targetId;
   @ModelColumnAnno(
      comment = "目标数量"
   )
   private int targetNum;
   @ModelColumnAnno(
      comment = "必刷出的任务"
   )
   private int mustTask;
   @ModelColumnAnno(
      comment = "任务出现的系统id"
   )
   private int sysfuncationID;
   @ModelColumnAnno(
      comment = "第几天"
   )
   private int time;
   @ModelColumnAnno(
      comment = "标签类型"
   )
   private int labelType;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 4,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, List<SevenDaysTaskModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         SevenDaysTaskModel sevenDaysTaskModel = (SevenDaysTaskModel)entry.getValue();
         ((List)tempHashMap.computeIfAbsent(sevenDaysTaskModel.activityId, (v) -> new ArrayList())).add(sevenDaysTaskModel);
      }

      pool.putMap("customSevenDaysTasks", tempHashMap);
   }

   public void reloadTaskTrigger() {
      ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)ApplicationContextProvider.getModelPoolEntity("activityopenTime", this.activityId);
      if (activityOpenTimeModel != null) {
         short module = 0;
         if (activityOpenTimeModel.getActivityType() == 2) {
            module = TaskDefine.TaskModule.MODULE_ACTIVITY_SPECIAL.moduleId;
         } else if (activityOpenTimeModel.getActivityType() == 1) {
            module = TaskDefine.TaskModule.MODULE_ACTIVITY_SEVEN.moduleId;
         } else if (activityOpenTimeModel.getActivityType() == 10) {
            module = TaskDefine.TaskModule.MODULE_WO_LONG.moduleId;
         } else if (activityOpenTimeModel.getActivityType() == 14) {
            module = TaskDefine.TaskModule.MODULE_SPRING_FESTIVAL.moduleId;
         } else if (activityOpenTimeModel.getActivityType() == 17) {
            module = TaskDefine.TaskModule.MODULE_SPRING_ENJOY_ILLUSTRATION.moduleId;
         } else if (activityOpenTimeModel.getActivityType() == 21) {
            module = TaskDefine.TaskModule.MODULE_ARTIFACT_ACTIVITY.moduleId;
         } else if (activityOpenTimeModel.getActivityType() == 32) {
            module = TaskDefine.TaskModule.MODULE_MID_AUTUMN.moduleId;
         } else if (activityOpenTimeModel.getActivityType() == 46) {
            module = TaskDefine.TaskModule.MODULE_ZZRZ.moduleId;
         } else if (activityOpenTimeModel.getActivityType() == 47) {
            module = TaskDefine.TaskModule.MODULE_XDMZ.moduleId;
         } else if (activityOpenTimeModel.getActivityType() == 48) {
            module = TaskDefine.TaskModule.MODULE_QRYW.moduleId;
         } else if (activityOpenTimeModel.getActivityType() == 43) {
            module = TaskDefine.TaskModule.MODULE_KITTY_ILLUSTRATION.moduleId;
         } else if (activityOpenTimeModel.getActivityType() == 45) {
            module = TaskDefine.TaskModule.MODULE_LI_YU_ROTATE.moduleId;
         } else if (activityOpenTimeModel.getActivityType() == 55) {
            module = TaskDefine.TaskModule.MODULE_ACT_THANKSGIVING.moduleId;
         } else if (activityOpenTimeModel.getActivityType() == 70) {
            module = TaskDefine.TaskModule.MODULE_ARTIFACT_ROTATE_ACTIVITY.moduleId;
         } else if (activityOpenTimeModel.getActivityType() == 81) {
            module = TaskDefine.TaskModule.MODULE_ARTIFACT_SKIN_ACTIVITY.moduleId;
         }

         if (module != 0) {
            ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(module, (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetType(), (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTargetId(), (v) -> new ConcurrentHashSet())).add(this.getId());
         }
      }
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getTaskName() {
      return this.taskName;
   }

   public void setTaskName(String taskName) {
      this.checkModify();
      this.taskName = taskName;
   }

   public String getTaskDesc() {
      return this.taskDesc;
   }

   public void setTaskDesc(String taskDesc) {
      this.checkModify();
      this.taskDesc = taskDesc;
   }

   public int getIcon() {
      return this.icon;
   }

   public void setIcon(int icon) {
      this.checkModify();
      this.icon = icon;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public int getToSystemFunId() {
      return this.toSystemFunId;
   }

   public void setToSystemFunId(int toSystemFunId) {
      this.checkModify();
      this.toSystemFunId = toSystemFunId;
   }

   public int getLowLevel() {
      return this.lowLevel;
   }

   public void setLowLevel(int lowLevel) {
      this.checkModify();
      this.lowLevel = lowLevel;
   }

   public int getMaxLevel() {
      return this.maxLevel;
   }

   public void setMaxLevel(int maxLevel) {
      this.checkModify();
      this.maxLevel = maxLevel;
   }

   public int getTargetType() {
      return this.targetType;
   }

   public void setTargetType(int targetType) {
      this.checkModify();
      this.targetType = targetType;
   }

   public int getTargetId() {
      return this.targetId;
   }

   public void setTargetId(int targetId) {
      this.checkModify();
      this.targetId = targetId;
   }

   public int getTargetNum() {
      return this.targetNum;
   }

   public void setTargetNum(int targetNum) {
      this.checkModify();
      this.targetNum = targetNum;
   }

   public int getMustTask() {
      return this.mustTask;
   }

   public void setMustTask(int mustTask) {
      this.checkModify();
      this.mustTask = mustTask;
   }

   public int getSysfuncationID() {
      return this.sysfuncationID;
   }

   public void setSysfuncationID(int sysfuncationID) {
      this.checkModify();
      this.sysfuncationID = sysfuncationID;
   }

   public int getTime() {
      return this.time;
   }

   public void setTime(int time) {
      this.checkModify();
      this.time = time;
   }

   public int getLabelType() {
      return this.labelType;
   }

   public void setLabelType(int labelType) {
      this.checkModify();
      this.labelType = labelType;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
