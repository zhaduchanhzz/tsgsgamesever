package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "MysticIdentify"
)
public class MagicIdentifyModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "鉴析等级"
   )
   private int identityLevel;
   @ModelColumnAnno(
      comment = "下个等级"
   )
   private int nextLevel;
   @ModelColumnAnno(
      comment = "鉴定速度"
   )
   private int identitySpeed;
   @ModelColumnAnno(
      columnName = "lvupStar",
      comment = "武将材料星级需求"
   )
   private int lvUpStar;
   @ModelColumnAnno(
      columnName = "lvupCost",
      comment = "武将材料数量需求"
   )
   private int lvUpCost;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getIdentityLevel() {
      return this.identityLevel;
   }

   public void setIdentityLevel(int identityLevel) {
      this.checkModify();
      this.identityLevel = identityLevel;
   }

   public int getNextLevel() {
      return this.nextLevel;
   }

   public void setNextLevel(int nextLevel) {
      this.checkModify();
      this.nextLevel = nextLevel;
   }

   public int getIdentitySpeed() {
      return this.identitySpeed;
   }

   public void setIdentitySpeed(int identitySpeed) {
      this.checkModify();
      this.identitySpeed = identitySpeed;
   }

   public int getLvUpStar() {
      return this.lvUpStar;
   }

   public void setLvUpStar(int lvUpStar) {
      this.checkModify();
      this.lvUpStar = lvUpStar;
   }

   public int getLvUpCost() {
      return this.lvUpCost;
   }

   public void setLvUpCost(int lvUpCost) {
      this.checkModify();
      this.lvUpCost = lvUpCost;
   }
}
