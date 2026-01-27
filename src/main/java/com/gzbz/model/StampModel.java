package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "Stamp"
)
public class StampModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "配饰名字"
   )
   private String name;
   @ModelColumnAnno(
      comment = "品质"
   )
   private int quality;
   @ModelColumnAnno(
      comment = "星级"
   )
   private int star;
   @ModelColumnAnno(
      comment = "基础属性类型"
   )
   private int basicPropertyType;
   @ModelColumnAnno(
      comment = "附加属性数量"
   )
   private int extraPropertyNum;
   @ModelColumnAnno(
      comment = "附加属性类型"
   )
   private int extraPropertyType;
   @ModelColumnAnno(
      comment = "套装类型"
   )
   private int setType;
   @ModelColumnAnno(
      comment = "套装id"
   )
   private int setId;
   @ModelColumnAnno(
      columnName = "sell",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "出售"
   )
   private ArrayList<ResourceModel> sell = new ArrayList();
   @ModelColumnAnno(
      columnName = "levUpConsume",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "升级消耗"
   )
   private ArrayList<ResourceModel> levUpConsume = new ArrayList();
   @ModelColumnAnno(
      comment = "升星的配饰id"
   )
   private int targetStamp;
   @ModelColumnAnno(
      columnName = "starUpConsume",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "升星消耗"
   )
   private ArrayList<ResourceModel> starUpConsume = new ArrayList();
   @ModelColumnAnno(
      columnName = "exchangeToSet_0",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "转换类型0套装"
   )
   private ArrayList<ResourceModel> exchangeToSet_0 = new ArrayList();
   @ModelColumnAnno(
      columnName = "exchangeToSet_1",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "转换类型1套装"
   )
   private ArrayList<ResourceModel> exchangeToSet_1 = new ArrayList();
   @ModelColumnAnno(
      columnName = "exchangeToSet_2",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "转换类型2套装"
   )
   private ArrayList<ResourceModel> exchangeToSet_2 = new ArrayList();
   @ModelColumnAnno(
      columnName = "clearConsume",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 2,
      comment = "洗练消耗"
   )
   private ArrayList<ResourceModel> clearConsume = new ArrayList();
   @ModelColumnAnno(
      columnName = "clearConsume_one",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "单属性锁定洗练消耗"
   )
   private ArrayList<ResourceModel> clearConsume_one = new ArrayList();
   @ModelColumnAnno(
      columnName = "clearConsume_two",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 1,
      comment = "双属性锁定洗练消耗"
   )
   private ArrayList<ResourceModel> clearConsume_two = new ArrayList();

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

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public int getBasicPropertyType() {
      return this.basicPropertyType;
   }

   public void setBasicPropertyType(int basicPropertyType) {
      this.checkModify();
      this.basicPropertyType = basicPropertyType;
   }

   public int getExtraPropertyNum() {
      return this.extraPropertyNum;
   }

   public void setExtraPropertyNum(int extraPropertyNum) {
      this.checkModify();
      this.extraPropertyNum = extraPropertyNum;
   }

   public int getExtraPropertyType() {
      return this.extraPropertyType;
   }

   public void setExtraPropertyType(int extraPropertyType) {
      this.checkModify();
      this.extraPropertyType = extraPropertyType;
   }

   public int getSetType() {
      return this.setType;
   }

   public void setSetType(int setType) {
      this.checkModify();
      this.setType = setType;
   }

   public int getSetId() {
      return this.setId;
   }

   public void setSetId(int setId) {
      this.checkModify();
      this.setId = setId;
   }

   public ArrayList<ResourceModel> getSell() {
      return this.sell;
   }

   public void setSell(ArrayList<ResourceModel> sell) {
      this.checkModify();
      this.sell = sell;
   }

   public ArrayList<ResourceModel> getLevUpConsume() {
      return this.levUpConsume;
   }

   public void setLevUpConsume(ArrayList<ResourceModel> levUpConsume) {
      this.checkModify();
      this.levUpConsume = levUpConsume;
   }

   public int getTargetStamp() {
      return this.targetStamp;
   }

   public void setTargetStamp(int targetStamp) {
      this.checkModify();
      this.targetStamp = targetStamp;
   }

   public ArrayList<ResourceModel> getStarUpConsume() {
      return this.starUpConsume;
   }

   public void setStarUpConsume(ArrayList<ResourceModel> starUpConsume) {
      this.checkModify();
      this.starUpConsume = starUpConsume;
   }

   public ArrayList<ResourceModel> getExchangeToSet_0() {
      return this.exchangeToSet_0;
   }

   public void setExchangeToSet_0(ArrayList<ResourceModel> exchangeToSet_0) {
      this.checkModify();
      this.exchangeToSet_0 = exchangeToSet_0;
   }

   public ArrayList<ResourceModel> getExchangeToSet_1() {
      return this.exchangeToSet_1;
   }

   public void setExchangeToSet_1(ArrayList<ResourceModel> exchangeToSet_1) {
      this.checkModify();
      this.exchangeToSet_1 = exchangeToSet_1;
   }

   public ArrayList<ResourceModel> getExchangeToSet_2() {
      return this.exchangeToSet_2;
   }

   public void setExchangeToSet_2(ArrayList<ResourceModel> exchangeToSet_2) {
      this.checkModify();
      this.exchangeToSet_2 = exchangeToSet_2;
   }

   public ArrayList<ResourceModel> getClearConsume() {
      return this.clearConsume;
   }

   public void setClearConsume(ArrayList<ResourceModel> clearConsume) {
      this.checkModify();
      this.clearConsume = clearConsume;
   }

   public ArrayList<ResourceModel> getClearConsume_one() {
      return this.clearConsume_one;
   }

   public void setClearConsume_one(ArrayList<ResourceModel> clearConsume_one) {
      this.checkModify();
      this.clearConsume_one = clearConsume_one;
   }

   public ArrayList<ResourceModel> getClearConsume_two() {
      return this.clearConsume_two;
   }

   public void setClearConsume_two(ArrayList<ResourceModel> clearConsume_two) {
      this.checkModify();
      this.clearConsume_two = clearConsume_two;
   }
}
