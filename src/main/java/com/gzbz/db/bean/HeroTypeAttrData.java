package com.gzbz.db.bean;

public class HeroTypeAttrData {
   private int heroType;
   private int type;
   private int way;
   private int val;

   public HeroTypeAttrData() {
   }

   public HeroTypeAttrData(int heroType, int type, int way, int val) {
      this.heroType = heroType;
      this.type = type;
      this.way = way;
      this.val = val;
   }

   public int getHeroType() {
      return this.heroType;
   }

   public void setHeroType(int heroType) {
      this.heroType = heroType;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.type = type;
   }

   public int getWay() {
      return this.way;
   }

   public void setWay(int way) {
      this.way = way;
   }

   public int getVal() {
      return this.val;
   }

   public void setVal(int val) {
      this.val = val;
   }

   public String toString() {
      return "HeroTypeAttrData{heroType=" + this.heroType + ", type=" + this.type + ", way=" + this.way + ", val=" + this.val + '}';
   }
}
