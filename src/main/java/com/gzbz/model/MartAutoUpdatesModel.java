package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "auctionAutomaticUpdates"
)
public class MartAutoUpdatesModel extends BaseModel {
   @ModelColumnAnno(
      comment = "珍稀程度组",
      isPrimaty = true
   )
   private int rareDegree;
   @ModelColumnAnno(
      comment = "周期内每2000人刷出数量"
   )
   private int getCountPre;
   @ModelColumnAnno(
      comment = "每次上架刷出占比"
   )
   private int preShelvesTimes;
   @ModelColumnAnno(
      comment = "重置周期"
   )
   private int countTimes;
   @ModelColumnAnno(
      comment = "刷新权重"
   )
   private int rate;
   @ModelColumnAnno(
      comment = "保底刷新次数"
   )
   private int limitnum;

   public int getRareDegree() {
      return this.rareDegree;
   }

   public int getGetCountPre() {
      return this.getCountPre;
   }

   public int getPreShelvesTimes() {
      return this.preShelvesTimes;
   }

   public int getCountTimes() {
      return this.countTimes;
   }

   public int getRate() {
      return this.rate;
   }

   public int getLimitnum() {
      return this.limitnum;
   }
}
