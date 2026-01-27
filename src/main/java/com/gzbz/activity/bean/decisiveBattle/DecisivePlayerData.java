package com.gzbz.activity.bean.decisiveBattle;

import com.gzbz.protobuf.CommonMsg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecisivePlayerData {
   public int point;
   public int step = 1;
   public int maxStep = 1;
   public int fightTimes;
   public int buyFightTimes;
   public List<Integer> receiveStepAward = new ArrayList();
   public Map<CommonMsg.HeroState, DecisiveArraying> arrayingMap = new HashMap();
   public Map<Integer, Integer> magicBook = new HashMap();
   public List<Integer> cooperateBeauty = new ArrayList();
   public int curMatchTime;
   public DecisiveMatchData matchData;
   public int lastStep;
   public int lastPoint;
   public List<byte[]> battleList = new ArrayList();
   public Map<Integer, Integer> defeatMap = new HashMap();
   public Map<CommonMsg.HeroState, Map<Integer, Integer>> tempArrayingMap = new HashMap();
}
