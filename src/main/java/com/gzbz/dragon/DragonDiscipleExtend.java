package com.gzbz.dragon;

import com.gzbz.db.bean.DragonTeamRecordData;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DragonDiscipleExtend {
   public int breachLv = 0;
   public boolean passed = false;
   public Set<Integer> tecPlace = new HashSet();
   public int battleNum;
   public Map<Integer, DragonTeamRecordData> rewards = new HashMap();
}
