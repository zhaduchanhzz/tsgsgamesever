package com.yy.duelWar;

import java.util.ArrayList;
import java.util.List;

public class DuelGuessData {
   public int round;
   public int group;
   public int bigGroup;
   public int midGroup;
   public int smallGroup;
   public int fightInx;
   public int leftId;
   public int rightId;
   public int leftPopularity;
   public int rightPopularity;
   public int winSide = -1;
   public List<PointFightResult> resultList = new ArrayList();

   public DuelGuessData() {
      this.resultList.addAll(this.getDefaultResult());
   }

   public List<PointFightResult> getDefaultResult() {
      List<PointFightResult> resultList = new ArrayList();

      for(int i = 0; i < 3; ++i) {
         PointFightResult tempResult = new PointFightResult();
         tempResult.inx = i + 1;
         tempResult.recordId = -1;
         tempResult.win = -1;
         tempResult.recordTime = 0;
         resultList.add(tempResult);
      }

      return resultList;
   }
}
