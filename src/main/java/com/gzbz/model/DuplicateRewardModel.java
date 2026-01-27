package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "DuplicateRewards"
)
public class DuplicateRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "副本难度"
   )
   private String warPoweTrouble;
   @ModelColumnAnno(
      comment = "活动id"
   )
   private int activityID;
   @ModelColumnAnno(
      comment = "副本类型"
   )
   private int DuplicateType;
   @ModelColumnAnno(
      comment = "开启条件"
   )
   private long openCondition;
   @ModelColumnAnno(
      comment = "战斗id"
   )
   private int battleId;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "奖励道具",
      count = 2
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "reissuerewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "补发奖励",
      count = 2
   )
   private List<ResourceModel> reissuerewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getWarPoweTrouble() {
      return this.warPoweTrouble;
   }

   public void setWarPoweTrouble(String warPoweTrouble) {
      this.checkModify();
      this.warPoweTrouble = warPoweTrouble;
   }

   public int getDuplicateType() {
      return this.DuplicateType;
   }

   public void setDuplicateType(int duplicateType) {
      this.checkModify();
      this.DuplicateType = duplicateType;
   }

   public long getOpenCondition() {
      return this.openCondition;
   }

   public void setOpenCondition(long openCondition) {
      this.checkModify();
      this.openCondition = openCondition;
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

   public List<ResourceModel> getReissuerewards() {
      return this.reissuerewards;
   }

   public void setReissuerewards(List<ResourceModel> reissuerewards) {
      this.checkModify();
      this.reissuerewards = reissuerewards;
   }

   public int getActivityID() {
      return this.activityID;
   }

   public void setActivityID(int activityID) {
      this.activityID = activityID;
   }
}
