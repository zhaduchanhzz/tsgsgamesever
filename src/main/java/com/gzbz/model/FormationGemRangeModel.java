package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "formationGemRange"
)
public class FormationGemRangeModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "职业限制"
   )
   private int typeLimit;
   @ModelColumnAnno(
      comment = "随机属性库"
   )
   private int randamcage;
   @ModelColumnAnno(
      comment = "随机资质id"
   )
   private int randomQualityId;
   @ModelColumnAnno(
      comment = "随机资质范围"
   )
   private String randomQualityValueRange;
   @ModelColumnAnno(
      comment = "资质加成方式"
   )
   private int randomQualityWay;
   @ModelColumnAnno(
      comment = "极品范围"
   )
   private int bestRange;
   @ModelColumnAnno(
      comment = "完美值出现权重"
   )
   private int pefectweight;
   @ModelColumnAnno(
      comment = "传承道具类型"
   )
   private int carryitemType;
   @ModelColumnAnno(
      comment = "传承道具id"
   )
   private int carryitemId;
   @ModelColumnAnno(
      comment = "传承道具数量"
   )
   private int carryitemNum;
   @ModelColumnAnno(
      comment = "属性类型随机权重"
   )
   private int weight;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getTypeLimit() {
      return this.typeLimit;
   }

   public void setTypeLimit(int typeLimit) {
      this.checkModify();
      this.typeLimit = typeLimit;
   }

   public int getRandomQualityId() {
      return this.randomQualityId;
   }

   public void setRandomQualityId(int randomQualityId) {
      this.checkModify();
      this.randomQualityId = randomQualityId;
   }

   public String getRandomQualityValueRange() {
      return this.randomQualityValueRange;
   }

   public void setRandomQualityValueRange(String randomQualityValueRange) {
      this.checkModify();
      this.randomQualityValueRange = randomQualityValueRange;
   }

   public int getRandomQualityWay() {
      return this.randomQualityWay;
   }

   public void setRandomQualityWay(int randomQualityWay) {
      this.checkModify();
      this.randomQualityWay = randomQualityWay;
   }

   public int getBestRange() {
      return this.bestRange;
   }

   public void setBestRange(int bestRange) {
      this.checkModify();
      this.bestRange = bestRange;
   }

   public int getPefectweight() {
      return this.pefectweight;
   }

   public void setPefectweight(int pefectweight) {
      this.checkModify();
      this.pefectweight = pefectweight;
   }

   public int getCarryitemType() {
      return this.carryitemType;
   }

   public void setCarryitemType(int carryitemType) {
      this.checkModify();
      this.carryitemType = carryitemType;
   }

   public int getCarryitemId() {
      return this.carryitemId;
   }

   public void setCarryitemId(int carryitemId) {
      this.checkModify();
      this.carryitemId = carryitemId;
   }

   public int getCarryitemNum() {
      return this.carryitemNum;
   }

   public void setCarryitemNum(int carryitemNum) {
      this.checkModify();
      this.carryitemNum = carryitemNum;
   }

   public int getRandamcage() {
      return this.randamcage;
   }

   public void setRandamcage(int randamcage) {
      this.checkModify();
      this.randamcage = randamcage;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }
}
