package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "LaborDaySignAward"
)
public class LaborDaySignAwardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "天数"
   )
   private int day;
   @ModelColumnAnno(
      comment = "奖励列表",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 4
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getDay() {
      return this.day;
   }

   public void setDay(int day) {
      this.checkModify();
      this.day = day;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
