package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "HefuStage"
)
public class HeFuStageModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "组"
   )
   private int group;
   @ModelColumnAnno(
      comment = "阶段"
   )
   private int stage;
   @ModelColumnAnno(
      comment = "开服时间"
   )
   private int serverDay;
   @ModelColumnAnno(
      comment = "第几周"
   )
   private int week;
   @ModelColumnAnno(
      comment = "周几"
   )
   private int day;
   @ModelColumnAnno(
      comment = "持续天数"
   )
   private int durationDay;
   @ModelColumnAnno(
      comment = "对应玩法章节"
   )
   private int chapterId;
   @ModelColumnAnno(
      comment = "准备时间"
   )
   private int readyTime;
   @ModelColumnAnno(
      comment = "开启时间"
   )
   private int startTime;
   @ModelColumnAnno(
      comment = "持续时间"
   )
   private int durationTime;
   @ModelColumnAnno(
      comment = "结算时间"
   )
   private int rewardTime;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, Map<Integer, HeFuStageModel>> tempMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         HeFuStageModel model = (HeFuStageModel)entry.getValue();
         ((Map)tempMap.computeIfAbsent(model.getGroup(), (v) -> new HashMap())).put(model.getStage(), model);
      }

      pool.putMap("customHefuStage", tempMap);
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getGroup() {
      return this.group;
   }

   public void setGroup(int group) {
      this.checkModify();
      this.group = group;
   }

   public int getStage() {
      return this.stage;
   }

   public void setStage(int stage) {
      this.checkModify();
      this.stage = stage;
   }

   public int getServerDay() {
      return this.serverDay;
   }

   public void setServerDay(int serverDay) {
      this.checkModify();
      this.serverDay = serverDay;
   }

   public int getWeek() {
      return this.week;
   }

   public void setWeek(int week) {
      this.checkModify();
      this.week = week;
   }

   public int getDay() {
      return this.day;
   }

   public void setDay(int day) {
      this.checkModify();
      this.day = day;
   }

   public int getDurationDay() {
      return this.durationDay;
   }

   public void setDurationDay(int durationDay) {
      this.checkModify();
      this.durationDay = durationDay;
   }

   public int getChapterId() {
      return this.chapterId;
   }

   public void setChapterId(int chapterId) {
      this.checkModify();
      this.chapterId = chapterId;
   }

   public int getReadyTime() {
      return this.readyTime;
   }

   public void setReadyTime(int readyTime) {
      this.checkModify();
      this.readyTime = readyTime;
   }

   public int getStartTime() {
      return this.startTime;
   }

   public void setStartTime(int startTime) {
      this.checkModify();
      this.startTime = startTime;
   }

   public int getDurationTime() {
      return this.durationTime;
   }

   public void setDurationTime(int durationTime) {
      this.checkModify();
      this.durationTime = durationTime;
   }

   public int getRewardTime() {
      return this.rewardTime;
   }

   public void setRewardTime(int rewardTime) {
      this.checkModify();
      this.rewardTime = rewardTime;
   }
}
