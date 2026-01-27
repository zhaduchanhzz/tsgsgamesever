package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.WarOrderBaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "JiuZhouWarCardReward"
)
public class SupremePvpWarOrderModel extends WarOrderBaseModel {
   @ModelColumnAnno(
      comment = "所需经验"
   )
   private int integral;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "奖励",
      columnName = "lockRewards"
   )
   private List<ResourceModel> rewards1 = new ArrayList();

   public int getIntegral() {
      return this.integral;
   }

   public List<ResourceModel> rewards() {
      return this.rewards;
   }

   public List<ResourceModel> rewards1() {
      return this.rewards1;
   }
}
