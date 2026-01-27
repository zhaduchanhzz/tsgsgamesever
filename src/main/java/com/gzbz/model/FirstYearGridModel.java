package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FristYearGrid"
)
public class FirstYearGridModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      columnName = "gridID"
   )
   private int gridId;
   @ModelColumnAnno(
      columnName = "eventID"
   )
   private int eventId;
   @ModelColumnAnno(
      comment = "事件参数",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> param = new ArrayList();

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

   public List<Integer> getParam() {
      return this.param;
   }

   public void setParam(List<Integer> param) {
      this.checkModify();
      this.param = param;
   }
}
