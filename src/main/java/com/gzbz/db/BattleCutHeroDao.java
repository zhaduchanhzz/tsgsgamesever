package com.gzbz.db;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.robot.RobotData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.JsonUtil;
import misc.MiscUtil;

@DBTableAnno(
   name = "tb_battle_cut_hero"
)
public class BattleCutHeroDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家code"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "最大解锁难度0,1,2位,3,4,5位标记是否通过"
   )
   public int maxHard = 1;
   @DBColumnAnno(
      comment = "昨日通关难度time+hard"
   )
   public long yesterdayHard;
   @DBColumnAnno(
      comment = "昨日通关记录"
   )
   public int yesterdayPass;
   @DBColumnAnno(
      comment = "今日所选难度"
   )
   public int todayHard;
   @DBColumnAnno(
      loadFun = "loadRewardInfo",
      saveFun = "saveRewardInfo",
      comment = "今日获得奖励记录"
   )
   public List<ResourceModel> todayReward = new ArrayList();
   @DBColumnAnno(
      comment = "今日使用复活次数"
   )
   public int reviveCount;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadHpMap",
      saveFun = "saveHpMap",
      comment = "英雄hp记录"
   )
   public Map<Long, HpData> hpMap = new HashMap();
   @DBColumnAnno(
      loadFun = "loadFriendSupport",
      saveFun = "saveFriendSupport",
      comment = "已雇佣的好友助阵英雄",
      columnType = "TEXT"
   )
   public Map<Integer, Boolean> friendSupport = new HashMap();
   @DBColumnAnno(
      comment = "好友英雄站位"
   )
   public byte friendPos = -1;
   @DBColumnAnno(
      comment = "当前选中的支援好友id"
   )
   public int friendCode;
   @DBColumnAnno(
      comment = "我的支援英雄code"
   )
   public int myHeroCode;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadSupports",
      saveFun = "saveSupports",
      comment = "哪些好友使用我的支援英雄"
   )
   public Set<Integer> supports = new HashSet();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadEnemyJson",
      saveFun = "saveEnemyJson",
      comment = "关卡敌人数据"
   )
   public TreeMap<Integer, EnemyData> enemy = new TreeMap();
   @DBColumnAnno(
      comment = "今日已领取宝箱的关卡id",
      loadFun = "loadBox",
      saveFun = "saveBox"
   )
   public List<Integer> battleBoxId = new ArrayList();
   private static final int[] hardArr = new int[]{1, 2, 3};

   public void loadRewardInfo(String data) {
      this.todayReward = JsonUtil.jsonToList(data, ResourceModel.class);
   }

   public void loadBox(String data) {
      this.battleBoxId = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveBox() {
      return JsonUtil.beanToJson(this.battleBoxId);
   }

   public String saveRewardInfo() {
      return JsonUtil.beanToJson(this.todayReward);
   }

   public void loadHpMap(String data) {
      this.hpMap = JsonUtil.jsonToMap(data, Long.class, HpData.class);
   }

   public String saveHpMap() {
      return JsonUtil.beanToJson(this.hpMap);
   }

   public void loadFriendSupport(String data) {
      this.friendSupport = JsonUtil.jsonToMap(data, Integer.class, Boolean.class);
   }

   public String saveFriendSupport() {
      return JsonUtil.beanToJson(this.friendSupport);
   }

   public void loadEnemyJson(String data) {
      this.enemy = (TreeMap)JsonUtil.jsonToMap(data, Integer.class, EnemyData.class, TreeMap.class);
   }

   public String saveEnemyJson() {
      return JsonUtil.beanToJson(this.enemy);
   }

   public void loadSupports(String data) {
      this.supports = JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveSupports() {
      return JsonUtil.beanToJson(this.supports);
   }

   public int getMaxHard() {
      for(int index = hardArr.length - 1; index >= 0; --index) {
         if (MiscUtil.existBit((long)this.maxHard, index)) {
            return hardArr[index];
         }
      }

      return 1;
   }

   public void setMaxHard(int hard) {
      this.maxHard = MiscUtil.setBit(this.maxHard, hard - 1);
   }

   public void hardPass(int hard) {
      this.maxHard = MiscUtil.setBit(this.maxHard, hard + hardArr.length - 1);
   }

   public boolean isPass(int hard) {
      return MiscUtil.existBit((long)this.maxHard, hard + hardArr.length - 1);
   }

   public void reset() {
      this.friendCode = 0;
      this.friendPos = -1;
      this.myHeroCode = 0;
      this.friendSupport.clear();
      this.hpMap.clear();
      this.yesterdayPass = this.getLastPassId();
      this.todayHard = 0;
      this.battleBoxId.clear();
      this.reviveCount = 0;
      this.todayReward.clear();
      this.supports.clear();
      this.enemy.clear();
      this.updateOp();
   }

   public void addTodayReward(ResourceModel item) {
      item.addResourceToList(this.todayReward);
   }

   public int getLastPassId() {
      int lastPassId = 0;
      if (this.enemy == null) {
         return lastPassId;
      } else {
         for(Map.Entry<Integer, EnemyData> entry : this.enemy.entrySet()) {
            if (!((EnemyData)entry.getValue()).pass) {
               return lastPassId;
            }

            lastPassId = (Integer)entry.getKey();
         }

         return lastPassId;
      }
   }

   public static class HpData {
      public Long hp;
      public Integer hpPercent;
   }

   public static class EnemyData extends RobotData {
      public Map<Integer, HpData> hpDataMap = new HashMap();
   }
}
