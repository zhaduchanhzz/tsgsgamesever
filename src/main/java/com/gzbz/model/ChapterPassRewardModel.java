package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "chapterPassReward"
)
public class ChapterPassRewardModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "奖励id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = " 奖励道具"
   )
   private ArrayList<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "bonus",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = " 额外奖励"
   )
   private ArrayList<ResourceModel> bonus = new ArrayList();
   @ModelColumnAnno(
      columnName = "bonustar",
      comment = "奖励星级"
   )
   private int bonustar;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public ArrayList<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(ArrayList<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public ArrayList<ResourceModel> getBonus() {
      return this.bonus;
   }

   public void setBonus(ArrayList<ResourceModel> bonus) {
      this.checkModify();
      this.bonus = bonus;
   }

   public int getBonustar() {
      return this.bonustar;
   }

   public void setBonustar(int bonustar) {
      this.checkModify();
      this.bonustar = bonustar;
   }
}
