package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "unionGateMap"
)
public class UnionDailyGuessMapModel extends BaseModel {
   @ModelColumnAnno(
      comment = "序号",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "格子id"
   )
   private int gridId;
   @ModelColumnAnno(
      comment = "坐标x"
   )
   private int gridx;
   @ModelColumnAnno(
      comment = "坐标y"
   )
   private int gridy;
   @ModelColumnAnno(
      comment = "格子类型"
   )
   private int gridType;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "格子事件"
   )
   private int gridEventId;
   @ModelColumnAnno(
      comment = "转换后格子事件"
   )
   private int changeEventId;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGridId() {
      return this.gridId;
   }

   public void setGridId(int gridId) {
      this.checkModify();
      this.gridId = gridId;
   }

   public int getGridx() {
      return this.gridx;
   }

   public void setGridx(int gridx) {
      this.checkModify();
      this.gridx = gridx;
   }

   public int getGridy() {
      return this.gridy;
   }

   public void setGridy(int gridy) {
      this.checkModify();
      this.gridy = gridy;
   }

   public int getGridType() {
      return this.gridType;
   }

   public void setGridType(int gridType) {
      this.checkModify();
      this.gridType = gridType;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public int getGridEventId() {
      return this.gridEventId;
   }

   public void setGridEventId(int gridEventId) {
      this.gridEventId = gridEventId;
   }

   public int getChangeEventId() {
      return this.changeEventId;
   }

   public void setChangeEventId(int changeEventId) {
      this.changeEventId = changeEventId;
   }
}
