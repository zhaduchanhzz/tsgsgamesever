package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "fengmoBattle"
)
public class FengmoBattleModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "level"
   )
   private int level;
   @ModelColumnAnno(
      comment = "战斗阶段"
   )
   private int battleStage;
   @ModelColumnAnno(
      comment = "战斗id"
   )
   private int battleId;
   @ModelColumnAnno(
      comment = "累计伤害"
   )
   private long DamageValue;
   @ModelColumnAnno(
      comment = "下一阶段id"
   )
   private int nextId;
   @ModelColumnAnno(
      columnName = "levelReward",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "宝箱奖励"
   )
   private ArrayList<ResourceModel> levelReward = new ArrayList();

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getBattleStage() {
      return this.battleStage;
   }

   public void setBattleStage(int battleStage) {
      this.checkModify();
      this.battleStage = battleStage;
   }

   public int getBattleId() {
      return this.battleId;
   }

   public void setBattleId(int battleId) {
      this.checkModify();
      this.battleId = battleId;
   }

   public long getDamageValue() {
      return this.DamageValue;
   }

   public void setDamageValue(long damageValue) {
      this.checkModify();
      this.DamageValue = damageValue;
   }

   public int getNextId() {
      return this.nextId;
   }

   public void setNextId(int nextId) {
      this.checkModify();
      this.nextId = nextId;
   }

   public ArrayList<ResourceModel> getLevelReward() {
      return this.levelReward;
   }

   public void setLevelReward(ArrayList<ResourceModel> levelReward) {
      this.checkModify();
      this.levelReward = levelReward;
   }
}
