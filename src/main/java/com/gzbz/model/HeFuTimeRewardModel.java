package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "HefuTimeReward"
)
public class HeFuTimeRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "次数"
   )
   private int times;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "奖励"
   )
   private List<ResourceModel> reward = new ArrayList();

   public int getTimes() {
      return this.times;
   }

   public void setTimes(int times) {
      this.checkModify();
      this.times = times;
   }

   public List<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(List<ResourceModel> reward) {
      this.checkModify();
      this.reward = reward;
   }
}
