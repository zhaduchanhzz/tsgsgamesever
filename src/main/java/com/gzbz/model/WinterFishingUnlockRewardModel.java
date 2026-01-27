package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "WinterFishingUnlockReward"
)
public class WinterFishingUnlockRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "收集类型"
   )
   private int colletType;
   @ModelColumnAnno(
      columnName = "para1",
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "伤害奖励分级"
   )
   private List<Integer> para1;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 2,
      subCls = ResourceModel.class,
      count = 3
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<Integer> getPara1() {
      return this.para1;
   }

   public void setPara1(List<Integer> para1) {
      this.checkModify();
      this.para1 = para1;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getColletType() {
      return this.colletType;
   }

   public void setColletType(int colletType) {
      this.checkModify();
      this.colletType = colletType;
   }
}
