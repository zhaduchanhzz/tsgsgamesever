package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "ChunJieMonopolyMap"
)
public class ChineseNewYearMonopolyMapModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "gridID"
   )
   private int gridId;
   @ModelColumnAnno(
      columnName = "eventID"
   )
   private int eventId;

   public int getGridId() {
      return this.gridId;
   }

   public void setGridId(int gridId) {
      this.checkModify();
      this.gridId = gridId;
   }

   public int getEventId() {
      return this.eventId;
   }

   public void setEventId(int eventId) {
      this.checkModify();
      this.eventId = eventId;
   }
}
