package com.gzbz.model;

import com.gzbz.model.fun.PropertyRangeModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "auctionAutomaticGroup"
)
public class MartAutoGroupModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "序号"
   )
   private int id;
   @ModelColumnAnno(
      comment = "珍稀程度组"
   )
   private int rareDegree;
   @ModelColumnAnno(
      comment = "神兽id"
   )
   private int godBeastid;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyRangeModel.class,
      comment = "属性范围"
   )
   private List<PropertyRangeModel> attr = new ArrayList();
   @ModelColumnAnno(
      comment = "起拍价下限"
   )
   private int startPriceMin;
   @ModelColumnAnno(
      comment = "起拍价上限"
   )
   private int startPriceMax;
   @ModelColumnAnno(
      comment = "一口价下限"
   )
   private int fixPriceMin;
   @ModelColumnAnno(
      comment = "一口价上限"
   )
   private int fixPriceMax;
   @ModelColumnAnno(
      comment = "权重"
   )
   private int rate;

   public int getId() {
      return this.id;
   }

   public int getRareDegree() {
      return this.rareDegree;
   }

   public int getGodBeastid() {
      return this.godBeastid;
   }

   public List<PropertyRangeModel> getAttr() {
      return this.attr;
   }

   public int getStartPriceMin() {
      return this.startPriceMin;
   }

   public int getStartPriceMax() {
      return this.startPriceMax;
   }

   public int getFixPriceMin() {
      return this.fixPriceMin;
   }

   public int getFixPriceMax() {
      return this.fixPriceMax;
   }

   public int getRate() {
      return this.rate;
   }
}
