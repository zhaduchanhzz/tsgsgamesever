package com.gzbz.activity.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeautyTreasureData {
   public int stage = 1;
   public List<BeautyTreasureRecord> recordList = new ArrayList();
   public Map<Integer, Integer> recruitRecord = new HashMap();
   public Map<Integer, Integer> receiveRecord = new HashMap();
   public Map<Integer, Map<Integer, Integer>> historyRecord = new HashMap();
   public int flag = 0;
}
