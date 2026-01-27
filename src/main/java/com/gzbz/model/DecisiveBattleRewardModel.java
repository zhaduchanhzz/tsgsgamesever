package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DecisiveBattleReward"
)
public class DecisiveBattleRewardModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "winrewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "胜利奖励"
   )
   private List<ResourceModel> winrewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "loserewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "失败奖励"
   )
   private List<ResourceModel> loserewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<ResourceModel> getWinrewards() {
      return this.winrewards;
   }

   public void setWinrewards(List<ResourceModel> winrewards) {
      this.checkModify();
      this.winrewards = winrewards;
   }

   public List<ResourceModel> getLoserewards() {
      return this.loserewards;
   }

   public void setLoserewards(List<ResourceModel> loserewards) {
      this.checkModify();
      this.loserewards = loserewards;
   }
}
