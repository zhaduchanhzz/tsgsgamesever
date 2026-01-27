package com.gzbz.model;

import com.gzbz.model.manager.BaseModel;
import model.ModelAnno;
import model.ModelColumnAnno;

@ModelAnno(
   file = "exclusiveTreasureActivation"
)
public class ExclusiveTreasureActivationModel extends BaseModel {
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "加成类型"
   )
   private int addType;
   @ModelColumnAnno(
      comment = "条件1三角形宝石个数"
   )
   private int triangleNum;
   @ModelColumnAnno(
      comment = "条件1方形宝石个数"
   )
   private int squareNum;
   @ModelColumnAnno(
      comment = "条件1圆形宝石个数"
   )
   private int circularNum;
   @ModelColumnAnno(
      comment = "权重概率"
   )
   private int rate;
   @ModelColumnAnno(
      comment = "group"
   )
   private int group;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getAddType() {
      return this.addType;
   }

   public void setAddType(int addType) {
      this.checkModify();
      this.addType = addType;
   }

   public int getTriangleNum() {
      return this.triangleNum;
   }

   public void setTriangleNum(int triangleNum) {
      this.checkModify();
      this.triangleNum = triangleNum;
   }

   public int getSquareNum() {
      return this.squareNum;
   }

   public void setSquareNum(int squareNum) {
      this.checkModify();
      this.squareNum = squareNum;
   }

   public int getCircularNum() {
      return this.circularNum;
   }

   public void setCircularNum(int circularNum) {
      this.checkModify();
      this.circularNum = circularNum;
   }

   public int getRate() {
      return this.rate;
   }

   public void setRate(int rate) {
      this.checkModify();
      this.rate = rate;
   }

   public int getGroup() {
      return this.group;
   }

   public void setGroup(int group) {
      this.checkModify();
      this.group = group;
   }
}
