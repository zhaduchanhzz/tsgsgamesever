package com.gzbz.db.bean;

import java.util.HashSet;
import java.util.Set;

public class LevelGiftData {
   private int type;
   private Set<Integer> level = new HashSet();

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.type = type;
   }

   public Set<Integer> getLevel() {
      return this.level;
   }

   public void setLevel(Set<Integer> level) {
      this.level = level;
   }

   public LevelGiftData(int type) {
      this.type = type;
   }

   public LevelGiftData() {
   }
}
