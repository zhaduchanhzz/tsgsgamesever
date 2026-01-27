package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_friend",
   resultType = 0,
   selectKey = {"playerId"}
)
public class FriendDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "已赠送次数"
   )
   public int giveTimes = 0;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadFriends",
      saveFun = "saveFriends"
   )
   public Set<Integer> friends = new HashSet();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadBlacks",
      saveFun = "saveBlacks"
   )
   public Set<Integer> blacks = new HashSet();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadBeInvites",
      saveFun = "saveBeInvites"
   )
   public Set<Integer> beInvites = new HashSet();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadChats",
      saveFun = "saveChats"
   )
   public Set<Integer> chats = new HashSet();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadGiveFriendship",
      saveFun = "saveGiveFriendship"
   )
   public Map<Integer, Integer> giveFriendship = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadGiveCounts",
      saveFun = "saveGiveCounts",
      comment = "增送次数统计"
   )
   public Map<Integer, Integer> giveCounts = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadGainFriendship",
      saveFun = "saveGainFriendship"
   )
   public Map<Integer, Integer> gainFriendship = new HashMap();
   @DBColumnAnno(
      comment = "今日加好友次数"
   )
   public int addFriendNum;
   @DBColumnAnno(
      comment = "更新时间"
   )
   public int updateTime;

   public void loadFriends(String str) {
      this.friends = (Set)JsonUtil.jsonToBean(str, HashSet.class);
   }

   public String saveFriends() {
      return JsonUtil.beanToJson(this.friends);
   }

   public void loadBlacks(String str) {
      this.blacks = (Set)JsonUtil.jsonToBean(str, HashSet.class);
   }

   public String saveBlacks() {
      return JsonUtil.beanToJson(this.blacks);
   }

   public void loadBeInvites(String str) {
      this.beInvites = (Set)JsonUtil.jsonToBean(str, HashSet.class);
   }

   public String saveBeInvites() {
      return JsonUtil.beanToJson(this.beInvites);
   }

   public void loadChats(String str) {
      this.chats = (Set)JsonUtil.jsonToBean(str, HashSet.class);
   }

   public String saveChats() {
      return JsonUtil.beanToJson(this.chats);
   }

   public void loadGiveFriendship(String str) {
      this.giveFriendship = JsonUtil.jsonToMap(str, Integer.class, Integer.class);
   }

   public String saveGiveFriendship() {
      return JsonUtil.beanToJson(this.giveFriendship);
   }

   public void loadGiveCounts(String str) {
      this.giveCounts = JsonUtil.jsonToMap(str, Integer.class, Integer.class);
   }

   public String saveGiveCounts() {
      return JsonUtil.beanToJson(this.giveCounts);
   }

   public int getGiveFriendship(int playerId) {
      return (Integer)this.giveFriendship.getOrDefault(playerId, 0);
   }

   public void setGiveFriendship(int playerId) {
      Integer times = (Integer)this.giveFriendship.getOrDefault(playerId, 0);
      this.giveFriendship.put(playerId, times + 1);
      this.updateOp();
   }

   public void loadGainFriendship(String str) {
      this.gainFriendship = JsonUtil.jsonToMap(str, Integer.class, Integer.class);
   }

   public String saveGainFriendship() {
      return JsonUtil.beanToJson(this.gainFriendship);
   }

   public Set<Integer> getGainSet() {
      Set<Integer> set = new HashSet();

      for(Map.Entry<Integer, Integer> entry : this.gainFriendship.entrySet()) {
         if ((Integer)entry.getValue() > 0) {
            set.add(entry.getKey());
         }
      }

      return set;
   }

   public int getGainFriendship(int playerId) {
      Integer times = (Integer)this.gainFriendship.getOrDefault(playerId, 0);
      return times;
   }

   public void setGainFriendship(int playerId) {
      Integer times = (Integer)this.gainFriendship.getOrDefault(playerId, 0);
      if (times <= 0) {
         this.gainFriendship.put(playerId, 0);
      } else {
         this.gainFriendship.put(playerId, times - 1);
      }

      this.updateOp();
   }

   public void obtainFriendship(int playerId) {
      int times = this.getGainFriendship(playerId);
      this.gainFriendship.put(playerId, times + 1);
      this.updateOp();
   }

   public void addValue(int typeData, int playerId) {
      Set<Integer> list = this.getDatas(typeData);
      this.addValue(list, playerId);
   }

   public void removeValue(int typeData, int playerId) {
      Set list = this.getDatas(typeData);
      this.removeValue(list, playerId);
   }

   public Set<Integer> getDatas(int typeData) {
      switch (typeData) {
         case 1:
            return this.friends;
         case 2:
            return this.getGainSet();
         case 3:
            return this.beInvites;
         case 4:
            return this.blacks;
         case 5:
            return this.chats;
         default:
            return null;
      }
   }

   private void addValue(Set list, int playerId) {
      if (list == null || !list.contains(playerId)) {
         list.add(playerId);
      }
   }

   private void removeValue(Set list, int playerId) {
      if (list != null && list.contains(playerId)) {
         list.remove(new Integer(playerId));
      }

   }

   public int getGiveTimes() {
      return this.giveTimes;
   }

   public void setGiveTimes(int times) {
      this.giveTimes = times;
      this.updateOp();
   }

   public void reset() {
      this.giveTimes = 0;
      this.giveFriendship.clear();
      this.gainFriendship.clear();
      this.updateOp();
   }
}
