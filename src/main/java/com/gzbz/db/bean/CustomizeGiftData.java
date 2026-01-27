package com.gzbz.db.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomizeGiftData {
   public Map<Integer, Integer> groupItem = new HashMap();
   public List<Long> groupItems = new ArrayList();

   public void clearGiftData() {
      this.groupItem.clear();
      this.groupItems.clear();
   }
}
