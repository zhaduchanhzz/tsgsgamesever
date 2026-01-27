package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FristYearLevelTask"
)
public class FirstYearLevelTaskModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "level"
   )
   private int level;
   @ModelColumnAnno(
      comment = "任务id",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> TaskId = new ArrayList();
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public List<Integer> getTaskId() {
      return this.TaskId;
   }

   public void setTaskId(List<Integer> taskId) {
      this.checkModify();
      this.TaskId = taskId;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
