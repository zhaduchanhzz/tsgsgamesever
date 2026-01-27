package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "shiyiSpecialOffer"
)
public class ShiyiSpecialOfferModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "最低指定金额"
   )
   private int lowMoney;
   @ModelColumnAnno(
      comment = "最高指定金额"
   )
   private int maxMoney;
   @ModelColumnAnno(
      comment = "满减金额"
   )
   private int discount;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getLowMoney() {
      return this.lowMoney;
   }

   public void setLowMoney(int lowMoney) {
      this.checkModify();
      this.lowMoney = lowMoney;
   }

   public int getMaxMoney() {
      return this.maxMoney;
   }

   public void setMaxMoney(int maxMoney) {
      this.checkModify();
      this.maxMoney = maxMoney;
   }

   public int getDiscount() {
      return this.discount;
   }

   public void setDiscount(int discount) {
      this.checkModify();
      this.discount = discount;
   }
}
