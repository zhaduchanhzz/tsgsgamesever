package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "equipCompound"
)
public class EquipCompoundModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "下个序号"
   )
   private int nextId;
   @ModelColumnAnno(
      comment = "装备类型"
   )
   private int equipType;
   @ModelColumnAnno(
      comment = "合成方案类型"
   )
   private int recipeType;
   @ModelColumnAnno(
      comment = "图标"
   )
   private int icon;
   @ModelColumnAnno(
      comment = "需要装备-type"
   )
   private int needType;
   @ModelColumnAnno(
      comment = "需要装备-id"
   )
   private int needId;
   @ModelColumnAnno(
      comment = "需要装备-num"
   )
   private int needNum;
   @ModelColumnAnno(
      comment = "消耗金币-type"
   )
   private int costType;
   @ModelColumnAnno(
      comment = "消耗金币-id"
   )
   private int costId;
   @ModelColumnAnno(
      comment = "消耗金币-num"
   )
   private int costNum;
   @ModelColumnAnno(
      comment = "合成装备-type"
   )
   private int rewardType;
   @ModelColumnAnno(
      comment = "合成装备-id"
   )
   private int rewardId;
   @ModelColumnAnno(
      comment = "合成装备-num"
   )
   private int rewardNum;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getNextId() {
      return this.nextId;
   }

   public void setNextId(int nextId) {
      this.checkModify();
      this.nextId = nextId;
   }

   public int getEquipType() {
      return this.equipType;
   }

   public void setEquipType(int equipType) {
      this.checkModify();
      this.equipType = equipType;
   }

   public int getRecipeType() {
      return this.recipeType;
   }

   public void setRecipeType(int recipeType) {
      this.checkModify();
      this.recipeType = recipeType;
   }

   public int getIcon() {
      return this.icon;
   }

   public void setIcon(int icon) {
      this.checkModify();
      this.icon = icon;
   }

   public int getNeedType() {
      return this.needType;
   }

   public void setNeedType(int needType) {
      this.checkModify();
      this.needType = needType;
   }

   public int getNeedId() {
      return this.needId;
   }

   public void setNeedId(int needId) {
      this.checkModify();
      this.needId = needId;
   }

   public int getNeedNum() {
      return this.needNum;
   }

   public void setNeedNum(int needNum) {
      this.checkModify();
      this.needNum = needNum;
   }

   public int getCostType() {
      return this.costType;
   }

   public void setCostType(int costType) {
      this.checkModify();
      this.costType = costType;
   }

   public int getCostId() {
      return this.costId;
   }

   public void setCostId(int costId) {
      this.checkModify();
      this.costId = costId;
   }

   public int getCostNum() {
      return this.costNum;
   }

   public void setCostNum(int costNum) {
      this.checkModify();
      this.costNum = costNum;
   }

   public int getRewardType() {
      return this.rewardType;
   }

   public void setRewardType(int rewardType) {
      this.checkModify();
      this.rewardType = rewardType;
   }

   public int getRewardId() {
      return this.rewardId;
   }

   public void setRewardId(int rewardId) {
      this.checkModify();
      this.rewardId = rewardId;
   }

   public int getRewardNum() {
      return this.rewardNum;
   }

   public void setRewardNum(int rewardNum) {
      this.checkModify();
      this.rewardNum = rewardNum;
   }
}
