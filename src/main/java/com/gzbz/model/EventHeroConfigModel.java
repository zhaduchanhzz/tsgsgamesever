package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "eventHeroConfig"
)
public class EventHeroConfigModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "activityID"
   )
   private int activityID;
   @ModelColumnAnno(
      comment = "挑战次数"
   )
   private int EventHeroFightTime;
   @ModelColumnAnno(
      comment = "首领bossId"
   )
   private int EventHeroBossId;
   @ModelColumnAnno(
      comment = "匹配战力阶段"
   )
   private String EventHeroMatchPower;
   @ModelColumnAnno(
      comment = "挑战固定获得"
   )
   private String EventHeroBossReward;
   @ModelColumnAnno(
      comment = "奖励库数量"
   )
   private int EventHeroRandomCount;
   @ModelColumnAnno(
      comment = "挑战回合数"
   )
   private int EventHeroBossRound;
   @ModelColumnAnno(
      comment = "招募所需道具"
   )
   private int EventHeroCall;
   @ModelColumnAnno(
      comment = "邮件id"
   )
   private String mailId;

   public int getActivityID() {
      return this.activityID;
   }

   public void setActivityID(int activityID) {
      this.checkModify();
      this.activityID = activityID;
   }

   public int getEventHeroFightTime() {
      return this.EventHeroFightTime;
   }

   public void setEventHeroFightTime(int eventHeroFightTime) {
      this.checkModify();
      this.EventHeroFightTime = eventHeroFightTime;
   }

   public int getEventHeroBossId() {
      return this.EventHeroBossId;
   }

   public void setEventHeroBossId(int eventHeroBossId) {
      this.checkModify();
      this.EventHeroBossId = eventHeroBossId;
   }

   public String getEventHeroMatchPower() {
      return this.EventHeroMatchPower;
   }

   public void setEventHeroMatchPower(String eventHeroMatchPower) {
      this.checkModify();
      this.EventHeroMatchPower = eventHeroMatchPower;
   }

   public String getEventHeroBossReward() {
      return this.EventHeroBossReward;
   }

   public void setEventHeroBossReward(String eventHeroBossReward) {
      this.checkModify();
      this.EventHeroBossReward = eventHeroBossReward;
   }

   public int getEventHeroRandomCount() {
      return this.EventHeroRandomCount;
   }

   public void setEventHeroRandomCount(int eventHeroRandomCount) {
      this.checkModify();
      this.EventHeroRandomCount = eventHeroRandomCount;
   }

   public int getEventHeroBossRound() {
      return this.EventHeroBossRound;
   }

   public void setEventHeroBossRound(int eventHeroBossRound) {
      this.checkModify();
      this.EventHeroBossRound = eventHeroBossRound;
   }

   public int getEventHeroCall() {
      return this.EventHeroCall;
   }

   public void setEventHeroCall(int eventHeroCall) {
      this.checkModify();
      this.EventHeroCall = eventHeroCall;
   }

   public String getMailId() {
      return this.mailId;
   }

   public void setMailId(String mailId) {
      this.checkModify();
      this.mailId = mailId;
   }
}
