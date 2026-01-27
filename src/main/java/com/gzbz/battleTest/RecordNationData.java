package com.gzbz.battleTest;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class RecordNationData {
   public ConcurrentHashMap<Integer, AtomicLong> nationWin = new ConcurrentHashMap();
   public ConcurrentHashMap<Integer, AtomicLong> nationFailed = new ConcurrentHashMap();
}
