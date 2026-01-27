package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "battleHeroTraining"
)
public class BattleHeroTrainingModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id，试炼层数"
   )
   private int id;
   @ModelColumnAnno(
      comment = "战斗名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "怪物组id"
   )
   private int monsterGroupId;
   @ModelColumnAnno(
      comment = "回合限制"
   )
   private byte boutCount;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "通关奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.checkModify();
      this.name = name;
   }

   public int getMonsterGroupId() {
      return this.monsterGroupId;
   }

   public void setMonsterGroupId(int monsterGroupId) {
      this.checkModify();
      this.monsterGroupId = monsterGroupId;
   }

   public byte getBoutCount() {
      return this.boutCount;
   }

   public void setBoutCount(byte boutCount) {
      this.checkModify();
      this.boutCount = boutCount;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
