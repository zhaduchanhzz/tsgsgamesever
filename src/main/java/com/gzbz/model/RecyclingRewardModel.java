package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "recyclingReward"
)
public class RecyclingRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "星级"
   )
   private int star;
   @ModelColumnAnno(
      comment = "物品",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3
   )
   private ArrayList<ResourceModel> rewardList = new ArrayList();

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public ArrayList<ResourceModel> getRewardList() {
      return this.rewardList;
   }

   public void setRewardList(ArrayList<ResourceModel> rewardList) {
      this.checkModify();
      this.rewardList = rewardList;
   }
}
