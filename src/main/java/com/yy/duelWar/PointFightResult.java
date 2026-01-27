package com.yy.duelWar;

import java.util.ArrayList;
import java.util.List;

public class PointFightResult {
   public int inx;
   public int recordId;
   public int recordTime;
   public int win;
   public List<DuelRcordHeroData> leftHero = new ArrayList();
   public List<DuelRcordHeroData> rightHero = new ArrayList();
   public long leftPower;
   public long rightPower;
}
