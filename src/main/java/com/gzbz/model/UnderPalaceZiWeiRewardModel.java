package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "underPalaceZiWeiReward"
)
public class UnderPalaceZiWeiRewardModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "层数"
   )
   private int id;
   @ModelColumnAnno(
      columnName = "allPassAwards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 5,
      comment = "奖励"
   )
   private List<ResourceModel> allPassAwards = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<ResourceModel> getAllPassAwards() {
      return this.allPassAwards;
   }

   public void setAllPassAwards(List<ResourceModel> allPassAwards) {
      this.checkModify();
      this.allPassAwards = allPassAwards;
   }
}
