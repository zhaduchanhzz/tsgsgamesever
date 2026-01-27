package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "handbookpage"
)
public class HandBookPageModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "界面ID"
   )
   private int pageid;
   @ModelColumnAnno(
      comment = "解锁等级"
   )
   private int pagelv;
   @ModelColumnAnno(
      comment = "任务id",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> task = new ArrayList();

   public int getPageid() {
      return this.pageid;
   }

   public void setPageid(int pageid) {
      this.checkModify();
      this.pageid = pageid;
   }

   public int getPagelv() {
      return this.pagelv;
   }

   public void setPagelv(int pagelv) {
      this.checkModify();
      this.pagelv = pagelv;
   }

   public List<Integer> getTask() {
      return this.task;
   }

   public void setTask(List<Integer> task) {
      this.checkModify();
      this.task = task;
   }
}
