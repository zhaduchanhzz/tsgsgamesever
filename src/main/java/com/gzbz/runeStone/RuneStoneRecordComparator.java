package com.gzbz.runeStone;

import com.gzbz.db.RuneStoneRecordDao;
import java.util.Comparator;

public class RuneStoneRecordComparator implements Comparator<RuneStoneRecordDao> {
   public int compare(RuneStoneRecordDao o1, RuneStoneRecordDao o2) {
      return o1.time - o2.time;
   }
}
