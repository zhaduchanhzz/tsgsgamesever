package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "post"
)
public class PostModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "星级"
   )
   private int star;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "赠送物品"
   )
   private ArrayList<ResourceModel> rewards = new ArrayList();

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public ArrayList<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(ArrayList<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
