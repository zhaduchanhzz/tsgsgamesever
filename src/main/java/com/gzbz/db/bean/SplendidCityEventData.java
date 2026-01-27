package com.gzbz.db.bean;

import java.util.ArrayList;
import java.util.List;

public class SplendidCityEventData {
   public int eventId;
   public List<Integer> eventParams = new ArrayList();

   public void clear() {
      this.eventId = 0;
      this.eventParams.clear();
   }
}
