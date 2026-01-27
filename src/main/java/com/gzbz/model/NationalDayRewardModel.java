package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "guoqingPoint"
)
public class NationalDayRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "Point"
   )
   private int point;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getPoint() {
      return this.point;
   }

   public void setPoint(int point) {
      this.checkModify();
      this.point = point;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setReward(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
