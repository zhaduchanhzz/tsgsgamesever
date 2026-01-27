package com.gzbz.gamePlayer.peak.bean;

import java.util.ArrayList;
import java.util.List;
import misc.DateUtil;

public class PeakBattleTotalData {
   public List<Integer> leftHeros = new ArrayList();
   public List<Integer> rightHeros = new ArrayList();
   public int isWin;
   public int round;
   public int leftStep;
   public int rightStep;
   public String time = DateUtil.transferLongToDate(System.currentTimeMillis(), "yyyy-MM-dd");
}
