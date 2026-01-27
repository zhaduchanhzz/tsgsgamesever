package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "equipEnchantHot"
)
public class EquipEnchantHotModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "装备名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "升星后装备"
   )
   private int stageUpId;
   @ModelColumnAnno(
      comment = "附魔返还(获得)"
   )
   private int enchantHotId;
   @ModelColumnAnno(
      comment = "评分"
   )
   private int score;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "附魔激活消耗"
   )
   private List<ResourceModel> enchantCost = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "返还消耗"
   )
   private List<ResourceModel> returnCost = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2,
      comment = "基础属性"
   )
   private List<PropertyModel> baseProperty = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2,
      comment = "专属属性"
   )
   private List<PropertyModel> extraProperty = new ArrayList();

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

   public int getStageUpId() {
      return this.stageUpId;
   }

   public void setStageUpId(int stageUpId) {
      this.checkModify();
      this.stageUpId = stageUpId;
   }

   public int getEnchantHotId() {
      return this.enchantHotId;
   }

   public void setEnchantHotId(int enchantHotId) {
      this.checkModify();
      this.enchantHotId = enchantHotId;
   }

   public List<ResourceModel> getEnchantCost() {
      return this.enchantCost;
   }

   public void setEnchantCost(List<ResourceModel> enchantCost) {
      this.checkModify();
      this.enchantCost = enchantCost;
   }

   public List<ResourceModel> getReturnCost() {
      return this.returnCost;
   }

   public void setReturnCost(List<ResourceModel> returnCost) {
      this.checkModify();
      this.returnCost = returnCost;
   }

   public List<PropertyModel> getBaseProperty() {
      return this.baseProperty;
   }

   public void setBaseProperty(List<PropertyModel> baseProperty) {
      this.checkModify();
      this.baseProperty = baseProperty;
   }

   public List<PropertyModel> getExtraProperty() {
      return this.extraProperty;
   }

   public void setExtraProperty(List<PropertyModel> extraProperty) {
      this.checkModify();
      this.extraProperty = extraProperty;
   }

   public int getScore() {
      return this.score;
   }

   public void setScore(int score) {
      this.checkModify();
      this.score = score;
   }
}
