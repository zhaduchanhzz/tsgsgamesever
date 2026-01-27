package com.yy.countryWar.bean;

import com.gzbz.protobuf.CountryWarMsg;
import java.util.ArrayList;
import java.util.List;

public class CountryMainServerData {
   public int mainServerId;
   public int totalScore;
   public List<TransferRecord> transferRecord = new ArrayList();

   public CountryWarMsg.CountryWarRankInfo.Builder toBuilder(int rank, int cityNum, int hourScore) {
      CountryWarMsg.CountryWarRankInfo.Builder builder = CountryWarMsg.CountryWarRankInfo.newBuilder();
      builder.setRank(rank);
      builder.setServerId(this.mainServerId);
      builder.setScore(this.totalScore);
      builder.setHourScore(hourScore);
      builder.setCityNum(cityNum);
      return builder;
   }
}
