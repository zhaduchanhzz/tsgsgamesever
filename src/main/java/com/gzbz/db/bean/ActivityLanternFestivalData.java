package com.gzbz.db.bean;

import java.util.HashMap;
import java.util.Map;

public class ActivityLanternFestivalData {
   public int bless;
   public Map<Byte, Byte> dicePlates = new HashMap();
   public int box;
   public Map<Integer, Long> prays = new HashMap();

   public void dailyReset() {
      this.bless = 0;
      this.dicePlates.clear();
      this.box = 0;
   }
}
