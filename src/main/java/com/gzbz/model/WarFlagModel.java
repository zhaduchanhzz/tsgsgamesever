package com.gzbz.model;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import java.util.List;
import misc.RandomUtil;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "countryWarFlag"
)
public class WarFlagModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "战旗名称"
   )
   private String name;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "类型名称"
   )
   private String typeName;
   @ModelColumnAnno(
      comment = "等级上限"
   )
   private int maxlv;
   @ModelColumnAnno(
      comment = "随机属性条目数"
   )
   private int randomPropertyCount;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = PropertyModel.class,
      count = 2,
      comment = "初始属性"
   )
   private List<PropertyModel> initialProperty = new ArrayList();
   @ModelColumnAnno(
      comment = "单次升级基础属性值提升"
   )
   private int lvupPropertyRise;
   @ModelColumnAnno(
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "洗练消耗"
   )
   private List<ResourceModel> refreshCost = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      count = 1,
      comment = "随机属性权重"
   )
   private List<Integer> randomPropertyweight = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      count = 1,
      comment = "单次洗练随机属性提升"
   )
   private List<Integer> randomPropertyRise = new ArrayList();
   @ModelColumnAnno(
      columnConvertType = 2,
      subCls = Integer.class,
      count = 1,
      comment = "单次洗练随机属性提升权重"
   )
   private List<Integer> randomPropertyRiseWeight = new ArrayList();
   @ModelColumnAnno(
      comment = "随机属性初始值"
   )
   private int randomPropertyMinNum;
   @ModelColumnAnno(
      comment = "随机属性最大值"
   )
   private int randomPropertyMaxNum;

   public int getId() {
      return this.id;
   }

   public String getName() {
      return this.name;
   }

   public int getType() {
      return this.type;
   }

   public String getTypeName() {
      return this.typeName;
   }

   public int getMaxlv() {
      return this.maxlv;
   }

   public int getRandomPropertyCount() {
      return this.randomPropertyCount;
   }

   public int getLvupPropertyRise() {
      return this.lvupPropertyRise;
   }

   public List<Integer> getRandomPropertyweight() {
      return this.randomPropertyweight;
   }

   public int getRandomPropertyMinNum() {
      return this.randomPropertyMinNum;
   }

   public int getRandomPropertyMaxNum() {
      return this.randomPropertyMaxNum;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
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

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public void setTypeName(String typeName) {
      this.checkModify();
      this.typeName = typeName;
   }

   public void setMaxlv(int maxlv) {
      this.checkModify();
      this.maxlv = maxlv;
   }

   public void setRandomPropertyCount(int randomPropertyCount) {
      this.checkModify();
      this.randomPropertyCount = randomPropertyCount;
   }

   public void setLvupPropertyRise(int lvupPropertyRise) {
      this.checkModify();
      this.lvupPropertyRise = lvupPropertyRise;
   }

   public List<ResourceModel> getRefreshCost() {
      return this.refreshCost;
   }

   public void setRefreshCost(List<ResourceModel> refreshCost) {
      this.checkModify();
      this.refreshCost = refreshCost;
   }

   public void setRandomPropertyweight(List<Integer> randomPropertyweight) {
      this.checkModify();
      this.randomPropertyweight = randomPropertyweight;
   }

   public void setRandomPropertyMinNum(int randomPropertyMinNum) {
      this.checkModify();
      this.randomPropertyMinNum = randomPropertyMinNum;
   }

   public void setRandomPropertyMaxNum(int randomPropertyMaxNum) {
      this.checkModify();
      this.randomPropertyMaxNum = randomPropertyMaxNum;
   }

   public List<PropertyModel> getInitialProperty() {
      return this.initialProperty;
   }

   public void setInitialProperty(List<PropertyModel> initialProperty) {
      this.initialProperty = initialProperty;
   }

   public int getPropertyType() {
      if (this.randomPropertyweight.size() < 2) {
         return 21;
      } else {
         int totalWeight = 0;
         totalWeight += (Integer)this.getRandomPropertyweight().get(0);
         totalWeight += (Integer)this.getRandomPropertyweight().get(1);
         int r = RandomUtil.randInt(totalWeight);
         return r < (Integer)this.randomPropertyweight.get(0) ? 21 : 22;
      }
   }

   public List<Integer> getRandomPropertyRise() {
      return this.randomPropertyRise;
   }

   public void setRandomPropertyRise(List<Integer> randomPropertyRise) {
      this.checkModify();
      this.randomPropertyRise = randomPropertyRise;
   }

   public List<Integer> getRandomPropertyRiseWeight() {
      return this.randomPropertyRiseWeight;
   }

   public void setRandomPropertyRiseWeight(List<Integer> randomPropertyRiseWeight) {
      this.checkModify();
      this.randomPropertyRiseWeight = randomPropertyRiseWeight;
   }
}
