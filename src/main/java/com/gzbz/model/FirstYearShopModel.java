package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "FristYearShop"
)
public class FirstYearShopModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      columnName = "rewards",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "奖励"
   )
   private List<ResourceModel> rewards = new ArrayList();
   @ModelColumnAnno(
      columnName = "resource",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "消耗资源"
   )
   private List<ResourceModel> resource = new ArrayList();
   @ModelColumnAnno(
      columnName = "ratio"
   )
   private int ratio;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }

   public List<ResourceModel> getResource() {
      return this.resource;
   }

   public void setResource(List<ResourceModel> resource) {
      this.checkModify();
      this.resource = resource;
   }

   public int getRatio() {
      return this.ratio;
   }

   public void setRatio(int ratio) {
      this.checkModify();
      this.ratio = ratio;
   }
}
