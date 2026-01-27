package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseConRechargeModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "eventHeroConRecharge"
)
public class EventHeroConRechargeModel extends BaseConRechargeModel {
   @ModelColumnAnno(
      comment = "奖励列表",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "主题id，先判断这个再检查天数"
   )
   private int mainId;

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getMainId() {
      return this.mainId;
   }
}
