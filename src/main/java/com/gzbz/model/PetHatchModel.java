package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "petHatch"
)
public class PetHatchModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "level",
      isPrimaty = true,
      comment = "神兽鉴定等级"
   )
   private int level;
   @ModelColumnAnno(
      columnName = "slot",
      comment = "开启鉴定槽位数"
   )
   private int slot;
   @ModelColumnAnno(
      columnName = "exp",
      comment = "下一级所需经验"
   )
   private int exp;
   @ModelColumnAnno(
      columnName = "time",
      comment = "孵化时间"
   )
   private int time;
   @ModelColumnAnno(
      columnName = "cost",
      comment = "每小时花费元宝"
   )
   private int cost;
   @ModelColumnAnno(
      columnName = "vipTime",
      comment = "特权孵化时间"
   )
   private int vipTime;
   @ModelColumnAnno(
      columnName = "vipCost",
      comment = "特权每小时花费时间"
   )
   private int vipCost;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "等级奖励"
   )
   private List<ResourceModel> levelAward = new ArrayList();

   public int getSlot() {
      return this.slot;
   }

   public void setSlot(int slot) {
      this.checkModify();
      this.slot = slot;
   }

   public int getExp() {
      return this.exp;
   }

   public void setExp(int exp) {
      this.checkModify();
      this.exp = exp;
   }

   public int getTime() {
      return this.time;
   }

   public void setTime(int time) {
      this.checkModify();
      this.time = time;
   }

   public int getCost() {
      return this.cost;
   }

   public void setCost(int cost) {
      this.checkModify();
      this.cost = cost;
   }

   public int getVipTime() {
      return this.vipTime;
   }

   public void setVipTime(int vipTime) {
      this.checkModify();
      this.vipTime = vipTime;
   }

   public int getVipCost() {
      return this.vipCost;
   }

   public void setVipCost(int vipCost) {
      this.checkModify();
      this.vipCost = vipCost;
   }

   public List<ResourceModel> getLevelAward() {
      return this.levelAward;
   }

   public void setLevelAward(List<ResourceModel> levelAward) {
      this.checkModify();
      this.levelAward = levelAward;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }
}
