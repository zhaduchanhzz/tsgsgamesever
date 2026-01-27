package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "importGift"
)
public class ImportGiftModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int playerId;
   @ModelColumnAnno
   private int giftId;

   public int getPlayerId() {
      return this.playerId;
   }

   public void setPlayerId(int playerId) {
      this.playerId = playerId;
   }

   public int getGiftId() {
      return this.giftId;
   }

   public void setGiftId(int giftId) {
      this.giftId = giftId;
   }
}
