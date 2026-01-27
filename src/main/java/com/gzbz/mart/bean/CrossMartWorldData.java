package com.gzbz.mart.bean;

import java.util.HashMap;
import java.util.Map;

public class CrossMartWorldData {
   public int code;
   public Map<Integer, MartAutoRefreshData> refreshMap = new HashMap();
   public int state;
   public Boolean specialState = false;
}
