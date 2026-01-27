package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "mine"
)
public class MineModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "矿山id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "矿山名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "矿山类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "事件出发组"
   )
   private int group;
   @ModelColumnAnno(
      comment = "事件id"
   )
   private int eventId;
   @ModelColumnAnno(
      comment = "概率比重"
   )
   private int odd;
   @ModelColumnAnno(
      comment = "矿山图标"
   )
   private int iconId;
   @ModelColumnAnno(
      comment = "前置矿山"
   )
   private int preHillId;
   @ModelColumnAnno(
      comment = "特殊事件触发组"
   )
   private int sp_group;
   @ModelColumnAnno(
      comment = "特殊事件事件id"
   )
   private int sp_eventId;
   @ModelColumnAnno(
      comment = "概率比重"
   )
   private int sp_odd;

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.quality = quality;
   }

   public int getIconId() {
      return this.iconId;
   }

   public void setIconId(int iconId) {
      this.iconId = iconId;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.type = type;
   }

   public int getGroup() {
      return this.group;
   }

   public void setGroup(int group) {
      this.group = group;
   }

   public int getEventId() {
      return this.eventId;
   }

   public void setEventId(int eventId) {
      this.eventId = eventId;
   }

   public int getOdd() {
      return this.odd;
   }

   public void setOdd(int odd) {
      this.odd = odd;
   }

   public int getPreHillId() {
      return this.preHillId;
   }

   public void setPreHillId(int preHillId) {
      this.preHillId = preHillId;
   }

   public int getSp_group() {
      return this.sp_group;
   }

   public void setSp_group(int sp_group) {
      this.checkModify();
      this.sp_group = sp_group;
   }

   public int getSp_eventId() {
      return this.sp_eventId;
   }

   public void setSp_eventId(int sp_eventId) {
      this.checkModify();
      this.sp_eventId = sp_eventId;
   }

   public int getSp_odd() {
      return this.sp_odd;
   }

   public void setSp_odd(int sp_odd) {
      this.checkModify();
      this.sp_odd = sp_odd;
   }
}
