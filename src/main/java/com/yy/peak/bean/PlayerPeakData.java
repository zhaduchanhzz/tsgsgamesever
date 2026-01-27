package com.yy.peak.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerPeakData {
   public int playerId;
   public int sourceServerId;
   public int commonFightTimes;
   public int commonBuyFightTimes;
   public int step = 1;
   public int curPoint;
   public int exp;
   public int bufferExp;
   public List<Integer> commonRiseWin = new ArrayList();
   public List<Integer> tempRiseWin = new ArrayList();
   public int peakFightTimes;
   public int peakBuyFightTimes;
   public int winTimes;
   public int maxStep;
   public int peakRank = 129;
   public int peakAward;
   public ArrayList<Integer> enemyList = new ArrayList();
   public boolean ifGuess = false;
   public String city;
   public String province;
   public long power;
   public int likeNum;
   public int canFight = 0;
   public int oldPeakLv = 0;
   public int oldPoint = 0;
   public int oldExp = 0;
   public byte[] commonArraying = null;
   public byte[] peakArraying = null;
   public FightInfoData lastFight;
   public int chip;
   public boolean guessUI = false;
   public boolean finalUI = false;
   public Map<Integer, PeakGuessData> myGuess = new HashMap();
   public List<Integer> matchList = new ArrayList();

   public static int getPoint(PlayerPeakData data) {
      return data.curPoint;
   }

   public int getRiseWinTimes() {
      int winNum = 0;

      for(int i = 0; i < this.commonRiseWin.size(); ++i) {
         if ((Integer)this.commonRiseWin.get(i) == 1) {
            ++winNum;
         }
      }

      return winNum;
   }

   public int getRiseLoseTimes() {
      int loseNum = 0;

      for(int i = 0; i < this.commonRiseWin.size(); ++i) {
         if ((Integer)this.commonRiseWin.get(i) == 0) {
            ++loseNum;
         }
      }

      return loseNum;
   }
}
