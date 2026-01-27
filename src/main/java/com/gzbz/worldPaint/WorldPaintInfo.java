package com.gzbz.worldPaint;

import java.io.Serializable;

public class WorldPaintInfo implements Serializable {
   private int type;
   private int grade;
   private int lv;

   public WorldPaintInfo() {
   }

   public WorldPaintInfo(int type, int grade, int lv) {
      this.type = type;
      this.grade = grade;
      this.lv = lv;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.type = type;
   }

   public int getGrade() {
      return this.grade;
   }

   public void setGrade(int grade) {
      this.grade = grade;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.lv = lv;
   }
}
