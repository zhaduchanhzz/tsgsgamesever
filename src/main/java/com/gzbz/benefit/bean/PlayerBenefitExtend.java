package com.gzbz.benefit.bean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.MiscUtil;

public class PlayerBenefitExtend {
   public int growFund = 0;
   public int recommendPlayer = 0;
   public Set<Integer> invitedPlayers = new HashSet();
   public Map<Integer, Long> taskCompletion = new HashMap();
   public int weeklyPreferentialRotate = 0;
   public int monthlyPreferentialRotate = 0;

   public Set<Integer> growFundRewards() {
      return MiscUtil.getBitPos((long)this.growFund);
   }

   public boolean isGotGrowFundReward(int id) {
      return MiscUtil.existBit((long)this.growFund, id);
   }

   public void addGrowFundReward(int id) {
      this.growFund = MiscUtil.setBit(this.growFund, id);
   }
}
