package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "ExclusiveWeaponStarLv"
)
public class ExclusiveWeaponStarLvModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "幻武品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "星级上限"
   )
   private int starLimit;
   @ModelColumnAnno(
      comment = "强化等级上限"
   )
   private int levelMax;
   @ModelColumnAnno(
      comment = "能否分解为强化材料"
   )
   private int isExchange;
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      comment = "1级能分解强化材料"
   )
   private ArrayList<Integer> exchangeMaterial = new ArrayList();

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getStarLimit() {
      return this.starLimit;
   }

   public void setStarLimit(int starLimit) {
      this.checkModify();
      this.starLimit = starLimit;
   }

   public int getLevelMax() {
      return this.levelMax;
   }

   public void setLevelMax(int levelMax) {
      this.checkModify();
      this.levelMax = levelMax;
   }

   public int getIsExchange() {
      return this.isExchange;
   }

   public void setIsExchange(int isExchange) {
      this.checkModify();
      this.isExchange = isExchange;
   }

   public ArrayList<Integer> getExchangeMaterial() {
      return this.exchangeMaterial;
   }

   public void setExchangeMaterial(ArrayList<Integer> exchangeMaterial) {
      this.checkModify();
      this.exchangeMaterial = exchangeMaterial;
   }
}
