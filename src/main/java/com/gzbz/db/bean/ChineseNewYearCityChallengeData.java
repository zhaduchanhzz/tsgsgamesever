package com.gzbz.db.bean;

import java.util.ArrayList;
import java.util.List;

public class ChineseNewYearCityChallengeData {
   public int buildId;
   public int buildLv;
   public List<SubjectData> answerList = new ArrayList();
   public long lastCommitTime;

   public ChineseNewYearCityChallengeData() {
   }

   public ChineseNewYearCityChallengeData(int buildId, int buildLv) {
      this.buildId = buildId;
      this.buildLv = buildLv;
      this.answerList.clear();
      this.lastCommitTime = System.currentTimeMillis();
   }
}
