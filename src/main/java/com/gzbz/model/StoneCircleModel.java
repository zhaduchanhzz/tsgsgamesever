package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "stoneCircle"
)
public class StoneCircleModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "地块单位数"
   )
   private int grounUnit;
   @ModelColumnAnno(
      comment = "事件模块上限"
   )
   private int eventLimit;
   @ModelColumnAnno(
      comment = "单位地块事件上限"
   )
   private int unitEventLimit;
   @ModelColumnAnno(
      comment = "道具模块出现权重"
   )
   private int itemUnitWeight;
   @ModelColumnAnno(
      comment = "道具模块出现上限"
   )
   private int itemUnitLimit;
   @ModelColumnAnno(
      comment = "商店模块出现权重"
   )
   private int shopUnitWeight;
   @ModelColumnAnno(
      comment = "商店模块出现上限"
   )
   private int shopUnitLimt;
   @ModelColumnAnno(
      comment = "恢复模块出现权重"
   )
   private int recoverUnitWeight;
   @ModelColumnAnno(
      comment = "恢复模块出现上限"
   )
   private int recoverUnitLimt;
   @ModelColumnAnno(
      comment = "怪物模块出现权重"
   )
   private int monsterUnitWeight;
   @ModelColumnAnno(
      comment = "怪物模块出现上限"
   )
   private int monsterUnitLimt;
   @ModelColumnAnno(
      comment = "特殊模块出现权重"
   )
   private int specialUnitWeght;
   @ModelColumnAnno(
      comment = "特殊模块出现上限"
   )
   private int specialUnitLimit;
   @ModelColumnAnno(
      comment = "地图模块出现范围"
   )
   private String mapRange;
   @ModelColumnAnno(
      comment = "前一圈地块范围"
   )
   private String lastMapRange;
   @ModelColumnAnno(
      comment = "额外地块数量"
   )
   private int extraBlockNum;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGrounUnit() {
      return this.grounUnit;
   }

   public void setGrounUnit(int grounUnit) {
      this.checkModify();
      this.grounUnit = grounUnit;
   }

   public int getEventLimit() {
      return this.eventLimit;
   }

   public void setEventLimit(int eventLimit) {
      this.checkModify();
      this.eventLimit = eventLimit;
   }

   public int getUnitEventLimit() {
      return this.unitEventLimit;
   }

   public void setUnitEventLimit(int unitEventLimit) {
      this.checkModify();
      this.unitEventLimit = unitEventLimit;
   }

   public int getItemUnitWeight() {
      return this.itemUnitWeight;
   }

   public void setItemUnitWeight(int itemUnitWeight) {
      this.checkModify();
      this.itemUnitWeight = itemUnitWeight;
   }

   public int getItemUnitLimit() {
      return this.itemUnitLimit;
   }

   public void setItemUnitLimit(int itemUnitLimit) {
      this.checkModify();
      this.itemUnitLimit = itemUnitLimit;
   }

   public int getShopUnitWeight() {
      return this.shopUnitWeight;
   }

   public void setShopUnitWeight(int shopUnitWeight) {
      this.checkModify();
      this.shopUnitWeight = shopUnitWeight;
   }

   public int getShopUnitLimt() {
      return this.shopUnitLimt;
   }

   public void setShopUnitLimt(int shopUnitLimt) {
      this.checkModify();
      this.shopUnitLimt = shopUnitLimt;
   }

   public int getRecoverUnitWeight() {
      return this.recoverUnitWeight;
   }

   public void setRecoverUnitWeight(int recoverUnitWeight) {
      this.checkModify();
      this.recoverUnitWeight = recoverUnitWeight;
   }

   public int getRecoverUnitLimt() {
      return this.recoverUnitLimt;
   }

   public void setRecoverUnitLimt(int recoverUnitLimt) {
      this.checkModify();
      this.recoverUnitLimt = recoverUnitLimt;
   }

   public int getMonsterUnitWeight() {
      return this.monsterUnitWeight;
   }

   public void setMonsterUnitWeight(int monsterUnitWeight) {
      this.checkModify();
      this.monsterUnitWeight = monsterUnitWeight;
   }

   public int getMonsterUnitLimt() {
      return this.monsterUnitLimt;
   }

   public void setMonsterUnitLimt(int monsterUnitLimt) {
      this.checkModify();
      this.monsterUnitLimt = monsterUnitLimt;
   }

   public int getSpecialUnitWeght() {
      return this.specialUnitWeght;
   }

   public void setSpecialUnitWeght(int specialUnitWeght) {
      this.checkModify();
      this.specialUnitWeght = specialUnitWeght;
   }

   public int getSpecialUnitLimit() {
      return this.specialUnitLimit;
   }

   public void setSpecialUnitLimit(int specialUnitLimit) {
      this.checkModify();
      this.specialUnitLimit = specialUnitLimit;
   }

   public String getMapRange() {
      return this.mapRange;
   }

   public void setMapRange(String mapRange) {
      this.checkModify();
      this.mapRange = mapRange;
   }

   public int getExtraBlockNum() {
      return this.extraBlockNum;
   }

   public void setExtraBlockNum(int extraBlockNum) {
      this.checkModify();
      this.extraBlockNum = extraBlockNum;
   }

   public String getLastMapRange() {
      return this.lastMapRange;
   }

   public void setLastMapRange(String lastMapRange) {
      this.checkModify();
      this.lastMapRange = lastMapRange;
   }
}
