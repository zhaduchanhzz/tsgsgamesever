package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "unionLog"
)
public class UnionLogModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "日志id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "日志类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "文字描述"
   )
   private String desc;
   @ModelColumnAnno(
      comment = "记录日志时间备注"
   )
   private String timeStamp;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }

   public String getTimeStamp() {
      return this.timeStamp;
   }

   public void setTimeStamp(String timeStamp) {
      this.checkModify();
      this.timeStamp = timeStamp;
   }
}
