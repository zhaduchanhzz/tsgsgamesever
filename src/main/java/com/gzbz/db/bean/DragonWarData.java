package com.gzbz.db.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DragonWarData {
   public int floor;
   public boolean firstPass = false;
   public int round;
   public int deadHeroNum;
   public int plusGain;
   public Set<Integer> passLayer = new HashSet();
   public List<Integer> enemyBuff = new ArrayList();
   public Set<Integer> myBuff = new HashSet();
   public boolean isReset = false;
   public boolean sweepReset = false;
   public int resetDeadNum;
   public int resetRound;
   public int passNum;
   public Map<Integer, Integer> layerDead = new HashMap();
   public Map<Integer, Integer> layerRound = new HashMap();
   public Map<Integer, Integer> layerLive = new HashMap();
   public Map<Integer, List<Boolean>> layerWin = new HashMap();
   public List<ArrayingMirror> arrayingList = new ArrayList();
   public List<ArrayingMirror> recordArrayingList = new ArrayList();
   public List<byte[]> recordArrayingCopy = new ArrayList();
   public Map<Integer, Integer> tempLayerDead = new HashMap();
   public Map<Integer, Integer> tempLayerRound = new HashMap();
   public Map<Integer, Integer> tempLayerLive = new HashMap();
   public Map<Integer, List<Boolean>> tempLayerWin = new HashMap();
   public List<ArrayingMirror> mergeArrayingList = new ArrayList();
   public Set<Integer> mergeMyBuff = new HashSet();
   public List<Integer> mergeEnemyBuff = new ArrayList();
   public int mergeRound;
   public int mergeDeadHeroNum;

   public DragonWarData() {
   }

   public DragonWarData(int floor) {
      this.floor = floor;
   }
}
