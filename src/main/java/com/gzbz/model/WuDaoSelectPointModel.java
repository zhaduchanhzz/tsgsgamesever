package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "wudaoSelectPoint"
)
public class WuDaoSelectPointModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "名次"
   )
   private int id;
   @ModelColumnAnno(
      comment = "积分获得"
   )
   private int point;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getPoint() {
      return this.point;
   }

   public void setPoint(int point) {
      this.checkModify();
      this.point = point;
   }
}
