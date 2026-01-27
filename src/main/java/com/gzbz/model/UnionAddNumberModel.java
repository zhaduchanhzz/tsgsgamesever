package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "unionAddNumber"
)
public class UnionAddNumberModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "次数id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "扩展人数"
   )
   private int number;
   @ModelColumnAnno(
      comment = "消耗资源类型"
   )
   private int itemType;
   @ModelColumnAnno(
      comment = "消耗资源id"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "消耗资源数量"
   )
   private int itemNum;
   @ModelColumnAnno(
      comment = "解锁需合服后"
   )
   private int unlockCondition;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getNumber() {
      return this.number;
   }

   public void setNumber(int number) {
      this.checkModify();
      this.number = number;
   }

   public int getItemType() {
      return this.itemType;
   }

   public void setItemType(int itemType) {
      this.checkModify();
      this.itemType = itemType;
   }

   public int getItemId() {
      return this.itemId;
   }

   public void setItemId(int itemId) {
      this.checkModify();
      this.itemId = itemId;
   }

   public int getItemNum() {
      return this.itemNum;
   }

   public void setItemNum(int itemNum) {
      this.checkModify();
      this.itemNum = itemNum;
   }

   public int getUnlockCondition() {
      return this.unlockCondition;
   }

   public void setUnlockCondition(int unlockCondition) {
      this.checkModify();
      this.unlockCondition = unlockCondition;
   }
}
