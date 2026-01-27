package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "ZhenYuShopDetails"
)
public class ZhenYuShopDetailsModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "开服天数组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "开服天数组末尾"
   )
   private int dateEnd;
   @ModelColumnAnno(
      comment = "道具id"
   )
   private int itemId;
   @ModelColumnAnno(
      comment = "数量"
   )
   private int quantity;
   @ModelColumnAnno(
      comment = "价格"
   )
   private int price;
   @ModelColumnAnno(
      comment = "限购次数"
   )
   private int limitBuyFrequency;
   @ModelColumnAnno(
      comment = "资源类型"
   )
   private int resourceType;
   @ModelColumnAnno(
      comment = "资源id"
   )
   private int resourceId;

   public int getId() {
      return this.id;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }

   public int getItemId() {
      return this.itemId;
   }

   public int getQuantity() {
      return this.quantity;
   }

   public int getPrice() {
      return this.price;
   }

   public int getLimitBuyFrequency() {
      return this.limitBuyFrequency;
   }

   public int getResourceType() {
      return this.resourceType;
   }

   public int getResourceId() {
      return this.resourceId;
   }

   public boolean theDayInRegion(int signDay) {
      return signDay >= this.dateStart && (this.dateEnd < this.dateStart || signDay <= this.dateEnd);
   }
}
