package com.gzbz.model;

import com.gzbz.model.fun.UnionDailyGuessEventFun;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "unionGateGridEvent"
)
public class UnionDailyGuessGridEventModel extends BaseModel {
   @ModelColumnAnno(
      comment = "事件id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "备注"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "具体事件",
      columnConvertType = 1,
      subCls = UnionDailyGuessEventFun.class,
      count = 5
   )
   private List<UnionDailyGuessEventFun> event = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public List<UnionDailyGuessEventFun> getEvent() {
      return this.event;
   }

   public void setEvent(List<UnionDailyGuessEventFun> event) {
      this.checkModify();
      this.event = event;
   }
}
