package com.gzbz.db.bean;

import com.gzbz.protobuf.SplendidCityMsg;
import java.util.HashSet;
import java.util.Set;

public class SplendidCityBuildData {
   public int buildId;
   public int lv;
   public Set<Integer> rewardLv = new HashSet();

   public SplendidCityMsg.GameBuilding.Builder buildMsg() {
      SplendidCityMsg.GameBuilding.Builder builder = SplendidCityMsg.GameBuilding.newBuilder();
      builder.setBuildId(this.buildId);
      builder.setLv(this.lv);
      builder.addAllRewardLv(this.rewardLv);
      return builder;
   }
}
