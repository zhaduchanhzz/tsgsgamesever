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
   file = "heromailtask"
)
public class HeroMailTaskModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "任务id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "mailid",
      comment = "信封序号"
   )
   private int mailid;
   @ModelColumnAnno(
      columnName = "taskdesc",
      comment = "任务描述"
   )
   private String taskDesc;
   @ModelColumnAnno(
      columnName = "targets",
      columnConvertType = 1,
      subCls = TaskTargetItem.class,
      count = 1,
      comment = "目标"
   )
   private List<TaskTargetItem> targets = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getMailid() {
      return this.mailid;
   }

   public void setMailid(int mailid) {
      this.checkModify();
      this.mailid = mailid;
   }

   public List<TaskTargetItem> getTargets() {
      return this.targets;
   }

   public void setTargets(List<TaskTargetItem> targets) {
      this.checkModify();
      this.targets = targets;
   }

   public String getTaskDesc() {
      return this.taskDesc;
   }

   public void setTaskDesc(String taskDesc) {
      this.checkModify();
      this.taskDesc = taskDesc;
   }

   public void reloadTaskTrigger() {
      ((Set)((Map)((Map)GlobalTaskPart.TRIGGERS.computeIfAbsent(TaskDefine.TaskModule.MODULE_HERO_MAIL_TASK.moduleId, (v) -> new ConcurrentHashMap())).computeIfAbsent(((TaskTargetItem)this.getTargets().get(0)).getTargetType(), (v) -> new ConcurrentHashMap())).computeIfAbsent(((TaskTargetItem)this.getTargets().get(0)).getTargetId(), (v) -> new ConcurrentHashSet())).add(this.getId());
   }
}
