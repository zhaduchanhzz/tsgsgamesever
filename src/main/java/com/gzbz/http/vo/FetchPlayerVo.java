package com.gzbz.http.vo;

import com.gzbz.db.PlayerDao;
import misc.DateUtil;

public class FetchPlayerVo {
   private int playerId;
   private int server;
   private int level;
   private String account;
   private int type;
   private String name;
   private long gold;
   private long copper;
   private int vip;
   private int totalOnline;
   private int lastOnline;
   private int birthday;
   private boolean isOnline;
   private long combatPower;

   public int getPlayerId() {
      return this.playerId;
   }

   public void setPlayerId(int playerId) {
      this.playerId = playerId;
   }

   public int getServer() {
      return this.server;
   }

   public void setServer(int server) {
      this.server = server;
   }

   public int getLevel() {
      return this.level;
   }

   public void setLevel(int level) {
      this.level = level;
   }

   public String getAccount() {
      return this.account;
   }

   public void setAccount(String account) {
      this.account = account;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.type = type;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public long getGold() {
      return this.gold;
   }

   public void setGold(long gold) {
      this.gold = gold;
   }

   public long getCopper() {
      return this.copper;
   }

   public void setCopper(long copper) {
      this.copper = copper;
   }

   public int getVip() {
      return this.vip;
   }

   public void setVip(int vip) {
      this.vip = vip;
   }

   public int getTotalOnline() {
      return this.totalOnline;
   }

   public void setTotalOnline(int totalOnline) {
      this.totalOnline = totalOnline;
   }

   public int getLastOnline() {
      return this.lastOnline;
   }

   public void setLastOnline(int lastOnline) {
      this.lastOnline = lastOnline;
   }

   public int getBirthday() {
      return this.birthday;
   }

   public void setBirthday(int birthday) {
      this.birthday = birthday;
   }

   public FetchPlayerVo() {
   }

   public boolean isOnline() {
      return this.isOnline;
   }

   public void setOnline(boolean online) {
      this.isOnline = online;
   }

   public long getCombatPower() {
      return this.combatPower;
   }

   public void setCombatPower(long combatPower) {
      this.combatPower = combatPower;
   }

   public FetchPlayerVo(PlayerDao playerDao) {
      this.playerId = playerDao.playerId;
      this.server = playerDao.serverId;
      this.level = playerDao.lv;
      this.account = playerDao.account;
      this.type = playerDao.type;
      this.name = playerDao.playerName;
      this.gold = playerDao.gold;
      this.copper = playerDao.copper;
      this.vip = playerDao.vip_lv;
      this.lastOnline = DateUtil.getIntTime(playerDao.lastLoginTime);
      this.birthday = DateUtil.getIntTime(playerDao.birthTime);
      this.combatPower = playerDao.combat_power;
   }
}
