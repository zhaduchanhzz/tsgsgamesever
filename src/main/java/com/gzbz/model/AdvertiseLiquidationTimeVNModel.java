package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "advertiseLiquidationTimeVN"
)
public class AdvertiseLiquidationTimeVNModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "唯一标识id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "系统id"
   )
   private int systemId;
   @ModelColumnAnno(
      comment = "广告次数"
   )
   private int timeNumber;
   @ModelColumnAnno(
      comment = "关联免费福利id,对应FreeWelfare表的id"
   )
   private int freeWelfareId;

   public int getTimeNumber() {
      return this.timeNumber;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public void setTimeNumber(int timeNumber) {
      this.checkModify();
      this.timeNumber = timeNumber;
   }

   public int getSystemId() {
      return this.systemId;
   }

   public void setSystemId(int systemId) {
      this.checkModify();
      this.systemId = systemId;
   }

   public int getFreeWelfareId() {
      return this.freeWelfareId;
   }

   public void setFreeWelfareId(int freeWelfareId) {
      this.checkModify();
      this.freeWelfareId = freeWelfareId;
   }
}
