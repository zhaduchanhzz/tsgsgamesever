package com.gzbz.battleTest;

import java.util.concurrent.atomic.AtomicLong;

public class Record {
   public int heroId = 0;
   public AtomicLong win = new AtomicLong();
   public AtomicLong failed = new AtomicLong();
   public float winRate = 0.0F;
}
