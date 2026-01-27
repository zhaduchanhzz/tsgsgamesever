package com.gzbz.db.bean;

import com.gzbz.model.fun.ResourceModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivitySpringFestivalData {
   public int bless;
   public Map<Byte, Byte> dicePlates = new HashMap();
   public int box;
   public Map<Integer, Long> prays = new HashMap();
   public List<ResourceModel> superBox = new ArrayList();

   public void dailyReset() {
      this.bless = 0;
      this.dicePlates.clear();
      this.box = 0;
   }
}
