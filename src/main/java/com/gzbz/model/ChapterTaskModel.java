package com.gzbz.model;

import cn.hutool.core.collection.ConcurrentHashSet;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.task.base.GlobalTaskPart;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "chaptertask"
)
public class ChapterTaskModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "taskid",
      comment = "序号"
   )
   private int taskId;
   @ModelColumnAnno(
      columnName = "taskdesc",
      comment = "内容"
   )
   private String taskdesc;
   @ModelColumnAnno(
      columnName = "taskType",
      comment = "任务类型"
   )
   private int taskType;
   @ModelColumnAnno(
      columnName = "target",
      comment = "任务需求"
   )
   private int target;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();

   public void reloadTaskTrigger() {
      ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(TaskDefine.TaskModule.MODULE_CHAPTER_SECTION.moduleId, (v) -> new ConcurrentHashMap())).computeIfAbsent(this.getTaskType(), (v) -> new ConcurrentHashMap())).computeIfAbsent(0, (v) -> new ConcurrentHashSet())).add(this.getTaskId());
   }

   public int getTaskId() {
      return this.taskId;
   }

   public void setTaskId(int taskId) {
      this.checkModify();
      this.taskId = taskId;
   }

   public String getTaskdesc() {
      return this.taskdesc;
   }

   public void setTaskdesc(String taskdesc) {
      this.checkModify();
      this.taskdesc = taskdesc;
   }

   public int getTarget() {
      return this.target;
   }

   public void setTarget(int target) {
      this.checkModify();
      this.target = target;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getTaskType() {
      return this.taskType;
   }

   public void setTaskType(int taskType) {
      this.checkModify();
      this.taskType = taskType;
   }
}
