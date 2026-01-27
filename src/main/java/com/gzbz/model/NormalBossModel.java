package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "normalBoss"
)
public class NormalBossModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "首领ID"
   )
   private int bossId;
   @ModelColumnAnno(
      comment = "boss类型"
   )
   private int bossType;
   @ModelColumnAnno(
      comment = "boss名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "战斗ID"
   )
   private int battleId;
   @ModelColumnAnno(
      comment = "战斗场景"
   )
   private int battleScene;
   @ModelColumnAnno(
      comment = "最大回合"
   )
   private int maxRound;
   @ModelColumnAnno(
      comment = "开放时间"
   )
   private String openTime;
   @ModelColumnAnno(
      comment = "结束时间"
   )
   private String closeTime;
   @ModelColumnAnno(
      comment = "开服时间要求"
   )
   private String serviceTime;
   @ModelColumnAnno(
      comment = "是否多波次"
   )
   private int isMoreTeamFight;
   @ModelColumnAnno(
      comment = "对应服务器总伤害奖励"
   )
   private int savageHurtAward;
   @ModelColumnAnno(
      comment = "玩家总伤害排名奖励"
   )
   private int savageRankAward;
   @ModelColumnAnno(
      comment = "需要开启的系统id"
   )
   private int needSysId;
   private List<OpenTime> openTimeList = new ArrayList();

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, NormalBossModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         NormalBossModel model = (NormalBossModel)entry.getValue();
         model.openTimeList.clear();

         for(String s : model.serviceTime.split("\\|")) {
            model.openTimeList.add(new OpenTime(s));
         }

         ((TreeMap)tempHashMap.computeIfAbsent(model.bossType, (v) -> new TreeMap())).put(model.bossId, model);
      }

      pool.putMap("customWorldBoss", tempHashMap);
   }

   public int getBossId() {
      return this.bossId;
   }

   public void setBossId(int bossId) {
      this.checkModify();
      this.bossId = bossId;
   }

   public int getBossType() {
      return this.bossType;
   }

   public void setBossType(int bossType) {
      this.checkModify();
      this.bossType = bossType;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getBattleId() {
      return this.battleId;
   }

   public void setBattleId(int battleId) {
      this.checkModify();
      this.battleId = battleId;
   }

   public int getBattleScene() {
      return this.battleScene;
   }

   public void setBattleScene(int battleScene) {
      this.checkModify();
      this.battleScene = battleScene;
   }

   public int getMaxRound() {
      return this.maxRound;
   }

   public void setMaxRound(int maxRound) {
      this.checkModify();
      this.maxRound = maxRound;
   }

   public String getOpenTime() {
      return this.openTime;
   }

   public void setOpenTime(String openTime) {
      this.checkModify();
      this.openTime = openTime;
   }

   public String getCloseTime() {
      return this.closeTime;
   }

   public void setCloseTime(String closeTime) {
      this.checkModify();
      this.closeTime = closeTime;
   }

   public String getServiceTime() {
      return this.serviceTime;
   }

   public void setServiceTime(String serviceTime) {
      this.checkModify();
      this.serviceTime = serviceTime;
   }

   public int getIsMoreTeamFight() {
      return this.isMoreTeamFight;
   }

   public void setIsMoreTeamFight(int isMoreTeamFight) {
      this.checkModify();
      this.isMoreTeamFight = isMoreTeamFight;
   }

   public int getSavageHurtAward() {
      return this.savageHurtAward;
   }

   public void setSavageHurtAward(int savageHurtAward) {
      this.checkModify();
      this.savageHurtAward = savageHurtAward;
   }

   public int getSavageRankAward() {
      return this.savageRankAward;
   }

   public void setSavageRankAward(int savageRankAward) {
      this.checkModify();
      this.savageRankAward = savageRankAward;
   }

   public List<OpenTime> getOpenTimeList() {
      return this.openTimeList;
   }

   public void setOpenTimeList(List<OpenTime> openTimeList) {
      this.openTimeList = openTimeList;
   }

   public int getNeedSysId() {
      return this.needSysId;
   }

   public void setNeedSysId(int needSysId) {
      this.checkModify();
      this.needSysId = needSysId;
   }

   public String toString() {
      return "NormalBossModel{bossId=" + this.bossId + ", bossType=" + this.bossType + ", name='" + this.name + '\'' + ", battleId=" + this.battleId + ", battleScene=" + this.battleScene + ", maxRound=" + this.maxRound + ", openTime='" + this.openTime + '\'' + ", closeTime='" + this.closeTime + '\'' + ", serviceTime='" + this.serviceTime + '\'' + ", savageHurtAward=" + this.savageHurtAward + ", savageRankAward=" + this.savageRankAward + ", openTimeList=" + this.openTimeList + '}';
   }

   public static class OpenTime {
      public int openServerDayBegin;
      public int openServerDayEnd;
      public List<Integer> openWeek = new ArrayList();

      public OpenTime(String serverDay2Week) {
         String[] serverDay2WeekArr = serverDay2Week.split(":");
         String[] serverDayArr = serverDay2WeekArr[0].split("-");
         String[] weekArr = serverDay2WeekArr[1].split(",");
         this.openServerDayBegin = Integer.parseInt(serverDayArr[0]);
         this.openServerDayEnd = Integer.parseInt(serverDayArr[1]);

         for(String week : weekArr) {
            this.openWeek.add(Integer.parseInt(week));
         }

      }

      public String toString() {
         return "OpenTime{openServerDayBegin=" + this.openServerDayBegin + ", openServerDayEnd=" + this.openServerDayEnd + ", openWeek=" + this.openWeek + '}';
      }
   }
}
