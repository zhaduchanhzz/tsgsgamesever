package com.gzbz.db.worldBean;

import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.bean.BeautyTreasureRecord;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ActivityData {
   public Map<Integer, ActivityInfo> timeRotates = new ConcurrentHashMap();
   public String weekendKoiWinner = "";
   public List<Integer> weekendKoiBuys = new ArrayList();
   public int weekendKoiGroup = 0;
   public int seedProcess = 0;
   public boolean firstArtifactEnd = false;
   public List<BeautyTreasureRecord> beautyTreasureRecord = new ArrayList();
   public List<BeautyTreasureRecord> beautyTreasureRotateRecord = new ArrayList();
   public List<BeautyTreasureRecord> qianKunTreasureHighRecord = new ArrayList();
   public List<BeautyTreasureRecord> qianKunTreasureCommonRecord = new ArrayList();
   public List<BeautyTreasureRecord> qianKunLotteryHighRecord = new ArrayList();
   public List<BeautyTreasureRecord> qianKunLotteryCommonRecord = new ArrayList();
   public List<BeautyTreasureRecord> tongQueLotteryRecord = new ArrayList();
   public List<BeautyTreasureRecord> huaJiaLotteryRecord = new ArrayList();
   public int sacrificeProcess = 0;
   public int kittySeedProcess = 0;
}
