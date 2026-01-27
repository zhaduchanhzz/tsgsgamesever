package com.gzbz.model;

import com.gzbz.model.fun.ExpeditionEventFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "expeditionGridEvent"
)
public class ExpeditionGridEventModel extends BaseModel {
   @ModelColumnAnno(
      comment = "事件id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "具体事件",
      columnConvertType = 1,
      subCls = ExpeditionEventFun.class,
      count = 5
   )
   private List<ExpeditionEventFun> event = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<ExpeditionEventFun> getEvent() {
      return this.event;
   }

   public void setEvent(List<ExpeditionEventFun> event) {
      this.checkModify();
      this.event = event;
   }
}
