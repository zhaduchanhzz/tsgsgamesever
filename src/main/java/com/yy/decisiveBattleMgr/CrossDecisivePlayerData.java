package com.yy.decisiveBattleMgr;

import com.gzbz.protobuf.CommonMsg;
import java.util.HashMap;
import java.util.Map;

public class CrossDecisivePlayerData {
   public int step;
   public int point;
   public Map<CommonMsg.HeroState, byte[]> arrayMap = new HashMap();
   public int matchTime;
   public int lastPlayerId = 0;
   public int maxStep;
}
