package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "mineEvent"
)
public class MineEventModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "事件id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "事件名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "事件描述"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "事件额外掉落组"
   )
   private int dropOutId;
   @ModelColumnAnno(
      comment = "事件额外掉落概率"
   )
   private int dropOutOdd;
   @ModelColumnAnno(
      comment = "事件判定间隔时间"
   )
   private int dropOutTime;
   @ModelColumnAnno(
      comment = "事件图标道具id"
   )
   private int iconId;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.type = type;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.desc = desc;
   }

   public int getDropOutId() {
      return this.dropOutId;
   }

   public void setDropOutId(int dropOutId) {
      this.dropOutId = dropOutId;
   }

   public int getDropOutOdd() {
      return this.dropOutOdd;
   }

   public void setDropOutOdd(int dropOutOdd) {
      this.dropOutOdd = dropOutOdd;
   }

   public int getDropOutTime() {
      return this.dropOutTime;
   }

   public void setDropOutTime(int dropOutTime) {
      this.dropOutTime = dropOutTime;
   }

   public int getIconId() {
      return this.iconId;
   }

   public void setIconId(int iconId) {
      this.iconId = iconId;
   }
}
