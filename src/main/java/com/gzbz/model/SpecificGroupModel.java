package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "specificGroup"
)
public class SpecificGroupModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "物品组id"
   )
   private int itemgroupID;
   @ModelColumnAnno(
      comment = "物品组类型"
   )
   private int groupType;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 5,
      comment = "物品"
   )
   private List<ResourceModel> rewards = new ArrayList();

   public int getItemgroupID() {
      return this.itemgroupID;
   }

   public void setItemgroupID(int itemgroupID) {
      this.checkModify();
      this.itemgroupID = itemgroupID;
   }

   public int getGroupType() {
      return this.groupType;
   }

   public void setGroupType(int groupType) {
      this.checkModify();
      this.groupType = groupType;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
