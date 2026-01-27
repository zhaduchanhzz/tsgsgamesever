package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "AncientSwordMonthAward"
)
public class AncientSwordMonthAwardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "所需活跃度"
   )
   private int active;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class
   )
   private final List<ResourceModel> rewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public int getActive() {
      return this.active;
   }
}
