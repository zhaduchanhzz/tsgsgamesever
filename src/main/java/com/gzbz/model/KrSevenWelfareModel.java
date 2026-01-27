package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "KrSevenWelfare"
)
public class KrSevenWelfareModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "天数"
   )
   private int day;
   @ModelColumnAnno(
      columnName = "freeReward",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "免费奖励"
   )
   private List<ResourceModel> freeReward = new ArrayList();
   @ModelColumnAnno(
      columnName = "discount",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "折扣奖励"
   )
   private List<ResourceModel> discount = new ArrayList();
   @ModelColumnAnno(
      comment = "购买价格"
   )
   private int price;
   @ModelColumnAnno(
      comment = "原价"
   )
   private int originalPrice;

   public int getDay() {
      return this.day;
   }

   public void setDay(int day) {
      this.checkModify();
      this.day = day;
   }

   public List<ResourceModel> getFreeReward() {
      return this.freeReward;
   }

   public void setFreeReward(List<ResourceModel> freeReward) {
      this.checkModify();
      this.freeReward = freeReward;
   }

   public List<ResourceModel> getDiscount() {
      return this.discount;
   }

   public void setDiscount(List<ResourceModel> discount) {
      this.checkModify();
      this.discount = discount;
   }

   public int getPrice() {
      return this.price;
   }

   public void setPrice(int price) {
      this.checkModify();
      this.price = price;
   }

   public int getOriginalPrice() {
      return this.originalPrice;
   }

   public void setOriginalPrice(int originalPrice) {
      this.checkModify();
      this.originalPrice = originalPrice;
   }
}
