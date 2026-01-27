package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "GodBeastNeiDanQuality"
)
public class GodBeastNeiDanQualityModel extends BaseModel {
   @ModelColumnAnno(
      comment = "品质",
      isPrimaty = true
   )
   private int quality;
   @ModelColumnAnno(
      comment = "等级上限"
   )
   private int levelLimit;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      comment = "基础属性"
   )
   private ArrayList<PropertyModel> baseAtt = new ArrayList();
   @ModelColumnAnno(
      comment = "吞噬提供经验"
   )
   private int exp;
   @ModelColumnAnno(
      comment = "品质抽取权重"
   )
   private int qualityWeight;

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int quality) {
      this.checkModify();
      this.quality = quality;
   }

   public int getLevelLimit() {
      return this.levelLimit;
   }

   public void setLevelLimit(int levelLimit) {
      this.checkModify();
      this.levelLimit = levelLimit;
   }

   public ArrayList<PropertyModel> getBaseAtt() {
      return this.baseAtt;
   }

   public void setBaseAtt(ArrayList<PropertyModel> baseAtt) {
      this.checkModify();
      this.baseAtt = baseAtt;
   }

   public int getExp() {
      return this.exp;
   }

   public void setExp(int exp) {
      this.checkModify();
      this.exp = exp;
   }

   public int getQualityWeight() {
      return this.qualityWeight;
   }

   public void setQualityWeight(int qualityWeight) {
      this.checkModify();
      this.qualityWeight = qualityWeight;
   }
}
