package com.gzbz.demonStrikes.bean;

import misc.DateUtil;

public class DemonStrikesNpcData {
   public int uid;
   public int mId;
   public int aTime;
   public boolean atk;

   public String toString() {
      return "{uid=" + this.uid + ", modelId=" + this.mId + ", actTime=" + DateUtil.transferLongToDate((long)this.aTime * 1000L) + ", atk=" + this.atk + '}';
   }
}
