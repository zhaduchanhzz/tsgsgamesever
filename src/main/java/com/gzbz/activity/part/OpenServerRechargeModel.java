package com.gzbz.activity.part;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseAddUpRechargeModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "openServerRecharge"
)
public class OpenServerRechargeModel extends BaseAddUpRechargeModel {
   @ModelColumnAnno(
      comment = "奖励列表",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private final List<ResourceModel> rewards = new ArrayList();

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }
}
