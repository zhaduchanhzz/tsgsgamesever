package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "GodBeastFloor"
)
public class GodBeastFloorModel extends BaseModel {
   @ModelColumnAnno(
      comment = "品质",
      isPrimaty = true
   )
   private int quality;
   @ModelColumnAnno(
      comment = "触发保底需抽取次数"
   )
   private int extractTimes;
   @ModelColumnAnno(
      comment = "保底基数人数X"
   )
   private int baseNum;
   @ModelColumnAnno(
      comment = "周期内每X人保底基数"
   )
   private int baseTimes;
   @ModelColumnAnno(
      comment = "触发保底时的随机库id"
   )
   private int HatchLibId;

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getExtractTimes() {
      return this.extractTimes;
   }

   public void setExtractTimes(int extractTimes) {
      this.checkModify();
      this.extractTimes = extractTimes;
   }

   public int getBaseNum() {
      return this.baseNum;
   }

   public void setBaseNum(int baseNum) {
      this.checkModify();
      this.baseNum = baseNum;
   }

   public int getBaseTimes() {
      return this.baseTimes;
   }

   public void setBaseTimes(int baseTimes) {
      this.checkModify();
      this.baseTimes = baseTimes;
   }

   public int getHatchLibId() {
      return this.HatchLibId;
   }

   public void setHatchLibId(int hatchLibId) {
      this.checkModify();
      this.HatchLibId = hatchLibId;
   }
}
