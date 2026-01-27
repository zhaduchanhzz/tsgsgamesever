package com.gzbz.battleTest;

import java.util.concurrent.atomic.AtomicLong;

public class RecordData {
   public int effectId = 0;
   public int heroId = 0;
   public AtomicLong value = new AtomicLong();
   public AtomicLong times = new AtomicLong();
}
