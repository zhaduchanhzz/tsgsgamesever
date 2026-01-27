package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "formationGemLvup"
)
public class FormationGemLvUpModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "等级"
   )
   private int lv;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "固定资质id"
   )
   private int fixQualityId;
   @ModelColumnAnno(
      comment = "固定资质值"
   )
   private int fixQualityValue;
   @ModelColumnAnno(
      comment = "固定资质加成方式"
   )
   private int fixQualityWay;
   @ModelColumnAnno(
      comment = "符石类型"
   )
   private int propertyType;
   @ModelColumnAnno(
      comment = "符石数量"
   )
   private int gemNum;
   @ModelColumnAnno(
      columnName = "lvUpTool",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "升级道具",
      count = 2
   )
   private List<ResourceModel> lvUpTool = new ArrayList();
   @ModelColumnAnno(
      comment = "升级符石id"
   )
   private int targetGemId;
   @ModelColumnAnno(
      columnName = "blockItem",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "分解道具",
      count = 2
   )
   private List<ResourceModel> blockItem = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getLv() {
      return this.lv;
   }

   public void setLv(int lv) {
      this.checkModify();
      this.lv = lv;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getFixQualityId() {
      return this.fixQualityId;
   }

   public void setFixQualityId(int fixQualityId) {
      this.checkModify();
      this.fixQualityId = fixQualityId;
   }

   public int getFixQualityValue() {
      return this.fixQualityValue;
   }

   public void setFixQualityValue(int fixQualityValue) {
      this.checkModify();
      this.fixQualityValue = fixQualityValue;
   }

   public int getFixQualityWay() {
      return this.fixQualityWay;
   }

   public void setFixQualityWay(int fixQualityWay) {
      this.checkModify();
      this.fixQualityWay = fixQualityWay;
   }

   public List<ResourceModel> getLvUpTool() {
      return this.lvUpTool;
   }

   public void setLvUpTool(List<ResourceModel> lvUpTool) {
      this.checkModify();
      this.lvUpTool = lvUpTool;
   }

   public int getTargetGemId() {
      return this.targetGemId;
   }

   public void setTargetGemId(int targetGemId) {
      this.checkModify();
      this.targetGemId = targetGemId;
   }

   public List<ResourceModel> getBlockItem() {
      return this.blockItem;
   }

   public void setBlockItem(List<ResourceModel> blockItem) {
      this.checkModify();
      this.blockItem = blockItem;
   }

   public int getPropertyType() {
      return this.propertyType;
   }

   public void setPropertyType(int propertyType) {
      this.checkModify();
      this.propertyType = propertyType;
   }

   public int getGemNum() {
      return this.gemNum;
   }

   public void setGemNum(int gemNum) {
      this.checkModify();
      this.gemNum = gemNum;
   }
}
