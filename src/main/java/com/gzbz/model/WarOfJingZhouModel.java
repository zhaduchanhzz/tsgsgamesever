package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warOfJingZhou"
)
public class WarOfJingZhouModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "所属阵营"
   )
   private int faction;
   @ModelColumnAnno(
      comment = "关卡id"
   )
   private int layerId;
   @ModelColumnAnno(
      comment = "下一关卡id"
   )
   private int nextLayerId;
   @ModelColumnAnno(
      comment = "战斗id"
   )
   private String battleId;
   @ModelColumnAnno(
      comment = "战斗场景id"
   )
   private int battleScene;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "首通奖励"
   )
   private List<ResourceModel> firstRewards = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "扫荡奖励"
   )
   private List<ResourceModel> sweepRewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getFaction() {
      return this.faction;
   }

   public void setFaction(int faction) {
      this.checkModify();
      this.faction = faction;
   }

   public int getLayerId() {
      return this.layerId;
   }

   public void setLayerId(int layerId) {
      this.checkModify();
      this.layerId = layerId;
   }

   public int getNextLayerId() {
      return this.nextLayerId;
   }

   public void setNextLayerId(int nextLayerId) {
      this.checkModify();
      this.nextLayerId = nextLayerId;
   }

   public String getBattleId() {
      return this.battleId;
   }

   public void setBattleId(String battleId) {
      this.checkModify();
      this.battleId = battleId;
   }

   public int getBattleScene() {
      return this.battleScene;
   }

   public void setBattleScene(int battleScene) {
      this.checkModify();
      this.battleScene = battleScene;
   }

   public List<ResourceModel> getFirstRewards() {
      return this.firstRewards;
   }

   public void setFirstRewards(List<ResourceModel> firstRewards) {
      this.checkModify();
      this.firstRewards = firstRewards;
   }

   public List<ResourceModel> getSweepRewards() {
      return this.sweepRewards;
   }

   public void setSweepRewards(List<ResourceModel> sweepRewards) {
      this.checkModify();
      this.sweepRewards = sweepRewards;
   }
}
