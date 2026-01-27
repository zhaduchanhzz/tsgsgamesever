package com.yy.duelWar;

import java.util.ArrayList;
import java.util.List;

public class DuelRecordInfo {
   public int fightInx;
   public int recordId;
   public int recordTIme;
   public int win = -1;
   public List<DuelRcordHeroData> leftHero = new ArrayList();
   public List<DuelRcordHeroData> rightHero = new ArrayList();
   public long leftPower;
   public long rightPower;
}
