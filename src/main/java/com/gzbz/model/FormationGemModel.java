package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "formationGem"
)
public class FormationGemModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "名字"
   )
   private String name;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "属性类型"
   )
   private int propertyType;
   @ModelColumnAnno(
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "固定资质id"
   )
   private int fixQualityId;
   @ModelColumnAnno(
      comment = "固定资质值"
   )
   private int fixQualityValue;
   @ModelColumnAnno(
      comment = "固定资质方式"
   )
   private int fixQualityWay;
   @ModelColumnAnno(
      comment = "随机资质数量"
   )
   private int randomQualityNum;
   @ModelColumnAnno(
      columnName = "getRandomProprety",
      comment = "探寻随机属性品质",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> randomQuality = new ArrayList();
   @ModelColumnAnno(
      comment = "合成符石id"
   )
   private int composeGemid;
   @ModelColumnAnno(
      comment = "评分"
   )
   private int score;
   @ModelColumnAnno(
      comment = "升级目标符石"
   )
   private int lvuptarget;
   @ModelColumnAnno(
      columnName = "composeItem",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "合成消耗",
      count = 2
   )
   private List<ResourceModel> composeItem = new ArrayList();
   @ModelColumnAnno(
      columnName = "randomProprety",
      comment = "合成随机属性品质",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> randomProprety = new ArrayList();
   @ModelColumnAnno(
      columnName = "randomrate",
      comment = "合成随机属性概率",
      columnConvertType = 2,
      subCls = Integer.class
   )
   private List<Integer> randomrate = new ArrayList();
   @ModelColumnAnno(
      columnName = "blockItem",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "分解道具",
      count = 2
   )
   private List<ResourceModel> blockItem = new ArrayList();
   @ModelColumnAnno(
      columnName = "lvupItem",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      comment = "升级消耗",
      count = 2
   )
   private List<ResourceModel> lvupItem = new ArrayList();

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

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getPropertyType() {
      return this.propertyType;
   }

   public void setPropertyType(int propertyType) {
      this.checkModify();
      this.propertyType = propertyType;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getRandomQualityNum() {
      return this.randomQualityNum;
   }

   public void setRandomQualityNum(int randomQualityNum) {
      this.checkModify();
      this.randomQualityNum = randomQualityNum;
   }

   public List<Integer> getRandomQuality() {
      return this.randomQuality;
   }

   public void setRandomQuality(List<Integer> randomQuality) {
      this.checkModify();
      this.randomQuality = randomQuality;
   }

   public int getComposeGemid() {
      return this.composeGemid;
   }

   public void setComposeGemid(int composeGemid) {
      this.checkModify();
      this.composeGemid = composeGemid;
   }

   public int getScore() {
      return this.score;
   }

   public void setScore(int score) {
      this.checkModify();
      this.score = score;
   }

   public List<ResourceModel> getComposeItem() {
      return this.composeItem;
   }

   public void setComposeItem(List<ResourceModel> composeItem) {
      this.checkModify();
      this.composeItem = composeItem;
   }

   public List<Integer> getRandomProprety() {
      return this.randomProprety;
   }

   public void setRandomProprety(List<Integer> randomProprety) {
      this.checkModify();
      this.randomProprety = randomProprety;
   }

   public List<Integer> getRandomrate() {
      return this.randomrate;
   }

   public void setRandomrate(List<Integer> randomrate) {
      this.checkModify();
      this.randomrate = randomrate;
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

   public List<ResourceModel> getBlockItem() {
      return this.blockItem;
   }

   public void setBlockItem(List<ResourceModel> blockItem) {
      this.checkModify();
      this.blockItem = blockItem;
   }

   public int getLvuptarget() {
      return this.lvuptarget;
   }

   public void setLvuptarget(int lvuptarget) {
      this.checkModify();
      this.lvuptarget = lvuptarget;
   }

   public List<ResourceModel> getLvupitem() {
      return this.lvupItem;
   }

   public void setLvupitem(List<ResourceModel> lvupitem) {
      this.checkModify();
      this.lvupItem = lvupitem;
   }
}
