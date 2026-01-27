package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "JZTrailAward"
)
public class HeroGodTrialAwardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id序号"
   )
   private int id;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "连续通关奖励加成比例,万分比"
   )
   private int per;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getPer() {
      return this.per;
   }

   public void setPer(int per) {
      this.checkModify();
      this.per = per;
   }
}
