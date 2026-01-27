package com.yy.peak.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class PeakSeasonData {
   public int zoneId;
   public HashMap<Integer, ArrayList<CommonKingData>> commonKing = new HashMap();
   public HashMap<Integer, PeakKingData> peakKing = new HashMap();
   public ConcurrentHashMap<Integer, ArrayList<PeakTopRecordData>> topRecord = new ConcurrentHashMap();
}
