package com.yy.duelWar;

import java.util.ArrayList;
import java.util.List;

public class DuelFightData {
   public int round;
   public int group;
   public int inx;
   public int bigGroup;
   public int midGroup;
   public int smallGroup;
   public int leftId;
   public int rightId;
   public List<PointFightResult> resultList = new ArrayList();
   public int winSide = -1;
   public int zoneType = 1;
   public Boolean extraFight = false;

   public DuelFightData() {
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
