package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "zhongqiuPray"
)
public class MidAutumnPrayModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true
   )
   private int id;
   @ModelColumnAnno(
      comment = "第几层"
   )
   private int tier;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "祈福奖励"
   )
   private List<ResourceModel> reward = new ArrayList();
   @ModelColumnAnno(
      comment = "前置抽取需求",
      columnName = "floorNum"
   )
   private int floorNum;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int weight;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getTier() {
      return this.tier;
   }

   public void setTier(int tier) {
      this.checkModify();
      this.tier = tier;
   }

   public int getFloorNum() {
      return this.floorNum;
   }

   public void setFloorNum(int floorNum) {
      this.checkModify();
      this.floorNum = floorNum;
   }

   public List<ResourceModel> getReward() {
      return this.reward;
   }

   public void setReward(List<ResourceModel> reward) {
      this.checkModify();
      this.reward = reward;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }
}
