package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "GreatCityGameBattle"
)
public class GreatCityGameBattleModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "战力区间起"
   )
   private int powerStart;
   @ModelColumnAnno(
      comment = "战力区间末"
   )
   private int powerEnd;
   @ModelColumnAnno(
      comment = "战斗id",
      columnName = "battleID"
   )
   private int battleId;
   @ModelColumnAnno(
      comment = "战斗回合数"
   )
   private int round;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public int getPowerStart() {
      return this.powerStart;
   }

   public void setPowerStart(int powerStart) {
      this.checkModify();
      this.powerStart = powerStart;
   }

   public int getPowerEnd() {
      return this.powerEnd;
   }

   public void setPowerEnd(int powerEnd) {
      this.checkModify();
      this.powerEnd = powerEnd;
   }

   public int getBattleId() {
      return this.battleId;
   }

   public void setBattleId(int battleId) {
      this.checkModify();
      this.battleId = battleId;
   }

   public int getRound() {
      return this.round;
   }

   public void setRound(int round) {
      this.checkModify();
      this.round = round;
   }
}
