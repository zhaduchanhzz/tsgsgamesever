package com.gzbz.union.bean;

import java.io.Serializable;

public class UnionWarStrongholdData implements Serializable {
   private int id = 0;
   private String name = "";
   private long power = 0L;
   private byte[] arrayingMirror;
   private int maxStar = 0;
   private int lv = 0;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public long getPower() {
      return this.power;
   }

   public void setPower(long power) {
      this.power = power;
   }

   public byte[] getArrayingData() {
      return this.arrayingMirror;
   }

   public void setArrayingData(byte[] arrayingData) {
      this.arrayingMirror = arrayingData;
   }

   public int getMaxStar() {
      return this.maxStar;
   }

   public void setMaxStar(int maxStar) {
      this.maxStar = maxStar;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.lv = lv;
   }
}
