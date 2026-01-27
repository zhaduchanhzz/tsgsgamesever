package com.yy.countryWar.bean;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CountryWarMsg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryPlayerData {
   public int playerId;
   public int mainServerId;
   public int subServerId;
   public int cityId;
   public List<ResourceModel> rewards = new ArrayList();
   public Map<Integer, Long> randomSurplusTime = new HashMap();
   public Map<Integer, Long> citySurplusTime = new HashMap();
   public byte[] playerArraying = null;
   public int cityNum;
   public int skills;
   public long damages;
   public boolean isOnline = false;
   public long transferColdEndTime;
   public int conDefNum;
   public int skillTime;
   public int cityTime;
   public boolean allowTransfer = true;
   public boolean sameUnionTransfer = true;
   public List<TransferRecord> transferRecord = new ArrayList();

   public CountryWarMsg.CountryWarRankInfo.Builder toBuilder(int rank, String playerName) {
      CountryWarMsg.CountryWarRankInfo.Builder builder = CountryWarMsg.CountryWarRankInfo.newBuilder();
      builder.setRank(rank);
      builder.setServerId(this.mainServerId);
      builder.setCityNum(this.cityNum);
      builder.setPlayerNam(playerName);
      builder.setSkills(this.skills);
      builder.setDamages(this.damages);
      return builder;
   }
}
