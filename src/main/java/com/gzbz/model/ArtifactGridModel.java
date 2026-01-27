package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "artifactgrid"
)
public class ArtifactGridModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "格子id",
      columnName = "id"
   )
   private int gridId;
   @ModelColumnAnno(
      comment = "格子类型"
   )
   private int gridType;
   @ModelColumnAnno(
      comment = "战斗ID"
   )
   private int battleId;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "奖励",
      columnName = "reward"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "击杀后的奖励",
      columnName = "strikereward"
   )
   private List<ResourceModel> strikeReward = new ArrayList();

   public int getGridId() {
      return this.gridId;
   }

   public void setGridId(int gridId) {
      this.checkModify();
      this.gridId = gridId;
   }

   public int getGridType() {
      return this.gridType;
   }

   public void setGridType(int gridType) {
      this.checkModify();
      this.gridType = gridType;
   }

   public int getBattleId() {
      return this.battleId;
   }

   public void setBattleId(int battleId) {
      this.checkModify();
      this.battleId = battleId;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public List<ResourceModel> getStrikeReward() {
      return this.strikeReward;
   }

   public void setStrikeReward(List<ResourceModel> strikeReward) {
      this.strikeReward = strikeReward;
   }
}
