package com.gzbz.db.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DragonTreasureData {
   public int goldNum;
   public int propNum;
   public int point;
   public int luckyPoint;
   public int addMoney;
   public int refreshNum;
   public Map<Integer, DragonTreasureAwardData> awardPool = new HashMap();
   public List<Integer> receiveBos = new ArrayList();
   public Map<Integer, Integer> awardMap = new HashMap();
   public List<Integer> awardRecord = new ArrayList();

   public void addRecord(int awardId) {
      if (this.awardRecord.size() >= 20) {
         this.awardRecord.remove(0);
      }

      this.awardRecord.add(awardId);
   }
}
