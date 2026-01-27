package com.yy.dragonWar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.DateUtil;

public class DragonWarFloorData {
   public int time = DateUtil.getIntTime(System.currentTimeMillis());
   public Map<Integer, List<FloorRankData>> floorMap = new HashMap();
}
