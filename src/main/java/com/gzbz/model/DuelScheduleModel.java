package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "duelSchedule"
)
public class DuelScheduleModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "id",
      isPrimaty = true,
      comment = "ID"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "fightNum",
      comment = "挑战次数累计"
   )
   private int fightNum;
   @ModelColumnAnno(
      columnName = "rewardType",
      comment = "奖励类型"
   )
   private int rewardType;
   @ModelColumnAnno(
      columnName = "rewardId",
      comment = "奖励ID"
   )
   private int rewardId;
   @ModelColumnAnno(
      columnName = "rewardNum",
      comment = "奖励数量"
   )
   private int rewardNum;
   @ModelColumnAnno(
      columnName = "status",
      comment = "奖励可领取状态"
   )
   private int status;
   @ModelColumnAnno(
      columnName = "resetTime",
      comment = "重置时间"
   )
   private String resetTime;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getFightNum() {
      return this.fightNum;
   }

   public void setFightNum(int fightNum) {
      this.checkModify();
      this.fightNum = fightNum;
   }

   public int getRewardType() {
      return this.rewardType;
   }

   public void setRewardType(int rewardType) {
      this.checkModify();
      this.rewardType = rewardType;
   }

   public int getRewardId() {
      return this.rewardId;
   }

   public void setRewardId(int rewardId) {
      this.checkModify();
      this.rewardId = rewardId;
   }

   public int getRewardNum() {
      return this.rewardNum;
   }

   public void setRewardNum(int rewardNum) {
      this.checkModify();
      this.rewardNum = rewardNum;
   }

   public int getStatus() {
      return this.status;
   }

   public void setStatus(int status) {
      this.checkModify();
      this.status = status;
   }

   public String getResetTime() {
      return this.resetTime;
   }

   public void setResetTime(String resetTime) {
      this.checkModify();
      this.resetTime = resetTime;
   }
}
