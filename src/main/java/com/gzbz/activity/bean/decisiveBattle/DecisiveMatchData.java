package com.gzbz.activity.bean.decisiveBattle;

import com.gzbz.protobuf.CommonMsg;
import java.util.HashMap;
import java.util.Map;

public class DecisiveMatchData {
   public int serverId;
   public int playerId;
   public String playerName;
   public int headId;
   public int headFrame;
   public int step;
   public int point;
   public int lv;
   public int monarchId;
   public int maxStep;
   public Map<CommonMsg.HeroState, byte[]> arrayingMap = new HashMap();
   public int againMatchNum;
   public int matchTime;
   public int changePoint;
   public Boolean isRobot = false;
   public Boolean isBattle = false;
}
