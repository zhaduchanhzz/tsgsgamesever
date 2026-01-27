package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.WarOrderBaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "underPalaceReward"
)
public class UnderPalaceRewardModel extends WarOrderBaseModel {
   @ModelColumnAnno(
      columnName = "allPassAwards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 5,
      comment = "奖励"
   )
   private List<ResourceModel> allPassAwards = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "奖励"
   )
   private List<ResourceModel> rewards1 = new ArrayList();

   public List<ResourceModel> getAllPassAwards() {
      return this.allPassAwards;
   }

   public void setAllPassAwards(List<ResourceModel> allPassAwards) {
      this.checkModify();
      this.allPassAwards = allPassAwards;
   }

   public List<ResourceModel> rewards() {
      return this.allPassAwards;
   }

   public List<ResourceModel> rewards1() {
      return this.rewards1;
   }
}
