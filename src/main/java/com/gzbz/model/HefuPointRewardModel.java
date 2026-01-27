package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "HefuPointReward"
)
public class HefuPointRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "积分数量"
   )
   private int pointValue;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2
   )
   private List<ResourceModel> reward = new ArrayList();

   public int getPointValue() {
      return this.pointValue;
   }

   public void setPointValue(int pointValue) {
      this.checkModify();
      this.pointValue = pointValue;
   }

   public List<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(List<ResourceModel> reward) {
      this.checkModify();
      this.reward = reward;
   }
}
