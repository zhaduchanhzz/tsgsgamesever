package com.yy.countryWar.bean;

import misc.DateUtil;

public class TransferRecord {
   public int transferTime = DateUtil.getIntTime(System.currentTimeMillis());
   public String transferName;
   public String beTransferName;
   public int cityId;
   public boolean isAttack = false;
   public boolean isWin = false;
}
