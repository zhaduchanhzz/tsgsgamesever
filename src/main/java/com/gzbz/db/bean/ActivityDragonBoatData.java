package com.gzbz.db.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivityDragonBoatData {
   public boolean isTakePlumNum;
   public int freeDrinkNum;
   public List<Integer> taskGroup = new ArrayList();
   public int totalWineNum;
   public Map<Integer, Boolean> prays = new HashMap();

   public void reset() {
      this.isTakePlumNum = false;
      this.freeDrinkNum = 0;
      this.taskGroup.clear();
      this.totalWineNum = 0;
      this.prays.clear();
   }
}
