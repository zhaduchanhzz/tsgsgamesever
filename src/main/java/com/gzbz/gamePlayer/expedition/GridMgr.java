package com.gzbz.gamePlayer.expedition;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GridMgr {
   private static final int TOP = 1;
   private static final int LEFT = 1;
   private static final int RIGHT = 0;
   private int row;
   private int col;
   private List<GridNode> list = new ArrayList();
   private int[][] oddColumn = new int[][]{{-1, -1}, {0, -1}, {-1, 0}, {1, 0}, {-1, 1}, {0, 1}};
   private int[][] evenColumn = new int[][]{{0, -1}, {1, -1}, {-1, 0}, {1, 0}, {0, 1}, {1, 1}};

   public void init(int row, int col) {
      if (this.list.size() != row * col || this.row != row || this.col != col) {
         this.row = row;
         this.col = col;
         this.list.clear();

         for(int i = 0; i < row; ++i) {
            for(int j = 0; j < col; ++j) {
               int grid = i * col + j + 1;
               GridNode gridNode = new GridNode(grid, j, i);
               this.list.add(gridNode);
            }
         }

      }
   }

   public Set<Integer> getNear(int grid) {
      Set<Integer> gridSet = new HashSet();
      if (grid >= 0 && grid <= this.list.size()) {
         GridNode gridNode = (GridNode)this.list.get(grid - 1);
         int row = (int)Math.ceil((double)((float)grid / (float)this.col));
         int[][] nearPos = row % 2 == 0 ? this.evenColumn : this.oddColumn;

         for(int i = 0; i < nearPos.length; ++i) {
            int tempPosX = gridNode.getX() + nearPos[i][0];
            int tempPosY = gridNode.getY() + nearPos[i][1];
            if (tempPosX >= 0 && tempPosX <= this.col - 1 && tempPosY >= 0 && tempPosY <= this.row - 1) {
               int tempGridId = this.changeToGrid(tempPosX, tempPosY);
               gridSet.add(tempGridId);
            }
         }

         return gridSet;
      } else {
         return gridSet;
      }
   }

   public int changeToGrid(int x, int y) {
      return y * this.col + x + 1;
   }
}
