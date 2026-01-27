package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "auctionGodBeastNeiDan"
)
public class AuctionGodBeastNeiDanModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "灵兽品质"
   )
   private int quality;
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

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getStartPriceMin() {
      return this.startPriceMin;
   }

   public void setStartPriceMin(int startPriceMin) {
      this.checkModify();
      this.startPriceMin = startPriceMin;
   }

   public int getStartPriceMax() {
      return this.startPriceMax;
   }

   public void setStartPriceMax(int startPriceMax) {
      this.checkModify();
      this.startPriceMax = startPriceMax;
   }

   public int getFixPriceMin() {
      return this.fixPriceMin;
   }

   public void setFixPriceMin(int fixPriceMin) {
      this.checkModify();
      this.fixPriceMin = fixPriceMin;
   }

   public int getFixPriceMax() {
      return this.fixPriceMax;
   }

   public void setFixPriceMax(int fixPriceMax) {
      this.checkModify();
      this.fixPriceMax = fixPriceMax;
   }

   public int getPreBidPrice() {
      return this.preBidPrice;
   }

   public void setPreBidPrice(int preBidPrice) {
      this.checkModify();
      this.preBidPrice = preBidPrice;
   }

   public int getSysBid() {
      return this.sysBid;
   }

   public void setSysBid(int sysBid) {
      this.checkModify();
      this.sysBid = sysBid;
   }

   public int getSysBidLow() {
      return this.sysBidLow;
   }

   public void setSysBidLow(int sysBidLow) {
      this.checkModify();
      this.sysBidLow = sysBidLow;
   }
}
