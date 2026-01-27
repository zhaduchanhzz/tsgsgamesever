package com.gzbz.logOperation.bean;

import misc.DateUtil;

public class LogOldData {
   public String logTime = DateUtil.time();
   public int logId;
   public String accountName;
   public String playerId;
   public String playerName;
   public String platformName;
   public String agentName;
   public String param_n3;
   public String param_n4;
   public String param_z3 = "-";
   public String param_z4 = "-";
   public String param_n5 = "-";
   public String param_n6 = "-";
   public String param_z5 = "-";
   public String param_z6 = "-";
   public String param_n7 = "-";
   public String param_n8 = "-";
   public String param_n9 = "-";
   public String param_n10 = "-";
   public String param_n11 = "-";

   public LogOldData(int logId) {
      this.logId = logId;
   }
}
