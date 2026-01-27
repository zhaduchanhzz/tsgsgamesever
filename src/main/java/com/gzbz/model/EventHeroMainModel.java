package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "eventHeroMain"
)
public class EventHeroMainModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "主题id"
   )
   private int mainId;
   @ModelColumnAnno(
      comment = "开服天数组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "开服天数组末尾"
   )
   private int dataEnd;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityId;
   @ModelColumnAnno(
      comment = "活动武将id"
   )
   private int heroId;
   @ModelColumnAnno(
      comment = "挑战次数"
   )
   private int EventHeroFightTime;
   @ModelColumnAnno(
      comment = "匹配时间"
   )
   private int EventHeroMatchTime;
   @ModelColumnAnno(
      comment = "首领id"
   )
   private int EventHeroBossId;
   @ModelColumnAnno(
      comment = "场景id"
   )
   private int EventHeroBattleSceneId;
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
      comment = "远征章节id"
   )
   private int bannerId;
   @ModelColumnAnno(
      comment = "邮件id"
   )
   private String mailId;
   @ModelColumnAnno(
      comment = "每日抽奖次数上限"
   )
   private int dayLimit;
   @ModelColumnAnno(
      comment = "道具转化"
   )
   private int changeItemId;
   @ModelColumnAnno(
      comment = "积分类型"
   )
   private int integralType;
   @ModelColumnAnno(
      comment = "积分id"
   )
   private int integralId;
   @ModelColumnAnno(
      comment = "是否开启累充"
   )
   private int isRecharge;
   @ModelColumnAnno(
      comment = "是否开启预告"
   )
   private int isAdvance;
   @ModelColumnAnno(
      comment = "是否开启连充"
   )
   private int isConRecharge;

   public int getMainId() {
      return this.mainId;
   }

   public void setMainId(int mainId) {
      this.checkModify();
      this.mainId = mainId;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public void setDateStart(int dateStart) {
      this.checkModify();
      this.dateStart = dateStart;
   }

   public int getDataEnd() {
      return this.dataEnd;
   }

   public void setDataEnd(int dataEnd) {
      this.checkModify();
      this.dataEnd = dataEnd;
   }

   public int getActivityId() {
      return this.activityId;
   }

   public void setActivityId(int activityId) {
      this.checkModify();
      this.activityId = activityId;
   }

   public int getHeroId() {
      return this.heroId;
   }

   public void setHeroId(int heroId) {
      this.checkModify();
      this.heroId = heroId;
   }

   public int getEventHeroFightTime() {
      return this.EventHeroFightTime;
   }

   public void setEventHeroFightTime(int eventHeroFightTime) {
      this.checkModify();
      this.EventHeroFightTime = eventHeroFightTime;
   }

   public int getEventHeroMatchTime() {
      return this.EventHeroMatchTime;
   }

   public void setEventHeroMatchTime(int eventHeroMatchTime) {
      this.checkModify();
      this.EventHeroMatchTime = eventHeroMatchTime;
   }

   public int getEventHeroBossId() {
      return this.EventHeroBossId;
   }

   public void setEventHeroBossId(int eventHeroBossId) {
      this.checkModify();
      this.EventHeroBossId = eventHeroBossId;
   }

   public int getEventHeroBattleSceneId() {
      return this.EventHeroBattleSceneId;
   }

   public void setEventHeroBattleSceneId(int eventHeroBattleSceneId) {
      this.checkModify();
      this.EventHeroBattleSceneId = eventHeroBattleSceneId;
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

   public int getBannerId() {
      return this.bannerId;
   }

   public void setBannerId(int bannerId) {
      this.checkModify();
      this.bannerId = bannerId;
   }

   public String getMailId() {
      return this.mailId;
   }

   public void setMailId(String mailId) {
      this.checkModify();
      this.mailId = mailId;
   }

   public int getDayLimit() {
      return this.dayLimit;
   }

   public void setDayLimit(int dayLimit) {
      this.checkModify();
      this.dayLimit = dayLimit;
   }

   public int getChangeItemId() {
      return this.changeItemId;
   }

   public void setChangeItemId(int changeItemId) {
      this.checkModify();
      this.changeItemId = changeItemId;
   }

   public int getIntegralType() {
      return this.integralType;
   }

   public void setIntegralType(int integralType) {
      this.checkModify();
      this.integralType = integralType;
   }

   public int getIntegralId() {
      return this.integralId;
   }

   public void setIntegralId(int integralId) {
      this.checkModify();
      this.integralId = integralId;
   }

   public int getIsRecharge() {
      return this.isRecharge;
   }

   public void setIsRecharge(int isRecharge) {
      this.checkModify();
      this.isRecharge = isRecharge;
   }

   public boolean getIsAdvance() {
      return this.isAdvance == 1;
   }

   public int getIsConRecharge() {
      return this.isConRecharge;
   }

   public void setIsConRecharge(int isConRecharge) {
      this.checkModify();
      this.isConRecharge = isConRecharge;
   }
}
