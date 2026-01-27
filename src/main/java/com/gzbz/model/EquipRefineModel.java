package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "EquipRefine"
)
public class EquipRefineModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "装备类型"
   )
   private int equipType;
   @ModelColumnAnno(
      comment = "精炼等级"
   )
   private int refineLevel;
   @ModelColumnAnno(
      comment = "前置精炼次数"
   )
   private int refinetime;
   @ModelColumnAnno(
      comment = "精炼概率"
   )
   private int refineChance;
   @ModelColumnAnno(
      comment = "概率材料",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> chance = new ArrayList();
   @ModelColumnAnno(
      comment = "提升概率率"
   )
   private int andChance;
   @ModelColumnAnno(
      comment = "基础属性",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2
   )
   private List<PropertyModel> base = new ArrayList();
   @ModelColumnAnno(
      comment = "额外属性",
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 1
   )
   private List<PropertyModel> additional = new ArrayList();
   @ModelColumnAnno(
      comment = "消耗材料",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2
   )
   private List<ResourceModel> consumes = new ArrayList();
   @ModelColumnAnno(
      comment = "返还材料",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> backMaterial = new ArrayList();
   @ModelColumnAnno(
      comment = "指定保级材料",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> apponi = new ArrayList();
   @ModelColumnAnno(
      comment = "必定成功材料",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1
   )
   private List<ResourceModel> success = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getEquipType() {
      return this.equipType;
   }

   public void setEquipType(int equipType) {
      this.checkModify();
      this.equipType = equipType;
   }

   public int getRefineLevel() {
      return this.refineLevel;
   }

   public void setRefineLevel(int refineLevel) {
      this.checkModify();
      this.refineLevel = refineLevel;
   }

   public int getRefinetime() {
      return this.refinetime;
   }

   public void setRefinetime(int refinetime) {
      this.checkModify();
      this.refinetime = refinetime;
   }

   public int getRefineChance() {
      return this.refineChance;
   }

   public void setRefineChance(int refineChance) {
      this.checkModify();
      this.refineChance = refineChance;
   }

   public List<ResourceModel> getChance() {
      return this.chance;
   }

   public void setChance(List<ResourceModel> chance) {
      this.checkModify();
      this.chance = chance;
   }

   public int getAndChance() {
      return this.andChance;
   }

   public void setAndChance(int andChance) {
      this.checkModify();
      this.andChance = andChance;
   }

   public List<PropertyModel> getBase() {
      return this.base;
   }

   public void setBase(List<PropertyModel> base) {
      this.checkModify();
      this.base = base;
   }

   public List<PropertyModel> getAdditional() {
      return this.additional;
   }

   public void setAdditional(List<PropertyModel> additional) {
      this.checkModify();
      this.additional = additional;
   }

   public List<ResourceModel> getSuccess() {
      return this.success;
   }

   public void setSuccess(List<ResourceModel> success) {
      this.checkModify();
      this.success = success;
   }

   public List<ResourceModel> getConsumes() {
      return this.consumes;
   }

   public void setConsumes(List<ResourceModel> consumes) {
      this.checkModify();
      this.consumes = consumes;
   }

   public List<ResourceModel> getBackMaterial() {
      return this.backMaterial;
   }

   public void setBackMaterial(List<ResourceModel> backMaterial) {
      this.checkModify();
      this.backMaterial = backMaterial;
   }

   public List<ResourceModel> getApponi() {
      return this.apponi;
   }

   public void setApponi(List<ResourceModel> apponi) {
      this.checkModify();
      this.apponi = apponi;
   }
}
