package com.gzbz.megerWar.bean;

public class MergeWarBuildingData extends MergeWarBaseGrid {
   public int totalHp;
   public int hp;
   public int force;
   public int protectTime;

   public MergeWarBuildingData() {
   }

   public MergeWarBuildingData(int grid, int hp) {
      this.grid = grid;
      this.hp = hp;
      this.totalHp = hp;
   }
}
