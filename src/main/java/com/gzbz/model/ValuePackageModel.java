package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "valuePackage"
)
public class ValuePackageModel extends BaseModel {
   @ModelColumnAnno(
      comment = "序号id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "礼包类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "礼包名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "下一级序号"
   )
   private int nextId;
   @ModelColumnAnno(
      comment = "礼包图标"
   )
   private int iconId;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 5,
      comment = "物品"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "disPrice",
      comment = "现价"
   )
   private int disPrice;
   @ModelColumnAnno(
      columnName = "oriPrice",
      comment = "原价"
   )
   private int oriPrice;
   @ModelColumnAnno(
      columnName = "autoReset",
      comment = "自动重置"
   )
   private int autoReset;
   @ModelColumnAnno(
      columnName = "lvLimit",
      comment = "开启等级"
   )
   private int lvLimit;
   @ModelColumnAnno(
      columnName = "awardId",
      comment = "赠送奖励id"
   )
   private int awardId;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getNextId() {
      return this.nextId;
   }

   public void setNextId(int nextId) {
      this.checkModify();
      this.nextId = nextId;
   }

   public int getIconId() {
      return this.iconId;
   }

   public void setIconId(int iconId) {
      this.checkModify();
      this.iconId = iconId;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getDisPrice() {
      return this.disPrice;
   }

   public void setDisPrice(int disPrice) {
      this.checkModify();
      this.disPrice = disPrice;
   }

   public int getOriPrice() {
      return this.oriPrice;
   }

   public void setOriPrice(int oriPrice) {
      this.checkModify();
      this.oriPrice = oriPrice;
   }

   public int getAutoReset() {
      return this.autoReset;
   }

   public void setAutoReset(int autoReset) {
      this.checkModify();
      this.autoReset = autoReset;
   }

   public int getLvLimit() {
      return this.lvLimit;
   }

   public void setLvLimit(int lvLimit) {
      this.checkModify();
      this.lvLimit = lvLimit;
   }

   public int getAwardId() {
      return this.awardId;
   }

   public void setAwardId(int awardId) {
      this.checkModify();
      this.awardId = awardId;
   }
}
