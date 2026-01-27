package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FlowerFireBattleAward"
)
public class FlowerFireBattleAwardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "战力最小值"
   )
   private int minHurt;
   @ModelColumnAnno(
      comment = "战力最大值"
   )
   private int maxHurt;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 1,
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

   public int getMinHurt() {
      return this.minHurt;
   }

   public void setMinHurt(int minHurt) {
      this.checkModify();
      this.minHurt = minHurt;
   }

   public int getMaxHurt() {
      return this.maxHurt;
   }

   public void setMaxHurt(int maxHurt) {
      this.checkModify();
      this.maxHurt = maxHurt;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
