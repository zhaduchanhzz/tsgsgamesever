package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import java.util.ArrayList;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "exclusiveTreasureBase"
)
public class ExclusiveTreasureBaseModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "职业类型"
   )
   private int nation;
   @ModelColumnAnno(
      comment = "槽位数"
   )
   private int holeNum;
   @ModelColumnAnno(
      comment = "对应等级"
   )
   private int lev;
   @ModelColumnAnno(
      comment = "对应阶数"
   )
   private int star;
   @ModelColumnAnno(
      comment = "加成属性类型"
   )
   private int proId;
   @ModelColumnAnno(
      comment = "加成方式"
   )
   private int proWay;
   @ModelColumnAnno(
      comment = "加成值"
   )
   private int proValue;
   @ModelColumnAnno(
      comment = "下一级加成属性类型"
   )
   private int nextProType;
   @ModelColumnAnno(
      comment = "下一级加成方式"
   )
   private int nextProWay;
   @ModelColumnAnno(
      comment = "下一级加成值"
   )
   private int nextProValue;
   @ModelColumnAnno(
      columnName = "upLevConsume",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "升级消耗"
   )
   private ArrayList<ResourceModel> upLevConsume = new ArrayList();
   @ModelColumnAnno(
      columnName = "upStarConsume",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 3,
      comment = "升阶消耗"
   )
   private ArrayList<ResourceModel> upStarConsume = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getNation() {
      return this.nation;
   }

   public void setNation(int nation) {
      this.checkModify();
      this.nation = nation;
   }

   public int getHoleNum() {
      return this.holeNum;
   }

   public void setHoleNum(int holeNum) {
      this.checkModify();
      this.holeNum = holeNum;
   }

   public int getLev() {
      return this.lev;
   }

   public void setLev(int lev) {
      this.checkModify();
      this.lev = lev;
   }

   public int getStar() {
      return this.star;
   }

   public void setStar(int star) {
      this.checkModify();
      this.star = star;
   }

   public int getProId() {
      return this.proId;
   }

   public void setProId(int proId) {
      this.checkModify();
      this.proId = proId;
   }

   public int getProWay() {
      return this.proWay;
   }

   public void setProWay(int proWay) {
      this.checkModify();
      this.proWay = proWay;
   }

   public int getProValue() {
      return this.proValue;
   }

   public void setProValue(int proValue) {
      this.checkModify();
      this.proValue = proValue;
   }

   public int getNextProType() {
      return this.nextProType;
   }

   public void setNextProType(int nextProType) {
      this.checkModify();
      this.nextProType = nextProType;
   }

   public int getNextProWay() {
      return this.nextProWay;
   }

   public void setNextProWay(int nextProWay) {
      this.checkModify();
      this.nextProWay = nextProWay;
   }

   public int getNextProValue() {
      return this.nextProValue;
   }

   public void setNextProValue(int nextProValue) {
      this.checkModify();
      this.nextProValue = nextProValue;
   }

   public ArrayList<ResourceModel> getUpLevConsume() {
      return this.upLevConsume;
   }

   public void setUpLevConsume(ArrayList<ResourceModel> upLevConsume) {
      this.checkModify();
      this.upLevConsume = upLevConsume;
   }

   public ArrayList<ResourceModel> getUpStarConsume() {
      return this.upStarConsume;
   }

   public void setUpStarConsume(ArrayList<ResourceModel> upStarConsume) {
      this.checkModify();
      this.upStarConsume = upStarConsume;
   }
}
