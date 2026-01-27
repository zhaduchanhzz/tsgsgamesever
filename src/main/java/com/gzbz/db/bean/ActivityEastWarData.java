package com.gzbz.db.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ActivityEastWarData {
   public boolean isTakeEastWar;
   public int freeDrinkNum;
   public List<Integer> taskGroup = new ArrayList();
   public Set<Integer> secretKey = new HashSet();
   public int totalId = 0;
   public int hadGetId = 0;
   public Set<Integer> boxs = new HashSet();
   public Map<Integer, CustomizeGiftData> optionalGift = new HashMap();
   public int totalWineNum;

   public void dailyReset() {
      this.freeDrinkNum = 0;
   }
}
