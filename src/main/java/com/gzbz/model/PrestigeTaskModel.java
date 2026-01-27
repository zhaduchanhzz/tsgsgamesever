package com.gzbz.model;

import cn.hutool.core.collection.ConcurrentHashSet;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.model.fun.TaskTargetItem;
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
   file = "prestigetask"
)
public class PrestigeTaskModel extends BaseModel {
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
      comment = "解锁条件"
   )
   private int needLevel;
   @ModelColumnAnno(
      comment = "最高等级"
   )
   private int lvLimit;
   @ModelColumnAnno(
      columnName = "target",
      columnConvertType = 1,
      subCls = TaskTargetItem.class,
      count = 3,
      comment = "目标"
   )
   private List<TaskTargetItem> target = new ArrayList();
   @ModelColumnAnno(
      comment = "对应称号序号"
   )
   private int prestigeid;
   @ModelColumnAnno(
      comment = "任务描述"
   )
   private String taskDesc;

   public void reloadTaskTrigger() {
      ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(TaskDefine.TaskModule.MODULE_PRESTIGET.moduleId, (v) -> new ConcurrentHashMap())).computeIfAbsent(((TaskTargetItem)this.getTarget().get(0)).getTargetType(), (v) -> new ConcurrentHashMap())).computeIfAbsent(((TaskTargetItem)this.getTarget().get(0)).getTargetId(), (v) -> new ConcurrentHashSet())).add(this.getId());
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

   public int getNeedLevel() {
      return this.needLevel;
   }

   public void setNeedLevel(int needLevel) {
      this.checkModify();
      this.needLevel = needLevel;
   }

   public int getLvLimit() {
      return this.lvLimit;
   }

   public void setLvLimit(int lvLimit) {
      this.checkModify();
      this.lvLimit = lvLimit;
   }

   public List<TaskTargetItem> getTarget() {
      return this.target;
   }

   public void setTarget(List<TaskTargetItem> target) {
      this.checkModify();
      this.target = target;
   }

   public int getPrestigeid() {
      return this.prestigeid;
   }

   public void setPrestigeid(int prestigeid) {
      this.checkModify();
      this.prestigeid = prestigeid;
   }
}
