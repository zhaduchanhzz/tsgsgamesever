package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "unionDonate"
)
public class UnionDonateModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "捐献id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "level",
      comment = "需求等级"
   )
   private int level;
   @ModelColumnAnno(
      columnName = "vipLevel",
      comment = "vip等级"
   )
   private int vipLevel;
   @ModelColumnAnno(
      columnName = "copper",
      comment = "需要铜钱"
   )
   private int copper;
   @ModelColumnAnno(
      columnName = "gold",
      comment = "需要元宝"
   )
   private int gold;
   @ModelColumnAnno(
      columnName = "progress",
      comment = "捐献进度"
   )
   private int progress;
   @ModelColumnAnno(
      columnName = "unionExp",
      comment = "军团经验"
   )
   private int unionExp;
   @ModelColumnAnno(
      columnName = "donate",
      comment = "军团贡献"
   )
   private int donate;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "捐献描述"
   )
   private String desc;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getVipLevel() {
      return this.vipLevel;
   }

   public void setVipLevel(int vipLevel) {
      this.checkModify();
      this.vipLevel = vipLevel;
   }

   public int getCopper() {
      return this.copper;
   }

   public void setCopper(int copper) {
      this.checkModify();
      this.copper = copper;
   }

   public int getGold() {
      return this.gold;
   }

   public void setGold(int gold) {
      this.checkModify();
      this.gold = gold;
   }

   public int getProgress() {
      return this.progress;
   }

   public void setProgress(int progress) {
      this.checkModify();
      this.progress = progress;
   }

   public int getUnionExp() {
      return this.unionExp;
   }

   public void setUnionExp(int unionExp) {
      this.checkModify();
      this.unionExp = unionExp;
   }

   public int getDonate() {
      return this.donate;
   }

   public void setDonate(int donate) {
      this.checkModify();
      this.donate = donate;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
