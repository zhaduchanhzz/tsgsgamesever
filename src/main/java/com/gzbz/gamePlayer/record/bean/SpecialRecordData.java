package com.gzbz.gamePlayer.record.bean;

import java.util.LinkedHashMap;

public class SpecialRecordData {
   public long recordId;
   public byte[] stream;
   public long powerDif;
   public LinkedHashMap<Integer, Integer> nationCountMap;

   public SpecialRecordData(long recordId, byte[] stream) {
      this.recordId = recordId;
      this.stream = stream;
   }
}
