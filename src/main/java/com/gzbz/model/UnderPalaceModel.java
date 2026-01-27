package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "underPalace"
)
public class UnderPalaceModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "关卡id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "关卡类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "层数"
   )
   private int stageNum;
   @ModelColumnAnno(
      comment = "下一层id"
   )
   private int nextStageID;
   @ModelColumnAnno(
      comment = "解锁条件"
   )
   private int hotStage;
   @ModelColumnAnno(
      columnName = "passAwards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 5,
      comment = "普通奖励"
   )
   private List<ResourceModel> passAwards = new ArrayList();
   @ModelColumnAnno(
      comment = "战斗id"
   )
   private int battleId;
   @ModelColumnAnno(
      comment = "战斗场景id"
   )
   private int battleScene;
   @ModelColumnAnno(
      comment = "buff库"
   )
   private int buffLab;
   @ModelColumnAnno(
      comment = "buff选择数量"
   )
   private int buffNum;
   @ModelColumnAnno(
      columnName = "stagePassAwards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 5,
      comment = "通关奖励"
   )
   private List<ResourceModel> stagePassAwards = new ArrayList();
   @ModelColumnAnno(
      comment = "第二支战斗id"
   )
   private int battleId2;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getStageNum() {
      return this.stageNum;
   }

   public void setStageNum(int stageNum) {
      this.checkModify();
      this.stageNum = stageNum;
   }

   public int getHotStage() {
      return this.hotStage;
   }

   public void setHotStage(int hotStage) {
      this.checkModify();
      this.hotStage = hotStage;
   }

   public List<ResourceModel> getPassAwards() {
      return this.passAwards;
   }

   public void setPassAwards(List<ResourceModel> passAwards) {
      this.checkModify();
      this.passAwards = passAwards;
   }

   public int getBattleId() {
      return this.battleId;
   }

   public void setBattleId(int battleId) {
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

   public int getBuffLab() {
      return this.buffLab;
   }

   public void setBuffLab(int buffLab) {
      this.checkModify();
      this.buffLab = buffLab;
   }

   public int getBuffNum() {
      return this.buffNum;
   }

   public void setBuffNum(int buffNum) {
      this.checkModify();
      this.buffNum = buffNum;
   }

   public List<ResourceModel> getStagePassAwards() {
      return this.stagePassAwards;
   }

   public void setStagePassAwards(List<ResourceModel> stagePassAwards) {
      this.checkModify();
      this.stagePassAwards = stagePassAwards;
   }

   public int getNextStageID() {
      return this.nextStageID;
   }

   public void setNextStageID(int nextStageID) {
      this.nextStageID = nextStageID;
   }

   public int getBattleId2() {
      return this.battleId2;
   }

   public void setBattleId2(int battleId2) {
      this.checkModify();
      this.battleId2 = battleId2;
   }
}
