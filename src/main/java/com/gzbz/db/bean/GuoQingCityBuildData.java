package com.gzbz.db.bean;

import com.gzbz.protobuf.ActivityGuoQingMsg;
import java.util.HashSet;
import java.util.Set;

public class GuoQingCityBuildData {
   public int buildId;
   public int lv;
   public Set<Integer> rewardLv = new HashSet();

   public ActivityGuoQingMsg.GameBuilding.Builder buildMsg() {
      ActivityGuoQingMsg.GameBuilding.Builder builder = ActivityGuoQingMsg.GameBuilding.newBuilder();
      builder.setBuildId(this.buildId);
      builder.setLv(this.lv);
      builder.addAllRewardLv(this.rewardLv);
      return builder;
   }
}
