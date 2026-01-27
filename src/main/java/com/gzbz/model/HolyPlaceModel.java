package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "holyPlace"
)
public class HolyPlaceModel extends BaseModel {
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
      columnName = "searchAwards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "乱入探索奖励"
   )
   private List<ResourceModel> searchAwards = new ArrayList();
   @ModelColumnAnno(
      comment = "战斗id"
   )
   private int battleId;
   @ModelColumnAnno(
      comment = "战斗场景id"
   )
   private int battleScene;
   @ModelColumnAnno(
      columnName = "robSuccessAwards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "劫掠成功奖励"
   )
   private List<ResourceModel> robSuccessAwards = new ArrayList();
   @ModelColumnAnno(
      columnName = "robFailAwards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "劫掠失败奖励"
   )
   private List<ResourceModel> robFailAwards = new ArrayList();

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

   public int getNextStageID() {
      return this.nextStageID;
   }

   public void setNextStageID(int nextStageID) {
      this.checkModify();
      this.nextStageID = nextStageID;
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

   public List<ResourceModel> getSearchAwards() {
      return this.searchAwards;
   }

   public void setSearchAwards(List<ResourceModel> searchAwards) {
      this.checkModify();
      this.searchAwards = searchAwards;
   }

   public List<ResourceModel> getRobSuccessAwards() {
      return this.robSuccessAwards;
   }

   public void setRobSuccessAwards(List<ResourceModel> robSuccessAwards) {
      this.checkModify();
      this.robSuccessAwards = robSuccessAwards;
   }

   public List<ResourceModel> getRobFailAwards() {
      return this.robFailAwards;
   }

   public void setRobFailAwards(List<ResourceModel> robFailAwards) {
      this.checkModify();
      this.robFailAwards = robFailAwards;
   }
}
