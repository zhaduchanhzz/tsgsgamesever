package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "GodBeastTaskReward"
)
public class GodBeastTaskRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "任务id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "score",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "积分消耗"
   )
   private List<ResourceModel> score = new ArrayList();
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "奖励列表"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "领取后是否消耗积分并重置0否1是"
   )
   private int reset;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<ResourceModel> getScore() {
      return this.score;
   }

   public void setScore(List<ResourceModel> score) {
      this.checkModify();
      this.score = score;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getReset() {
      return this.reset;
   }

   public void setReset(int reset) {
      this.checkModify();
      this.reset = reset;
   }
}
