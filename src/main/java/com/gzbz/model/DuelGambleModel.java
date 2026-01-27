package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "wudaoGamble"
)
public class DuelGambleModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "下注类型 1铜钱2元宝"
   )
   private int type;
   @ModelColumnAnno(
      comment = "赛区类型"
   )
   private int zoneType;
   @ModelColumnAnno(
      comment = "竞猜阶段"
   )
   private int section;
   @ModelColumnAnno(
      comment = "下注消耗道具类型"
   )
   private int itemstype;
   @ModelColumnAnno(
      comment = "下注消耗道具id"
   )
   private int itemsid;
   @ModelColumnAnno(
      comment = "下注消耗道具数"
   )
   private int itemsvalue;
   @ModelColumnAnno(
      comment = "压中奖励"
   )
   private int award1;
   @ModelColumnAnno(
      comment = "押错奖励"
   )
   private int award2;
   @ModelColumnAnno(
      comment = "翻盘奖励"
   )
   private int award3;

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

   public int getSection() {
      return this.section;
   }

   public void setSection(int section) {
      this.checkModify();
      this.section = section;
   }

   public int getItemstype() {
      return this.itemstype;
   }

   public void setItemstype(int itemstype) {
      this.checkModify();
      this.itemstype = itemstype;
   }

   public int getItemsid() {
      return this.itemsid;
   }

   public void setItemsid(int itemsid) {
      this.checkModify();
      this.itemsid = itemsid;
   }

   public int getItemsvalue() {
      return this.itemsvalue;
   }

   public void setItemsvalue(int itemsvalue) {
      this.checkModify();
      this.itemsvalue = itemsvalue;
   }

   public int getAward1() {
      return this.award1;
   }

   public void setAward1(int award1) {
      this.checkModify();
      this.award1 = award1;
   }

   public int getAward2() {
      return this.award2;
   }

   public void setAward2(int award2) {
      this.checkModify();
      this.award2 = award2;
   }

   public int getAward3() {
      return this.award3;
   }

   public void setAward3(int award3) {
      this.checkModify();
      this.award3 = award3;
   }

   public int getZoneType() {
      return this.zoneType;
   }

   public void setZoneType(int zoneType) {
      this.checkModify();
      this.zoneType = zoneType;
   }
}
