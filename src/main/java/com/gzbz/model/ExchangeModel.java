package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "exchange"
)
public class ExchangeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "兑换类型"
   )
   private int group;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;
   @ModelColumnAnno(
      columnName = "obtainType",
      comment = "获得的物品类型"
   )
   private int obtainType;
   @ModelColumnAnno(
      columnName = "obtainId",
      comment = "获得的物品id"
   )
   private int obtainId;
   @ModelColumnAnno(
      columnName = "obtainNum",
      comment = "获得的物品数量"
   )
   private int obtainNum;
   @ModelColumnAnno(
      comment = "玩家等级需求"
   )
   private int levelNeed;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGroup() {
      return this.group;
   }

   public void setGroup(int group) {
      this.checkModify();
      this.group = group;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public int getObtainType() {
      return this.obtainType;
   }

   public void setObtainType(int obtainType) {
      this.checkModify();
      this.obtainType = obtainType;
   }

   public int getObtainId() {
      return this.obtainId;
   }

   public void setObtainId(int obtainId) {
      this.checkModify();
      this.obtainId = obtainId;
   }

   public int getObtainNum() {
      return this.obtainNum;
   }

   public void setObtainNum(int obtainNum) {
      this.checkModify();
      this.obtainNum = obtainNum;
   }

   public int getLevelNeed() {
      return this.levelNeed;
   }

   public void setLevelNeed(int levelNeed) {
      this.levelNeed = levelNeed;
   }
}
