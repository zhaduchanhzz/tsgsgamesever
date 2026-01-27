package com.gzbz.godBeast.bean;

public class GodBeastHatchFloorData {
   private int quality;
   private int hatchNum;
   private int libId;

   public GodBeastHatchFloorData() {
   }

   public GodBeastHatchFloorData(int quality, int hatchNum, int libId) {
      this.quality = quality;
      this.hatchNum = hatchNum;
      this.libId = libId;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.quality = quality;
   }

   public int getHatchNum() {
      return this.hatchNum;
   }

   public void setHatchNum(int hatchNum) {
      this.hatchNum = hatchNum;
   }

   public int getLibId() {
      return this.libId;
   }

   public void setLibId(int libId) {
      this.libId = libId;
   }
}
