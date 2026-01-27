package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.WarOrderBaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "battleTowerExtraReward"
)
public class BattleTowerExtraRewardModel extends WarOrderBaseModel {
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "通关层数需求"
   )
   private int towerId;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "奖励"
   )
   private List<ResourceModel> rewards1 = new ArrayList();

   public List<ResourceModel> rewards() {
      return this.rewards;
   }

   public List<ResourceModel> rewards1() {
      return this.rewards1;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getTowerId() {
      return this.towerId;
   }

   public void setTowerId(int towerId) {
      this.checkModify();
      this.towerId = towerId;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
