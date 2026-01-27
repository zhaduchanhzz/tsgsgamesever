package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "offerShoplv"
)
public class OfferShopLvModel extends BaseModel {
   @ModelColumnAnno(
      comment = "悬赏商店等级",
      isPrimaty = true
   )
   private int level;
   @ModelColumnAnno(
      comment = "当前等级经验下限"
   )
   private int minNum;
   @ModelColumnAnno(
      comment = "当前等级经验上限"
   )
   private int maxNum;

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.checkModify();
      this.level = level;
   }

   public int getMinNum() {
      return this.minNum;
   }

   public void setMinNum(int minNum) {
      this.checkModify();
      this.minNum = minNum;
   }

   public int getMaxNum() {
      return this.maxNum;
   }

   public void setMaxNum(int maxNum) {
      this.checkModify();
      this.maxNum = maxNum;
   }
}
