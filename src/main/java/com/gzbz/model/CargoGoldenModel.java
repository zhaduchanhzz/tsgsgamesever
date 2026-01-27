package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "cargoGolden"
)
public class CargoGoldenModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "伤害最小值"
   )
   private long minHurt;
   @ModelColumnAnno(
      comment = "伤害最大值"
   )
   private long maxHurt;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "击沉奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "单次拦截奖励"
   )
   private List<ResourceModel> cRewards = new ArrayList();
   @ModelColumnAnno(
      comment = "战斗id"
   )
   private int battleId;
   @ModelColumnAnno(
      comment = "战斗回合"
   )
   private int roundNum;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "结算奖励"
   )
   private List<ResourceModel> countRewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public long getMinHurt() {
      return this.minHurt;
   }

   public void setMinHurt(long minHurt) {
      this.minHurt = minHurt;
   }

   public long getMaxHurt() {
      return this.maxHurt;
   }

   public void setMaxHurt(long maxHurt) {
      this.maxHurt = maxHurt;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.rewards = rewards;
   }

   public List<ResourceModel> getcRewards() {
      return this.cRewards;
   }

   public void setcRewards(List<ResourceModel> cRewards) {
      this.cRewards = cRewards;
   }

   public int getBattleId() {
      return this.battleId;
   }

   public void setBattleId(int battleId) {
      this.battleId = battleId;
   }

   public int getRoundNum() {
      return this.roundNum;
   }

   public void setRoundNum(int roundNum) {
      this.roundNum = roundNum;
   }

   public List<ResourceModel> getCountRewards() {
      return this.countRewards;
   }

   public void setCountRewards(List<ResourceModel> countRewards) {
      this.checkModify();
      this.countRewards = countRewards;
   }
}
