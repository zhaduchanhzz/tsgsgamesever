package com.gzbz.db.bean;

import com.gzbz.gamePlayer.stoneCircle.bean.EventData;
import com.gzbz.gamePlayer.stoneCircle.bean.MapLocation;
import java.util.ArrayList;
import java.util.List;

public class MapEventData {
   public int stage;
   public List<Integer> extraGrid = new ArrayList();
   public int bossBlock;
   public int bossLocation;
   public List<EventData> eventList = new ArrayList();
   public List<MapLocation> lightList = new ArrayList();
   public MapLocation myLocation;
   public int isShow;
   public boolean enterSpecial = false;
   public List<EventData> specialEvent = new ArrayList();
}
