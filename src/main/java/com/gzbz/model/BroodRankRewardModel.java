package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "broodRankReward"
)
public class BroodRankRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "奖池类型"
   )
   private int rewardType;
   @ModelColumnAnno(
      comment = "日期组起始"
   )
   private int dateStart;
   @ModelColumnAnno(
      comment = "日期组末尾"
   )
   private int dateEnd;
   @ModelColumnAnno(
      comment = "排名上限"
   )
   private int rankMax;
   @ModelColumnAnno(
      comment = "排名下限"
   )
   private int rankMin;
   @ModelColumnAnno(
      comment = "上榜所需积分"
   )
   private int rankNeedScore;
   @ModelColumnAnno(
      comment = "是否显示在排行榜列表"
   )
   private int isTemp;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 2,
      subCls = ResourceModel.class,
      count = 4
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      comment = "邮件id"
   )
   private int mailId;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getRewardType() {
      return this.rewardType;
   }

   public void setRewardType(int rewardType) {
      this.rewardType = rewardType;
   }

   public int getDateStart() {
      return this.dateStart;
   }

   public void setDateStart(int dateStart) {
      this.dateStart = dateStart;
   }

   public int getDateEnd() {
      return this.dateEnd;
   }

   public void setDateEnd(int dateEnd) {
      this.dateEnd = dateEnd;
   }

   public int getRankMax() {
      return this.rankMax;
   }

   public void setRankMax(int rankMax) {
      this.rankMax = rankMax;
   }

   public int getRankMin() {
      return this.rankMin;
   }

   public void setRankMin(int rankMin) {
      this.rankMin = rankMin;
   }

   public int getRankNeedScore() {
      return this.rankNeedScore;
   }

   public void setRankNeedScore(int rankNeedScore) {
      this.rankNeedScore = rankNeedScore;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.rewards = rewards;
   }

   public int getMailId() {
      return this.mailId;
   }

   public void setMailId(int mailId) {
      this.mailId = mailId;
   }

   public int getIsTemp() {
      return this.isTemp;
   }

   public void setIsTemp(int isTemp) {
      this.isTemp = isTemp;
   }
}
