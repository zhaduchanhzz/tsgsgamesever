package com.gzbz.db.bean;

import java.util.ArrayList;
import java.util.List;

public class FirstYearCityChallengeData {
   public int buildId;
   public int buildLv;
   public List<SubjectData> answerList = new ArrayList();
   public long lastCommitTime;

   public FirstYearCityChallengeData() {
   }

   public FirstYearCityChallengeData(int buildId, int buildLv) {
      this.buildId = buildId;
      this.buildLv = buildLv;
      this.answerList.clear();
      this.lastCommitTime = System.currentTimeMillis();
   }
}
