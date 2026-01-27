package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "offerReward"
)
public class OfferRewardModel extends BaseModel {
   @ModelColumnAnno(
      comment = "id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "击杀奖励"
   )
   private int killAward;
   @ModelColumnAnno(
      comment = "排名奖励组"
   )
   private int rankAwardGroup;
   @ModelColumnAnno(
      comment = "排名奖励第一名"
   )
   private int rankAwardno1;
   @ModelColumnAnno(
      comment = "挑战掉落的积分"
   )
   private int challengePoint;
   @ModelColumnAnno(
      comment = "击杀掉落的积分"
   )
   private int killPoint;
   @ModelColumnAnno(
      comment = "挑战奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 5
   )
   private List<ResourceModel> items = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getKillAward() {
      return this.killAward;
   }

   public void setKillAward(int killAward) {
      this.checkModify();
      this.killAward = killAward;
   }

   public int getRankAwardGroup() {
      return this.rankAwardGroup;
   }

   public void setRankAwardGroup(int rankAwardGroup) {
      this.checkModify();
      this.rankAwardGroup = rankAwardGroup;
   }

   public int getRankAwardno1() {
      return this.rankAwardno1;
   }

   public void setRankAwardno1(int rankAwardno1) {
      this.checkModify();
      this.rankAwardno1 = rankAwardno1;
   }

   public int getChallengePoint() {
      return this.challengePoint;
   }

   public void setChallengePoint(int challengePoint) {
      this.checkModify();
      this.challengePoint = challengePoint;
   }

   public int getKillPoint() {
      return this.killPoint;
   }

   public void setKillPoint(int killPoint) {
      this.checkModify();
      this.killPoint = killPoint;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }
}
