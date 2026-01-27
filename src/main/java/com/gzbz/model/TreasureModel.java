package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "treasure"
)
public class TreasureModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "宝物id"
   )
   private int treasureId;
   @ModelColumnAnno(
      comment = "宝物名称"
   )
   private String treasureName;
   @ModelColumnAnno(
      comment = "阵营id"
   )
   private int faction;
   @ModelColumnAnno(
      comment = "解锁条件id"
   )
   private int condition;
   @ModelColumnAnno(
      comment = "图标id"
   )
   private int icon;
   @ModelColumnAnno(
      comment = "特效id"
   )
   private int armature;

   public int getTreasureId() {
      return this.treasureId;
   }

   public void setTreasureId(int treasureId) {
      this.checkModify();
      this.treasureId = treasureId;
   }

   public String getTreasureName() {
      return this.treasureName;
   }

   public void setTreasureName(String treasureName) {
      this.checkModify();
      this.treasureName = treasureName;
   }

   public int getFaction() {
      return this.faction;
   }

   public void setFaction(int faction) {
      this.checkModify();
      this.faction = faction;
   }

   public int getCondition() {
      return this.condition;
   }

   public void setCondition(int condition) {
      this.checkModify();
      this.condition = condition;
   }

   public int getIcon() {
      return this.icon;
   }

   public void setIcon(int icon) {
      this.checkModify();
      this.icon = icon;
   }

   public int getArmature() {
      return this.armature;
   }

   public void setArmature(int armature) {
      this.checkModify();
      this.armature = armature;
   }
}
