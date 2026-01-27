package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "auctionGodBeast"
)
public class MartAutoGodBeastModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "资质"
   )
   private int id;
   @ModelColumnAnno(
      comment = "起拍价下限"
   )
   private int startPriceMin;
   @ModelColumnAnno(
      comment = "起拍价上限"
   )
   private int startPriceMax;
   @ModelColumnAnno(
      comment = "一口价下限"
   )
   private int fixPriceMin;
   @ModelColumnAnno(
      comment = "一口价上限"
   )
   private int fixPriceMax;
   @ModelColumnAnno(
      comment = "推荐价"
   )
   private int recommendPrice;
   @ModelColumnAnno(
      comment = "每次竞价加价下限"
   )
   private int preBidPrice;
   @ModelColumnAnno(
      comment = "系统是否出价竞拍"
   )
   private int sysBid;
   @ModelColumnAnno(
      comment = "自动出价标准"
   )
   private int sysBidLow;

   public int getId() {
      return this.id;
   }

   public int getStartPriceMin() {
      return this.startPriceMin;
   }

   public int getStartPriceMax() {
      return this.startPriceMax;
   }

   public int getFixPriceMin() {
      return this.fixPriceMin;
   }

   public int getFixPriceMax() {
      return this.fixPriceMax;
   }

   public int getRecommendPrice() {
      return this.recommendPrice;
   }

   public int getPreBidPrice() {
      return this.preBidPrice;
   }

   public int getSysBid() {
      return this.sysBid;
   }

   public int getSysBidLow() {
      return this.sysBidLow;
   }
}
