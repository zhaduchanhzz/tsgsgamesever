package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "cleansingTowerLevelNew"
)
public class CleansingTowerLevelNewModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "id",
      comment = "关卡id"
   )
   private int level;
   @ModelColumnAnno(
      comment = "下一关卡id"
   )
   private int nextLevel;
   @ModelColumnAnno(
      comment = "开启等级"
   )
   private int unLockLv;
   @ModelColumnAnno(
      comment = "奖励列表"
   )
   private String rewards;

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getNextLevel() {
      return this.nextLevel;
   }

   public void setNextLevel(int nextLevel) {
      this.checkModify();
      this.nextLevel = nextLevel;
   }

   public int getUnLockLv() {
      return this.unLockLv;
   }

   public void setUnLockLv(int unLockLv) {
      this.checkModify();
      this.unLockLv = unLockLv;
   }

   public String getRewards() {
      return this.rewards;
   }

   public void setRewards(String rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
