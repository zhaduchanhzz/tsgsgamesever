package com.yy.countryWar.bean;

import com.gzbz.protobuf.CountryWarMsg;

public class CountryWarLogInfo {
   public int type;
   public int attPlayer;
   public String attPlayerName;
   public int attServerId;
   public int city;
   public int cityType;
   public boolean isFight;
   public boolean isFightWin;
   public boolean isOccupy;
   public int defPlayer;
   public String defPlayerName;
   public int defServerId;
   public long createTime;
   public boolean isTransfer;
   public boolean isPofang;

   public CountryWarMsg.CountryWarLogInfo.Builder toBuilder() {
      CountryWarMsg.CountryWarLogInfo.Builder builder = CountryWarMsg.CountryWarLogInfo.newBuilder();
      builder.setType(this.type);
      builder.setCreateTime((int)(this.createTime / 1000L));
      if (this.type == 1) {
         builder.setAttServerId(this.attServerId);
      } else if (this.type == 3) {
         builder.setAttPlayer(this.attPlayer);
         builder.setAttServerId(this.attServerId);
         builder.setCity(this.city);
         builder.setIsFight(this.isFight);
         builder.setIsFightWin(this.isFightWin);
         builder.setIsOccupy(this.isOccupy);
         builder.setDefPlayer(this.defPlayer);
         builder.setDefServerId(this.defServerId);
         builder.setAttPlayerName(this.attPlayerName);
         builder.setDefPlayerName(this.defPlayerName);
         builder.setIsBeTransfer(this.isTransfer);
         builder.setIsPofang(this.isPofang);
      } else if (this.type == 4) {
         builder.setDefPlayer(this.defPlayer);
         builder.setDefServerId(this.defServerId);
         builder.setDefPlayerName(this.defPlayerName);
      }

      return builder;
   }
}
