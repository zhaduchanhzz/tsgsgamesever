package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warHorseStableIntegral"
)
public class WarHorseStableIntegralModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "阶段id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "宝箱id"
   )
   private int boxId;
   @ModelColumnAnno(
      comment = "需要达到积分"
   )
   private int needPoint;
   @ModelColumnAnno(
      comment = "领取消耗积分"
   )
   private int consumePoint;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getBoxId() {
      return this.boxId;
   }

   public void setBoxId(int boxId) {
      this.checkModify();
      this.boxId = boxId;
   }

   public int getNeedPoint() {
      return this.needPoint;
   }

   public void setNeedPoint(int needPoint) {
      this.checkModify();
      this.needPoint = needPoint;
   }

   public int getConsumePoint() {
      return this.consumePoint;
   }

   public void setConsumePoint(int consumePoint) {
      this.checkModify();
      this.consumePoint = consumePoint;
   }
}
