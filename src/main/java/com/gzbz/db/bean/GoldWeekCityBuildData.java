package com.gzbz.db.bean;

import com.gzbz.protobuf.ActGoldWeekMsg;
import java.util.HashSet;
import java.util.Set;

public class GoldWeekCityBuildData {
   public int buildId;
   public int lv;
   public Set<Integer> rewardLv = new HashSet();

   public ActGoldWeekMsg.GameBuilding.Builder buildMsg() {
      ActGoldWeekMsg.GameBuilding.Builder builder = ActGoldWeekMsg.GameBuilding.newBuilder();
      builder.setBuildId(this.buildId);
      builder.setLv(this.lv);
      builder.addAllRewardLv(this.rewardLv);
      return builder;
   }
}
