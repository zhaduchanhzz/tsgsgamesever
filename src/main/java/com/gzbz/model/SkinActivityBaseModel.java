package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "skinActivityBase"
)
public class SkinActivityBaseModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "activityId",
      isPrimaty = true,
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      columnName = "battleId",
      comment = "战斗id"
   )
   private int battleId;
   @ModelColumnAnno(
      columnName = "flopCost",
      comment = "翻牌消耗的道具"
   )
   private String flopCost;

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public int getBattleId() {
      return this.battleId;
   }

   public void setBattleId(int battleId) {
      this.checkModify();
      this.battleId = battleId;
   }

   public void setFlopCost(String flopCost) {
      this.checkModify();
      this.flopCost = flopCost;
   }

   public ResourceModel getFlopCost() {
      if (this.flopCost != null && this.flopCost.length() != 0) {
         String[] tempStrs = this.flopCost.split("\\|");
         if (tempStrs.length < 3) {
            return null;
         } else {
            ResourceModel model = new ResourceModel(Integer.valueOf(tempStrs[0]), Integer.valueOf(tempStrs[1]), Integer.valueOf(tempStrs[2]));
            return model;
         }
      } else {
         return null;
      }
   }
}
