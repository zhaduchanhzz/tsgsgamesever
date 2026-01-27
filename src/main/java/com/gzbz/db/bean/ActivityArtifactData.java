package com.gzbz.db.bean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ActivityArtifactData {
   public Set<Integer> weaponBoxs = new HashSet();
   public int round = 1;
   public int totalLootNum = 0;
   public int curLootNum = 0;
   public int enjoyId = 0;
   public int resetNum = 0;
   public Set<Integer> hadLoots = new HashSet();
   public boolean hadGetEnjoy = false;
   public HashMap<Integer, Integer> chooseMap = new HashMap();
   public int random = -1;
   public int appoint = -1;
   public int grid = 1;
   public Set<Integer> gotGrids = new HashSet();
   public int rollNum = 0;
   public int totalLineBoxes = 0;
   public Set<Integer> lineBoxes = new HashSet();
   public Set<Integer> finalBoxes = new HashSet();
   public int randomRecoverTime = 0;
   public int lastBattle = 0;
   public int actDay = 0;
   public int appointBuy = 0;

   public void reset() {
      this.weaponBoxs.clear();
      this.round = 1;
      this.totalLootNum = 0;
      this.curLootNum = 0;
      this.enjoyId = 0;
      this.resetNum = 0;
      this.hadLoots.clear();
      this.chooseMap.clear();
      this.hadGetEnjoy = false;
      this.appoint = -1;
      this.random = -1;
      this.randomRecoverTime = 0;
      this.lineBoxes.clear();
      this.finalBoxes.clear();
      this.gotGrids.clear();
      this.grid = 1;
      this.rollNum = 0;
      this.totalLineBoxes = 0;
      this.resetNum = 0;
      this.actDay = 0;
      this.lastBattle = 0;
   }
}
