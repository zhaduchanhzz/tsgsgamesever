package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "onehundredStrokesJP"
)
public class HundredStrokesJPModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "在线时长(分钟)"
   )
   private int onlineTime;
   @ModelColumnAnno(
      comment = "十连抽次数"
   )
   private int tenDrawNum;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getOnlineTime() {
      return this.onlineTime;
   }

   public void setOnlineTime(int onlineTime) {
      this.checkModify();
      this.onlineTime = onlineTime;
   }

   public int getTenDrawNum() {
      return this.tenDrawNum;
   }

   public void setTenDrawNum(int tenDrawNum) {
      this.checkModify();
      this.tenDrawNum = tenDrawNum;
   }
}
