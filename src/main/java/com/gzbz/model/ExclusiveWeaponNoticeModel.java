package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "ExclusiveWeaponNotice"
)
public class ExclusiveWeaponNoticeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "解锁等级"
   )
   private int unlockLv;
   @ModelColumnAnno(
      comment = "下一个id"
   )
   private int nextId;
   @ModelColumnAnno(
      comment = "解锁判定道具类型"
   )
   private int extraItemType;
   @ModelColumnAnno(
      comment = "解锁判定道具id"
   )
   private int extraItemId;
   @ModelColumnAnno(
      comment = "解锁判定道具数量"
   )
   private int extraItemValue;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "奖励"
   )
   private ArrayList<ResourceModel> items = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getUnlockLv() {
      return this.unlockLv;
   }

   public void setUnlockLv(int unlockLv) {
      this.checkModify();
      this.unlockLv = unlockLv;
   }

   public int getNextId() {
      return this.nextId;
   }

   public void setNextId(int nextId) {
      this.checkModify();
      this.nextId = nextId;
   }

   public int getExtraItemType() {
      return this.extraItemType;
   }

   public void setExtraItemType(int extraItemType) {
      this.checkModify();
      this.extraItemType = extraItemType;
   }

   public int getExtraItemId() {
      return this.extraItemId;
   }

   public void setExtraItemId(int extraItemId) {
      this.checkModify();
      this.extraItemId = extraItemId;
   }

   public int getExtraItemValue() {
      return this.extraItemValue;
   }

   public void setExtraItemValue(int extraItemValue) {
      this.checkModify();
      this.extraItemValue = extraItemValue;
   }

   public ArrayList<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(ArrayList<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }
}
