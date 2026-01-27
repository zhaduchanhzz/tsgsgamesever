package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "unionGateMapicon"
)
public class UnionDailyGuessMapIconModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "地形组"
   )
   private int group;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int gridType;
   @ModelColumnAnno(
      comment = "icon"
   )
   private String icon;
   @ModelColumnAnno(
      comment = "描述"
   )
   private String desc;

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

   public int getGridType() {
      return this.gridType;
   }

   public void setGridType(int gridType) {
      this.checkModify();
      this.gridType = gridType;
   }

   public String getIcon() {
      return this.icon;
   }

   public void setIcon(String icon) {
      this.checkModify();
      this.icon = icon;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
