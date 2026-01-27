package com.gzbz.activity.bean;

import com.gzbz.model.ActivityRuleModel;
import misc.DateUtil;

public class ActivityInfo {
   public int id = 0;
   public int start = 0;
   public int drop = 0;
   public int end = 0;
   public boolean open = false;
   public boolean dropping = false;
   public boolean forceClose = false;
   public boolean gmOp = false;
   public int times = 0;
   public int actOpenDay = 0;
   public int crossActOpenDay = 0;

   public int nextTime(ActivityRuleModel activityRuleModel) {
      return this.gmOp ? this.end + 1 : this.end + 1 + Math.max(0, activityRuleModel.getNextTime() * DateUtil.getIntTime(86400000L));
   }

   public String toString() {
      return "ActivityInfo{id=" + this.id + ", start=" + DateUtil.transferLongToDate((long)this.start * 1000L) + ", drop=" + DateUtil.transferLongToDate((long)this.drop * 1000L) + ", end=" + DateUtil.transferLongToDate((long)this.end * 1000L) + ", open=" + this.open + ", dropping=" + this.dropping + ", times=" + this.times + ", crossActOpenDay=" + this.crossActOpenDay + '}';
   }
}
