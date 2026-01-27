package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "dragonWarMain"
)
public class DragonWarMainModel extends BaseModel {
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
      comment = "层"
   )
   private int floor;
   @ModelColumnAnno(
      columnName = "battleId",
      comment = "战斗id",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> battleId = new ArrayList();
   @ModelColumnAnno(
      comment = "战斗场景"
   )
   private int battkeScene;
   @ModelColumnAnno(
      comment = "队伍数量"
   )
   private int supportType;
   @ModelColumnAnno(
      comment = "固定buffId"
   )
   private int buffId;
   @ModelColumnAnno(
      comment = "回合数"
   )
   private int roundLimit;

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

   public int getFloor() {
      return this.floor;
   }

   public void setFloor(int floor) {
      this.checkModify();
      this.floor = floor;
   }

   public List<Integer> getBattleId() {
      return this.battleId;
   }

   public void setBattleId(List<Integer> battleId) {
      this.checkModify();
      this.battleId = battleId;
   }

   public int getBattkeScene() {
      return this.battkeScene;
   }

   public void setBattkeScene(int battkeScene) {
      this.checkModify();
      this.battkeScene = battkeScene;
   }

   public int getSupportType() {
      return this.supportType;
   }

   public void setSupportType(int supportType) {
      this.checkModify();
      this.supportType = supportType;
   }

   public int getBuffId() {
      return this.buffId;
   }

   public void setBuffId(int buffId) {
      this.checkModify();
      this.buffId = buffId;
   }

   public int getRoundLimit() {
      return this.roundLimit;
   }

   public void setRoundLimit(int roundLimit) {
      this.checkModify();
      this.roundLimit = roundLimit;
   }
}
