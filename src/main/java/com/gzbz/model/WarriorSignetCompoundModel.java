package com.gzbz.model;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "warriorSignetCompound"
)
public class WarriorSignetCompoundModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "将印名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "合成的将印id（道具表内的）"
   )
   private int targetWarrior;
   @ModelColumnAnno(
      columnConvertType = 1,
      count = 4,
      subCls = KeyValFun.class,
      comment = "合成成功率"
   )
   private List<KeyValFun> rate = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      count = 2,
      subCls = ResourceModel.class,
      comment = "失败道具给予"
   )
   private List<ResourceModel> defeatItem = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      count = 1,
      subCls = ResourceModel.class,
      comment = "成功道具给予"
   )
   private List<ResourceModel> successItem = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      count = 1,
      subCls = ResourceModel.class,
      comment = "合成消耗"
   )
   private List<ResourceModel> cost = new ArrayList();

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

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getTargetWarrior() {
      return this.targetWarrior;
   }

   public void setTargetWarrior(int targetWarrior) {
      this.checkModify();
      this.targetWarrior = targetWarrior;
   }

   public List<KeyValFun> getRate() {
      return this.rate;
   }

   public void setRate(List<KeyValFun> rate) {
      this.checkModify();
      this.rate = rate;
   }

   public List<ResourceModel> getDefeatItem() {
      return this.defeatItem;
   }

   public void setDefeatItem(List<ResourceModel> defeatItem) {
      this.checkModify();
      this.defeatItem = defeatItem;
   }

   public List<ResourceModel> getCost() {
      return this.cost;
   }

   public void setCost(List<ResourceModel> cost) {
      this.checkModify();
      this.cost = cost;
   }

   public List<ResourceModel> getSuccessItem() {
      return this.successItem;
   }

   public void setSuccessItem(List<ResourceModel> successItem) {
      this.checkModify();
      this.successItem = successItem;
   }
}
