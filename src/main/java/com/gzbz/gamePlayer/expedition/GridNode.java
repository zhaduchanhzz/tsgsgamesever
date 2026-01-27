package com.gzbz.gamePlayer.expedition;

public class GridNode {
   private int grid;
   private int x;
   private int y;
   private GridNode parentNode;

   public GridNode() {
   }

   public GridNode(int grid, int x, int y) {
      this.grid = grid;
      this.x = x;
      this.y = y;
   }

   public int getX() {
      return this.x;
   }

   public void setX(int x) {
      this.x = x;
   }

   public int getY() {
      return this.y;
   }

   public void setY(int y) {
      this.y = y;
   }
}
