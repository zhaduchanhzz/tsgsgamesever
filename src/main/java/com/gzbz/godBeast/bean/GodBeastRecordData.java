package com.gzbz.godBeast.bean;

public class GodBeastRecordData {
   public int godBeastId;
   public long recTime;
   public int scoreId;

   public GodBeastRecordData() {
   }

   public GodBeastRecordData(int godBeastId, long recTime, int scoreId) {
      this.godBeastId = godBeastId;
      this.recTime = recTime;
      this.scoreId = scoreId;
   }
}
