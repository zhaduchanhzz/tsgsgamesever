package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warHorseSkin"
)
public class WarHorseSkinModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "皮肤id"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "name",
      comment = "名称"
   )
   private String name;
   @ModelColumnAnno(
      columnName = "unlockType",
      comment = "解锁类型"
   )
   private int unlockType;
   @ModelColumnAnno(
      columnName = "unlockWay",
      comment = "解锁需要获得的神兽"
   )
   private int unlockWay;
   @ModelColumnAnno(
      columnName = "armatureId",
      comment = "神兽模型资源"
   )
   private int armatureId;
   @ModelColumnAnno(
      columnName = "armatureName",
      comment = "神兽模型名"
   )
   private String armatureName;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getUnlockType() {
      return this.unlockType;
   }

   public void setUnlockType(int unlockType) {
      this.checkModify();
      this.unlockType = unlockType;
   }

   public int getUnlockWay() {
      return this.unlockWay;
   }

   public void setUnlockWay(int unlockWay) {
      this.checkModify();
      this.unlockWay = unlockWay;
   }

   public int getArmatureId() {
      return this.armatureId;
   }

   public void setArmatureId(int armatureId) {
      this.checkModify();
      this.armatureId = armatureId;
   }

   public String getArmatureName() {
      return this.armatureName;
   }

   public void setArmatureName(String armatureName) {
      this.checkModify();
      this.armatureName = armatureName;
   }
}
