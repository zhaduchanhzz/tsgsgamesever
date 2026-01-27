package com.gzbz.db.bean;

import com.gzbz.model.fun.ResourceModel;
import java.util.ArrayList;
import java.util.List;
import misc.DateUtil;

public class HouseKeeperData {
   public int systemId;
   public List<Integer> options = new ArrayList();
   public short state;
   public long hurtValue;
   public List<ResourceModel> rewards = new ArrayList();
   public boolean isActive;
   public boolean isMark;
   public int markTime;

   public void reset() {
      this.state = 0;
      this.hurtValue = 0L;
      this.rewards.clear();
      this.isActive = false;
      if (this.markTime == 0 || this.markTime < DateUtil.getIntTime(DateUtil.getDayStartTimeStamp() - 86400000L)) {
         this.isMark = false;
         this.markTime = 0;
      }

   }

   public void setIsMark(boolean isMark) {
      this.isMark = isMark;
      this.markTime = DateUtil.getIntTime(System.currentTimeMillis());
   }
}
