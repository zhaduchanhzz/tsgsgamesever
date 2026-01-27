package com.gzbz.db.bean;

import com.gzbz.protobuf.ChineseNewYearMsg;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChineseNewYearCityBuildData {
   public int buildId;
   public int lv;
   public Set<Integer> rewardLv = new HashSet();
   public int dailyChallengeNum;
   public List<SubjectData> subjectList = new ArrayList();

   public ChineseNewYearMsg.GameBuilding.Builder buildMsg() {
      ChineseNewYearMsg.GameBuilding.Builder builder = ChineseNewYearMsg.GameBuilding.newBuilder();
      builder.setBuildId(this.buildId);
      builder.setLv(this.lv);
      builder.addAllRewardLv(this.rewardLv);
      builder.setDailyChallengeNum(this.dailyChallengeNum);
      builder.addAllCompleteLv(this.rewardLv);
      return builder;
   }
}
