package com.gzbz.gift.bean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PlayerGiftExtend {
   public Map<Integer, Integer> timeLimit = new HashMap();
   public Set<Integer> triggers = new HashSet();
   public Map<Integer, Integer> triggerValue = new HashMap();
   public Map<Integer, Integer> todayBuyLimit = new HashMap();
   public Map<Integer, Integer> giftTypePlayerLv = new HashMap();
   public Map<Integer, Set<Integer>> welfareC = new HashMap();
   public Map<Integer, Set<Integer>> welfareS = new HashMap();
   public LifeTimeCardData lifeTimeCardData = new LifeTimeCardData();
   public Set<Integer> beforeLimitActBuy = new HashSet();

   public boolean isTrigger(int timeLimitGiftType) {
      return this.triggers.contains(timeLimitGiftType);
   }

   public void addTrigger(int timeLimitGiftType) {
      this.triggers.add(timeLimitGiftType);
   }

   public void delTrigger(int timeLimitGiftType) {
      this.timeLimit.remove(timeLimitGiftType);
      this.triggers.remove(timeLimitGiftType);
      this.todayBuyLimit.remove(timeLimitGiftType);
      this.giftTypePlayerLv.remove(timeLimitGiftType);
   }
}
