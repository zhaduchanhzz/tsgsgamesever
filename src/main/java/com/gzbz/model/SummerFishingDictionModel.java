package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "SummerFishingDictionary"
)
public class SummerFishingDictionModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "鱼的品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "鱼的等级"
   )
   private int fishLevel;
   @ModelColumnAnno(
      comment = "基础评分"
   )
   private int baseScore;
   @ModelColumnAnno(
      comment = "钓鱼权重"
   )
   private int weight;
   @ModelColumnAnno(
      comment = "标准长度"
   )
   private float baseLength;
   @ModelColumnAnno(
      comment = "普通力度最小长度"
   )
   private float NormolLengthMin;
   @ModelColumnAnno(
      comment = "普通力度最大长度"
   )
   private float NormolLengthMax;
   @ModelColumnAnno(
      comment = "高级力度最小长度"
   )
   private float HighLengthMin;
   @ModelColumnAnno(
      comment = "高级力度最大长度"
   )
   private float HighLengthMax;
   @ModelColumnAnno(
      comment = "最大力度最小长度"
   )
   private float BestLengthMin;
   @ModelColumnAnno(
      comment = "最大力度最大长度"
   )
   private float BestLengthMax;
   @ModelColumnAnno(
      comment = "奖励",
      columnConvertType = 2,
      subCls = ResourceModel.class,
      count = 3
   )
   private List<ResourceModel> rewards = new ArrayList();

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

   public int getFishLevel() {
      return this.fishLevel;
   }

   public void setFishLevel(int fishLevel) {
      this.checkModify();
      this.fishLevel = fishLevel;
   }

   public int getBaseScore() {
      return this.baseScore;
   }

   public void setBaseScore(int baseScore) {
      this.checkModify();
      this.baseScore = baseScore;
   }

   public int getWeight() {
      return this.weight;
   }

   public void setWeight(int weight) {
      this.checkModify();
      this.weight = weight;
   }

   public float getBaseLength() {
      return this.baseLength;
   }

   public void setBaseLength(float baseLength) {
      this.checkModify();
      this.baseLength = baseLength;
   }

   public float getNormolLengthMin() {
      return this.NormolLengthMin;
   }

   public void setNormolLengthMin(float normolLengthMin) {
      this.checkModify();
      this.NormolLengthMin = normolLengthMin;
   }

   public float getNormolLengthMax() {
      return this.NormolLengthMax;
   }

   public void setNormolLengthMax(float normolLengthMax) {
      this.checkModify();
      this.NormolLengthMax = normolLengthMax;
   }

   public float getHighLengthMin() {
      return this.HighLengthMin;
   }

   public void setHighLengthMin(float highLengthMin) {
      this.checkModify();
      this.HighLengthMin = highLengthMin;
   }

   public float getHighLengthMax() {
      return this.HighLengthMax;
   }

   public void setHighLengthMax(float highLengthMax) {
      this.checkModify();
      this.HighLengthMax = highLengthMax;
   }

   public float getBestLengthMin() {
      return this.BestLengthMin;
   }

   public void setBestLengthMin(float bestLengthMin) {
      this.checkModify();
      this.BestLengthMin = bestLengthMin;
   }

   public float getBestLengthMax() {
      return this.BestLengthMax;
   }

   public void setBestLengthMax(float bestLengthMax) {
      this.checkModify();
      this.BestLengthMax = bestLengthMax;
   }

   public List<ResourceModel> getRewards() {
      return this.rewards;
   }

   public void setRewards(List<ResourceModel> rewards) {
      this.checkModify();
      this.rewards = rewards;
   }
}
