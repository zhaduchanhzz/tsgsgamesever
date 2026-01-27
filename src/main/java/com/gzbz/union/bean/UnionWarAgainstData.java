package com.gzbz.union.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class UnionWarAgainstData implements Serializable {
   private int id = 0;
   private String name;
   private int rank = 0;
   private int sId = 0;
   private String sName = "";
   private long power = 0L;
   private Map<Integer, UnionWarStrongholdData> strongholdDataMap = new HashMap();
   private int enemy = 0;
   private boolean win = false;
   private int star = 0;

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

   public int getRank() {
      return this.rank;
   }

   public void setRank(int rank) {
      this.rank = rank;
   }

   public int getsId() {
      return this.sId;
   }

   public void setsId(int sId) {
      this.sId = sId;
   }

   public String getsName() {
      return this.sName;
   }

   public void setsName(String sName) {
      this.sName = sName;
   }

   public long getPower() {
      return this.power;
   }

   public void setPower(long power) {
      this.power = power;
   }

   public Map<Integer, UnionWarStrongholdData> getStrongholdDataMap() {
      return this.strongholdDataMap;
   }

   public void setStrongholdDataMap(Map<Integer, UnionWarStrongholdData> strongholdDataMap) {
      this.strongholdDataMap = strongholdDataMap;
   }

   public int getEnemy() {
      return this.enemy;
   }

   public void setEnemy(int enemy) {
      this.enemy = enemy;
   }

   public boolean isWin() {
      return this.win;
   }

   public void setWin(boolean win) {
      this.win = win;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.star = star;
   }

   public UnionWarAgainstData copyNew() {
      UnionWarAgainstData unionWarAgainstData = new UnionWarAgainstData();
      unionWarAgainstData.setEnemy(this.enemy);
      unionWarAgainstData.setPower(this.power);
      unionWarAgainstData.setsName(this.sName);
      unionWarAgainstData.setsId(this.sId);
      unionWarAgainstData.setRank(this.rank);
      unionWarAgainstData.setId(this.id);
      unionWarAgainstData.setName(this.name);
      unionWarAgainstData.setStar(this.star);
      return unionWarAgainstData;
   }
}
