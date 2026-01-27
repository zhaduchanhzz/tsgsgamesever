package com.yy.duelWar;

import java.util.ArrayList;
import java.util.List;

public class DuelFightRecordData {
   public int leftId;
   public int rightId;
   public int winSide = -1;
   public int stage;
   public int round;
   public List<DuelRecordInfo> recordInfo = new ArrayList();
   public int leftRank;
   public int rightRank;
}
