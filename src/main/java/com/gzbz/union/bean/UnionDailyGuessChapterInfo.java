package com.gzbz.union.bean;

public class UnionDailyGuessChapterInfo {
   private int chapterId;
   private int nextChapterGrid;
   private int canPassBattle;
   private int mapGroup;

   public UnionDailyGuessChapterInfo(int chapterId, int nextChapterGrid, int canPassBattle, int mapGroup) {
      this.chapterId = chapterId;
      this.nextChapterGrid = nextChapterGrid;
      this.canPassBattle = canPassBattle;
      this.mapGroup = mapGroup;
   }

   public int getChapterId() {
      return this.chapterId;
   }

   public void setChapterId(int chapterId) {
      this.chapterId = chapterId;
   }

   public int getNextChapterGrid() {
      return this.nextChapterGrid;
   }

   public void setNextChapterGrid(int nextChapterGrid) {
      this.nextChapterGrid = nextChapterGrid;
   }

   public int getCanPassBattle() {
      return this.canPassBattle;
   }

   public void setCanPassBattle(int canPassBattle) {
      this.canPassBattle = canPassBattle;
   }

   public int getMapGroup() {
      return this.mapGroup;
   }

   public void setMapGroup(int mapGroup) {
      this.mapGroup = mapGroup;
   }
}
