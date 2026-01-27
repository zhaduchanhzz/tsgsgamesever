package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "sacrifice"
)
public class SacrificeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "祭祀类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "祭祀次数"
   )
   private int times;
   @ModelColumnAnno(
      comment = "优先消耗道具",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> firstItem = new ArrayList();
   @ModelColumnAnno(
      comment = "消耗道具代替",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> replaceItem = new ArrayList();
   @ModelColumnAnno(
      comment = "祭祀积分"
   )
   private int exReward;
   @ModelColumnAnno(
      comment = "祭祀使用普通库"
   )
   private int ordinaryLib;
   @ModelColumnAnno(
      comment = "祭祀保底奖励库"
   )
   private int floorLib;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "额外奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getTimes() {
      return this.times;
   }

   public void setTimes(int times) {
      this.checkModify();
      this.times = times;
   }

   public List<Integer> getFirstItem() {
      return this.firstItem;
   }

   public void setFirstItem(List<Integer> firstItem) {
      this.checkModify();
      this.firstItem = firstItem;
   }

   public List<Integer> getReplaceItem() {
      return this.replaceItem;
   }

   public void setReplaceItem(List<Integer> replaceItem) {
      this.checkModify();
      this.replaceItem = replaceItem;
   }

   public int getExReward() {
      return this.exReward;
   }

   public void setExReward(int exReward) {
      this.checkModify();
      this.exReward = exReward;
   }

   public int getOrdinaryLib() {
      return this.ordinaryLib;
   }

   public void setOrdinaryLib(int ordinaryLib) {
      this.checkModify();
      this.ordinaryLib = ordinaryLib;
   }

   public int getFloorLib() {
      return this.floorLib;
   }

   public void setFloorLib(int floorLib) {
      this.checkModify();
      this.floorLib = floorLib;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
