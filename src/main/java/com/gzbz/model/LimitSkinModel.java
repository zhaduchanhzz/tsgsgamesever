package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "limitSkin"
)
public class LimitSkinModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "皮肤id"
   )
   private int dressId;
   @ModelColumnAnno(
      comment = "礼包id"
   )
   private int giftBagId;

   public int getDressId() {
      return this.dressId;
   }

   public int getGiftBagId() {
      return this.giftBagId;
   }
}
