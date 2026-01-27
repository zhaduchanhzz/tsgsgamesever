package com.gzbz.activity.bean.decisiveBattle;

import java.util.ArrayList;
import java.util.List;

public class DecisiveBattleRecord {
   public DecisiveMatchData leftData;
   public DecisiveMatchData rightData;
   public int win;
   public List<DecisiveBattleResult> result = new ArrayList();
}
