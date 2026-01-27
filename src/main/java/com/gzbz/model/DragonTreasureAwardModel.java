package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "dragonTreasureAward"
)
public class DragonTreasureAwardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "道具组"
   )
   private int awardGroup;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "奖励道具"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "刷新概率"
   )
   private int awardodd;
   @ModelColumnAnno(
      comment = "获得次数"
   )
   private int awardTimes;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getAwardGroup() {
      return this.awardGroup;
   }

   public void setAwardGroup(int awardGroup) {
      this.checkModify();
      this.awardGroup = awardGroup;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getAwardodd() {
      return this.awardodd;
   }

   public void setAwardodd(int awardodd) {
      this.checkModify();
      this.awardodd = awardodd;
   }

   public int getAwardTimes() {
      return this.awardTimes;
   }

   public void setAwardTimes(int awardTimes) {
      this.checkModify();
      this.awardTimes = awardTimes;
   }
}
