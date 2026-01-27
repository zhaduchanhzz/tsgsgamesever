package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "shopWarcraftLib"
)
public class ShopWarcraftLibModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "groupId",
      comment = "组id"
   )
   private int groupId;
   @ModelColumnAnno(
      columnName = "shopItem",
      comment = "物品或武将"
   )
   private int shopItem;
   @ModelColumnAnno(
      columnName = "weight",
      comment = "比重"
   )
   private int weight;
   @ModelColumnAnno(
      columnName = "worldlvLimit",
      comment = "世界等级"
   )
   private int worldlvLimit;
   @ModelColumnAnno(
      columnName = "lvLimit",
      comment = "开启等级"
   )
   private int lvLimit;
   @ModelColumnAnno(
      columnName = "lvLimitEx",
      comment = "强制开启等级"
   )
   private int lvLimitEx;
   @ModelColumnAnno(
      columnName = "desc",
      comment = "备注"
   )
   private String desc;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGroupId() {
      return this.groupId;
   }

   public void setGroupId(int groupId) {
      this.checkModify();
      this.groupId = groupId;
   }

   public int getShopItem() {
      return this.shopItem;
   }

   public void setShopItem(int shopItem) {
      this.checkModify();
      this.shopItem = shopItem;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public int getWorldlvLimit() {
      return this.worldlvLimit;
   }

   public void setWorldlvLimit(int worldlvLimit) {
      this.checkModify();
      this.worldlvLimit = worldlvLimit;
   }

   public int getLvLimit() {
      return this.lvLimit;
   }

   public void setLvLimit(int lvLimit) {
      this.checkModify();
      this.lvLimit = lvLimit;
   }

   public int getLvLimitEx() {
      return this.lvLimitEx;
   }

   public void setLvLimitEx(int lvLimitEx) {
      this.checkModify();
      this.lvLimitEx = lvLimitEx;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
