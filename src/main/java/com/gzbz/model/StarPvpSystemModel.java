package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "starPvpSystem"
)
public class StarPvpSystemModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "系统id"
   )
   private int systemId;
   @ModelColumnAnno(
      comment = "pvp场景"
   )
   private String mark;

   public int getSystemId() {
      return this.systemId;
   }

   public void setSystemId(int systemId) {
      this.checkModify();
      this.systemId = systemId;
   }

   public String getMark() {
      return this.mark;
   }

   public void setMark(String mark) {
      this.checkModify();
      this.mark = mark;
   }
}
