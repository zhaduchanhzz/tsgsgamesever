package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "dragonStrengthenBattle"
)
public class DragonStrengthenBattleModel extends BaseModel {
   @ModelColumnAnno(
      comment = "阶级层数",
      isPrimaty = true
   )
   private int stage;
   @ModelColumnAnno(
      comment = "战斗id"
   )
   private int battleId;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 5,
      comment = "奖励道具"
   )
   private List<ResourceModel> reward = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 5,
      comment = "扫荡奖励道具"
   )
   private List<ResourceModel> fastAtk = new ArrayList();

   public int getStage() {
      return this.stage;
   }

   public void setStage(int stage) {
      this.checkModify();
      this.stage = stage;
   }

   public int getBattleId() {
      return this.battleId;
   }

   public void setBattleId(int battleId) {
      this.checkModify();
      this.battleId = battleId;
   }

   public List<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(List<ResourceModel> reward) {
      this.checkModify();
      this.reward = reward;
   }

   public List<ResourceModel> getFastAtk() {
      return this.fastAtk;
   }

   public void setFastAtk(List<ResourceModel> fastAtk) {
      this.checkModify();
      this.fastAtk = fastAtk;
   }
}
