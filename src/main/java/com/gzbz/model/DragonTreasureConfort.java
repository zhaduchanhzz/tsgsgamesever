package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "dragonTreasureConfort"
)
public class DragonTreasureConfort extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "第几期活动"
   )
   private int confortGroup;
   @ModelColumnAnno(
      comment = "幸运值"
   )
   private int luckPoint;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "奖励道具"
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getConfortGroup() {
      return this.confortGroup;
   }

   public void setConfortGroup(int confortGroup) {
      this.checkModify();
      this.confortGroup = confortGroup;
   }

   public int getLuckPoint() {
      return this.luckPoint;
   }

   public void setLuckPoint(int luckPoint) {
      this.checkModify();
      this.luckPoint = luckPoint;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
