package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "dailyTopUp"
)
public class DailyTopUpModel extends BaseModel {
   @ModelColumnAnno(
      comment = "礼包ID"
   )
   private int dailyTopUpId;
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "礼包类型"
   )
   private int dailyTopUpType;
   @ModelColumnAnno(
      comment = "需要充值金额"
   )
   private int needTopUp;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 4,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "重置时间"
   )
   private String resetTime;

   public int getDailyTopUpId() {
      return this.dailyTopUpId;
   }

   public void setDailyTopUpId(int dailyTopUpId) {
      this.checkModify();
      this.dailyTopUpId = dailyTopUpId;
   }

   public int getDailyTopUpType() {
      return this.dailyTopUpType;
   }

   public void setDailyTopUpType(int dailyTopUpType) {
      this.checkModify();
      this.dailyTopUpType = dailyTopUpType;
   }

   public int getNeedTopUp() {
      return this.needTopUp;
   }

   public void setNeedTopUp(int needTopUp) {
      this.checkModify();
      this.needTopUp = needTopUp;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public String getResetTime() {
      return this.resetTime;
   }

   public void setResetTime(String resetTime) {
      this.checkModify();
      this.resetTime = resetTime;
   }
}
