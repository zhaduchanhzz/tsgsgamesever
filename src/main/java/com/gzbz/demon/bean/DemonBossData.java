package com.gzbz.demon.bean;

import com.gzbz.gamePlayer.playerBag.StarMapPoint;
import java.util.HashMap;
import java.util.Map;

public class DemonBossData {
   public int playerId;
   public String playerName;
   public int heroCode;
   public int heroId;
   public int heroStar;
   public int heroLv;
   public long heroPower;
   public byte[] bytes;
   public boolean isSelect = false;
   public long heroFlag;
   public int heroType;
   public int dressId;
   public Map<Integer, StarMapPoint> starMap = new HashMap();

   public void resetStarMap(Map<Integer, StarMapPoint> starMapParam) {
      this.starMap.clear();
      this.starMap.putAll(starMapParam);
   }
}
