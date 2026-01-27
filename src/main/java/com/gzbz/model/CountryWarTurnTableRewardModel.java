package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "countryWarTurnTableReward"
)
public class CountryWarTurnTableRewardModel extends BaseModel {
   @ModelColumnAnno(
      columnName = "pos",
      isPrimaty = true,
      comment = "位置"
   )
   private int pos;
   @ModelColumnAnno(
      columnName = "girdReward",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "格子数据"
   )
   private List<ResourceModel> girdReward = new ArrayList();
   @ModelColumnAnno(
      columnName = "weight",
      comment = "权重"
   )
   private int weight;

   public int getPos() {
      return this.pos;
   }

   public void setPos(int pos) {
      this.checkModify();
      this.pos = pos;
   }

   public List<ResourceModel> getGirdReward() {
      return this.girdReward;
   }

   public void setGirdReward(List<ResourceModel> girdReward) {
      this.checkModify();
      this.girdReward = girdReward;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }
}
