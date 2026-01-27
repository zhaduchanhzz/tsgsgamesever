package com.gzbz.model;

import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "offerRewardDetail"
)
public class OfferRewardDetailModel extends BaseModel {
   @ModelColumnAnno(
      comment = "id",
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "任务组"
   )
   private int taskGroup;
   @ModelColumnAnno(
      comment = "战斗id"
   )
   private int battleId;
   @ModelColumnAnno(
      comment = "发布悬赏奖励组"
   )
   private int offerRewardAwardGroup;
   @ModelColumnAnno(
      comment = "挑战奖励",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3
   )
   private List<ResourceModel> battleAward = new ArrayList();
   @ModelColumnAnno(
      comment = "击杀奖励"
   )
   private int killAwardGroup;
   @ModelColumnAnno(
      comment = "排名奖励组"
   )
   private int rankAwardGroup;
   @ModelColumnAnno(
      comment = "悬赏存在时间"
   )
   private int timeLimit;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getTaskGroup() {
      return this.taskGroup;
   }

   public void setTaskGroup(int taskGroup) {
      this.checkModify();
      this.taskGroup = taskGroup;
   }

   public int getBattleId() {
      return this.battleId;
   }

   public void setBattleId(int battleId) {
      this.checkModify();
      this.battleId = battleId;
   }

   public List<ResourceModel> getBattleAward() {
      return this.battleAward;
   }

   public void setBattleAward(List<ResourceModel> battleAward) {
      this.checkModify();
      this.battleAward = battleAward;
   }

   public int getRankAwardGroup() {
      return this.rankAwardGroup;
   }

   public void setRankAwardGroup(int rankAwardGroup) {
      this.checkModify();
      this.rankAwardGroup = rankAwardGroup;
   }

   public int getTimeLimit() {
      return this.timeLimit;
   }

   public void setTimeLimit(int timeLimit) {
      this.checkModify();
      this.timeLimit = timeLimit;
   }

   public int getOfferRewardAwardGroup() {
      return this.offerRewardAwardGroup;
   }

   public void setOfferRewardAwardGroup(int offerRewardAwardGroup) {
      this.checkModify();
      this.offerRewardAwardGroup = offerRewardAwardGroup;
   }

   public int getKillAwardGroup() {
      return this.killAwardGroup;
   }

   public void setKillAwardGroup(int killAwardGroup) {
      this.checkModify();
      this.killAwardGroup = killAwardGroup;
   }

   public long getMasterHp() {
      BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", this.getBattleId());
      if (battleModel == null) {
         return 0L;
      } else {
         long hp = 0L;
         BattlePKTeam pkTeam = new BattlePKTeam(this.getBattleId());

         for(Entity entity : pkTeam.getEntityMap().values()) {
            hp += entity.getBaseProperty(1);
         }

         return hp;
      }
   }
}
